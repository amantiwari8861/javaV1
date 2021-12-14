class Demo1
{
    int num=50;
    public String toString() {
        return "ye mera object ka naam hai "+num ;
    };
}
class Run
{
    public static void main(String[] args) {
        Demo1 obj1=new Demo1();
        // Object 
        System.out.println(obj1);
        System.out.println(obj1.toString());
    }
}