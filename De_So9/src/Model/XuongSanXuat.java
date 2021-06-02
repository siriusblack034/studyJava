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
public class XuongSanXuat implements Serializable{
    private int maX, heSoCV;
    private String tenXuong, moTa;

    public XuongSanXuat(int maX, int heSoCV, String tenXuong, String moTa) {
        this.maX = maX;
        this.heSoCV = heSoCV;
        this.tenXuong = tenXuong;
        this.moTa = moTa;
    }

    public XuongSanXuat() {
    }

    public int getMaX() {
        return maX;
    }

    public int getHeSoCV() {
        return heSoCV;
    }

    public String getTenXuong() {
        return tenXuong;
    }

    public String getMoTa() {
        return moTa;
    }
    
}
