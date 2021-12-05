package com.luoxiang.project.bean;

import java.util.List;

/**
 * projectName: 	    ProjectWeb
 * packageName:	        com.luoxiang.project.bean
 * className:	        ServerBean
 * author:	            Luoxiang
 * time:	            2018/3/18	8:07
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2018/3/18
 * upDateDesc:	        TODO
 */


public class ServerBean {

    /**
     * rows : [{
     * "aab004":"广州市司法局",
     * "aab019":3,"aab119":9,
     * "aae036":1521273600000,
     * "bab301":"01",
     * "bfe301":"10100011801001",
     * "bfe3a4":"主任科员以下",
     * "id":{"bfa001":"201801","bfz315":"30996"}},{
     * "aab004":"广州市司法局",
     * "aab019":3,"aab119":9,
     * "aae036":1521273600000,
     * "bab301":"01",
     * "bfe301":"10100011801002","bfe3a4":"主任科员以下","id":{"bfa001":"201801","bfz315":"31007"}}]
     * total : 294
     */

    private int total;
    private List<RowsBean> rows;

    public int getTotal() { return total;}

    public void setTotal(int total) { this.total = total;}

    public List<RowsBean> getRows() { return rows;}

    public void setRows(List<RowsBean> rows) { this.rows = rows;}

    public static class RowsBean {
        /**
         * aab004 : 广州市司法局
         * aab019 : 3
         * aab119 : 9
         * aae036 : 1521273600000
         * bab301 : 01
         * bfe301 : 10100011801001
         * bfe3a4 : 主任科员以下
         * id : {"bfa001":"201801","bfz315":"30996"}
         */

        private String aab004;
        private int    aab019;
        private int    aab119;
        private long   aae036;
        private String bab301;
        private String bfe301;
        private String bfe3a4;
        private IdBean id;

        public String getAab004() { return aab004;}

        public void setAab004(String aab004) { this.aab004 = aab004;}

        public int getAab019() { return aab019;}

        public void setAab019(int aab019) { this.aab019 = aab019;}

        public int getAab119() { return aab119;}

        public void setAab119(int aab119) { this.aab119 = aab119;}

        public long getAae036() { return aae036;}

        public void setAae036(long aae036) { this.aae036 = aae036;}

        public String getBab301() { return bab301;}

        public void setBab301(String bab301) { this.bab301 = bab301;}

        public String getBfe301() { return bfe301;}

        public void setBfe301(String bfe301) { this.bfe301 = bfe301;}

        public String getBfe3a4() { return bfe3a4;}

        public void setBfe3a4(String bfe3a4) { this.bfe3a4 = bfe3a4;}

        public IdBean getId() { return id;}

        public void setId(IdBean id) { this.id = id;}

        public static class IdBean {
            /**
             * bfa001 : 201801
             * bfz315 : 30996
             */

            private String bfa001;
            private String bfz315;

            public String getBfa001() { return bfa001;}

            public void setBfa001(String bfa001) { this.bfa001 = bfa001;}

            public String getBfz315() { return bfz315;}

            public void setBfz315(String bfz315) { this.bfz315 = bfz315;}
        }

        @Override
        public String toString() {
            return "单位：='" + aab004  + ", 代码=" + bfe301 ;
        }
    }
}
