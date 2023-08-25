class Emp2
{
    int id=101;
}

class UpdateEmployee
{
    void update(Emp2 e) //here Emp2's class object is passed as a reference
    {
        e.id=102;//here the reference is updated
    }
}

public class PassByReference2 {
    public static void main(String[] args) {
        Emp2 e1 = new Emp2();
        UpdateEmployee ue = new UpdateEmployee();
        ue.update(e1);
        System.out.println(e1.id);
    }
}