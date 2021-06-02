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
public class PhongBan  implements Serializable{
    private int maPhong, heSo;
    private String tenPhong, moTa;
    
    public PhongBan(int maPhong, int heSo, String tenPhong, String moTa) {
        this.maPhong = maPhong;
        this.heSo = heSo;
        this.tenPhong = tenPhong;
        this.moTa = moTa;
    }

    public PhongBan() {
    }

    public int getMaPhong() {
        return maPhong;
    }

    public int getHeSo() {
        return heSo;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public String getMoTa() {
        return moTa;
    }
    
    
}
