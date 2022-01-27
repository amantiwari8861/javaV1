import java.util.Scanner;

class Pattren5 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();

for (int i = 0; i < num; i++)
{
    for (int j = num-1; j >i; j--)
    {
        System.out.print(" ");
    }
    for (int j = 1; j <=i+1 ; j++) 
    {
        System.out.print(j);
    }
    for (int j = i; j >0; j--) 
    {
        System.out.print(j);
    }
    System.out.println();
}

}
    
}