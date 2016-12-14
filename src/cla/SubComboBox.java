/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cla;

import java.sql.ResultSet;
import javax.swing.JComboBox;

/**
 *
 * @author Acer 4738
 */
public class SubComboBox extends JComboBox<String>{

    
    public void addItem(ResultSet rItem) throws Exception {
        if(rItem.first()){
            do {                
                super.addItem(rItem.getString(1));
            } while (rItem.next());
        }
            
    }
    
}
