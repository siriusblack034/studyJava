/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Admin88
 */
public class HandleException extends Exception{
    private String s;
    public HandleException() {
    }

    public HandleException(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
   
}
