public class get 
{
    private int i;//200
    public void seti( int i) //setter /mutator
    {
        this.i=i;
    }
    public int getivalue() //getter /accesor
    {
        return i;
    }
}
class Main 
{
    public static void main(String[] args) {
    get obGet=new get();
    obGet.seti(200);
    int c=obGet.getivalue();//200
    System.out.println("the value is "+c);
    }
}
//encapsulation done
//polymorphism



