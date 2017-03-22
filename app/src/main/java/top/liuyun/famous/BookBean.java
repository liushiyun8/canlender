package top.liuyun.famous;

import java.util.List;

/**
 * Created by 刘仕云 on 2016/12/29.
 */
public class BookBean {

    /**
     * code : 200
     * datas : {"month":"2017-2","last_month":"2017-1","next_month":"2017-3","days":[{"num":"1","date":"2017-2-1","week":"3","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"2","date":"2017-2-2","week":"4","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"3","date":"2017-2-3","week":"5","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"4","date":"2017-2-4","week":"6","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"5","date":"2017-2-5","week":"0","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"6","date":"2017-2-6","week":"1","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"7","date":"2017-2-7","week":"2","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"8","date":"2017-2-8","week":"3","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"9","date":"2017-2-9","week":"4","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"10","date":"2017-2-10","week":"5","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"11","date":"2017-2-11","week":"6","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"12","date":"2017-2-12","week":"0","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"13","date":"2017-2-13","week":"1","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"14","date":"2017-2-14","week":"2","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"15","date":"2017-2-15","week":"3","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"16","date":"2017-2-16","week":"4","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"17","date":"2017-2-17","week":"5","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"18","date":"2017-2-18","week":"6","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"19","date":"2017-2-19","week":"0","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"20","date":"2017-2-20","week":"1","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"21","date":"2017-2-21","week":"2","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"22","date":"2017-2-22","week":"3","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"23","date":"2017-2-23","week":"4","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"24","date":"2017-2-24","week":"5","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"25","date":"2017-2-25","week":"6","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"26","date":"2017-2-26","week":"0","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"27","date":"2017-2-27","week":"1","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"28","date":"2017-2-28","week":"2","price":398,"is_buy":"0","is_select":"0","set":"10"}]}
     */

    private int code;
    /**
     * month : 2017-2
     * last_month : 2017-1
     * next_month : 2017-3
     * days : [{"num":"1","date":"2017-2-1","week":"3","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"2","date":"2017-2-2","week":"4","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"3","date":"2017-2-3","week":"5","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"4","date":"2017-2-4","week":"6","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"5","date":"2017-2-5","week":"0","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"6","date":"2017-2-6","week":"1","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"7","date":"2017-2-7","week":"2","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"8","date":"2017-2-8","week":"3","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"9","date":"2017-2-9","week":"4","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"10","date":"2017-2-10","week":"5","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"11","date":"2017-2-11","week":"6","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"12","date":"2017-2-12","week":"0","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"13","date":"2017-2-13","week":"1","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"14","date":"2017-2-14","week":"2","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"15","date":"2017-2-15","week":"3","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"16","date":"2017-2-16","week":"4","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"17","date":"2017-2-17","week":"5","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"18","date":"2017-2-18","week":"6","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"19","date":"2017-2-19","week":"0","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"20","date":"2017-2-20","week":"1","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"21","date":"2017-2-21","week":"2","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"22","date":"2017-2-22","week":"3","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"23","date":"2017-2-23","week":"4","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"24","date":"2017-2-24","week":"5","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"25","date":"2017-2-25","week":"6","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"26","date":"2017-2-26","week":"0","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"27","date":"2017-2-27","week":"1","price":398,"is_buy":"0","is_select":"0","set":"10"},{"num":"28","date":"2017-2-28","week":"2","price":398,"is_buy":"0","is_select":"0","set":"10"}]
     */

    private DatasBean datas;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DatasBean getDatas() {
        return datas;
    }

    public void setDatas(DatasBean datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        private String month;
        private String last_month;
        private String next_month;
        /**
         * num : 1
         * date : 2017-2-1
         * week : 3
         * price : 398
         * is_buy : 0
         * is_select : 0
         * set : 10
         */

        private List<DaysBean> days;

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getLast_month() {
            return last_month;
        }

        public void setLast_month(String last_month) {
            this.last_month = last_month;
        }

        public String getNext_month() {
            return next_month;
        }

        public void setNext_month(String next_month) {
            this.next_month = next_month;
        }

        public List<DaysBean> getDays() {
            return days;
        }

        public void setDays(List<DaysBean> days) {
            this.days = days;
        }

        public static class DaysBean {
            private String num;
            private String date;
            private String week;
            private int price;
            private String is_buy;
            private String is_select;
            private String set;

            public String getNum() {
                return num;
            }

            public void setNum(String num) {
                this.num = num;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public String getIs_buy() {
                return is_buy;
            }

            public void setIs_buy(String is_buy) {
                this.is_buy = is_buy;
            }

            public String getIs_select() {
                return is_select;
            }

            public void setIs_select(String is_select) {
                this.is_select = is_select;
            }

            public String getSet() {
                return set;
            }

            public void setSet(String set) {
                this.set = set;
            }
        }
    }
}
