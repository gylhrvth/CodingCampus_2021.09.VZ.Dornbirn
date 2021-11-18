package Danny.Filesystem.TaskFilesystemTraveralUsefullExtended;

import java.io.File;
import java.util.HashMap;

public class FileReceiverHashMap1 extends SelectionFileCounter1 {
    public int counterJava = 0;
    public int counterXml = 0;

    public void onFileReceived(File file) {

        HashMap<Integer, String> fileExtension = new HashMap<Integer, String>();
        fileExtension.put(1, ".java");
        fileExtension.put(2, ".xml");

          if (file.getName().endsWith(fileExtension.get(1))) {
              counterJava++;
          } else if (file.getName().endsWith(fileExtension.get(2))) {
              counterXml++;

          }

    }

    public int getCounterJava() {
        return counterJava;
    }

    public int getCounterXml() {
        return counterXml;
    }
}
