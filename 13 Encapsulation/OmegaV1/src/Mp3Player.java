import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Mp3Player {

    private static AdvancedPlayer player;
    private static Thread playerThread;

    public static void play(String filePath) throws JavaLayerException, IOException 
    {
        FileInputStream fis = new FileInputStream(filePath);
        player = new AdvancedPlayer(fis);
        player.setPlayBackListener(new PlaybackListener() {
            @Override
            public void playbackFinished(PlaybackEvent evt) {
                System.out.println("Playback finished");
            }
        });

        playerThread = new Thread(() -> {
            try {
                player.play();
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        });
        if (playerThread != null && !playerThread.isAlive()) 
        {
            playerThread.start();
        } 
        else 
        {
            System.out.println("Player is already playing.");
        }
    }

    public static void pause() 
    {
        if (player != null) {
            player.close();
            System.out.println("Player paused.");
        } else {
            System.out.println("No song is playing.");
        }
    }

    public static void stop() 
    {
        if (playerThread != null && playerThread.isAlive()) {
            playerThread.interrupt();
            player.stop();
            System.out.println("Player stopped.");
        } else {
            System.out.println("No song is playing.");
        }
    }

    public static void exit() 
    {
        if (playerThread != null && playerThread.isAlive()) 
        {
            playerThread.interrupt();
        }
        System.out.println("Exiting MP3 player. Goodbye!");
        System.exit(0);
    }

    public static void main(String[] args) throws Exception
    {
        
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.println("1. Play");
            System.out.println("2. Pause");
            System.out.println("3. Stop");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    play("F:\\Music\\Favourite\\Ed Sheeran - Shape Of You.mp3");
                    break;
                case 2:
                    pause();
                    break;
                case 3:
                    stop();
                    break;
                case 4:
                    scanner.close();
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }while(true);
    }
}
