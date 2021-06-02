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
public class HanhKhach implements Serializable{
    private int ma;
    private String hoTen, diaChi, loai;

    public HanhKhach() {
    }

    public HanhKhach(int ma, String hoTen, String diaChi, String loai) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loai = loai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    
   

    public int getMa() {
        return ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    

    public String getLoai() {
        return loai;
    }
    
}
