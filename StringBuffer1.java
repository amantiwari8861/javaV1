class StringBuffer1
{
    public static void main(String[] args) {
        
        // String is immutable
        //without re-initialization we can't change the original string value

        String s1="Aman";
        String s2=s1.concat(" tiwari");
        System.out.println("the concated value is :"+s2); //Aman tiwari
        System.out.println("the original value is still :"+s1); //Aman  (this is proving string is immutable )

        s1=s1.concat(" Singh");  //re-initialization can change string value 
        System.out.println("the new value is :"+s1); //Aman Singh

    }
}