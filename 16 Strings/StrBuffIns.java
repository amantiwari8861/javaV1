class StrBuffIns
{
    public static void main(String[] args) 
    {
        StringBuffer str=new StringBuffer("ABCDEFGH");
        
        // str.insert(2, "any_data");
        // str.insert(2,'5');
        // str.insert(2,true);
        // str.insert(2,10);
        // str.insert(2,3.14f);
        // str.insert(2,35666776l);
        // str.insert(2,3.6776555d);
        // str.insert(2,3.6776555D);
        // str.reverse();
        // str.delete(2, 4);//2 included but not 4
        
        // System.out.println("the string is :"+str);

        // System.out.println(String.format("hii %1.6f", 5.677778990654));
        String s1=str.toString();

        System.out.println(s1);
        
    }
}