/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststudent;

/**
 *
 * @author DELL
 */
public class Teststudent {

   
    public static void main(String[] args) {
         
          student na=new student();
             na.setName("hatem");
             na.setID("100");
             na.setCGPA(3.3);
          subject hus=new subject();
             hus.sethours(12);
             hus.setName("hatem");
             hus.setID("50");
        address hos=new address();
            hos.setaddres("Saftelkamer");
            hos.setcity("minia");
            hos.setcountry("Egypt");
       System.out.println(na.getName()+" "+ na.getID()+" "+na.getCGPA());
       System.out.println(hus.getName()+" "+ hus.getID()+" "+hus.gethours());
       System.out.println(hos.getaddress()+" "+hos.getcity()+" "+hos.getcountry());
  
    }
}

}
       
    

    
    

