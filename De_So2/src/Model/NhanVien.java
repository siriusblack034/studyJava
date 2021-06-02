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
public class NhanVien implements Serializable {
    private int ma, bacLuong;
    private String hoTen,diaChi, sdt;
   
    public NhanVien() {
        
    }

   
   

    public NhanVien(int ma, int bacLuong, String hoTen, String diaChi, String sdt) {
   
        this.ma = ma;
        this.bacLuong = bacLuong;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public int getMa() {
        return ma;
    }

    public int getBacLuong() {
        return bacLuong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSdt() {
        return sdt;
    }
    
    
    
}
