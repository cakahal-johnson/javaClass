/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayclass2023;

//import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;
import java.text.SimpleDateFormat;




/**
 *
 * @author Cakahal Johnson
 */
public class JavaExtras_12 {
    
    JavaExtras_12(){
        /*
    (1)    Enums: This is a special "class" that represents a group of constants(unchangeable variables, like final variables)
        
        To create an Enum, we use the enum-keyword(instead of class or interface), 
        and separate the constants with a comma. note that they should be in uppercase letterd.
        
        syntax:
        enum Level {
            LOW,
            MEDIUM,
            HIGH
        }
        
        To access enum constants we use dot
        
        inside the main class: Level myVar = Level.MEDIUM;
        
        Note: Enum is short for "Enumerations", which means "specifically listed".
               we can also use Enums inside a public class...
        
               Enums are often used in switch statements to check for corresponding values
        
       Loop Through an Enum:
        The enum type has a values() method, which returns an array of all enum constants
        this method is useful when you want to loop through the constants of an Enum
        
        for(Level myVar : Level.values()){
              System.out.println(myVar);
        
        DIFFERENCE BETWEEN ENUMS AND CLASSES
        An enum can, just like class, have attributies and methods. 
        The only D/F is that enum constants are public, static and final(unchangeable - cannot be overridden)
        
        An Enum cannot be used to create objects, and it cannot extend other classes(but it can implement interfaces)
        
        WHY AND WHEN TO USE ENUMS?
        we use Enums when you have values that you know aren't going to change, like month days, days, colors, deck of card...
        
        
     (2)   JAVA DATE AND TIME
        java date is a built-in Date Class, to use this when import java.time package
        
        CLASS                     DESCRIPTION
        LocalDate                  Represents a date (year, month, day(yyyy-MM-dd))
        LocalTime                  Represents a time(hour, minute, second and nanoseconds(HH-mm-ss-ns))
        LocalDateTime              Represents both a date and a time(yyyy-MM-dd-HH-mm-ss-ns)
        DateTimeFormatter          Formatter for displaying and parsing dtate-time objects       
        }
        
        
        */
        System.out.println("==============Date Formats Starts================");
               // 19/07/2023 
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
        
        System.out.println(strDate);
        
        // 19 July 2023
        formatter = new SimpleDateFormat("dd MMMM yyyy");
        strDate = formatter.format(date);
        System.out.println("Month Display: " +strDate);
        
        
        
        System.out.println("==============Date Formats Ends================");

        
        //java.time.LocalDate class, and use its now() method
       // LocalDate myTm = LocalDate.now(); // Create a date object
        
        //Formating Date and TIme
//        import DateTimeFormatter dot ofPattern() method instead of now()
        
      /*
        (3) JAVA ARRAYLIST
        The ArrayList class is a resizable array, which use java,util package
        
        DIFFERENCE BETWEEN ARRAYLIST AND ARRAY:
        ArrayList is built-in, the size of an array cannot be modified but we create a new when we want to add or remove an Array
        while elements can be added and removed from an ArrayList whenever you want
        
        to use we import ArrayList object java.util.ArrayList;
        syntax:
        ArrayList<String> cars = new ArrayList<String>(); // creating an ArrayList object
        
        
        */  
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> cars_number = new ArrayList<Integer>();
        
        cars_number.add(12);
        cars_number.add(8);
        cars_number.add(2);
        cars_number.add(23);
        
        cars_number.add(12);

        
        cars.add("Benz");
        cars.add("Venza");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars);
        
        // Access an Item
        // we use the get() method and refer to the index number:
        // the first index of an array is Zero 
        cars.get(1);
        System.out.println(cars.get(1));
        
        // Changing an item 
        // we use set()
        cars.set(1, "Opel");
                System.out.println(cars);
        System.out.println(cars.get(1));
        
        //Removing we use remove() this remove one item while clear() removes all element
        cars.remove(3);
                System.out.println(cars);
                
         // ArrayList Size()
                cars.size();
                
                        System.out.println(cars.size());
                        
