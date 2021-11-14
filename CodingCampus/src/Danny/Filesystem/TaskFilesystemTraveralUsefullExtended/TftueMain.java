package Danny.Filesystem.TaskFilesystemTraveralUsefullExtended;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

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

        List<File> receiverLists = new LinkedList<>();


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
