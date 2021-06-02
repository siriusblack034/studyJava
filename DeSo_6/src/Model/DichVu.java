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
public class DichVu implements Serializable{
    private int ma;
    private String ten, donVi;
    private double gia;

    public DichVu() {
    }

    public DichVu(int ma, String ten, String donVi, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.donVi = donVi;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDonVi() {
        return donVi;
    }

    public double getGia() {
        return gia;
    }
    
}
