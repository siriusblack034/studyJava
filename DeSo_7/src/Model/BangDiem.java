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
public class BangDiem implements Serializable{
    private SinhVien sinhVien;
    private MonHoc monHoc;
    private double diem;

    public BangDiem(SinhVien sinhVien, MonHoc monHoc, double diem) {
        this.sinhVien = sinhVien;
        this.monHoc = monHoc;
        this.diem = diem;
    }

    public BangDiem() {
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
    
}
