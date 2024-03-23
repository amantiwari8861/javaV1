package opencvnetbeans;

import java.awt.EventQueue;
import org.opencv.core.Core;

public class OpenCvNetbeans {

    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println("library loaded succesfully!");

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Camera camera = new Camera();
                new Thread(new Runnable() {

                    @Override
                    public void run() {
                        camera.startCamera();
                    }
                }).start();
            }
        });
    }

}
