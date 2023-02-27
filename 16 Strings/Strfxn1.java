class Strfxn1
{
    public static void main(String[] args) {
        
        //concat() length() isEmpty() trim() toLowerCase() toUpperCase()

        // String check=""; //nothing is given 
        // String check2=" "; // only space Ascii(32)
        // System.out.println(check.isEmpty());//true
        // System.out.println(check2.isEmpty());//false
        // System.out.println(check2.isBlank());//true comes in java 11
        // System.out.println(check2.trim().isEmpty());//true

        String any="    heLLo my name    is AmAn         ";
        // System.out.println(any.length()); //37
        // System.out.println(any.trim()); //to trim the unwanted space from both the ends 
        // System.out.println(any.length());//37 bcz string is immutable
        // System.out.println(any.trim().length());//chaining of string fxn 

        // System.out.println(any.toUpperCase());
        // System.out.println(any.toLowerCase());
        //eg. sc.next().charAt(0);
        // System.out.println(any.trim().length().toUpperCase()); //error
        // System.out.println(any.trim().toUpperCase().length());//possible (24)
        // System.out.println(any.replace('n','h'));
        // System.out.println(any.replace("AmAn","Rohit"));
        // System.out.println(any.contains("Aman"));//false
        // System.out.println(any.contains("AMAN"));//false
        // System.out.println(any.contains("AmAn"));//true
        //  System.out.println(any.contains(" "));//true
        //  System.out.println(any.contains("A"));//true
        // single quote('') is for character and double quote("") for String
        String name3="Aman";
        // System.out.println(name3.equals("Aman")); //true
        // System.out.println(name3.equals("AMAN"));//false
        // System.out.println(name3.equalsIgnoreCase("AmAN"));//true
        // char arr[]=name3.toCharArray();
        // for (char c : arr) //foreach loop enhanced for loop iterator 
        // { 
        //     System.out.println("the value is :"+c);
        // }
        // for (int i = 0; i < arr.length; i++) 
        // {
        //     System.out.println("the character at "+i+" position is :"+arr[i]);
        // }
        // byte arr[]=name3.getBytes();
        // for (int i = 0; i < arr.length; i++) 
        // {
        //     System.out.println("the character at "+i+" position is :"+arr[i]);
        // } 
        // System.out.println(name3.endsWith("u"));//false
        // System.out.println(name3.endsWith("n"));//true
        
        String str="hello my name is  aman";
        System.out.println(str.endsWith("aman"));//true
        System.out.println(str.endsWith("Aman"));//false
        
    }
}

// any.trim().length().toUpperCase()
// string => int => String (in uppercase ) //error


// h.w take username and password from user and check whether the given id password is true or false 
// searching in string 