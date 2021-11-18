package Danny.Filesystem.TaskFilesystemTraveralUsefullExtended;

import Danny.Filesystem.TaskFilesystemTraversal.FsTraversalMain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TftueMain {

    static List<FileReceiver1> fileReceiverList = new ArrayList<>();


    public static void main(String[] args) {
        FileReceiver1 fileReceiver1 = new FileReceiver1();
        FileReceiverSize1 fileReceiverSize1 = new FileReceiverSize1();
        SelectionFileCounter1 selectionFileCounter1 = new SelectionFileCounter1();
        FileReceiverHashMap1 fileReceiverHashMap1 = new FileReceiverHashMap1();

        fileReceiverList.add(fileReceiver1);
        fileReceiverList.add(fileReceiverSize1);
        fileReceiverList.add(selectionFileCounter1);
        fileReceiverList.add(fileReceiverHashMap1);


        File file = new File(FsTraversalMain.PATH);

        int depht = 0;

        try {
            for (int i = 0; i < fileReceiverList.size(); i++) {
                fileListingRecusiv(file, depht, fileReceiverList.get(i));
            }
        } catch (FileNotFoundException exc) {
            System.out.println("\nDatei not exist!\n");
        }

        System.out.println("Die Größe aller Dateien beträgt: " + FileReceiverSize1.size);
        System.out.println("Es wurden " + SelectionFileCounter1.counter + " Dateie(n) mit der Endung .xml gefunden.");
        System.out.println("Es wurden " + FileReceiverHashMap1.counterJava + " Dateie(n) mit der Endung .java gefunden.");
        System.out.println("Es wurden " + FileReceiverHashMap1.counterXml + " Dateie(n) mit der Endung .xml gefunden.");

    }

    public static void fileListingRecusiv(File file, int depht, FileReceiver1 fileReceiver) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        for (File child : file.listFiles()) {
            if (child.isFile()) {
                fileReceiver.onFileReceived(child);
            } else {
                fileReceiver.onFileReceived(child);
                fileListingRecusiv(child, depht + 1, fileReceiver);
            }
        }
    }


}
