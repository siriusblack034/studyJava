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
public class KhachHang implements Serializable{
    private int maKH;
    private String hoTen,diaChi;
    private int SDT;
    public KhachHang() {
        
    }

    public KhachHang(int maKH, String hoTen, String diaChi, int SDT) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.SDT = SDT;
    }

  

    

    public int getMaKH() {
        return maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getSDT() {
        return SDT;
    }

    
    
}
