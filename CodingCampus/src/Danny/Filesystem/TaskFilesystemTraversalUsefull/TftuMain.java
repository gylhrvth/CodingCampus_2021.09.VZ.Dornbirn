package Danny.Filesystem.TaskFilesystemTraversalUsefull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TftuMain {

    public static void main(String[] args) throws FileNotFoundException {
        String path = new String("C:\\Users\\DanGO\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Lukas");
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("Datei not exist!");
        }
        System.out.println(file);
        int depht = 0;

        List<FileReceiver> fileReceiverList = new ArrayList<>();
//        fileReceiverList.add(FileReceiver);


        FileReceiver.onFileReceived(file,depht);
        FileReceiverSize.onFileReceived(file,depht);
        SelectionFileCounter.main(file, depht,".xml");
        FileReceiverHashMap.main(file,depht);
    }
}
