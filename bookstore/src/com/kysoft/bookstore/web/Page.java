package com.kysoft.bookstore.web;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ky_pc
 * Date: 17-9-21
 * Time: 下午5:21
 * To change this template use File | Settings | File Templates.
 */
public class Page<T> {

    private int pageNo;

    private List<T> list;

    private int pageSize = 3;

    private long totalItemNumber;

    public Page(int pageNo) {
        super();
        this.pageNo = pageNo;
    }

    public int getPageNo() {
        if(pageNo < 0){
            pageNo = 1;
        }

        if(pageNo > getTotalPageNumber()){
            pageNo = getTotalPageNumber();
        }

        return pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getTotalPageNumber(){
        int totalPageNumber = (int)totalItemNumber / pageSize;
        if(totalItemNumber % pageSize != 0 ){
            totalPageNumber++;
        }
        return totalPageNumber;
    }

    public void setTotalItemNumber(long totalItemNumber) {
        this.totalItemNumber = totalItemNumber;
    }

    public boolean isHasNext(){
        return pageNo < getTotalPageNumber();
    }

    public boolean isHasPrev(){
        return getPageNo() > 1;
    }

    public int getNextPage(){
        if(isHasNext()){
            return getPageNo() - 1;
        }
        return getPageNo();
    }

    public int getPrevPage(){
        if(isHasPrev()){
            return getPageNo() + 1;
        }
        return getPageNo();
    }

}

