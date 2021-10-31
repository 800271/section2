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
public class address extends student{
    
    String streetNo;
  String city;
    String country;
    public address(){
        
    }

   
public address(String a,String d,String s) {
    streetNo=a;
    city=d;
    country=s;
    
}  
 public void setaddres(String a){
        streetNo=a;
    }
    public String getaddress(){
        return streetNo;
}
     public void setcity(String d){
        city=d;
    }
    public String getcity(){
        return city;
    } 
      public void setcountry(String s){
        country=s;
    }
    public String getcountry(){
        return country;
    }
    
  
}
