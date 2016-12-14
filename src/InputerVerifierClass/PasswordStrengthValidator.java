/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InputerVerifierClass;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

/**
 *http://justwild.us/examples/password/ 
 * @author assassin
 */
public class PasswordStrengthValidator extends ErrorProvider {

    public PasswordStrengthValidator(JFrame parent,JComponent c) {
        super(parent,c);
    }
    private String errorMessage="Error";

    @Override
    protected Error ErrorDefinition(JComponent c) {
        String password = new String(((JPasswordField)c).getPassword());
        if (password.length() <= 4) {
            return new Error(Error.ERROR, errorMessage);
        } else if (password.length() < 8) {
            return new Error(Error.WARNING, "Password is very weak!");
        } else {
            return new Error(Error.NO_ERROR, "");
        }
    }

    /**
     * @param errorMessage the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
