class Strfxn3
{
    public static void main(String[] args) {
        // String str="hello everyone";
        String name="Aman";
        String sname="Tiwari";
        // System.out.println(str.join("@", str,"my name is",name));
        // System.out.println(name.join(" ",name,sname));//improper way(warning)
        // System.out.println(sname.join(" ",name,sname));//improper way(warning)
        System.out.println(String.join("-",name,sname));//proper way
        System.out.println(String.join(" ",name,sname));//proper way
        System.out.println(String.join("y",name,sname));//proper way
        System.out.println(String.join("hello",name,sname));//proper way
        // System.out.println(join(" ",name,sname)); //error
    }
}