import java.util.Random;

public class Probablity {

    public static void main(String[] args) {
        
        // System.out.println("By Math.random");
        // for (int i = 1; i < 100; i++) 
        // {
        //     double num=Math.random();
        //     if(num<0.08)
        //     System.out.printf("%3d :%f \n",i,num);
        // }
        // System.out.println("By Random");
        Random rndm=new Random();
        // for (int i = 1; i < 100; i++) 
        // {
        //     double num=rndm.nextDouble();
        //     if(num<0.08)
        //     System.out.printf("%3d :%f \n",i,num);
        // }
        System.out.println("Self");
        for (int i = 1; i < 100; i++) 
        {
            double num=(rndm.nextInt(100))/100.0;
            if(num<0.08)
            System.out.println(i+":"+num);
        }

    }
}