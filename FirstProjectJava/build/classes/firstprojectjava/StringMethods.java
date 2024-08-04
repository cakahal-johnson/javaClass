/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprojectjava;

import java.util.Arrays;

/**
 *
 * @author Cakahal Johnson
 */
public class StringMethods {
    
    StringMethods(){
//        String name = new String ("cakahal");
//        System.out.println(name);
//        System.out.println(name.length());
//        
//        if(name.contains("a")){
//            System.out.println("true");
//        }
//        
//        String fullname = "john-mark-ojo";
//        String[] user_details = fullname.split("-");
//        System.out.println(Arrays.toString(user_details));
//        String fname = user_details[0];
//        System.out.println(fname);
//        
//        System.out.println(fullname.substring(5, 9));
//        
//        String names = "mark obi";  
//        
//        if (names.startsWith("mark")){
//            System.out.println("true");           
//        }else{
//            System.out.println("false");
//        }
//        
//        if (names.endsWith("ii")){
//            System.out.println("true");           
//        }else{
//            System.out.println("false");
//        }
//        
//        String password = "123456789";
//        String comfirm_password = "123456789";
//        
//        if (password.equals(comfirm_password)){
//            System.out.println("true");           
//        }else{
//            System.out.println("false");
//        }
//        
//         if (password.equalsIgnoreCase (comfirm_password)){ //case sensitive
//            System.out.println("true");           
//        }else{
//            System.out.println("false");
//        }
//         
//        String username = " cakahal ";
//        System.out.println(username.trim());
//        String i = "";
//        System.out.println(i.isEmpty());
//        
//        String url = "Obi is A boy";
//        
//        String url_ch = url.toLowerCase().replace(" ", "-");
//        System.out.println(url_ch);
//        
//        System.out.println(url_ch.toUpperCase());
//        System.out.println(url.charAt(0));
        
        
        
         String name = "John Matthew Adams";
      System.out.println("The full name is: " + name);
      System.out.print("Initials with surname is: ");
      int len = name.length();
      name = name.trim();
      String str1 = "";
      for (int i = 0; i < len; i++) {
         char ch = name.charAt(i);
         if (ch != ' ') {
            str1 = str1 + ch;
         } else {
            System.out.print(Character.toUpperCase(str1.charAt(0)) + ". ");
            str1 = "";
         }
      }
      String str2 = "";
      for (int j = 0; j < str1.length(); j++) {
         if (j == 0)
            str2 = str2 + Character.toUpperCase(str1.charAt(0));
         else
            str2 = str2 + Character.toLowerCase(str1.charAt(j));
      }
      System.out.println(str2);
    }
    
    
     
}
