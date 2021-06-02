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
public class HoaDon implements Serializable{
    private NguoiMua nguoiMua;
    private LoaiVe loaiVe;
    private int soLuong;

    public HoaDon(NguoiMua nguoiMua, LoaiVe loaiVe, int soLuong) {
        this.nguoiMua = nguoiMua;
        this.loaiVe = loaiVe;
        this.soLuong = soLuong;
    }

    public NguoiMua getNguoiMua() {
        return nguoiMua;
    }

    public LoaiVe getLoaiVe() {
        return loaiVe;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
