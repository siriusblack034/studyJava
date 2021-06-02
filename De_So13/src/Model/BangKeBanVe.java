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
public class BangKeBanVe implements Serializable{
    private HanhKhach hanhKhach;
    private LoaiVe loaiVe;

    public BangKeBanVe() {
    }

    public BangKeBanVe(HanhKhach hanhKhach, LoaiVe loaiVe) {
        this.hanhKhach = hanhKhach;
        this.loaiVe = loaiVe;
    }

    public HanhKhach getHanhKhach() {
        return hanhKhach;
    }

    public LoaiVe getLoaiVe() {
        return loaiVe;
    }
    
}
