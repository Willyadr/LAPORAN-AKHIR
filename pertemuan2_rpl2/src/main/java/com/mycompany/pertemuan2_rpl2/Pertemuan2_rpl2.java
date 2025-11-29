/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan2_rpl2;



/**
 * @author ASUS
 */
public class Pertemuan2_rpl2 {
    public static void main(String[] args) {
        User user = new User();
        user.login();
        user.logout();
        
        seller seller = new seller();
         seller.addProduct("Nasi Goreng");
         
         buyer buyer = new buyer();
buyer.login();
buyer.logout();

 admin admin = new admin();
        admin.login();
        admin.manageUser();
        admin.logout();

    } 
}