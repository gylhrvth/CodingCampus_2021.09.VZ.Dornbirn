package Plamena.week10.Filesystem;

import java.io.File;

public class FileSizeGetter  extends FileReceiver{


    @Override
    public void onFileReceived(int depth, File dir) {
        try {
            if (dir.isFile()) {
                double fileSize = Math.round((double)(dir.length()/1024));
                System.out.println();
                for (int i = 0; i < depth*2; i++) {
                    System.out.print(" ");
                }
                System.out.print(dir.getName() + " " + fileSize + "KB");
            } else if (dir.isDirectory()) {
                System.out.println();
                for (int i = 0; i < depth*2; i++) {
                    System.out.print(" ");
                }
                System.out.print(dir.getName());
                File[] dirContent = dir.listFiles();
                for (File file : dirContent) {
                    onFileReceived( depth + 1, file);
                }

            }
        } catch (NullPointerException npe) {
            npe.fillInStackTrace();
        }
    }
}
