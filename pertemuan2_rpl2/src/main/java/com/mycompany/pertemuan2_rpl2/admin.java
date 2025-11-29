/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan2_rpl2;

/**
 * @author ASUS
 */
public class admin extends User {

    @Override
    public void login() {
        System.out.println("Admin melakukan Login");
    }

    @Override
    public void logout() {
        System.out.println("Admin melakukan Logout");
    }

    public void manageUser() {
        System.out.println("Admin mengelola user!");
    }
}