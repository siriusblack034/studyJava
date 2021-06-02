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
    private int maCN, bacTho;
    private String hoTen, diaChi, SDT;

    public CongNhan() {
    }

    public CongNhan(int maCN, int bacTho, String hoTen, String diaChi, String SDT) {
        this.maCN = maCN;
        this.bacTho = bacTho;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.SDT = SDT;
    }

    public int getMaCN() {
        return maCN;
    }

    public int getBacTho() {
        return bacTho;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSDT() {
        return SDT;
    }
    
}
