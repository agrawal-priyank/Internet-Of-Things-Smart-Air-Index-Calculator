/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Priyank
 */
public class Validation {

    public static void isEmptyFieldOnFocusLost(java.awt.event.FocusEvent evt) {

        JTextField jt = (JTextField) evt.getSource();
        if (jt.getText().equals("")) {
            jt.setText("");
            jt.setBackground(Color.yellow);

        } else {
            jt.setBackground(Color.white);
        }
    }

    public static void restrictNumericinTxtFields(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        JTextField jt = (JTextField) evt.getSource();
        if (!((c >= '0') && (c <= '9')
                || (c == KeyEvent.VK_PLUS)
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE))) {
            //getToolkit().;
            jt.setText("");
            jt.setBackground(Color.yellow);
            evt.consume();
        } else {
            jt.setBackground(Color.white);
        }
    }

    public static void restrictNumberofCharacters(java.awt.event.KeyEvent evt, int MAX_NUM) {
        JTextField jt = (JTextField) evt.getSource();
        if (!(jt.getText().length() <= MAX_NUM)) {
            jt.setText(jt.getText().substring(0, MAX_NUM - 1));
        }
    }

    public static boolean isEmpty(JTextField jTextField) {
        boolean flag = true;
        if (jTextField.getText().trim().equalsIgnoreCase("") || jTextField.getText().length() == 0) {
            flag = false;
        }
        return flag;
    }

    public static boolean isEmpty(JPasswordField jPasswordField) {
        boolean flag = true;
        if (jPasswordField.getPassword().length == 0) {
            flag = false;
        }
        return flag;
    }

    public static void restrictAlphabetinTxtFields(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        JTextField jt = (JTextField) evt.getSource();
        if (!((c >= 'A') && (c <= 'Z') || (c >= 'a') && (c <= 'z')
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_SPACE))) {
            //getToolkit.beep();
            jt.setText("");
            jt.setBackground(Color.yellow);
            evt.consume();
        } else {
            jt.setBackground(Color.white);
        }
    }

    public static boolean EmailAddressValidator(String email) {
        java.util.regex.Pattern p = java.util.regex.Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }
}
