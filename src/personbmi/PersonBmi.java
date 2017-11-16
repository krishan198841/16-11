/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personbmi;

import javax.swing.JOptionPane;

/**
 *
 * @author MERC-LAB-01
 */
public class PersonBmi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Person p1 = new Person();
      p1.name = "Krishan";
      p1.ht=1.71;
      p1.wt=42;
      p1.calculateBmi();
      
        System.out.println(p1.name+"'s BMI is "+p1.bmi);
        
      Person p2 = new Person("Nishan");
      
      p2.ht = 1.82;
      p2.wt= 56;
      p2.calculateBmi();
      
        System.out.println(p2.name+"'s Bmi is "+p2.bmi);
        
     Person p3= new Person("Asho",1.65,65);
      p3.calculateBmi();
      
         System.out.println(p3.name+"'s BMI is "+p3.bmi);
         
     Person i1=new Person();
     i1.name=JOptionPane.showInputDialog("Name");
     i1.ht=Double.parseDouble(JOptionPane.showInputDialog("Ht"));
     i1.wt=Double.parseDouble(JOptionPane.showInputDialog("Wt"));
     i1.calculateBmi();
     JOptionPane.showMessageDialog(null,i1.name+"'s BMI is"+i1.bmi);
     
     
     
      
        


// TODO code application logic here
    }
    
}
