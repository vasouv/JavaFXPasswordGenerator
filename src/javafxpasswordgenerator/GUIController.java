package javafxpasswordgenerator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
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
    CheckBox upperChoice, lowerChoice, numbersChoice, specialChoice;
    
    @FXML
    ComboBox passwordLengthCombo;
    
    @FXML
    private void createPassword(ActionEvent e) {
	passwordTextField.setText(genPassword.generatePassword(
                Integer.parseInt(passwordLengthCombo.getSelectionModel().getSelectedItem().toString()), 
                numbersChoice.isSelected(), 
                lowerChoice.isSelected(), 
                upperChoice.isSelected(), 
                specialChoice.isSelected()));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
	// TODO
    }    
    
}
