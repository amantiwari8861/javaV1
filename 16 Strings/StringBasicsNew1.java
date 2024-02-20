import java.util.Scanner;

class StringBasicsNew1
{
    public static void main(String[] args) {
        
        // char name[]={'a','m','a','n'};
        // for (char c : name) 
        // {
        //     System.out.print(c);
        // }
        // char name2[]="Aman";
        // for (char c : name2) {
        //     System.out.print(c);
        // }

        //Note: character must be in single quote and string must be in double quote

        // Scanner sc=new Scanner(System.in);

        // System.out.println("Enter a string(word) : ");
        // String str = sc.next();

        // System.out.println("Given word is :"+str);

        // System.out.print("Enter a char : ");
        // char c = sc.next().charAt(0);
        // System.out.println(c);
		
        // sc.nextLine();// if character skips use this
        // System.out.println("Enter a string(sentence) : ");
        // String str1 = sc.nextLine();
        // System.out.println("Given Sentence :"+str1);
        // sc.close();

        // int len="Aman".length();  //everything in double quote(string literal) is a String class object
        // System.out.println(len);

        // String s=new String("Hello");
        // System.out.println(s);

        String s1="Aman"; //gets memory in string constant pool
        String s2="Aman"; //gets memory in string constant pool
        String s3=new String("Aman"); //gets memory in heap
        String s4=new String("Aman"); //gets memory in heap


        // System.out.println(s1==s2);// is memory location is same ?
        // System.out.println(s3==s4);// is memory location is same ? 
        // System.out.println(s1==s3);// is memory location is same ? 

        //Note: == checks the memory address(reference) of these objects

        System.out.println(s1.equals(s2));// is value same ?
        System.out.println(s3.equals(s4));// is value same ? 
        System.out.println(s1.equals(s3));// is value same ? 
        //if there is 50 variable with same value then in scp only unique value stores at same memory location


    }
}