import java.io.File;
import java.io.IOException;

class CreateFileExample {
    public static void main(String[] args) {
        String desktopPath = "/home/Desktop/example.txt";
        File file = new File(desktopPath);

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println("Error creating file: " + e.getMessage());
        }
    }
}

