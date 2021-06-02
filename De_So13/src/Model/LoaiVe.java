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
    private String moTa;
    private double gia;

    public LoaiVe(int ma, String moTa, double gia) {
        this.ma = ma;
        this.moTa = moTa;
        this.gia = gia;
    }

    public LoaiVe() {
    }

    public int getMa() {
        return ma;
    }

    public String getMoTa() {
        return moTa;
    }

    public double getGia() {
        return gia;
    }
    
}
