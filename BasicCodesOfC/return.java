class Return {
    void fxn(int a,int b)
    {
        System.out.println("in fxn1 ");
    }
    void fxn(char ch,int b)
    {
        System.out.println("in fxn2 "+ch);
       String s=Integer.toBinaryString(b);
        System.out.println(s);
    }
}
 class return2 {
public static void main(String[] args) {
    Return obj=new Return();
    obj.fxn(20, 30);
    obj.fxn('A', 30);
}
}