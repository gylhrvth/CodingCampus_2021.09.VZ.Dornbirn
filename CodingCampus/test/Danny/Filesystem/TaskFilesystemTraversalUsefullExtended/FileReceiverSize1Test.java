package Danny.Filesystem.TaskFilesystemTraversalUsefullExtended;

import Danny.Filesystem.TaskFilesystemTraveralUsefullExtended.FileReceiverSize1;
import Danny.Filesystem.TaskFilesystemTraveralUsefullExtended.TftueMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class FileReceiverSize1Test {
    @Test
    public void testSizeOfBootFolder() {
        FileReceiverSize1 receiverSize1 = new FileReceiverSize1();
        try {
            TftueMain.fileListingRecusiv(new File("C:\\windows\\boot"), 0, receiverSize1);
            Assertions.assertEquals(40886702, receiverSize1.getSize());
        } catch (FileNotFoundException exc) {
            Assertions.fail("Datei sollte gefunden werden!", exc);
        }
    }

    @Test
    public void checkFileNotFoundException() {
        FileReceiverSize1 receiverSize1 = new FileReceiverSize1();
        try {
            TftueMain.fileListingRecusiv(new File("C:\\xyz"), 0, receiverSize1);
            Assertions.fail("Ausnahme wurde nicht geworfen!!!");
        } catch (FileNotFoundException exc) {
            //Success
        }
    }
}
