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
public class BangTinhCong implements Serializable{
    private PhongVien phongVien;
    private KieuBaiViet kieuBaiViet;
    private int soLuong;

    public PhongVien getPhongVien() {
        return phongVien;
    }

    public KieuBaiViet getKieuBaiViet() {
        return kieuBaiViet;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public BangTinhCong() {
    }

    public BangTinhCong(PhongVien phongVien, KieuBaiViet kieuBaiViet, int soLuong) {
        this.phongVien = phongVien;
        this.kieuBaiViet = kieuBaiViet;
        this.soLuong = soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
