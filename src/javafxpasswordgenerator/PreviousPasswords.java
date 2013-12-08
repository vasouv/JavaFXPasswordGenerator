/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxpasswordgenerator;

import java.util.LinkedList;

/**
 *
 * @author vasouv
 */
public class PreviousPasswords {
    
    LinkedList prevPass;
    
    public PreviousPasswords() {
        prevPass = new LinkedList();
    }
    
    public void add(String pass) {
        if(isFull()) {
            removeFirst();
        }
        prevPass.add(pass);
    }
    
    private void removeFirst() {
        prevPass.removeFirst();
    }
    
    private boolean isFull() {
        return prevPass.size() == 8;
    }
    
}
