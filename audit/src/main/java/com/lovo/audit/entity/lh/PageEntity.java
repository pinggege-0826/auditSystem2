package com.lovo.audit.entity.lh;

import java.io.Serializable;
import java.util.List;

public class PageEntity<T> implements Serializable {

    private List<T> list;

    private int totalPage;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