          // Looping Through an ArrayList with for-conditional statement
        for (int i =0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
        
        // Looping Through an ArrayList with foreach-conditional statement
        
        cars.add("Ford");
        cars.add("MVC");
        
        for (String i : cars){
            System.out.println(i);
        }
        
        //Sorting an ArrayList which inside java.util package, Collections class,
//        which is include the sort() method for listing Alphabetically or numerically
        
        cars.add("benz");
        Collections.sort(cars); 
        for(String i : cars){
            System.out.println(i);

        }
        
        // LinkedList class import java.util.LinkedList
        LinkedList<String> Cars = new LinkedList<String>();
        Cars.add("Mazda");
        Cars.add("BMW");
        
        System.out.println(Cars);
        
        /*
         ArrayList vs. LinkedList
        The LinkedList class is a collection which can contain many objects of the same 
        type, just like the ArrayList.

        The LinkedList class has all of the same methods as the ArrayList class because 
        they both implement the List interface. 
        This means that you can add items, change items, remove items and clear the list in the same way.

        However, while the ArrayList class and the LinkedList class can be 
        used in the same way, they are built very differently.

        How the ArrayList works
        The ArrayList class has a regular array inside it. When an element is  
        added, it is placed into the array. If the array is not big enough, 
        a new, larger array is created to replace the old one and the old one is removed.

        How the LinkedList works
        The LinkedList stores its items in "containers." The list has a link to 
        the first container and each container has a link to the next container 
        in the list. To add an element to the list, the element is placed into a
        new container and that container is linked to one of the other containers in the list.
        
        LinkedList Methods
        For many cases, the ArrayList is more efficient as it is common to need 
        access to random items in the list, but the LinkedList provides several 
        methods to do certain operations more efficiently:
        
        addFirst() : Adds an item to the begining of the list
        addLast :    Adds an item to the end of the list
        removeFirst() : Remove an item from the begining of the list
        removeLast() : Remove an item from the end of the list
        getFirst() : Get an item from the begining of the list
        getLast() : Get an item from the end of the list
        */
        
        Cars.addFirst("Benz");
        System.out.println(Cars);
        
        
        /*
        Java HashMap: store items as an ordered collection, using index to access them
        also using "key/values" pairs  import java.util.HashMap
        */
        
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        System.out.println(capitalCities);
        
        // Access an Item
        capitalCities.get("England");
        System.out.println(capitalCities.get("England"));
        
        // Remove an Item use clear() method to all items
        System.out.println(capitalCities.remove("England"));
        
        //size() method checks hoe many items there are
        
        // Loop Through a HashMap for-each
        System.out.println("============HashMap===============");
        // use the KeySet() method if you only want the Keys, and use the values() method if you only want the value
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        
        for(String i : capitalCities.keySet()){
            System.out.println(i);
        }
        
        System.out.println("==============HashMap.values============");
        
         for(String i : capitalCities.values()){
            System.out.println(i);
        }
         
        System.out.println("==============HashMap.both Keys/values============");
           for(String i : capitalCities.keySet()){
            System.out.println("Keys: "+ i + " Values " + capitalCities.get(i));
        }
           
           /*Here HashMAp we use two type DataType String, Integer, Boolean, Character, Double*/
        HashMap<String, Integer> students  = new HashMap<String, Integer>();
        
        students.put("Cakahal", 90);
        students.put("Sam", 70);
        students.put("Somto", 102);
        
        System.out.println("==============HashMap.both Keys/values students============");
           for(String i : students.keySet()){
            System.out.println("Keys: "+ i + " Values " + students.get(i));
        }
           
           
       /*
           JAVA HashSet
           A HashSet is a collection of items where every item is unique, import java.util package
           HashSet<String> students  = new HashSet<String>();
           outputs like HashMap
           .add(), .contains(), remove(), size(), clear(),
           
           //.contains returns a boolean
           
           
       */
           HashSet<String> student  = new HashSet<String>();
            student.add("Cakahal");
            student.add("Sam");
            student.add("Somto");
           System.out.println(student.contains("sam"));
           
           // Looping with for-loop
           HashSet<Integer> student_age  = new HashSet<Integer>();
           student_age.add(4);
           student_age.add(3);
           student_age.add(8);
           student_age.add(6);
           
           // show which age between 1 and 10 are in the set
           for (int i = 1; i <= 10; i++){
               if(student_age.contains(i)){
                   System.out.println(i +" was found in the set");
               }else{
                    System.out.println(i +" was not found in the set");

               }
           }
           
           /*Java Iterator*/
//           is techincal term for looping through a collection import java.util.iterator
           
           // Getting an Iterator we can use get an Iterator for any collection
           Iterator<String> it = cars.iterator(); // where cars is the Array collection we need to iterate
           
           System.out.println(it.next());
           
           //Looping through we use hasNext() and next()
           while(it.hasNext()){
               System.out.println(it.next());
           }
           
           //remove()
           
           Iterator<Integer> iT = cars_number.iterator();
           while(iT.hasNext()){
               Integer i = iT.next();
               if(i < 10){
                   iT.remove();
               }
           }
           System.out.println(cars_number);
           
           
           
           /*
              JAVA THREADS:
           
           These allows a program to operate more efficiently by doing multiple things at the same time
           
           N:B Threads can be used to perform complicated tasks in the background without interrupting the main 
               program
           
           
           Types of threads: run() and start() method
           
           where by extending the thread class and overiding its run() method
           
           while creating a thread is to implement the Runnable interface:
           
           where if the class extends the thread class, the thread can run by creating an instance of the class
           and it is called the start method
           
           # see the main class for thread extends samples
           
           # if the class implements the Runnable interface, the thread can be run by passing an instance
            of the class to thread object's constructor and then calling the thread's start() method
           
           # see the main class for thread implements samples

           DIFFERENCE BETWEEN "EXTENDING" AND "IMPLEMENTING" THREADS
           the major difference is that when a class extends the Thread class, you cannot extend any other class,
           but by implementing Runnable interface, it is possible to extend from another class as well
           
           CONCURRENCY PROBLEMS
           B'cos threads run at the same time as other parts of the program, there is no way to know in which 
           order the code will run. when the threads and main programm are reading and writing the same
           variables, the values are unpredictable. the problems that result from this are called concurrency problems
           
           
           
           
           */
 
           
           


           

        

        
        
        
        
        

        
        
            

        


        
        
    }
    
}
