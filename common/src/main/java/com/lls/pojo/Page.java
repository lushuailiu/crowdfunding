package com.lls.pojo;

import java.util.List;

public class Page<T> {
    private List<T> list;

    private int pageNo;

    private int pageSize;

    private int totalNo;

    private int totalPage;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalNo() {
        return totalNo;
    }

    public void setTotalNo(int totalNo) {
        this.totalNo = totalNo;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
