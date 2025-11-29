package com.mycompany.pertemuan2_rpl2;

/**
 * @author ASUS
 */
public class seller extends User {
    private String product;

    public void addProduct(String productName) {
        System.out.println("Seller menambahkan produk: " + productName);
        this.product = productName;
    }

    public String getProduct() {
        return product;
    }
}