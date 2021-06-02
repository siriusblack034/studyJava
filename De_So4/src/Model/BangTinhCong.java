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
    private CongNhan congNhan;
    private SanPham sp;
    private int soLuong;

    public BangTinhCong() {
    }

    public BangTinhCong(CongNhan congNhan, SanPham sp, int soLuong) {
        this.congNhan = congNhan;
        this.sp = sp;
        this.soLuong = soLuong;
    }

    public CongNhan getCongNhan() {
        return congNhan;
    }

    public SanPham getSp() {
        return sp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
