/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggignment2;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author c0661137
 */
public class CourseTest {

    
    @Test 
    public void testGetAll(){
    Course instance = new Course();
        List<Student> Result = instance.getAll();
        
        assertEquals(Result, instance.getAll());
        
        
    }
    
    @Test
    public void TestShouldReturnSameAsListProvided(){
     
    }
    @Test
    public void TestShouldReturnStudent(){
        
    }
    
    @Test
    public void TestShouldReturnAllOrignalStudent(){
    
    }
            
}
    
      
   