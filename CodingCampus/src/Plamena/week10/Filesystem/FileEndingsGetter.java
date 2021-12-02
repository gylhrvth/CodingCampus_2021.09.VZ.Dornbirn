package Plamena.week10.Filesystem;


import java.io.File;

public class FileEndingsGetter extends FileReceiver {

    @Override
    public void onFileReceived(int depth, File dir) {
        int counter = 0;
        String extension = "mp4";
            if (dir.isFile()) {
                String fileName = dir.getName();
                if (fileName.contains(extension)) {
                    counter++;
                }
                System.out.println(fileName);
            }

    }
}
