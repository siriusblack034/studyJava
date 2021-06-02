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
    private int ma;
    private String hoTen, diaChi, nhom;

    public KhachHang() {
    }

    public KhachHang(int ma, String hoTen, String diaChi, String nhom) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.nhom = nhom;
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

    public String getNhom() {
        return nhom;
    }

    
    
}
