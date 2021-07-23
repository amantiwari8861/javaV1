class StrBuffIns
{
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("ABCDEFGH");
        
        // str.insert(2, " any_data ");
        // str.insert(2,'5');
        // str.insert(2,true);
        // str.insert(2,10);
        // str.insert(2,3.14f);
        // str.insert(2,35666776l);
        // str.insert(2,3.6776555d);
        str.insert(2,3.6776555D);
        str.reverse();
        System.out.println("the string is :"+str);
    }
}