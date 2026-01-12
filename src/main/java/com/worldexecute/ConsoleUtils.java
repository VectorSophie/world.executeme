package com.worldexecute;

/**
 * ConsoleUtils - Utility class for console operations with ANSI color support.
 * This class can be used standalone for any console-based application requiring colored output.
 *
 * Features:
 * - ANSI color codes for cross-platform console coloring
 * - Slow typing effect with configurable delays
 * - Color-based printing
 * - Console clearing
 */
public class ConsoleUtils {

    // ANSI Color Codes
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    /**
     * Prints text with slow typing effect.
     *
     * @param text The text to display
     * @param delayMilliseconds Delay between each character in milliseconds
     * @param newLine Whether to add a new line at the end
     * @param spaceNumber Number of blank lines to add after the text
     * @param color Color of the text (green, blue, yellow, red, cyan, or empty for green)
     */
    public static void slowType(String text, int delayMilliseconds, boolean newLine, int spaceNumber, String color) {
        String colorCode = getColorCode(color);
        System.out.print(colorCode + "[Console] ");

        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delayMilliseconds);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.print(RESET);

        if (newLine) {
            System.out.println();
            for (int i = 0; i < spaceNumber; i++) {
                System.out.println();
            }
        }
    }

    /**
     * Prints text with a custom prefix and slow typing effect.
     *
     * @param text The text to display
     * @param name The prefix/name to display before the text
     * @param delayMilliseconds Delay between each character in milliseconds
     * @param newLine Whether to add a new line at the end
     * @param spaceNumber Number of blank lines to add after the text
     * @param color Color of the text
     */
    public static void slowType2(String text, String name, int delayMilliseconds, boolean newLine, int spaceNumber, String color) {
        String colorCode = getColorCode(color);
        System.out.print(colorCode + name + " ");

        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delayMilliseconds);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.print(RESET);

        if (newLine) {
            System.out.println();
            for (int i = 0; i < spaceNumber; i++) {
                System.out.println();
            }
        }
    }

    /**
     * Prints colored text without typing effect.
     *
     * @param text The text to print
     * @param color Color name
     */
    public static void printColored(String text, String color) {
        System.out.println(getColorCode(color) + text + RESET);
    }

    /**
     * Simulates a loading bar with progress percentage.
     *
     * @param message Message to display after loading completes
     * @param delayAmount Delay between each progress update in milliseconds
     * @param barAmount Total number of bars (not used, kept for compatibility)
     */
    public static void simulateLoading(String message, int delayAmount, int barAmount) {
        int totalBars = 10;

        for (int i = 0; i <= totalBars; i++) {
            StringBuilder progressBar = new StringBuilder("[");
            for (int j = 0; j < i; j++) {
                progressBar.append('#');
            }
            for (int j = i; j < totalBars; j++) {
                progressBar.append('-');
            }
            progressBar.append("]");

            System.out.print("\r" + progressBar + " " + (i * 100 / 10) + "%");
            try {
                Thread.sleep(delayAmount);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\n" + message);
    }

    /**
     * Clears the console screen using ANSI escape codes.
     */
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Gets the ANSI color code for a color name.
     *
     * @param color Color name (green, blue, yellow, red, cyan)
     * @return ANSI color code string
     */
    private static String getColorCode(String color) {
        if (color == null || color.isEmpty()) {
            return GREEN;
        }

        switch (color.toLowerCase()) {
            case "green":
                return GREEN;
            case "blue":
            case "cyan":
                return CYAN;
            case "yellow":
                return YELLOW;
            case "red":
                return RED;
            case "purple":
                return PURPLE;
            case "white":
                return WHITE;
            default:
                return GREEN;
        }
    }
}
