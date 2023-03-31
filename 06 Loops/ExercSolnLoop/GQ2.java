public class GQ2 {
    public static void main(String[] args) {
        
        int t1=0,t2=1,t3;

        System.out.print(t1+" "+t2+" ");
        //0 1 1 2 3 5
        for (int i = 1; i <= 8; i++) 
        {
            t3=t1+t2;
            System.out.print(t3+" ");
            t1=t2;
            t2=t3;
        }
    }
}
