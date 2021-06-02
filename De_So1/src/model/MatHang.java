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
public class MatHang implements Serializable{
    private int maHang;
    private String tenHang, nhomHang;
    private double giaBan;
    
    public MatHang() {
    }

    public MatHang(int maHang,String tenHang, String nhomHang, double giaBan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaBan = giaBan;
    }

    public int getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public String getNhomHang() {
        return nhomHang;
    }

    public double getGiaBan() {
        return giaBan;
    }

    
    
}
