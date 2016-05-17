
package com.example.baok2n.recycleviewdemo.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListProduct {

    @SerializedName("products")
    @Expose
    private List<Product_> listProduct;

    /**
     * 
     * @return
     *     The listProduct
     */
    public List<Product_> getListProduct() {
        return listProduct;
    }

    /**
     * 
     * @param listProduct
     *     The listProduct
     */
    public void setListProduct(List<Product_> listProduct) {
        this.listProduct = listProduct;
    }

}
