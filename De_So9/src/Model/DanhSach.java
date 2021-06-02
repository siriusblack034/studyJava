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
    private CongNhan congNhan;
    private XuongSanXuat xuongSanXuat;
    private int soNgay;

    public DanhSach(CongNhan congNhan, XuongSanXuat xuongSanXuat, int soNgay) {
        this.congNhan = congNhan;
        this.xuongSanXuat = xuongSanXuat;
        this.soNgay = soNgay;
    }

    public DanhSach() {
    }

    public CongNhan getCongNhan() {
        return congNhan;
    }

    public XuongSanXuat getXuongSanXuat() {
        return xuongSanXuat;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    
}
