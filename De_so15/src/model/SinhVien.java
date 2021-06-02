/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Admin88
 */
public class SinhVien implements Serializable{
    private int ma;
    private String hoTen, diaChi, ngaySinh, lop;

    public SinhVien(int ma, String hoTen, String diaChi, String ngaySinh, String lop) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
    }

    public SinhVien() {
    }

    public int getMa() {
        return ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getLop() {
        return lop;
    }
    
}
