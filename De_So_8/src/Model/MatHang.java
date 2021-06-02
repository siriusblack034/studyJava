/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Admin88
 */
public class MatHang implements Serializable{
    private int ma;
    private String ten, nhom;
    private double giaMua,giaBan;

    public MatHang(int ma, String ten, String nhom, double giaMua, double giaBan) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public MatHang() {
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getNhom() {
        return nhom;
    }

    public double getGiaMua() {
        return giaMua;
    }

    public double getGiaBan() {
        return giaBan;
    }
    
}
