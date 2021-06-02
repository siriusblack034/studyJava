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
public class SanPham implements Serializable{
    private int ma;
    private String ten;
    private double gia;

    public SanPham(int ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    public SanPham() {
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public double getGia() {
        return gia;
    }
    
}
