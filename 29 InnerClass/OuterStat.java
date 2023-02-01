class OuterStat
{
    static class InnerStat
    {
        void show()
        {
            System.out.println("hello i am inner class fxn");
        }       
    }
    void outerShow()
    {
        System.out.println("i am in outer class fxn");
    }
}

class Main 
{
    public static void main(String[] args) {
        
        // OuterStat obj=new OuterStat();
        // OuterStat.InnerStat objInnerStat=obj.new InnerStat();
        // objInnerStat.show();
        OuterStat.InnerStat obj=new OuterStat.InnerStat(); //inner class object 
        obj.show();
        // obj.outerShow();//error obj is Inner class object not outer
    }
}

//static inner class 