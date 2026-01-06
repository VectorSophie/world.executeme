package com.worldexecute;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 * AudioPlayer - Standalone utility for playing audio files.
 * Supports WAV, AIFF, and AU formats through javax.sound.sampled.
 * For MP3 support, consider using JavaFX MediaPlayer or external libraries like JLayer.
 *
 * Features:
 * - Play audio files in a separate thread
 * - Non-blocking playback
 * - Simple start/stop controls
 *
 * Usage Example:
 * <pre>
 * AudioPlayer player = new AudioPlayer("audio/song.wav");
 * player.play();
 * // ... do other work ...
 * player.stop();
 * </pre>
 *
 * Note: For MP3 files, you'll need to either:
 * 1. Convert to WAV format, or
 * 2. Use JavaFX MediaPlayer, or
 * 3. Add external library like JLayer (javazoom)
 */
public class AudioPlayer {

    private String audioFilePath;
    private Clip audioClip;
    private Thread playbackThread;
    private volatile boolean isPlaying = false;

    /**
     * Creates an AudioPlayer for the specified audio file.
     *
     * @param audioFilePath Path to the audio file
     */
    public AudioPlayer(String audioFilePath) {
        this.audioFilePath = audioFilePath;
    }

    /**
     * Plays the audio file in a separate thread (non-blocking).
     * Returns immediately while audio continues playing.
     */
    public void play() {
        playbackThread = new Thread(() -> {
            try {
                File audioFile = new File(audioFilePath);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
                AudioFormat format = audioStream.getFormat();
                DataLine.Info info = new DataLine.Info(Clip.class, format);

                audioClip = (Clip) AudioSystem.getLine(info);
                audioClip.open(audioStream);
                audioClip.start();

                isPlaying = true;

                // Wait for playback to complete
                while (!audioClip.isRunning()) {
                    Thread.sleep(10);
                }

                while (audioClip.isRunning()) {
                    Thread.sleep(10);
                }

                isPlaying = false;
                audioClip.close();
                audioStream.close();

            } catch (UnsupportedAudioFileException e) {
                System.err.println("Unsupported audio format: " + audioFilePath);
                System.err.println("For MP3 files, use JavaFX MediaPlayer or convert to WAV.");
            } catch (IOException e) {
                System.err.println("Error reading audio file: " + e.getMessage());
            } catch (LineUnavailableException e) {
                System.err.println("Audio line unavailable: " + e.getMessage());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        playbackThread.start();
    }

    /**
     * Stops the audio playback immediately.
     */
    public void stop() {
        if (audioClip != null && audioClip.isRunning()) {
            audioClip.stop();
            audioClip.close();
            isPlaying = false;
        }
    }

    /**
     * Checks if audio is currently playing.
     *
     * @return true if audio is playing, false otherwise
     */
    public boolean isPlaying() {
        return isPlaying;
    }

    /**
     * Waits for the audio playback to complete.
     * Blocks until the audio finishes playing.
     */
    public void waitForCompletion() {
        if (playbackThread != null) {
            try {
                playbackThread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /**
     * Alternative implementation using JavaFX MediaPlayer (for MP3 support).
     * Uncomment and use this if you have JavaFX available.
     *
     * Example:
     * <pre>
     * // Add to dependencies: org.openjfx:javafx-media
     * import javafx.scene.media.Media;
     * import javafx.scene.media.MediaPlayer;
     *
     * public void playMP3() {
     *     String uri = new File(audioFilePath).toURI().toString();
     *     Media media = new Media(uri);
     *     MediaPlayer mediaPlayer = new MediaPlayer(media);
     *     mediaPlayer.play();
     * }
     * </pre>
     */
}
