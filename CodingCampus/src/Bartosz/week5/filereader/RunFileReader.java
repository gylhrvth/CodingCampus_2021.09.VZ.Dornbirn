package Bartosz.week5.filereader;

public class RunFileReader {
    public static void main(String[] args) {
        String path ="C:\\Users\\DCV\\Desktop\\filescanner-txt\\kurzgeschichte.txt";

        String result =FileReader.runFileReader(path);
        System.out.println(result);
    }
}
