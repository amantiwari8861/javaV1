class StringBuild2
{
    public static void main(String[] args) {
        
        // StringBuilder fname="Aman";//error cannot convert string to stringbuilder
        String name="Aman";
        StringBuilder fname=new StringBuilder("Aman");
        StringBuilder fname2=new StringBuilder(name);
        StringBuilder lname=new StringBuilder("Tiwari");

        // System.out.println(fname+lname); error
        // System.out.println(fname.concat(lname));
        System.out.println(fname.append(lname));
        System.out.println("the new value of fname is "+fname);//StringBuilder class is mutable
        
    }
}