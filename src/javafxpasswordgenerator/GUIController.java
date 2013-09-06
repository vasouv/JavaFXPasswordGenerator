/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxpasswordgenerator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author vasouv
 */
public class GUIController implements Initializable {
    
    //Create the Password object
    Password genPassword = new Password();
    
    @FXML
    Button generateButton;
    
    @FXML
    TextField passwordTextField;
    
    @FXML
    private void createPassword() {
	passwordTextField.setText(genPassword.generatePassword(8));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
	// TODO
    }    
    
}
