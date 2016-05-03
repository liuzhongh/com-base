package com.shangkang.core.dto;

import java.io.Serializable;

/**
 * Created by lizhou on 2016/3/23
 */
public class RequestModel<T> implements Serializable{

    private static final long serialVersionUID = 7112680814515143153L;

    private int pageNo =1;
    private int pageSize = 15;
    private boolean paginationFlag = true;

    private T param;

    public RequestModel() {
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

    public boolean isPaginationFlag() {
        return paginationFlag;
    }

    public void setPaginationFlag(boolean paginationFlag) {
        this.paginationFlag = paginationFlag;
    }

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }

    public RequestModel(int pageNo, int pageSize, boolean paginationFlag, T param) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.paginationFlag = paginationFlag;
        this.param = param;
    }

    @Override
    public String toString() {
        return "RequestModel{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", paginationFlag=" + paginationFlag +
                ", param=" + param +
                '}';
    }
}
