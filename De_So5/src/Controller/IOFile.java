/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
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

    public <T> void writeFile(List<T> list, String name) {
        try {
            FileOutputStream f = new FileOutputStream(name);
            ObjectOutputStream o = new ObjectOutputStream(f);
            for (T t : list) {
                o.writeObject(t);
            }
            o.close();
            f.close();
        } catch (Exception e) {
        }
    }

    public <T> List<T> readFile(String name) {
        List<T> list = new ArrayList<>();
        try {
            FileInputStream f = new FileInputStream(name);
            ObjectInputStream o = new ObjectInputStream(f);
            T data = (T) o.readObject();
            while (data != null) {
                list.add(data);
                data = (T) o.readObject();
            }
            o.close();
            f.close();
        } catch (Exception e) {
            return list;
        }
        return list;
    }
}