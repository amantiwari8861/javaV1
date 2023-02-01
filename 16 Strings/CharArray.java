class CharArray
{
    public static void main(String[] args) {
        
        // char name[]={'A','M','A','N'}; //CHARACTER ARRAY
        // char ch='A';
        // String namez=new String(name);
        // String namez=new String(ch); //error
        // System.out.println("the name is "+namez);
        String fname="aMan";
        // String lname=" Tiwari";
        String namez="amaN";
        // String fullname=fname+lname;
        // System.out.println("the fullname is "+fullname);
    //    boolean check=(fname==lname);
        // System.out.println(fname==lname);
        // System.out.println("the value is "+check);
        // System.out.println("the length is :"+fname.length());
        System.out.println(fname.compareTo(namez)); 
        //exact match gives zero (A == A)
        // A > a  65-97 =>  -32
        // a > A  97-65 => 32 
    }
}