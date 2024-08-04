/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emmaclass;

/**
 *
 * @author Cakahal Johnson
 */
public class String_methods_oct {
    
    String_methods_oct(){
        
        /*
        JAVA HAVE 48 METHODS FOR STRING FORMATTING
        
        This methods is jjust a way of manipulating a string which is just TEXT or words
        Strings are more to variables 
        
        */
        
        // Creating a 'strikng Object by using the 'new key-word'
        String name = new String("Hello world!");
        System.out.println(name);
        
        // which we have a shorthand for the string method
        String Name = "Java is awesome!!!";
            System.out.println(Name);
            
//        Methods is function defined so it can perform actions and also accepts args*
            // rapped in paramthesis()
            
         // Concatenation: means combining two or more strings by using plus sign in words and .concat
//            in operator
//            by using concat() method
            String First_name = "Cakahal ";
            String Last_name = "Johnson";
            
            String Sur_name = First_name.concat(Last_name);
            System.out.println(Sur_name);
            
//            checking for the lenght index in a string
            // we use the length()
                    System.out.println(Sur_name.length());
                    
            //sub_string which takes params starting and ending index
                    String checking_sub = Sur_name.substring(1);
//                    the beging will cut out the index provided
                            System.out.println(checking_sub);
                            
//                      here we use the beging and ending index
            String checking_sub2 = Sur_name.substring(0, 7);
//                    the beging will cut out the index provided
                            System.out.println(checking_sub2);
                            
            
//           where we want to search for a content inside string
//             so we use the indexOf()
               String Txt = "where we want to search for a content inside string";
           //               b'cos of the index we need to use int DataType
               int search_txt = Txt.indexOf("content"); // the position of the content is at index of 30
                    System.out.println(search_txt);
                    
//             where we can check for Equality returns a boolean which true or false value
                    String one = "ABCD";
                    String two = "abcd";
                    String three = "efgh";
                    String four = "Abcd";
                    
             System.out.println("is one equal to two " + one.equals(two)); //false b'cos case sensitive
             System.out.println("is one equal to four " + one.equals(four)); //false b'cos case sensitive
             
             
//       here we can also replace in the strings
             // we use the replace method
             String replace_txt = Txt.replace("content", "word");
             System.out.println(replace_txt);
             
//             checking a character is contented inside a String using the if statement 
             if(Txt.contains("d")){
               System.out.println("yes! D is last the character");

             }else{
                 System.out.println("No! D is not the last character");

             }
             
//             checking for the suffix in the string which returns a Boolean
             
               System.out.println("yes g is last the character " + Txt.endsWith("x"));
               
                /*
            1	char charAt(int index)
Returns the character at the specified index.

2	int compareTo(Object o)
Compares this String to another Object.

3	int compareTo(String anotherString)
Compares two strings lexicographically.

4	int compareToIgnoreCase(String str)
Compares two strings lexicographically, ignoring case differences.

5	String concat(String str)
Concatenates the specified string to the end of this string.

6	boolean contentEquals(StringBuffer sb)
Returns true if and only if this String represents the same sequence of characters as the specified StringBuffer.

7	static String copyValueOf(char[] data)
Returns a String that represents the character sequence in the array specified.

8	static String copyValueOf(char[] data, int offset, int count)
Returns a String that represents the character sequence in the array specified.

9	boolean endsWith(String suffix)
Tests if this string ends with the specified suffix.

10	boolean equals(Object anObject)
Compares this string to the specified object.

11	boolean equalsIgnoreCase(String anotherString)
Compares this String to another String, ignoring case considerations.

12	byte[] getBytes()
Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.

13	byte[] getBytes(String charsetName)
Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array.

14	void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
Copies characters from this string into the destination character array.

15	int hashCode()
Returns a hash code for this string.

16	int indexOf(int ch)
Returns the index within this string of the first occurrence of the specified character.

17	int indexOf(int ch, int fromIndex)
Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.

18	int indexOf(String str)
Returns the index within this string of the first occurrence of the specified substring.

19	int indexOf(String str, int fromIndex)
Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.

20	String intern()
Returns a canonical representation for the string object.

21	int lastIndexOf(int ch)
Returns the index within this string of the last occurrence of the specified character.

22	int lastIndexOf(int ch, int fromIndex)
Returns the index within this string of the last occurrence of the specified character, searching backward starting at the specified index.

23	int lastIndexOf(String str)
Returns the index within this string of the rightmost occurrence of the specified substring.

24	int lastIndexOf(String str, int fromIndex)
Returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index.

25	int length()
Returns the length of this string.

26	boolean matches(String regex)
Tells whether or not this string matches the given regular expression.

27	boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
Tests if two string regions are equal.

28	boolean regionMatches(int toffset, String other, int ooffset, int len)
Tests if two string regions are equal.

29	String replace(char oldChar, char newChar)
Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.

30	String replaceAll(String regex, String replacement
Replaces each substring of this string that matches the given regular expression with the given replacement.

31	String replaceFirst(String regex, String replacement)
Replaces the first substring of this string that matches the given regular expression with the given replacement.

32	String[] split(String regex)
Splits this string around matches of the given regular expression.

33	String[] split(String regex, int limit)
Splits this string around matches of the given regular expression.

34	boolean startsWith(String prefix)
Tests if this string starts with the specified prefix.

35	boolean startsWith(String prefix, int toffset)
Tests if this string starts with the specified prefix beginning a specified index.

36	CharSequence subSequence(int beginIndex, int endIndex)
Returns a new character sequence that is a subsequence of this sequence.

37	String substring(int beginIndex)
Returns a new string that is a substring of this string.

38	String substring(int beginIndex, int endIndex)
Returns a new string that is a substring of this string.

39	char[] toCharArray()
Converts this string to a new character array.

40	String toLowerCase()
Converts all of the characters in this String to lower case using the rules of the default locale.

41	String toLowerCase(Locale locale)
Converts all of the characters in this String to lower case using the rules of the given Locale.

42	String toString()
This object (which is already a string!) is itself returned.

43	String toUpperCase()
Converts all of the characters in this String to upper case using the rules of the default locale.

44	String toUpperCase(Locale locale)
Converts all of the characters in this String to upper case using the rules of the given Locale.

45	String trim()
Returns a copy of the string, with leading and trailing whitespace omitted.

46	static String valueOf(primitive data type x)
Returns the string representation of the passed data type argument.
        
        
        
        */


             



            
            

        
        
    }
    
}
