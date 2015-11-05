

package boletin.pkg72;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class NewClass72 {
    
    short num1,num2;
    
public short pedirNumeroEnteiro(){
        short num;
        String res =JOptionPane.showInputDialog("Dame o numero");
        num=Short.parseShort(res);
        return num;
}
public void comparar(short num1,short num2){
    if (num1>=num2)
        System.out.println("A resta e:"+(num1-num2));
     else
             System.out.println("A suma e:"+(num1+num2));
         
        
        }
        
        
        
        
        
        
        }
    
        
    

    

