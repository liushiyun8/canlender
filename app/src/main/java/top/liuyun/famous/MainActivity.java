package top.liuyun.famous;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private View btn;
    private TextView edit;
    private GridView lv;
    private String url=" http://zf.lbjet.com/mobile/index.php?act=houses&op=house_calendar&house_id=1524&half_a_year&month=";
    private String month;
    private List<BookBean.DatasBean.DaysBean> list=new ArrayList<>();
    private CommonAdapter<BookBean.DatasBean.DaysBean> commonAdapter;
    private int start=-1;
    private int end=-1;
    private Button btn0;
    private String last_month;
    private String next_month;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initDate("");
    }

    private void initDate(final String months) {
        String url1=url+months;
//        if(months!=""){
//            String url1=url+months;
//        }
//        String url1=url+months;
        list.clear();
        Log.e("OOOO",url1);
        OkHttpClient client = new OkHttpClient();
        Request re = new Request.Builder().url(url1).build();
        client.newCall(re).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("jjj","上班");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String json = response.body().string();
                Gson gson = new Gson();
                BookBean bookBean = gson.fromJson(json, BookBean.class);
                if(bookBean.getCode()==200){
                    last_month = bookBean.getDatas().getLast_month();
                    next_month = bookBean.getDatas().getNext_month();
                    month= bookBean.getDatas().getMonth();
                    int i=Integer.parseInt(bookBean.getDatas().getDays().get(0).getWeek());
                    for (int j = 0; j < i; j++) {
                        list.add(new BookBean.DatasBean.DaysBean());
                    }
                    list.addAll(bookBean.getDatas().getDays());
                    Log.e("OOOl",list.size()+"");
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            edit.setText(month);
                            commonAdapter.notifyDataSetChanged();
                        }
                    });
                }
            }
        });
    }

    private void initView() {
        btn = findViewById(R.id.update);
        edit = (TextView) findViewById(R.id.key);
        lv = (GridView) findViewById(R.id.lv);
        btn0 = (Button) findViewById(R.id.update0);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                BookBean.DatasBean.DaysBean daysBean = list.get(position);
                if("0".equals(daysBean.getIs_buy())||daysBean.getIs_buy()==null){
                    return;
                }

                if(start==-1){
                    start = position;
                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).setIs_select("0");
                    }
                    list.get(position).setIs_select("1");
                }
                else {
                    if(position>=start){
                        for (int i = start; i <=position ; i++) {
                            list.get(i).setIs_select("1");
                        }
                        start=-1;
                    }
                }
                commonAdapter.notifyDataSetChanged();
            }
        });
        commonAdapter = new CommonAdapter<BookBean.DatasBean.DaysBean>(this, list, R.layout.mylvitem) {
            @Override
            public void convert(ViewHolder helper, int position, BookBean.DatasBean.DaysBean item) {
                if(item.getWeek()!=null){
                    helper.setText(R.id.date,item.getNum());
                    helper.setText(R.id.body,"¥"+item.getPrice());
                    helper.setText(R.id.title,"剩"+item.getSet()+"套");
                }else {
                    helper.setText(R.id.date,"");
                    helper.setText(R.id.body,"");
                    helper.setText(R.id.title,"");
                }
                helper.getConvertView().setEnabled("0".equals(item.getIs_buy())?false:true);
                if("0".equals(item.getIs_buy())){
                    helper.setBackgroundColor(R.id.layout,Color.parseColor("#88cccccc"));
                }else if(item.getIs_buy()==null){
                    helper.setBackgroundColor(R.id.layout,Color.TRANSPARENT);
                }else
                helper.setBackgroundColor(R.id.layout,"1".equals(item.getIs_select())? Color.parseColor("#FF4081"):Color.TRANSPARENT);
            }
        };
        lv.setAdapter(commonAdapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initDate(next_month);
                if(start!=-1){
                    start=0;
                }
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initDate(last_month);
                if(start!=-1){
                    start=0;
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
