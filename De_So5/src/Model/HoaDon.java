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
public class HoaDon implements Serializable  {
    private KhachHang khachHang;
    private MatHang matHang;
    private int soLuong;

    public HoaDon() {
    }

    public HoaDon(KhachHang khachHang, MatHang matHang, int soLuong) {
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public MatHang getMatHang() {
        return matHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
