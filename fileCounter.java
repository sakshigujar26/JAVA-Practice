import java.io.File;
 class FileFolderCount {
    public static void main(String[] args) {
        String path = "/Home/java";
        File file = new File(path);
        setNumbers(file);
    }

    public static void setNumbers(File file) {
        int countFile = 0;
        int countFolder = 0;
        if (file.exists() && file.isDirectory()) {
            for (File f : file.listFiles()) {
                if (f.isFile()) {
                    countFile++;
                } else if (f.isDirectory()) {
                    countFolder++;
                }
            }
            System.out.println("Number of files: " + countFile);
            System.out.println("Number of folders: " + countFolder);
        } else {
            System.out.println("Path not found or is not a directory");
        }
    }
}

