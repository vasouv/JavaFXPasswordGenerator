package javafxpasswordgenerator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author vasouv
 */
public class GUIController implements Initializable {
    
    //Create the Password object
    Password genPassword = new Password();
    
    //Creates the obj thatt holds the last 8 passwords
    PreviousPasswords prevPasswords = new PreviousPasswords();
    
    @FXML
    Button generateButton;
    
    @FXML
    TextField passwordTextField;
    
    @FXML
    CheckBox upperChoice, lowerChoice, numbersChoice, specialChoice;
    
    @FXML
    ComboBox passwordLengthCombo;
    
    @FXML
    ListView prevPassList;
    
    @FXML
    private void createPassword(ActionEvent e) {
	passwordTextField.setText(genPassword.generatePassword(
                Integer.parseInt(passwordLengthCombo.getSelectionModel().getSelectedItem().toString()), 
                numbersChoice.isSelected(), 
                lowerChoice.isSelected(), 
                upperChoice.isSelected(), 
                specialChoice.isSelected()));
        
        prevPasswords.add(passwordTextField.getText());
        
        showPreviousPasswords();
    }
    
    @FXML
    private void showPreviousPasswords() {
        prevPassList.setItems(prevPasswords.getPasswords());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
	// TODO
    }    
    
}
