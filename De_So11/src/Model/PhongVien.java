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
public class PhongVien implements Serializable{
    private int maPV;
    private String hoTen, diaChi, loaiPV;

    public PhongVien() {
    }

    public PhongVien(int maPV, String hoTen, String diaChi, String loaiPV) {
        this.maPV = maPV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiPV = loaiPV;
    }

    public int getMaPV() {
        return maPV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getLoaiPV() {
        return loaiPV;
    }
    
}
