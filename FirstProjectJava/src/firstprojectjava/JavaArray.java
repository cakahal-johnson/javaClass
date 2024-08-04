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
public class JavaArray {
    JavaArray(){
        
        // for each arry it print out all the arrys in the group
      int[] students = {2,3,4,5,6,6,6};//definity array when is defined 
           String name[] = {"Obi", "Ken", "mark"};
           for (int i: students){
            System.out.println(i);
        }

//        int[] students = {2,3,4,5,6,6,6}; //sorts is asending other 
//        Arrays.sort(students);
//       String name[] = {"Obi", "Ken", "mark"};
//        System.out.println(Arrays.toString(students));

//strings prints it in a list line
//        
//        for (int i: students){
//            System.out.println(i);
//       }
        
        ///arrys .copy 
//        int[] a = {34,56,66};
//        int[] b = Arrays.copyOf(a, a.length);
//        System.out.println(Arrays.toString(b));///copying an arrays
//        
//        System.out.println(Arrays.binarySearch(a, 66));///binary returns the index
//        
//         System.out.println(Arrays.equals(a, students));///to check if is equal
//     
//        
//        System.out.println(Arrays.equals(a, b));///to check if is equal
                
                ///if element present in s particular element
//        
//        for (int i = 0; i < name.length; i++){ ///index is 0, 1,3.
//            System.out.println(name[i]);
//        }
//        
//        int stds_age[] = new int[5];
//        stds_age[0] = 9;
//        stds_age[1] = 34;
//        stds_age[2] = 95;
//        stds_age[3] = 85;
//        stds_age[4] = 71;
//        for(int ii : stds_age){
//            System.out.println(ii);
//
//        }
        
        ///muiltpy arrays
        
//        int[] [] result = {{23,45,78},{89,87,65},{89,9,10}};
//            System.out.println(result[2] [2]);
//            Arrays.sorts(a)///alt key+enter to import arrays or scanner...
            
            //print all using arry
           //print star in trigular format
           //print 2 x 2 = 4
           
         int[] [] result = {{23,45,78},{89,87,65},{89,9,10}};
         
           for (int i = 0; i < result.length; i++){
               for (int j = 0; j < result[i].length; j++){
                   System.out.println(result [i] [j]);
               }
           }
               

        

    }
}
