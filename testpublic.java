class testpublic {

    // private int data1=50;
    int data1=100;
    private void fxn()
   {
       System.out.println("hello i am public fxn data "+data1);
   }
}
class Main {
    public static void main(String[] args) {
        testpublic obj=new testpublic();
        // obj.fxn();
        System.out.println(obj.data1);
    }
}

// No, we cannot declare a top-level class as private or protected. It can be either public or default (no modifier).
//  If it does not have a modifier, it is supposed to have a default access
// private > default > protected > public  ( security level)