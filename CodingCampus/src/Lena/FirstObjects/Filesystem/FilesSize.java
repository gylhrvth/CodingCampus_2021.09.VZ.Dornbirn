package Lena.FirstObjects.Filesystem;

import java.io.File;

public class FilesSize extends FileReceiver {

    private long filesSize;

    public FilesSize(){
        this.filesSize=0;

    }

    public void onFileReceived(File file, int depth) {
        setFilesSize(this.getFilesSize()+file.length());
    }

    public long getFilesSize() {
        return filesSize;
    }

    public void setFilesSize(long filesSize) {
        this.filesSize = filesSize;
    }

    public String toString(){
        return "Total size: "+filesSize/1024.0+"KB";
    }
}
