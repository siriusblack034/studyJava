/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Admin88
 */
public class DanhSachCong implements Serializable {

    private PhongBan phongBan;
    private Map<NhanVien, Integer> items;

    public DanhSachCong() {
        items = new HashMap<>();
    }

    public DanhSachCong(PhongBan phongBan, NhanVien nv, int ngay) {
        this();
        this.phongBan = phongBan;
        items.put(nv, ngay);
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }

    public Map<NhanVien, Integer> getItems() {
        return items;
    }

    public void setItems(NhanVien nv, int ngay) {
        Set<NhanVien> set = items.keySet();
        for (NhanVien nhanVien : set) {
            if (nhanVien.getMa() == nv.getMa()) {
                ngay += items.get(nhanVien);
                items.remove(nhanVien);
                items.put(nv, ngay);
                return;
            }
        }

        items.put(nv, ngay);

    }

}
