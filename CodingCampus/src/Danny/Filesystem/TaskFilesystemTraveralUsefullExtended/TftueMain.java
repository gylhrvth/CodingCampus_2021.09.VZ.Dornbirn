package Danny.Filesystem.TaskFilesystemTraveralUsefullExtended;

import Danny.Filesystem.TaskFilesystemTraversalUsefull.FileReceiver;
import Danny.Filesystem.TaskFilesystemTraversalUsefull.FileReceiverHashMap;
import Danny.Filesystem.TaskFilesystemTraversalUsefull.FileReceiverSize;
import Danny.Filesystem.TaskFilesystemTraversalUsefull.SelectionFileCounter;

import java.io.File;
import java.io.FileNotFoundException;

public class TftueMain {

    public static void main(String[] args) throws FileNotFoundException {
        String path = new String("C:\\Users\\DanGO\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Lukas");
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("Datei not exist!");
        }
        System.out.println(file);
        int depht = 0;
        fileListingRecusiv(file, depht);

        FileReceiver1.onFileReceived(file,depht);
        FileReceiverSize1.onFileReceived(file,depht);
        SelectionFileCounter1.main(file, depht,".xml");
        FileReceiverHashMap1.main(file,depht);

    }

    public static void fileListingRecusiv(File file, int depht) {

        for (File child : file.listFiles()) {
            if (child.isFile()) {
                FileReceiver1.onFileReceived(child, depht);

            } else {
                FileReceiver1.onFileReceived(child, depht);
                fileListingRecusiv(child, depht + 1);
            }
            if (file.listFiles().length == (depht)) {
                depht--;
            }
        }
    }
}
