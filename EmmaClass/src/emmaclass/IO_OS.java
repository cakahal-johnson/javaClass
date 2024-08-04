/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emmaclass;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Cakahal Johnson
 */
public class IO_OS {
    
    IO_OS(){
        
        /*
        this is a package in java which provides for system input and output through data streams,
        serialization and the file system.
        
        this systems can create file, write a file, read the file, edit anslo delete the file
        then we need to import java file handlers and always use try catch code block
        
        String file_name = "C:\Users\JOHNSON\Desktop\oct_java"
        */
        
        String file_name = "C:\\Users\\JOHNSON\\Desktop\\oct_java";
        
        /*
        Stream: is a sequence of data which is used to composed of bytes, b'cos it is like
        streamof water that continues to flow
        
        JAVA HAVE #3 STREAMS
        System.out: standard output function
        System.in: standard input function
        System.err: standard for error
  
        */
        
        System.out.println("sample message");
        System.err.println("error message");
        
//        int anything = System.in.read();
//        System.out.println((char)anything);
        String filename = "nov_java_oct_io_wt.html";
        File file = new File("C:\\Users\\JOHNSON\\Desktop\\oct_java\\" + filename); // import the File()
        
        try{
            
            //we need to check for the conditions
            if(!file.exists()){
                file.createNewFile();
                
                //outputing the message
                JOptionPane.showMessageDialog(null, "Successfully created!");
            }else{
                JOptionPane.showMessageDialog(null, "File already Exist!");
            }
            
//            writing inside the file
            String code_content = "<h1> Updated \nThis is my java code </h1>";
            
            FileWriter fw = new FileWriter(file, true); // import the filWriter()
            
//            then we pass the file through BuffereWriter
            //Writes text to a character-output stream, buffering characters so as 
            //to provide for the efficient writing of single characters, arrays, and strings.
            BufferedWriter bw = new BufferedWriter(fw); // import the buffered
            
//            then we pure buffered function inside the content write method
            bw.write(code_content); // saving the content
            
            bw.close(); // then we close the content
            
            /*
            Class	Description
BufferedInputStream	
A BufferedInputStream adds functionality to another input stream-namely, the ability to buffer the input and 
            to support the mark and reset methods.
BufferedOutputStream	
The class implements a buffered output stream.
BufferedReader	
Reads text from a character-input stream, buffering characters so as to provide for the efficient reading 
            of characters, arrays, and lines.
BufferedWriter	***
Writes text to a character-output stream, buffering characters so as to provide for the efficient writing of
            single characters, arrays, and strings.
ByteArrayInputStream	
A ByteArrayInputStream contains an internal buffer that contains bytes that may be read from the stream.
ByteArrayOutputStream	
This class implements an output stream in which the data is written into a byte array.
CharArrayReader	
This class implements a character buffer that can be used as a character-input stream.
CharArrayWriter	
This class implements a character buffer that can be used as an Writer.
Console	
Methods to access the character-based console device, if any, associated with the current Java virtual machine.
DataInputStream	
A data input stream lets an application read primitive Java data types from an underlying input stream in a
            machine-independent way.
DataOutputStream	
A data output stream lets an application write primitive Java data types to an output stream in a portable way.
File ****	
An abstract representation of file and directory pathnames.
FileDescriptor	
Instances of the file descriptor class serve as an opaque handle to the underlying machine-specific structure 
            representing an open file, an open socket, or another source or sink of bytes.
FileInputStream	
A FileInputStream obtains input bytes from a file in a file system.
FileOutputStream	
A file output stream is an output stream for writing data to a File or to a FileDescriptor.
FilePermission	
This class represents access to a file or directory.
FileReader	
Convenience class for reading character files.
FileWriter	
Convenience class for writing character files.
FilterInputStream	
A FilterInputStream contains some other input stream, which it uses as its basic source of data, possibly 
            transforming the data along the way or providing additional functionality.
FilterOutputStream	
This class is the superclass of all classes that filter output streams.
FilterReader	
Abstract class for reading filtered character streams.
FilterWriter	
Abstract class for writing filtered character streams.
InputStream	
This abstract class is the superclass of all classes representing an input stream of bytes.
InputStreamReader	
An InputStreamReader is a bridge from byte streams to character streams: It reads bytes and decodes them into 
            characters using a specified charset.
LineNumberInputStream	Deprecated
This class incorrectly assumes that bytes adequately represent characters.
LineNumberReader	
A buffered character-input stream that keeps track of line numbers.
ObjectInputStream	
An ObjectInputStream deserializes primitive data and objects previously written using an ObjectOutputStream.
ObjectInputStream.GetField	
Provide access to the persistent fields read from the input stream.
ObjectOutputStream	
An ObjectOutputStream writes primitive data types and graphs of Java objects to an OutputStream.
ObjectOutputStream.PutField	
Provide programmatic access to the persistent fields to be written to ObjectOutput.
ObjectStreamClass	
Serialization's descriptor for classes.
ObjectStreamField	
A description of a Serializable field from a Serializable class.
OutputStream	
This abstract class is the superclass of all classes representing an output stream of bytes.
OutputStreamWriter	
An OutputStreamWriter is a bridge from character streams to byte streams: Characters written to it are encoded 
            into bytes using a specified charset.
PipedInputStream	
A piped input stream should be connected to a piped output stream; the piped input stream then provides 
            whatever data bytes are written to the piped output stream.
PipedOutputStream	
A piped output stream can be connected to a piped input stream to create a communications pipe.
PipedReader	
Piped character-input streams.
PipedWriter	
Piped character-output streams.
PrintStream	
A PrintStream adds functionality to another output stream, namely the ability to print representations of 
            various data values conveniently.
PrintWriter	
Prints formatted representations of objects to a text-output stream.
PushbackInputStream	
A PushbackInputStream adds functionality to another input stream, namely the ability to "push back" or "unread" 
            one byte.
PushbackReader	
A character-stream reader that allows characters to be pushed back into the stream.
RandomAccessFile	
Instances of this class support both reading and writing to a random access file.
Reader	
Abstract class for reading character streams.
SequenceInputStream	
A SequenceInputStream represents the logical concatenation of other input streams.
SerializablePermission	
This class is for Serializable permissions.
StreamTokenizer	
The StreamTokenizer class takes an input stream and parses it into "tokens", allowing the tokens to be 
            read one at a time.
StringBufferInputStream	Deprecated
This class does not properly convert characters into bytes.
StringReader	
A character stream whose source is a string.
StringWriter	
A character stream that collects its output in a string buffer, which can then be used to construct a string.
Writer	 *****
Abstract class for writing to character streams.
            
            
            */
            
            //READING OUT THE CONTENT INTO THE FILE
            FileInputStream fis = new FileInputStream(file); // we need to import the fis
            BufferedInputStream bis = new BufferedInputStream(fis); // we also import the bis
            
            //here we need to use the while loop to loop through all the content
            while(bis.available() > 0){
                System.out.println((char) bis.read());
            }
            
            //Here we remane the file
            String url = "C:\\Users\\JOHNSON\\Desktop\\oct_java\\";
            String NewName = "Updating_Nov_class";
            
            //passing the new name inside the file write
            File NewFile = new File(url + NewName);
            
            
            //checking the file name to update with a boolean
            boolean result = file.renameTo(NewFile);
            
            // using thne IF-Statement to check result boolean
            if(result){
                JOptionPane.showMessageDialog(null, NewName + " Successfully Renamed!");
            }else{
                JOptionPane.showMessageDialog(null, NewName + " No File to Renamed!");  
            }
            
            
            //deleting the file
            //we need to use the boolean to check for the Delete condition
            boolean result_del = file.delete();
            
            //Using the IF-statement to check the condition
            if(result_del){
                JOptionPane.showMessageDialog(null, NewName + " Successfully Deleted!");

            }else{
                JOptionPane.showMessageDialog(null, NewName + " Not Found to Delete!");

            }
            
            
            
            
            
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
    }
    
}
