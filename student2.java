package teststudent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class student {
     String name;
      String id;
     double gpa;
     public void setName(String n){
        name=n;
     }
    public String getName(){
        return name;
    }
    public void setID(String i){
        id=i;
    }
    public String getID(){
        return id;
    }
    
    public void setCGPA(double c){
        gpa=c;
    }
    public double getCGPA(){
        return gpa;
    }
     @Override
    public String toString(){
        return "Name = "+name+" id = "+id+ " gpa = "+gpa;
    }
}
    

