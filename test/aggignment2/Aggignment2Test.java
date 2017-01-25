/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggignment2;

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
public class Aggignment2Test {

    public Aggignment2Test() {
    }

    /**
     * Test of main method, of class Assignment2.
     */
    @Test
    public void testNoArg() {
        Student instance = new Student();
        Student instance2 = new Student();
        instance2.setId("");
        instance2.setGender("");
        instance2.setName("");
        instance2.setGrade(0);
        boolean expectedresult = true;
        boolean result = instance.equals(instance2);
        assertEquals("Testing no arg constructor", expectedresult, result);
    }
     @Test
    public void testFullArg() {
        Student instance = new Student("bob","C1231","Male",90.99);
        Student instance2 = new Student();
        instance2.setId("C1231");
        instance2.setGender("Male");
        instance2.setName("bob");
        instance2.setGrade(90.99);
        boolean expectedresult = true;
        boolean result = instance.equals(instance2);
        assertEquals("Testing no arg constructor", expectedresult, result);
    }
    @Test
    public void testGetName() {
        System.out.println("getName");
        String name = "bob";
        String id = "C1231";
        String gender = "male";
        double grade = 92.49;
        Student instance = new Student(name, id, gender, grade);
        String expResult = "bob";
        String result = instance.getName();
        assertEquals("Testing method Student.getName()",
                expResult, result);
    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        String name = "bob";
        String id = "C1231";
        String gender = "male";
        double grade = 92.49;
        Student instance = new Student(name, id, gender, grade);
        String expResult = "C1231";
        String result = instance.getId();
        assertEquals("Testing method Student.getId()", expResult, result);
    }

    @Test
    public void testGetGender() {
        System.out.println("getGender");
        String name = "bob";
        String id = "C1231";
        String gender = "male";
        double grade = 92.49;
        Student instance = new Student(name, id, gender, grade);
        String expResult = "male";
        String result = instance.getGender();
        assertEquals("Testing method Student.getGender()", expResult, result);
    }

    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        String name = "bob";
        String id = "C1231";
        String gender = "male";
        double grade = 92.49;
        Student instance = new Student(name, id, gender, grade);
        double expResult = 92.49;
        double result = instance.getGrade();
        assertEquals("Testing method Student.getGrade()", expResult, result,0.02);
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "bob";
        Student instance = new Student();
        instance.setName(name);
        String result = instance.getName();
        assertEquals("Testing method Student.setName()", name, result);
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "C1231";
        Student instance = new Student();
        instance.setId(id);
        String result = instance.getId();
        assertEquals("Testing method Student.setId()", id, result);
    }

    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "male";
        Student instance = new Student();
        instance.setGender(gender);
        String result = instance.getGender();
        assertEquals("Testing method Student.setGender()", gender, result);
    }

    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        double grade = 90.96;
        Student instance = new Student();
        instance.setGrade(grade);
        double result = instance.getGrade();
        assertEquals("Testing method Student.setGender()", grade, result, 0.02);
    }

    @Test
    public void testStudentEquals() {
        System.out.println("equals");
        Student instance = new Student();
        instance.setName("bob");
        instance.setId("C1231");
        Student instance2 = new Student();
        instance2.setName("bob");
        instance2.setId("C1231");
        boolean expectedresult = true;
        boolean result = instance.equals(instance2);
        assertEquals(expectedresult, result);
    }
    @Test
    public void testStudentEqualsId() {
       System.out.println("equalsId");
        Student instance = new Student();
        instance.setName("bob");
        instance.setId("C1231");
        Student instance2 = new Student();
        instance2.setName("bob");
        instance2.setId("C1236");
        boolean expectedresult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expectedresult, result);
    }
    @Test
    public void testStudentEqualsName() {
       System.out.println("equalsName");
        Student instance = new Student();
        instance.setName("Toaster");
        instance.setId("C1231");
        Student instance2 = new Student();
        instance2.setName("bob");
        instance2.setId("C1231");
        boolean expectedresult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expectedresult, result);
    }
    @Test
    public void testStudentToString() {
        try {
            System.out.println("toString");
            Student instance = new Student();
            instance.setName("bob");
            instance.setId("C1231");
            instance.setGender("male");
            instance.setGrade(90.09);
            String jsonString = instance.toString();
            JSONObject result = (JSONObject) new JSONParser().parse(jsonString);
            JSONObject expResult = (JSONObject) new JSONParser().parse("{\"name\":\"bob\",\"id\":\"C1231\",\"gender\":\"male\",\"grade\":90.09}");
            assertEquals(expResult, result);
        } catch (ParseException ex) {
            System.err.println("Invalid JSON Format");
            fail("Invalid JSON Format");
        }
    }
}
