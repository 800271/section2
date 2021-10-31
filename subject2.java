package teststudent;


import teststudent.student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class subject extends student {
    double Hours;
    
    public subject(){
        
    }
    public subject(String n,String id,double g,double h){
      
       Hours=h;
       
        
    }
    public void sethours(double h){
        Hours=h;
    }
     public double gethours(){
        return Hours;
    }
    
    
}
