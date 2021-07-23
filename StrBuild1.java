class StrBuild1
{
    public static void main(String[] args) {
        
        // String in java is immutable(unchangable)
        String fname="First_Name";
        String lname="last_name";
        // String fullname=fname+lname; //wastage of memory 
        //fname=fname.concat(lname); //reinitialization
        System.out.println(fname.concat(lname));
        System.out.println("the 1st value is still "+fname);//it shows immutibility of string 
    }
}