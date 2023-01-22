import java.util.Scanner;

public class StaticinitializerBlock {

    static int B;
    static int H;

    static{
        try{
        Scanner sc=new Scanner(System.in);
        B=sc.nextInt();
        H=sc.nextInt();
        sc.close();
        if(B<=0 || H<=0)
        throw new Exception(" Breadth and height must be positive");
        if(B>=-100 && B<=100 && H>=-100 && H<=100 )
        System.out.println(B*H);
        }
        catch(Exception e)
        {
            System.out.println(e.getClass().getName()+":"+e.getMessage());
            // System.out.println(e);
        }
    }



    public static void main(String[] args) {
        
        
        
        
    }
}
