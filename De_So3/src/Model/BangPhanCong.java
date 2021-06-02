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
public class BangPhanCong implements Serializable{
    private NhanVien nhanVien;
    private DuAn duAn;
    private int soNgay;
    private String viTri;
    public BangPhanCong() {
        
    }

    public BangPhanCong(NhanVien nhanVien, DuAn duAn, int soNgay, String viTri) {
        this.nhanVien = nhanVien;
        this.duAn = duAn;
        this.soNgay = soNgay;
        this.viTri = viTri;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public DuAn getDuAn() {
        return duAn;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public String getViTri() {
        return viTri;
    }

   
   
    
}
