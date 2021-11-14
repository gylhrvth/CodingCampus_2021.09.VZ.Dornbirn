package Danny.Filesystem.TaskFilesystemTraversal;

import java.io.File;
import java.io.FileNotFoundException;

public class FsTraversalMain {

    public static void main(String[] args) throws FileNotFoundException {


        String path = new String("C:\\Users\\DanGO\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Lukas");
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("Datei no exist");
        }
        System.out.println(file);
        int deep = 0;
        listFile(file, deep);


    }

    public static void listFile(File file, int deep) {

        for (File child : file.listFiles()) {
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
        if (file.listFiles().length == (deep)) {
            deep--;


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
