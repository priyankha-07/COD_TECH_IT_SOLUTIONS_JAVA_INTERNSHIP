package File_Encryption_Decryption;
import java.io.*;

public class FileEncryptionDecryption {

    public static void main(String[] args) {
        // Prompt user for input file, output file, and key
        String inputFile = getInput("Enter the path of the input file: ");
        String outputFile = getInput("Enter the path of the output file: ");
        int key = getKey();

        try {
            // Read input file
            String inputText = readFile(inputFile);

            // Encrypt text and write to output file
            String encryptedText = encrypt(inputText, key);
            writeToFile(outputFile, encryptedText);

            System.out.println("Encryption successful. Encrypted text written to " + outputFile);

            // Decrypt text and write to another file
            String decryptedText = decrypt(encryptedText, key);
            writeToFile(outputFile.replace(".txt", "_decrypted.txt"), decryptedText);

            System.out.println("Decryption successful. Decrypted text written to " + outputFile.replace(".txt", "_decrypted.txt"));

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Error reading input.");
        }
    }

    private static int getKey() {
        System.out.print("Enter the key for encryption/decryption: ");
        try {
            return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException("Invalid key. Please enter a valid integer.");
        }
    }

    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    private static void writeToFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }

    private static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) (((c - base + key) % 26 + 26) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    private static String decrypt(String text, int key) {
        return encrypt(text, 26 - key);
    }
}
