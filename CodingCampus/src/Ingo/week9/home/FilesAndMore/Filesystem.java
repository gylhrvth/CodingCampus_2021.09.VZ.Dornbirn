package Ingo.week9.home.FilesAndMore;

import java.io.File;

public class Filesystem {
    public static void main(String[] args) {

        File file = new File("C:\\");
        File[] fileArr = file.listFiles();
        for(File child : fileArr) {
            System.out.println(child);
        }
        for (int i = 0; i < fileArr.length; i++) {
            File childs = fileArr[i];
            System.out.println(childs);

            if(childs.isFile()) {
                System.out.println(childs.length());
            }
        }



    }
}
