import java.util.Arrays;
import java.util.Scanner;

class Array
{
    public static void main(String[] args) throws Exception
     {
        
        //Homogeneous collection of data

        // int arr[];
        // arr=new int[5];

        // int arr2[]=new int[5];
        // int []arr3=new int[5];
        // int[] arr4=new int[5];

        // arr2[0]=100;

        // System.out.println(arr2[0]);

        // int arr5[]={10,20,30,40,50};
        // System.out.println(arr5[2]);
        // System.out.println(new int[]{10,20,30,40,50}[2]);


        // int arr[]=new int[100];
        // for (int i = 0; i < 100; i++) {
        //     arr[i]=(i+1)*2;
        // }
        // System.out.println("The array is :");
        // for (int i = 0; i < arr.length; i++) 
        // {
        //     System.out.println(arr[i]);
        // }

        // String students[]=new String[10];
        // students[0]="ishant";
        // students[1]="ishant 1.1";
        // students[2]="ishant 1.2";
        // students[3]="ishant 1.3";

        // System.out.println(students.length);

        // int count=0;
        // for (int i = 0; i < students.length; i++) {
        //     if (students[i]!=null) {
        //         count++;
        //     }
        // }
        // System.out.println(count);

        Scanner sc=new Scanner(System.in);

        // int a=sc.nextInt();
        // sc.nextLine();
        // String s=sc.nextLine();
        
        // System.out.println(a);
        // System.out.println(s);

        // String students[]=new String[5];

        // students[0]=sc.nextLine();
        // students[1]=sc.nextLine();
        // students[2]=sc.nextLine();
        // students[3]=sc.nextLine();
        // students[4]=sc.nextLine();
        // for (int i = 0; i < students.length; i++) 
        // {
        //     students[i]=sc.nextLine();
        // }
        // System.out.println("Students list:");
        // for (String stu : students) 
        // {
        //     System.out.println(stu);
        //     // Thread.sleep(2000);
        // }

        // Arrays.stream(students).forEach(s->System.out.println(s));


        String countries[]={"india","america","australia"};
        String states[][]={
            {"UP","MP","Delhi","Goa"},
            {"NYC","Texas","San Fransisco","san diego"},
            {"sydney","south wales","virginia","victoria"}};
            
            // System.out.println(states[0][1]);
            // System.out.println(states[1][2]);
            // System.out.println(states[2][1]);
        int scores[][]=new int[3][4];

        for (int i = 0; i < countries.length; i++) 
        {
            System.out.println(countries[i]+":");
            for (int j = 0; j < states[i].length; j++) 
            {
                System.out.print("\t"+states[i][j]+" score:");
                scores[i][j]=sc.nextInt();
            }
        }

        System.out.println("\n************ All Scores ***************\n");
        for (int i = 0; i < scores.length; i++) 
        {
            System.out.print(countries[i]+"[");
            for (int j = 0; j < scores[i].length; j++) 
            {
                System.out.print(states[i][j]+"("+scores[i][j]+")");
                if (j<scores[i].length-1) 
                {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
        sc.close();
    }
}