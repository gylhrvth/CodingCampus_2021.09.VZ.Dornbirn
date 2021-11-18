package Danny.Filesystem.TaskFilesystemTraversalUsefull;

import Danny.Filesystem.TaskFilesystemTraversal.FsTraversalMain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TftuMain {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(FsTraversalMain.PATH);
        if (!file.exists()) {
            throw new FileNotFoundException("Datei not exist!");
        }
        System.out.println(file);
        int depht = 0;

        List<FileReceiver> fileReceiverList = new ArrayList<>();
//        fileReceiverList.add(FileReceiver);


        FileReceiver.onFileReceived(file, depht);
        FileReceiverSize.onFileReceived(file, depht);
        SelectionFileCounter.main(file, depht, ".xml");
        FileReceiverHashMap.main(file, depht);
    }
}
