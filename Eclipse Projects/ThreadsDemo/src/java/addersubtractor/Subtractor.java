package addersubtractor;

public class Subtractor implements Runnable {
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1 ; i <= 10000; ++i) {
            count.value -= i;
        }
    }
}
