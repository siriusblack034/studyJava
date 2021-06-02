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
public class CongNhan implements Serializable{
    private int ma;
    private String ten, diaChi, CaSx;

    public CongNhan() {
    }

    public CongNhan(int ma, String ten, String diaChi, String CaSx) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.CaSx = CaSx;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getCaSx() {
        return CaSx;
    }
    
}
