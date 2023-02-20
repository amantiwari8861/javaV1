interface C 
{
    String FOUNDER="Dennis Ritchie";
    void cTopics();
}
interface Java
{
    String FOUNDER="James Gosling";
    void javaTopics();
}
interface Python
{
    String FOUNDER="Guido Van Rossum";
    void pythonTopics();
}

class English
{
    void bussinessCommunication()
    {
        System.out.println("Good knowledge of bussiness communication");
    }
}

class Skills extends English implements C,Java,Python
{
    @Override
    public void cTopics() 
    {
        System.out.println("C topics");
        // System.out.println(FOUNDER);// reference to FOUNDER is ambiguous
        System.out.println(C.FOUNDER);
    }
    @Override
    public void javaTopics() 
    {
        System.out.println("Java topics");
        // System.out.println(FOUNDER);// reference to FOUNDER is ambiguous
        System.out.println(Java.FOUNDER);

    }
    @Override
    public void pythonTopics() 
    {
        System.out.println("Python topics");
        // System.out.println(FOUNDER);// reference to FOUNDER is ambiguous
        System.out.println(Python.FOUNDER);
    }
}
public class MultipleInheritance 
{
    public static void main(String[] args) 
    {
        Skills s=new Skills();
        s.cTopics();
        s.javaTopics();
        s.pythonTopics();
        s.bussinessCommunication();
    }
}