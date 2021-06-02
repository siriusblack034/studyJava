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
public class DanhSach implements Serializable{
    private NhanVien nhanVien;
    private MatHang matHang;
    private int soLuong;

    public DanhSach(NhanVien nhanVien, MatHang matHang, int soLuong) {
        this.nhanVien = nhanVien;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }

    public DanhSach() {
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public MatHang getMatHang() {
        return matHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
