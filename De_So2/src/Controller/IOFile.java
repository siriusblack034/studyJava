/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin88
 */
public class IOFile {

    public IOFile() {
    }
    public <T> void writeFile(List<T> list, String nameFile){
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
                
            }
        }
    }
    public <T> List<T> readFile(String nameFile){
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
}
