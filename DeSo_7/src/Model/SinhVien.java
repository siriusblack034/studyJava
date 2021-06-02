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
public class SinhVien implements Serializable{
    private int ma;
    private String hoTen, diaChi, lop, ngaySinh;

    public SinhVien() {
    }

    public SinhVien(int ma, String hoTen, String diaChi, String lop, String ngaySinh) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
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

    public String getLop() {
        return lop;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }
    
}
