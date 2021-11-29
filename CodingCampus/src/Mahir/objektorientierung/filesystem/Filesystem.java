package Mahir.objektorientierung.filesystem;






import java.io.File;
import java.io.FileNotFoundException;

public class Filesystem {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "CodingCampus\\src";
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("File does not exist");
        }
//        System.out.println(file);
//        listFile(file, 0);
        FileReceiver.onFileRecived(file,0);
        FileRecieverSize.onFileReceived(file,0);
        SelectionFileCounter.main(file,0,"xml");
        FileHashMap.main(file,0);


    }

    public static void listFile(File file, int depth) {
        for (File child : file.listFiles()) {
            if (child.isFile()) {
                printIndentation(depth);
                System.out.println("|--" + child.getName());
            } else {
                if (depth == 0) {
                    System.out.println(" ");
                }
                printTurnover(depth);
                printIndentation(depth);
                System.out.println("|--" + child.getName());
                listFile(child, depth + 1);
            }

        }
        if (file.listFiles().length == (depth)) {
            depth--;
        }

    }
    public static void printIndentation (int depth){
        for (int i = 0; i < depth; i++) {
            System.out.print("|  ");
        }
    }

    public static void printTurnover (int depth){
        for (int i = 0; i < depth; i++) {
            System.out.print("|  ");
        }
        System.out.print("|");
        System.out.println();
    }

}
