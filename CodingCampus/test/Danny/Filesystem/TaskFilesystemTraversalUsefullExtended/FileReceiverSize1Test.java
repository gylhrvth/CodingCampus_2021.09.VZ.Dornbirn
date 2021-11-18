package Danny.Filesystem.TaskFilesystemTraversalUsefullExtended;

import Danny.Filesystem.TaskFilesystemTraveralUsefullExtended.TftueMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class FileReceiverSize1Test {
    @Test
    public void testSizeOfBootFolder() {

        try {
            TftueMain.fileListingRecusiv(new File("C:\\Users\\DanGO\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Lukas"), 0);
            Assertions.assertEquals(40886702,0);
        } catch (FileNotFoundException exc) {
            Assertions.fail("Datei sollte gefunden werden!", exc);
        }
    }

    @Test
    public void checkFileNotFoundException() {
        try {
            TftueMain.fileListingRecusiv(new File("C:\\xyz"), 0);
            Assertions.fail("Ausnahme wurde nicht geworfen!!!");
        } catch (FileNotFoundException exc) {
            //Success
        }
    }
}
