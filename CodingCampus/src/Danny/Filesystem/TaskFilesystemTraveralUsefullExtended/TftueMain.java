package Danny.Filesystem.TaskFilesystemTraveralUsefullExtended;

import Danny.Filesystem.TaskFilesystemTraversal.FsTraversalMain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TftueMain {

    private static List<FileReceiver1> fileReceiverList = new ArrayList<>();
    private static File file = new File(FsTraversalMain.PATH);

    public static void main(String[] args) {
        FileReceiver1 fileReceiver1 = new FileReceiver1();
        FileReceiverSize1 fileReceiverSize1 = new FileReceiverSize1();
        SelectionFileCounter1 selectionFileCounter1 = new SelectionFileCounter1();
        FileReceiverHashMap1 fileReceiverHashMap1 = new FileReceiverHashMap1();

        fileReceiverList.add(fileReceiver1);
        fileReceiverList.add(fileReceiverSize1);
        fileReceiverList.add(selectionFileCounter1);
        fileReceiverList.add(fileReceiverHashMap1);


        int depht = 0;

        try {
                fileListingRecusiv(file, depht);
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
            fileListingRecusiv(new File("c:\\windows\\boot\\"), 0);
            fileListingRecusiv(new File(FsTraversalMain.PATH), 0);
        } catch (FileNotFoundException exc) {
            //noop
        }

        System.out.println(fr.getSize());
        System.out.println(fr2.getSize());

        long end = System.currentTimeMillis();

        System.out.println("It took: " + (end - start) + " ms.");
        System.out.println("------------------------------------");
    }

    public static void fileListingRecusiv(File file, int depht) throws FileNotFoundException {
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
                fileListingRecusiv(child, depht + 1);
            }
        }
    }


}
