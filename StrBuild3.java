import java.util.Scanner;
class StrBuild3
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        StringBuilder str1=new StringBuilder();
        System.out.println("enter the string ");
        str1.append(sc.nextLine());
        System.out.println("the string is "+str1);
        // StringBuilder str2=new StringBuilder("ANY STRING");
        // str1.insert(3," Aman");
        // str1.insert(3,str2);
        // System.out.println("string after inserting is "+str1);
        //str1.reverse();
        //System.out.println("the reversed string is "+str1);
        str1.replace(1,4,"Aman");
        System.out.println("after replace "+str1);
    }
}