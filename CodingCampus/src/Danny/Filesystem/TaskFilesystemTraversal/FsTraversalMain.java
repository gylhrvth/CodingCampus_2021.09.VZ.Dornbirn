package Danny.Filesystem.TaskFilesystemTraversal;

import java.io.File;
import java.io.FileNotFoundException;

public class FsTraversalMain {
    public static final String PATH = "CodingCampus\\src\\Lukas";

    public static void main(String[] args) throws FileNotFoundException {

        //String path = "C:\\";
        File file = new File(PATH);

        System.out.println(file);
        int deep = 0;
        listFile(file, deep);
    }

    public static void listFile(File file, int deep) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException("Datei not exist");
        }
        File[] fileArray = file.listFiles();
        if (fileArray != null) {
            for (File child : fileArray) {
                if (child.isFile()) {
                    printIndentation(deep);
                    System.out.println("|--" + child.getName());
                } else {
                    if (deep == 0) {
                        System.out.println("|");
                    }
                    printTurnover(deep);
                    printIndentation(deep);
                    System.out.println("|--" + child.getName());
                    listFile(child, deep + 1);
                }
            }
        }
    }

    public static void printIndentation(int deep) {
        for (int i = 0; i < deep; i++) {
            System.out.print("|  ");
        }
    }

    public static void printTurnover(int deep) {
        for (int i = 0; i < deep; i++) {
            System.out.print("|  ");
        }
        System.out.print("|");
        System.out.println();
    }
}
