/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;
import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Admin88
 */
public class DanhSachMua implements Serializable{
    private Map<MatHang,Integer> items;
    private KhachHang khachHang;
   
    public DanhSachMua() {
        items = new HashMap<>();
    }

    public DanhSachMua(MatHang mh,int sl,KhachHang khachHang) {
        this();
        items.put(mh, sl);
        this.khachHang = khachHang;
    }

    public Map<MatHang, Integer> getItems() {
        return items;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

   

    public void setItems(MatHang mh, int sl) {
        Set <MatHang> set  = items.keySet();
        int check =0;
        for(MatHang mh1 : set){
            if(mh1.getMaHang() == mh.getMaHang()){
                int soLuong = items.get(mh1);
                items.remove(mh1);
                items.put(mh1, soLuong+ sl);
                check = 1;
                return;
            }
        }
        items.put(mh, sl);
    }

    
    
    
  
  
}
