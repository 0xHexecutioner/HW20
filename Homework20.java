package sample;

import java.io.File;

public class main {
    public static void main(String[] args) {
        String path = "C:\"; 

        File file = new File(path);
        if (file.exists() && file.isFile()) {
            long size = file.length();
            System.out.println("File Size: " + formatSize(size));
        } else {
            System.out.println("File not found.");
        }
    }

    
    public static String formatSize(long size) {
        if (size < 1024) {
            return size + " байт";
        } else if (size < 1024 * 1024) {
            return size / 1024 + " КБ";
        } else if (size < 1024 * 1024 * 1024) {
            return size / (1024 * 1024) + " МБ";
        } else {
            return size / (1024 * 1024 * 1024) + " ГБ";
        }
    }
}
