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
public class LoaiVe implements Serializable{
    private int ma;
    private String loai;
    private double gia;

    public LoaiVe() {
    }

    public LoaiVe(int ma, String loai, double gia) {
        this.ma = ma;
        this.loai = loai;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public String getLoai() {
        return loai;
    }

    public double getGia() {
        return gia;
    }
    
}
