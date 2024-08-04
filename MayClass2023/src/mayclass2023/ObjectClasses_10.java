/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayclass2023;

/**
 *
 * @author Cakahal Johnson
 */
public class ObjectClasses_10 {
    ObjectClasses_10(){
        
        /*
        Object and CLass means Object-Oriented Programming which is OOP:
        
        OOP means: is  a methodology or paradigm to a program using classes and Object
        
        Object?: is the reall world entities tha has thier own properties and behaviours
        
        Classes?: is the blueprint from which and objects properties and behavioues are decided
        
        Example:
        class of DOGs:            Properties:             Behaviour:
        local404                    breed                    eat()
                                    size                     sleep()
                                    age                      run()
                                    colour                   bark()
        
        where Properties is the Noun while Behaviours Verb
        
        THE DIFFERENT BETWEEN OOP AND PROCEDUAL OR FUNCTION PROGRAMMING
        * Botton Up Approach                   Top Down Approach
        * Divided into Objects                 Divided into functions
        * Has Access Modifiers                 Doesn't have Access Modifiers
        * Obj can move and comm.               Data can move freely from function to function
          with each oth through                in the system.
          a member function
        * More secure                          Less secure
        * Supports overloading                 Do not support overloading
        
        JAVA CLASSES (oop)
        -- JAVA CLASS/OBJECT
        -- JAVA CLASS ATTRIBUTES
        -- JAVA CLASS METHODS
        -- JAVA CONSTRUCTORS
        -- JAVA MODIFIERS
        -- JAVA ENCAPSULATION
        -- JAVA PACKAGES / API
        -- JAVA INHERITANCE
        -- JAVA POLYMORPHISM
        -- JAVA INNER CLASSES
        
        *****Java Constructors*******
        A constructor in java is a special method that is used to initialize objects.
        whereas the constructor is called when an object of class is created.
        it can Used to set initial values for the Object attributes
        
        -- NOTE: That the constructor name must match the class name, and it cannot have a return type (like void)
                 Also the constructor is called when the object is created
                 All classes have constructors by default: if you do not create a class constructor yourself
        
        Constuctors can also take parameters, which is used to initialize attributes.
        
        
        OOP ACCESS MODIFIERS:
        Access modifiers are the Private, Package, Protected, Public
        
        * Private access modifiers: means that the only code inside the class can only
        be access inside it's java field.
        
        * The Package access modifiers: means that the only code inside the class itself,
         or other classes in the same package, and can access the field (i.e you don't need to wirte it)
        
        * Protected access modifiers: is also like the package modifiers, except subclasses 
          of the class can also access the field, even if the subclass is not located in the same package.
        
        * The Public access modifiers: This means the field can be accessed by all classes in your Application.
        
        
        ENCAPSULATION:
        This is to make sure that "sensitive" data is hidden from users. 
        To achieve this, you must:
             declare class variables/attributes as private
             provide public get and set methods to access and update the values of a private variable
        
        where GET: get method returns the value of the variable name
        SET: set method takes a parameter(newName) and assigns it to the name variable.
        The THIS-keyword is used to refer to the current object
        However, as the name variable is declared as private, we cannot access it from outside this class
        
        WHY ENCAPSULATION?
        -- Better control of class attributes and methods
        -- Class attributes can be made read-only(if you only use the get method), 
           or write-only(if you only use the set method)
        -- Flexible: the programmer can change one part of the code without affecting other parts
        -- Increased security of data
        
        *******JAVA INHERITANCE(subclass and Superclass)***********
        In java, it is possible to inherit attributes and methods from one class to another.
        we two categories:
        --subclass(child) - the class that inherits from another class
        --superclass(parent) - the class being inherited from
        
        TO use inherit from a class, use the extends-keyword
        where if you don't want other classed to inherit from a class, use the final-keyword
        
        ********JAVA POLMORPHISM:************
        This means "many forms", and it occurs when we have many classes that are related to each other by inheritance
        -- it uses other methods to perform different tasks, this allows us to perform a single action in different ways
        
        ---Why and When to Use "Inheritance" and "Polymorphism"?
        ---it is useful for code reusability: reuse attributes and methods of an existing class when you create a new class
        
        
        
        
        */
    
    }// ObjectClasses_10 ends here
} // public class ends here
