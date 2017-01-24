/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggignment2;

import org.junit.Test;


/**
 *
 * @author c0661137
 */
public class Aggignment2Test {
    
    public Aggignment2Test() {
    }
    
    /**
     * Test of main method, of class Aggignment2.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String name = "bob";
        String id = "C1231";
        String gender = "male";
        double grade = 92.49;
        Student instance = new Student(name,id,gender,grade);
        String expResult = "bob";
        String result = instance.getName();
        assertEquals("Testing method Student.getName()",
                expResult, result); 
        
        
    }

    
}
