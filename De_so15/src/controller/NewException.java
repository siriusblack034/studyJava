/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Admin88
 */
public class NewException extends Exception{
    private String mess;

    public NewException(String mess) {
        this.mess = mess;
    }

    public NewException() {
    }

    public String getMess() {
        return mess;
    }
    
}
