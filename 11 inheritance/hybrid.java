interface parent1
{
    int i=100;
}
interface child1 extends parent1
{
    int j=200;
} 
interface child2 extends parent1
{
    int k=300;
} 
interface grandson extends child1,child2
{
    int l=400;
    default void print()
    {
        System.out.println("the value of i="+i+"  j="+j+ " k= "+k+" l="+l+" in interface ");
    }
}

 class Main implements grandson
 {
   
     public static void main(String[] args) {
        // grandson onj=new Main();
        // onj.print();
        Main obj=new Main();
        obj.printdata();
        obj.print();
     }
     void printdata()
     {
         System.out.println("the value of i="+i+"  j="+j+ " k= "+k+" l="+l+" in class ");
     }
 }
 
 
 
 
 
 
 
 
 
 
 
 
/*
 class1 extends class2
 interface1 extends interface1
 class1 implements interface1
 */