class immutable2 {
    public static void main(String[] args) {
        String str1="Aman ";
        String str2=" Tiwari";
        // String str3=str1.concat(str2);
        str1=str1.concat(str2);//re-initialization
        // System.out.println("the full name is :"+str1.concat(str2));//concatination
        System.out.println("the value of str1 is :"+str1);//Aman 
        // System.out.println("the value of str3 is "+str3);
    }
}