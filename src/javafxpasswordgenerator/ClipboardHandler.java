/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxpasswordgenerator;

import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

/**
 *
 * @author vasouv
 */
public class ClipboardHandler {

    final Clipboard clipboard = Clipboard.getSystemClipboard();
    final ClipboardContent content = new ClipboardContent();
    
    public void copyToClipboard(String pass) {
        content.putString(pass);
        clipboard.setContent(content);
    }

}
