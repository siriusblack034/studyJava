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
public class BangDiem implements Serializable{
    private SinhVien sinhVien;
    private MonHoc monHoc;
    private int diem ;

    public BangDiem() {
    }

    public BangDiem(SinhVien sinhVien, MonHoc monHoc, int diem) {
        this.sinhVien = sinhVien;
        this.monHoc = monHoc;
        this.diem = diem;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public int getDiem() {
        return diem;
    }

    
    
}
