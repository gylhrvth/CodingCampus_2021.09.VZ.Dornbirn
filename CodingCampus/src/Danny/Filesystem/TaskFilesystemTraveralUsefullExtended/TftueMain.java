package Danny.Filesystem.TaskFilesystemTraveralUsefullExtended;

import Danny.Filesystem.TaskFilesystemTraversal.FsTraversalMain;

import java.io.File;
import java.io.FileNotFoundException;

public class TftueMain {
    private int counter = 0;


    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(FsTraversalMain.PATH);
        int depht = 0;


        fileListingRecusiv(file, depht);
        System.out.println("Die Größe aller Dateien beträgt: " + FileReceiverSize1.size );
        System.out.println("Es wurden " + SelectionFileCounter1.counter + " Dateie(n) mit der Endung .xml gefunden.");
        System.out.println("Es wurden " + FileReceiverHashMap1.counterJava + " Dateie(n) mit der Endung .java gefunden.");
        System.out.println("Es wurden " + FileReceiverHashMap1.counterXml + " Dateie(n) mit der Endung .xml gefunden.");



    }

    public static void fileListingRecusiv(File file, int depht) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException("Datei not exist!");
        }

        for (File child : file.listFiles()) {
            if (child.isFile()) {
                FileReceiver1.onFileReceived(child);
                FileReceiverSize1.onFileReceived(child);
                SelectionFileCounter1.onFileReceived(child,".xml");
                FileReceiverHashMap1.onFileReceived(child);
            } else {
                FileReceiver1.onFileReceived(child);
                FileReceiverSize1.onFileReceived(child);
                fileListingRecusiv(child, depht + 1);
            }
        }
    }


}
