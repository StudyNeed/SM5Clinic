/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InputerVerifierClass;

import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author assassin
 */
public class StringLengthValidator extends ErrorProvider {
private StringLength s;
private int length;
    public StringLengthValidator(JComponent c,int length,StringLength s) {
        super(c);
        this.s = s;
        this.length = length;
    }

    @Override
    protected Error ErrorDefinition(JComponent c) {
        String str =  ((JTextField)c).getText();
        boolean result = false;
        switch(s)
        {
            case MAXIMUM:
                result = str.length() <= length;
                break;

            case MINIMUM:
                result = str.length() >= length;
                break;
        }
        if(result)
        {
            return new Error(Error.NO_ERROR, "");
        }
        else
        {
            return new Error(Error.ERROR, "Invalid String Length");
        }
    }

   public enum StringLength {

        MAXIMUM,
        MINIMUM
    }
}
