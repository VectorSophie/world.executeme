package com.worldexecute;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * FileReaderUtil - Standalone utility for reading and displaying text files.
 * Provides methods to read text files line-by-line with optional delays and color formatting.
 *
 * Features:
 * - Read and display text files with optional delays between lines
 * - Color-coded character display based on character rules
 * - Error handling for file operations
 *
 * Usage Example:
 * <pre>
 * FileReaderUtil.readFile("textFiles/user");
 * FileReaderUtil.readFileColor("textFiles/logoRhine");
 * </pre>
 */
public class FileReaderUtil {

    /**
     * Reads a text file and displays it line-by-line with a small delay.
     *
     * @param fileName The file path (without .txt extension)
     */
    public static void readFile(String fileName) {
        String filePath = fileName + ".txt";

        try (InputStream inputStream = FileReaderUtil.class.getClassLoader().getResourceAsStream(filePath);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            if (inputStream == null) {
                System.out.println("The file could not be found: " + filePath);
                return;
            }

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    /**
     * Reads a text file and displays it with character-based color coding.
     * Colors applied:
     * - '+' characters appear in RED
     * - '$' and 'X' characters appear in YELLOW
     * - All other characters appear in default color
     *
     * @param fileName The file path (without .txt extension)
     */
    public static void readFileColor(String fileName) {
        String filePath = fileName + ".txt";

        try (InputStream inputStream = FileReaderUtil.class.getClassLoader().getResourceAsStream(filePath);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            if (inputStream == null) {
                System.out.println("The file could not be found: " + filePath);
                return;
            }

            String line;
            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    // Apply color based on character
                    if (c == '+') {
                        System.out.print(ConsoleUtils.RED);
                    } else if (c == '$' || c == 'X') {
                        System.out.print(ConsoleUtils.YELLOW);
                    } else {
                        System.out.print(ConsoleUtils.RESET);
                    }

                    System.out.print(c);
                    System.out.print(ConsoleUtils.RESET);
                }

                System.out.println();

                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    /**
     * Reads a text file without any delays or special formatting.
     * Useful for quick file reading without animation.
     *
     * @param fileName The file path (without .txt extension)
     */
    public static void readFileQuick(String fileName) {
        String filePath = fileName + ".txt";

        try (InputStream inputStream = FileReaderUtil.class.getClassLoader().getResourceAsStream(filePath);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            if (inputStream == null) {
                System.out.println("The file could not be found: " + filePath);
                return;
            }

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
