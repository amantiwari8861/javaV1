class StringBuilder5
{
    public static void main(String[] args) {
        
        // StringBuilder  mutable class similar to StringBuffer
        //StringBuilder released in jdk 1.5
        //StringBuffer is released in earlier than jdk 1.5 
        // StringBuilder str=new StringBuilder("hello");
        StringBuilder str=new StringBuilder(); 
        System.out.println("the capacity is :"+str.capacity());//16
        System.out.println("the length is :"+str.length());//0
        str.append("hello");
        System.out.println("the value is :"+str);
        str.append(" evryone i am aman");
        System.out.println("the new value is :"+str);
        
        System.out.println("the capacity is :"+str.capacity());
        System.out.println("the length is :"+str.length());
        // newsize=oldsize*2+2
 

        //threads : the smallest unit of processes
        //StringBuffer is syncronized  //execution time is //more stability
        //StringBuilder is non-synchronized ()  //faster than StringBuffer //less stable than StringBuffer


    }
}