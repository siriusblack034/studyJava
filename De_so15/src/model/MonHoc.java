/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Admin88
 */
public class MonHoc implements Serializable{
    private int ma, soDvht;
    private String tenMon, loaiMon;

    public MonHoc() {
    }

    public MonHoc(int ma, int soDvht, String tenMon, String loaiMon) {
        this.ma = ma;
        this.soDvht = soDvht;
        this.tenMon = tenMon;
        this.loaiMon = loaiMon;
    }

    public int getMa() {
        return ma;
    }

    public int getSoDvht() {
        return soDvht;
    }

    public String getTenMon() {
        return tenMon;
    }

    public String getLoaiMon() {
        return loaiMon;
    }
    
}
