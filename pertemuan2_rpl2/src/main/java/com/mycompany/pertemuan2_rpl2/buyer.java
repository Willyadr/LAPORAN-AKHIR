package com.mycompany.pertemuan2_rpl2;

/**
 *
 * @author ASUS
 */
public class buyer extends User {

    @Override
    public void login() {
        System.out.println("Buyer melakukan Login");
    }

    @Override
    public void logout() {
        System.out.println("Buyer melakukan Logout");
    }

}
