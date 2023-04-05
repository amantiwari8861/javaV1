import java.util.Scanner;

public class MarksArr {

    public static void main(String[] args) {
        
        // taking user defined value in user defined sized array
        Scanner sc=new Scanner(System.in);
        int marks[],total=0;//array declartion

        System.out.println("enter no. of marks :");
        // int len=sc.nextInt();//long way
        // marks=new int[len];//long way
        marks=new int[sc.nextInt()];//array memory initialization (shortcut)

        System.out.println("enter marks :");
        for(int i=0;i<marks.length;i++)
        {
            System.out.print("Enter "+i+"th element :");
            marks[i]=sc.nextInt();
            total=total+marks[i];
        }
        // marks={67,783,56,35,35,67}; //error
        // marks=new int[]{76,86,94,24,97,36};
        System.out.println("Your percentage is "+total/marks.length+" %");
        System.out.print("the marks are :");
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" ,");
        }

    }
}