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
public class KieuBaiViet implements Serializable{
    private int ma;
    private String tenBai;
    private double gia;

    public KieuBaiViet(int ma, String tenBai, double gia) {
        this.ma = ma;
        this.tenBai = tenBai;
        this.gia = gia;
    }

    public KieuBaiViet() {
    }

    public int getMa() {
        return ma;
    }

    public String getTenBai() {
        return tenBai;
    }

    public double getGia() {
        return gia;
    }
    
}
