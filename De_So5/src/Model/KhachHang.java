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
public class KhachHang implements Serializable{
    private int Ma;
    private String ten, diaChi, nhom;

    public KhachHang() {
    }

    public KhachHang(int Ma, String ten, String diaChi, String nhom) {
        this.Ma = Ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.nhom = nhom;
    }

    public int getMa() {
        return Ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getNhom() {
        return nhom;
    }
    
}
