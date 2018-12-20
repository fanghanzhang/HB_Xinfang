package com.ironghui.hb_xinfang.bean;

import java.util.List;

public class OpenCaseBean {


    /**
     * pager : {"count":991,"currentPage":1,"pageCount":100,"resultList":[["ff80808167ba42030167c5c1314a47bf","4218120909318985","湖北省随州市随州市市直黄先涛",null,{"date":18,"day":2,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1545062400000,"timezoneOffset":-480,"year":118}],["ff80808167ba42030167c5bfd44247a7","4218120512408934","湖北省随州市曾都区庹海涛",null,{"date":17,"day":1,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1544976000000,"timezoneOffset":-480,"year":118}],["ff80808167b9bc3f0167c01ce0f72860","4218121215156598","湖北省随州市曾都区洛阳镇珠宝山村九组杨学森",null,{"date":14,"day":5,"hours":9,"minutes":18,"month":11,"nanos":0,"seconds":50,"time":1544750330000,"timezoneOffset":-480,"year":118}],["ff808081679caab40167a173e4161594","4218120722246268","湖北省随州市广水市布厚明",null,{"date":10,"day":1,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1544371200000,"timezoneOffset":-480,"year":118}],["ff808081679caab40167a17443a9159d","4218120414474753","湖北省随州市曾都区刘小强",null,{"date":7,"day":5,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1544112000000,"timezoneOffset":-480,"year":118}],["ff808081679caab40167a17b77f51609","4218112307332230","湖北省随州市曾都区杨光林",null,{"date":6,"day":4,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1544025600000,"timezoneOffset":-480,"year":118}],["ff80808167ba42030167c5c19afc47cb","4218120413594635","湖北省襄阳市保康县都正丽",null,{"date":6,"day":4,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1544025600000,"timezoneOffset":-480,"year":118}],["ff80808167ba42030167c5c1da3547ce","4218120317217283","湖北省随州市随县曾凡阳",null,{"date":4,"day":2,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1543852800000,"timezoneOffset":-480,"year":118}],["ff808081675d8a33016771f4813c3574","4218111409268838","沙洋县李某信访事项办理情况",null,{"date":3,"day":1,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1543766400000,"timezoneOffset":-480,"year":118}],["ff808081679caab40167a1751ab415b4","4218113013399777","湖北省随州市曾都区张向阳",null,{"date":3,"day":1,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1543766400000,"timezoneOffset":-480,"year":118}]]}
     */

    private PagerBean pager;

    public PagerBean getPager() {
        return pager;
    }

    public void setPager(PagerBean pager) {
        this.pager = pager;
    }

    public static class PagerBean {
        /**
         * count : 991
         * currentPage : 1
         * pageCount : 100
         * resultList : [["ff80808167ba42030167c5c1314a47bf","4218120909318985","湖北省随州市随州市市直黄先涛",null,{"date":18,"day":2,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1545062400000,"timezoneOffset":-480,"year":118}],["ff80808167ba42030167c5bfd44247a7","4218120512408934","湖北省随州市曾都区庹海涛",null,{"date":17,"day":1,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1544976000000,"timezoneOffset":-480,"year":118}],["ff80808167b9bc3f0167c01ce0f72860","4218121215156598","湖北省随州市曾都区洛阳镇珠宝山村九组杨学森",null,{"date":14,"day":5,"hours":9,"minutes":18,"month":11,"nanos":0,"seconds":50,"time":1544750330000,"timezoneOffset":-480,"year":118}],["ff808081679caab40167a173e4161594","4218120722246268","湖北省随州市广水市布厚明",null,{"date":10,"day":1,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1544371200000,"timezoneOffset":-480,"year":118}],["ff808081679caab40167a17443a9159d","4218120414474753","湖北省随州市曾都区刘小强",null,{"date":7,"day":5,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1544112000000,"timezoneOffset":-480,"year":118}],["ff808081679caab40167a17b77f51609","4218112307332230","湖北省随州市曾都区杨光林",null,{"date":6,"day":4,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1544025600000,"timezoneOffset":-480,"year":118}],["ff80808167ba42030167c5c19afc47cb","4218120413594635","湖北省襄阳市保康县都正丽",null,{"date":6,"day":4,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1544025600000,"timezoneOffset":-480,"year":118}],["ff80808167ba42030167c5c1da3547ce","4218120317217283","湖北省随州市随县曾凡阳",null,{"date":4,"day":2,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1543852800000,"timezoneOffset":-480,"year":118}],["ff808081675d8a33016771f4813c3574","4218111409268838","沙洋县李某信访事项办理情况",null,{"date":3,"day":1,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1543766400000,"timezoneOffset":-480,"year":118}],["ff808081679caab40167a1751ab415b4","4218113013399777","湖北省随州市曾都区张向阳",null,{"date":3,"day":1,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1543766400000,"timezoneOffset":-480,"year":118}]]
         */

        private int count;
        private int currentPage;
        private int pageCount;
        private List<List<Object>> resultList;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public List<List<Object>> getResultList() {
            return resultList;
        }

        public void setResultList(List<List<Object>> resultList) {
            this.resultList = resultList;
        }
    }
}
