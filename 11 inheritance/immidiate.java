class grandparent
{
    int num=100;
}
class parent extends grandparent
{
    int num=50;
    int n=super.num;
}
class child extends parent
{
    int num=10;
    void show()
    {
        // System.out.println("child num :"+num+"parent num :"+super.num+"grand parent num "+super.num);
        //super can access only immidiate parent class data 
        System.out.println("child num : "+num+" parent num : "+super.num+" grand parent num "+n);
    }
    public static void main(String[] args) {
        // new child().show();
        child obj=new child();
        obj.show();
    }
}
