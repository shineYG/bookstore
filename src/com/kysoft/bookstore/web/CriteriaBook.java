package com.kysoft.bookstore.web;

/**
 * Created with IntelliJ IDEA.
 * User: ky_pc
 * Date: 17-9-21
 * Time: 下午5:51
 * To change this template use File | Settings | File Templates.
 */
public class CriteriaBook {

    private float minPrice = 0;

    private float maxPrice = Integer.MAX_VALUE;

    private int pageNo;

    public CriteriaBook() {
    }

    public CriteriaBook(float minPrice, float maxPrice, int pageNo) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.pageNo = pageNo;
    }

    public float getMinPrice() {
        return minPrice;
    }

    public float getMaxPrice() {
        return maxPrice;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setMinPrice(float minPrice) {
        this.minPrice = minPrice;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public void setMaxPrice(float maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public String toString() {
        return "CriteriaBook{" +
                "minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                ", pageNo=" + pageNo +
                '}';
    }
}
