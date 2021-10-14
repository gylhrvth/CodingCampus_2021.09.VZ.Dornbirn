package Niklas.filereadwrite;

public class FileReadWrite {
    public static void main(String[] args) {
        String path = "/Users/niklasfessler/Dev/CC/CodingCampus_2021.09.VZ.Dornbirn/CodingCampus/src/Niklas/filereadwrite/1342-0.txt";
        String writePath = "/Users/niklasfessler/Dev/CC/CodingCampus_2021.09.VZ.Dornbirn/CodingCampus/src/Niklas/filereadwrite/writeme.txt";
        String result = FileReader.readFile(path);
        CharCounter.countChars(result);
    }
}
