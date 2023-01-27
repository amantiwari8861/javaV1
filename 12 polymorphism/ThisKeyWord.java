class TestThis 
{
    int id;
    int num;
    TestThis(int id,int n) 
    {
        // id = id;
        this.id = id;
        num=n;
        // this.showDetails();
        showDetails();
    }
    void showDetails() 
    {
        System.out.println("Id="+a);
    }
}
public class ThisKeyWord {
    public static void main(String[] args) {

        TestThis obj = new TestThis(45,67);
        // obj.showDetails();

        // System.out.println(obj.id);
        System.out.println(a);

    }
}
