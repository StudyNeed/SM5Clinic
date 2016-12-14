/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package InputerVerifierClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author assassin
 */
public class ValidateRegularExpression extends ErrorProvider {
    private String errorMessage="Error";
    private Pattern pattern;
    public ValidateRegularExpression(JFrame parent,JComponent c,String regex) {
        super(parent,c);
        this.pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
    }
    
    public ValidateRegularExpression(JComponent c,String regex,String errorMessage) {
        super(c);
        this.pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        this.errorMessage=errorMessage;
    }

    
    @Override
    protected Error ErrorDefinition(JComponent c) {
         Matcher m = pattern.matcher(((JTextField)c).getText());
         if(m.matches())
         {
             return new Error(Error.NO_ERROR, "");
         }
         else
         {
             return new Error(Error.ERROR, errorMessage);
         }
    }




}
