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
public class HoaDon implements Serializable{
    private KhachHang khachHang;
    private DichVu dichVu;
    private int soLuong;

    public HoaDon(KhachHang khachHang, DichVu dichVu, int soLuong) {
        this.khachHang = khachHang;
        this.dichVu = dichVu;
        this.soLuong = soLuong;
    }

    public HoaDon() {
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
