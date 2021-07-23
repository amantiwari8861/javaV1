class Strfxn1
{
    public static void main(String[] args) {
        
        //concat() length() isEmpty() trim() toLowerCase() toUpperCase()

        // String check=""; //nothing is given 
        // String check2=" "; // only space Ascii(32)
        // System.out.println(check.isEmpty());//true
        // System.out.println(check2.isEmpty());
        // System.out.println(check2.isBlank());
        // System.out.println(check2.trim().isEmpty());

        // String any="    hello my name    is Aman         ";
        // System.out.println(any.length()); //37
        // System.out.println(any.trim()); //to trim the unwanted span from both the ends 
        // System.out.println(any.length());
        // System.out.println(any.toUpperCase());
        // System.out.println(any.toLowerCase());
        // System.out.println(any.trim().length());//chaining of string fxn 
        //eg. sc.next().charAt(0);
        // System.out.println(any.trim().length().toUpperCase()); //error
        // System.out.println(any.replace('n','h'));
        // System.out.println(any.replace("Aman","Rohit"));
        // System.out.println(any.trim().toUpperCase().length());//possible (25)
        // System.out.println(any.contains("Aman"));//true
        // System.out.println(any.contains("AMAN"));//false
        //  System.out.println(any.contains(" "));//true
        //  System.out.println(any.contains("A"));//true
        // single quote('') is for character and double quote("") for String
        String name3="Aman";
        String str="hello my name is  aman";
        // System.out.println(name3.equals("Aman")); //true
        // System.out.println(name3.equals("AMAN"));//false
        // System.out.println(name3.equalsIgnoreCase("AmAN"));//true
        // char arr[]=name3.toCharArray();
        // for (char c : arr) { //foreach loop enhanced for loop iterator 
        //     System.out.println("the value is :"+c);
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("the character at "+i+" position is :"+arr[i]);
        // }
        // byte arr[]=name3.getBytes();
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("the character at "+i+" position is :"+arr[i]);
        // } 
        System.out.println(name3.endsWith("u"));//false
        System.out.println(name3.endsWith("n"));//true
        System.out.println(str.endsWith("aman"));//true
        System.out.println(str.endsWith("Aman"));//false
        
    }
}

// any.trim().length().toUpperCase()
// string => int => String (in uppercase ) //error


// h.w take username and password from user and check whether the given id password is true or false 
// searching in string 