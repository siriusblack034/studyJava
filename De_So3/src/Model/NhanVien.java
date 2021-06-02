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
public class NhanVien implements Serializable{
    private int ma;
    private String ten, diaChi,chuyenMon;

    public NhanVien() {
    }

    public NhanVien(int ma, String ten, String diaChi, String chuyenMon) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.chuyenMon = chuyenMon;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }
    
}
