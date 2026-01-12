package com.worldexecute;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * TextAnimator - Standalone utility for text animation effects.
 * Provides various text animation techniques including character shuffling,
 * encrypt walls, and animated text rendering.
 *
 * Features:
 * - Character shuffling animation
 * - Encrypt wall effect (rapid text cycling)
 * - Animated text with customizable loops and colors
 */
public class TextAnimator {

    private static final Random random = new Random();

    /**
     * Shuffles the characters in a string randomly.
     *
     * @param unshuffled The original string
     * @return Character array with shuffled characters
     */
    public static char[] shuffleWords(String unshuffled) {
        char[] charArray = unshuffled.toCharArray();

        for (int i = charArray.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        return charArray;
    }

    /**
     * Animates text by shuffling characters multiple times before displaying final text.
     * Creates a "decryption" or "glitch" effect.
     *
     * @param animateWord The word/text to animate
     * @param actorTalk Prefix text (e.g., "[Console]", "[World]")
     * @param color Color name for the final text
     * @param loops Number of shuffle iterations before showing final text
     * @param sepColor If true, only the animated word is colored; if false, entire line is colored
     */
    public static void animateText(String animateWord, String actorTalk, String color, int loops, boolean sepColor) {
        System.out.print("\r");

        // Shuffle animation phase
        for (int a = 0; a < loops; a++) {
            String shuffled = new String(shuffleWords(animateWord));
            System.out.print(actorTalk + " " + shuffled + "\r");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Final display with color
        String colorCode = getColorCode(color);

        if (sepColor) {
            System.out.print("\r" + actorTalk + " " + ConsoleUtils.YELLOW + animateWord + ConsoleUtils.RESET);
        } else {
            System.out.print("\r" + colorCode + actorTalk + " " + animateWord + ConsoleUtils.RESET);
        }

        System.out.println();
    }

    /**
     * Creates an "encrypt wall" effect by rapidly cycling through lines of text.
     * Each line replaces the previous one with a carriage return, creating a flickering effect.
     *
     * @param loopAmount Number of times to cycle through all lines
     * @param wordBlock List of text lines to cycle through
     */
    public static void encryptWall(int loopAmount, List<String> wordBlock) {
        int sleepAmount = (int) Math.ceil(100.0 / loopAmount);

        for (int i = 0; i < loopAmount; i++) {
            for (String line : wordBlock) {
                System.out.print(line + "\r");
                try {
                    Thread.sleep(sleepAmount);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println();
        }
    }

    /**
     * Simulates world generation with a progress bar and random status messages.
     *
     * @param worldType World type identifier (for loading different world configurations)
     */
    public static void simulateWorld(int worldType) {
        int totalBars = 69;
        int delay = 187;
        String[] phrases = {
            "Adding. 'You' and 'Me'.",
            "Generating the Universe",
            "Adding Star and Moons..",
            "Crafting the Narrative."
        };

        System.out.println("████████Generating World████████");
        System.out.println("Seed ID: 03108891624980232");

        for (int i = 0; i <= totalBars; i++) {
            String randomPhrase = phrases[random.nextInt(phrases.length)];
            StringBuilder progressBar = new StringBuilder(randomPhrase + " [");

            for (int j = 0; j < i; j++) {
                progressBar.append('#');
            }
            for (int j = i; j < totalBars; j++) {
                progressBar.append('-');
            }
            progressBar.append("]");

            double percent = Math.ceil(i * 10 / 6.9);
            System.out.print("\r" + progressBar + " " + (int) percent + "%");

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println();
    }

    /**
     * Simulates a corrupted world generation (used in the finale).
     *
     * @param worldType World type identifier
     */
    public static void simulateWorld2(int worldType) {
        int totalBars = 69;
        int delay = 181;
        String[] phrases = {"4$@(*&$J$@", "A@$@$%%#", "$%#%.", "Alice"};

        System.out.println("Lobotomy Corp. INC - 2022");
        System.out.println("4129@$_(921242421");
        System.out.println("42@#@!#24124");

        for (int i = 0; i <= totalBars; i++) {
            String randomPhrase = phrases[random.nextInt(phrases.length)];
            StringBuilder progressBar = new StringBuilder(randomPhrase + " [");

            for (int j = 0; j < i; j++) {
                progressBar.append('#');
            }
            for (int j = i; j < totalBars; j++) {
                progressBar.append('-');
            }
            progressBar.append("]");

            double percent = Math.ceil(i * 10 / 6.9);
            System.out.print("\r" + progressBar + " " + (int) percent + "%");

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println();
    }

    /**
     * Gets the ANSI color code for a color name.
     *
     * @param color Color name (green, blue, yellow, red, cyan)
     * @return ANSI color code string
     */
    private static String getColorCode(String color) {
        if (color == null || color.isEmpty()) {
            return ConsoleUtils.GREEN;
        }

        switch (color.toLowerCase()) {
            case "green":
                return ConsoleUtils.GREEN;
            case "blue":
            case "cyan":
                return ConsoleUtils.CYAN;
            case "yellow":
                return ConsoleUtils.YELLOW;
            case "red":
                return ConsoleUtils.RED;
            case "purple":
                return ConsoleUtils.PURPLE;
            case "white":
                return ConsoleUtils.WHITE;
            default:
                return ConsoleUtils.GREEN;
        }
    }
}
