package Eray.week5.FileReaderAndWriter;

public class MainCreateFileOrRead {
    public static void main(String[] args) {
      startMenuForFileReaderAndWriter();
    }

    private static void startMenuForFileReaderAndWriter(){
        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Eray\\week5\\FileReaderAndWriter\\testBook.txt";
        String writePath = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Eray\\week5\\FileReaderAndWriter\\newTestFile.txt";
        String result = FileReader.readFile(path);
        //Count chars of testBook.txt
        CharCounter.countChars(result);

        //Create New File | nicht ausführen ansonsten wird eine neue Datei erstellt Danke!!!
        FileWriterCreateNewFile.writeFile(writePath, "Hey My Name is Eray!");
    }
}
