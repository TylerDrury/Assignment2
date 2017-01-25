/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author c0636081
 */
public class Course{
    
    public List<Student> temp = new ArrayList<>();
    
    
    
    public Course(){
        
    }
    
    public Course(List<Student> temp){
        this.temp = temp;
    }
    
    public void add(Student stu){
        temp.add(stu);
    }
    
    public void remove(Student stu){
        temp.remove(stu);
    }
    
    public void remove(int id){
        temp.remove(id);
    }
    
    public void insert(Student stu, int id) {
        temp.add(id, stu);
    }
    
    public Student get(int id) {
        return temp.get(id);
    }
    
    public List<Student> getall() {
        
        return temp;
        
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (!Objects.equals(this.temp, other.temp)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    /*public String toString() {
        
        for (int i=0;i < temp.size();i++)
        {
            
            temp.get(i);
            String output = String.valueOf(temp.get(i));
            return output;
        }
        return null;
    }*/
/*
    @Override
    public String toString() {
        
    return "course{" + "temp=" + temp + '}';
        JSONObject json = new JSONObject();
        json.put("name",name );
        json.put("id",id );
        json.put("gender",gender );
        json.put("grade",grade );
        return json.to JSONString();
        
    }
    
    public Set<Student> getAllByGender(String gender) {
        
        Set<Student> temp2 = new HashSet<student>();
        
        if (temp2.contains(Student, gender))
        
                
    }
    
    */
}
