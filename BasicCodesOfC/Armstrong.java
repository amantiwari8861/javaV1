import java.util.Scanner;
public class Armstrong {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        int num,res=0,OriginalValue,rem;
        num=obj.nextInt();
        
        OriginalValue=num;
        while (num!=0) 
        {
            rem=num%10;
            res=res+rem*rem*rem;
            num=num/10;
        }
        if(OriginalValue==res)
        {
            System.out.println("Armstrong no.");
        }
        else
        {
            System.out.println("not a armstrong no.");
        }

    }
}