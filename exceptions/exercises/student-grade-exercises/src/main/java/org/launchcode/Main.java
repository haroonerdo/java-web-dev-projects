package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        System.out.println("Test  started");
        try {
            int result=Divide(10, 0);
            System.out.println("Division Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error!: " + e.getMessage());
        }
        System.out.println("Test  finished\n");


        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.js");
        studentFiles.put("Stefanie", "CoolProgram.java");
        // Test out your CheckFileExtension() function!
        for (String student : studentFiles.keySet()) {
            try {
                int points = CheckFileExtension(studentFiles.get(student));
                if (points < 0) {
                    System.out.println(student + " submitted file: " + studentFiles.get(student) +
                            "File name is null or empty. Points: " + points);
                }else{
                    System.out.println(student + " submitted file: " + studentFiles.get(student) +
                            ". Points: " + points);
                }
            } catch (FileFormatException e) {
                System.out.println(student + " error: " + e.getMessage());
            }

        }

    }

    public static int Divide(int x, int y) throws ArithmeticException {
        // Write code here!
        if (y == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (x / y);
    }

    public static int CheckFileExtension(String fileName) throws FileFormatException {
        // Write code here!
//        if (fileName == null || fileName.isEmpty()) {
//            throw new FileFormatException("File name is null or empty.");
//        }

//        if (fileName == null || fileName.isEmpty()) {
//            throw new FileFormatException("File name is null or empty. Points: -1");
//        }

        if (fileName == null || fileName.isEmpty()) {
            return -1;
        }else {
            int dotIndex = fileName.lastIndexOf('.');
            if (dotIndex != -1 && dotIndex < fileName.length() - 1) {
                String fileExtension = fileName.substring(dotIndex + 1);
                if (fileExtension.equalsIgnoreCase("java")) {
                    return 1;
                } else {
                    return 0;
                }
            }

        }
        return 0; //??
    }
        static class FileFormatException extends Exception {
            public FileFormatException(String message) {
                super(message);
            }
        }
}