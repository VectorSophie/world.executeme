package com.worldexecute;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Main - Entry point for the World.Execute(Me) console application.
 * This class handles user authentication and coordinates the audio playback
 * with the visual animation sequence.
 *
 * Usage:
 * <pre>
 * java Main
 * </pre>
 *
 * The program will:
 * 1. Display the user file
 * 2. Prompt for password ("run world.exec")
 * 3. Play audio and display synchronized animations
 */
public class Main {

    public static void main(String[] args) {
        // Display intro
        FileReaderUtil.readFile("textFiles/user");
        System.out.print(">");

        // Get password
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        if (!pass.equals("run world.exec")) {
            scanner.close();
            return;
        }

        // Display song info
        TextAnimator.animateText("Song: World.Execute(Me)", "", "white", 10, false);
        TextAnimator.animateText("Producer: Mili", "", "white", 10, false);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        ConsoleUtils.clearConsole();

        // Create thread pool for concurrent execution
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Audio playback task
        executor.submit(() -> {
            // Note: For MP3 files, convert to WAV or use JavaFX MediaPlayer
            // AudioPlayer player = new AudioPlayer("ghost.wav");
            // player.play();
            // player.waitForCompletion();

            // If no audio file, just return
            System.err.println("Audio playback disabled. To enable:");
            System.err.println("1. Convert ghost.mp3 to ghost.wav, or");
            System.err.println("2. Implement MP3 support using JavaFX MediaPlayer");
        });

        // Animation task
        executor.submit(() -> {
            WorldExecute.worldExecuteMe();
        });

        // Shutdown executor and wait for completion
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        scanner.close();
    }
}
