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
public class DuAn implements Serializable{
    private int ma;
    private String ten, kieuDuAn;
    private  double tongKinhPhi;

    public DuAn() {
    }

    public DuAn(int ma, String ten, String kieuDuAn, double tongKinhPhi) {
        this.ma = ma;
        this.ten = ten;
        this.kieuDuAn = kieuDuAn;
        this.tongKinhPhi = tongKinhPhi;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getKieuDuAn() {
        return kieuDuAn;
    }

    public double getTongKinhPhi() {
        return tongKinhPhi;
    }
    
}
