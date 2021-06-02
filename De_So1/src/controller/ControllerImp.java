/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DanhSachMua;
import model.KhachHang;
import model.MatHang;

/**
 *
 * @author Admin88
 */
public class ControllerImp implements Controller{

    @Override
    public <T> void writeFile(List<T> list, String nameFile) {
        FileOutputStream f =null;
        try {
            f = new FileOutputStream(nameFile);
            ObjectOutputStream o = new ObjectOutputStream(f);
            for(T t : list){
                o.writeObject(t);
            }
        } catch (Exception e) {
            System.out.println("Exception writeFIle");
        }
        finally{
            try {
                f.close();
            } catch (IOException ex) {
                Logger.getLogger(ControllerImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public <T> List<T> readFile(String nameFile) {
        FileInputStream f = null;
       // ObjectInputStream = null; roi dong 2 cái này ở finnally
        List <T> list = new ArrayList<>();
        try {
            f = new FileInputStream(nameFile);
            ObjectInputStream o = new ObjectInputStream(f);
            T t =  (T) o.readObject();
            while(t != null){
                list.add(t);
                t = (T) o.readObject();
            }
            
            f.close();
            o.close();
        } catch (Exception e) {
            return list;
        }
        
        return list;
    }

    @Override
    public <T> List<T> sortName(List<T> list) {
        list.sort(new Comparator<T> () {
            @Override
            public int compare(T o1, T o2) {
                if(o1 instanceof KhachHang){
                    KhachHang kh1 = (KhachHang) o1;
                    KhachHang kh2 = (KhachHang) o2;
                    return kh1.getHoTen().compareToIgnoreCase(kh2.getHoTen());
                }
                else if(o1 instanceof MatHang){
                    MatHang kh1 = (MatHang) o1;
                    MatHang kh2 = (MatHang) o2;
                    return kh1.getTenHang().compareToIgnoreCase(kh2.getTenHang());
                }
                else if(o1 instanceof DanhSachMua){
                    DanhSachMua ds1 = (DanhSachMua) o1;
                    DanhSachMua ds2 = (DanhSachMua) o2;
                    return ds1.getKhachHang().getHoTen().compareToIgnoreCase(ds2.getKhachHang().getHoTen());
                }
                return 0;
            }
        });
        return list;
    }

    @Override
    public <T> List<T> searchName(List<T> list, String key) {
        List<T> list1 = new ArrayList<T>();
        for(T t : list){
            if(t instanceof MatHang){
                if((((MatHang) t).getMaHang() +"").matches(".*" + key + ".*")){
                    list1.add(t);
                }
            }
            else if(t instanceof KhachHang){
                if((((KhachHang) t).getMaKH()+"").matches(".*" + key + ".*")){
                    list1.add(t);
                }
            }
        }
        return list1;
    }
    
}
