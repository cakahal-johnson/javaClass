/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graclass;


/**
 *
 * @author Cakahal Johnson
 */
public class Parent {
    /*
    Object-Oriented Programming: is a methodology or paradigm to design a program 
    using Classes and Objects
    
    Object: is the real world entities that has their own properties and behaviours
    
    Classes: is the blueprint from which an objects properties and behaviours are decided
    
    example:
    class of Dogs:          Properties:         Behaviour:
    local 404               breed                   eat()
                            size                    sleep()
                            age                     run()
                            colour                  bark()
    
    
    THE DIFFERENT B/W OBJECT ORIENTED AND PROCEDUAL PROGRAMMING
    * Botton Up Approach                    *   Top Down Approach
    * Divided into Objects                  *   Divided into functions
    * Has Access Modifiers                  *   Doesn't have Access Modifiers
    * Objects can move & communicate        *   Data can move freely from function 
      with each other through                   to function in the system 
      member functions
    * More secure                           * Less secure
    *Supports overloading                   * Don not support overloading
    
    The *private* access modifier means that only code inside the class itself
    can access this Java field. The package access modifier means that only
    code inside the class itself, or other classes in the same package, can
    access the field. You don't actually write the package modifier. By leaving
    out any access modifier, the access modifier defaults to package scope.
The protected access modifier is like the package modifier, except subclasses
    of the class can also access the field, even if the subclass is not located 
    in the same package. The public access modifier means that the field can 
    be accessed by all classes in your application.
    
    */
    
    Parent(){
        Human human1 = new Human();
        System.out.println(human1.name);
        System.out.println(human1.haircolor);
        
    
        
    }
   
    
}

class Human{
    public String name = "Obi";
    static String haircolor = "black";
    private String cloth = "Trouses";
    protected int age = 89;
}

