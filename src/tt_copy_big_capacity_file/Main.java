package tt_copy_big_capacity_file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter source file: ");
        String sourcePath = input.nextLine();
        System.out.println("Enter destination file: ");
        String destPath = input.nextLine();

        File sourceFile = new File("src/tt_copy_big_capacity_file/tung.txt");
        File destFile = new File("src/tt_copy_big_capacity_file/tung2.txt");

        try {
            copyFileUsingJava7Files(sourceFile, destFile);
            System.out.printf("Copy file completed !");
        } catch (IOException e) {
            System.out.printf("Cant copy that file");
            System.out.printf(e.getMessage());
        }
    }


}
