package Danny.Filesystem.TaskFilesystemTraveralUsefullExtended;

import java.io.File;

public class GyulaMachtBeispiel {
    public static void main(String[] args) {
        File testFile = new File("C:\\Users\\dan\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Danny");
        long totalSize = printFileRecursive("", false, testFile);
        System.out.printf("Total: %10d%n", totalSize);
    }

    public static long printFileRecursive(String prefix, boolean lastFileOfDirectory, File f){
        String filePrefix = lastFileOfDirectory?"└── ":"├──";
        long sizeTotal = 0;
        System.out.println(prefix + filePrefix + f.getName());
        if (f.isDirectory()){
            File[] files = f.listFiles();
            for (int i = 0; i < files.length; i++) {
                sizeTotal += printFileRecursive("│   " + prefix, (i==files.length-1), files[i]);
            }
        } else {
            sizeTotal = f.length();
        }
        return sizeTotal;
    }
}
