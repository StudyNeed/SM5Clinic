package cla;


import javax.swing.JTextField;
import java.awt.Toolkit;


        
public class MyInput{
	public static void inputInteger(java.awt.event.KeyEvent evt){
		if(!Character.isDigit(evt.getKeyChar())){
                        Toolkit.getDefaultToolkit().beep();
			evt.consume();
		}
	}
	public static void inputInteger(java.awt.event.KeyEvent evt, JTextField txt, int digit){
		if(!Character.isDigit(evt.getKeyChar())){
			Toolkit.getDefaultToolkit().beep();
			evt.consume();
		}
		else
		{
			String st=txt.getText();
			if(st.length()>=digit)
				evt.consume();
		}	
	}
	public static void inputFloat(java.awt.event.KeyEvent evt, JTextField txt){
		if(evt.getKeyChar()==46){
			String st=txt.getText();
			if(st.indexOf(46)!=-1){
				evt.consume();
                        }
                }
		else if(!Character.isDigit(evt.getKeyChar()))
                {
			evt.consume();
                }
	}
        
	public static void inputFloat(java.awt.event.KeyEvent evt, JTextField txt, int digit){
		if(evt.getKeyChar()==46){
			String st=txt.getText();
			if(st.indexOf(46)!=-1){
				evt.consume();
			}
		}
		else if(!Character.isDigit(evt.getKeyChar())){
			evt.consume();
		}
		else
		{
			String st=txt.getText();
			if(!st.equals(""))
			{
				double num=Double.valueOf(st);
				st=""+((long)num);
                                       
				if(st.length()>=digit){
				evt.consume();
				}
			}
		}
	}
        
	public static void clearText(JTextField... txt){
		for(JTextField temp:txt){
			temp.setText("");
		}
		txt[0].grabFocus();
	}
        
        public static boolean checkInput(JTextField... txt){
            for(JTextField temp:txt){
                String st=temp.getText();
                if(st.equals("")){
                    temp.grabFocus();
                    return false;
                }
            }            
            return true;
            
        }
        
        public static String checkEmptyFieldName (JTextField... txt){
            for(JTextField temp:txt){
                String st=temp.getText();
                if(st.equals("")){
                    temp.grabFocus();
                    return temp.getName();
                }
            }            
            return null;
            
        }
        
        
        
}
