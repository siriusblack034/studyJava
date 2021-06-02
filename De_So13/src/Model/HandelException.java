/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Admin88
 */
public class HandelException extends Exception{
    private String mess;

    public HandelException(String mess) {
        this.mess = mess;
    }

    public String getMess() {
        return mess;
    }

    public HandelException() {
    }
    
}
