package stringbuffervsbuilder;


public class TestBuilderBuffer 
{
    // private static StringBuffer buffer=new StringBuffer();
    private static StringBuilder buffer=new StringBuilder();
    public void test()
    {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                buffer.append("A");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                buffer.append("B");
            }
        });

        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final buffer length
        System.out.println("Final buffer length: " + buffer.length());

    }
}