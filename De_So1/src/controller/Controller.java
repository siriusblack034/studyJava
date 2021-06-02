/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;

/**
 *
 * @author Admin88
 */
public interface Controller {
    <T> void writeFile(List<T> list, String fileName);
    
    <T> List<T> readFile(String fileName);
    
    <T> List<T> sortName(List<T> List);
    
    <T> List<T> searchName(List<T> list, String key);
}
