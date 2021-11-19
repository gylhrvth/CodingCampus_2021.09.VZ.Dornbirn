package Danny.Filesystem.TaskFilesystemTraveralUsefullExtended;

import Danny.Filesystem.TaskFilesystemTraversal.FsTraversalMain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TftueMain {


    private static File file = new File(FsTraversalMain.PATH);

    public static void main(String[] args) {
        FileReceiver1 fileReceiver1 = new FileReceiver1();
        FileReceiverSize1 fileReceiverSize1 = new FileReceiverSize1();
        SelectionFileCounter1 selectionFileCounter1 = new SelectionFileCounter1();
        FileReceiverHashMap1 fileReceiverHashMap1 = new FileReceiverHashMap1();

        List<FileReceiver1> fileReceiverList = new ArrayList<>();
        fileReceiverList.add(fileReceiver1);
        fileReceiverList.add(fileReceiverSize1);
        fileReceiverList.add(selectionFileCounter1);
        fileReceiverList.add(fileReceiverHashMap1);

        int depht = 0;

        try {
            fileListingRecursiv(file, depht, fileReceiverList);
        } catch (FileNotFoundException exc) {
            System.out.println("\nDatei not exist!\n");
        }

        System.out.println("Die Größe aller Dateien beträgt: " + fileReceiverSize1.getSize());
        System.out.println("Es wurden " + selectionFileCounter1.getCounter() + " Dateie(n) mit der Endung .xml gefunden.");
        System.out.println("Es wurden " + fileReceiverHashMap1.getCounterJava() + " Dateie(n) mit der Endung .java gefunden.");
        System.out.println("Es wurden " + fileReceiverHashMap1.getCounterXml() + " Dateie(n) mit der Endung .xml gefunden.");

        System.out.println("------------------------------------");

        FileReceiverSize1 fr = new FileReceiverSize1();
        FileReceiverSize1 fr2 = new FileReceiverSize1();

        long start = System.currentTimeMillis();

        try {
            fileListingRecursiv(new File("c:\\windows\\boot\\"), 0, fileReceiverList);
            fileListingRecursiv(file, 0, fileReceiverList);
        } catch (FileNotFoundException exc) {
            //noop
        }

        System.out.println(fr.getSize());
        System.out.println(fr2.getSize());

        long end = System.currentTimeMillis();

        System.out.println("It took: " + (end - start) + " ms.");
        System.out.println("------------------------------------");
    }

    public static void fileListingRecursiv(File file, int depth, List<FileReceiver1> fileReceiverList) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        File[] children = file.listFiles();
        if (children == null) {
            return;
        }

        for (File child : children) {
            for (FileReceiver1 receiver1 : fileReceiverList) {
                receiver1.onFileReceived(child);
            }
            if (!child.isFile()) {
                fileListingRecursiv(child, depth + 1, fileReceiverList);
            }
        }
    }


}
