class TestThis {
    int id,num;
    TestThis(int id,int n) 
    {
        // id = id;
        this.id=id;
        num=n;
    }
    void showDetails() 
    {
        System.out.println("Id="+id);
        System.out.println("Num="+num);
    }
}
public class ThisKeyWord {
    public static void main(String[] args) {
        TestThis obj = new TestThis(45,67);
        obj.showDetails();
    }
}