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
public class DienThoai implements Serializable{
    private int ma;
    private String hangSX, model;
    private double donGia;

    public DienThoai(int ma, String hangSX, String model, double donGia) {
        this.ma = ma;
        this.hangSX = hangSX;
        this.model = model;
        this.donGia = donGia;
    }

    public DienThoai() {
    }

    public int getMa() {
        return ma;
    }

    public String getHangSX() {
        return hangSX;
    }

    public String getModel() {
        return model;
    }

    public double getDonGia() {
        return donGia;
    }
    
    
}
