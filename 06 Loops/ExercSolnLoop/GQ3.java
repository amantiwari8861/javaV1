public class GQ3 {

    public static void main(String[] args) {
        
        // 153 => 1^3 + 5^3 + 3^3 => 1+125+27 =>153
        // 321 => 27 + 8 +1 

        int num=371,rem,result=0,temp;
        temp=num;
        while (num>0) 
        {    
            rem=num%10;
            result=result+rem*rem*rem;
            num=num/10;
        }

        System.out.println("the result is "+result);
        if (result==temp) {
            System.out.println("armstrong no.");
        }
        else
        {
            System.out.println("not armstrong");
        }


    }
}