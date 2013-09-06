/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxpasswordgenerator;

import java.util.Random;

/**
 *
 * @author vasouv
 */
public class Password {
    
    private final String NUMBERS = "0123456789";
    private final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String SPECIAL = "@#$%^&*()?";
    private final String ALLCHARS = NUMBERS + LOWERCASE + UPPERCASE + SPECIAL;
    private int passwordLength = 8; //Assigning the minimum length of the password
    
    public Password(){}

    public int getPasswordLength() {
	return passwordLength;
    }

    public void setPasswordLength(int passwordLength) {
	this.passwordLength = passwordLength;
    }
    
    public String generatePassword(int passLength) {
	StringBuilder tempPassword = new StringBuilder();
	Random randNumber = new Random();
	
	for(int i = 0; i < passLength; i++) {
	    tempPassword.append(ALLCHARS.charAt(randNumber.nextInt(ALLCHARS.length())));
	}
	
	
	return tempPassword.toString();
    }
    
}
