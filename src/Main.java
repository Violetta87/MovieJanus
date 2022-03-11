import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        FileHandle fileHandle=new FileHandle();
        fileHandle.createTableFromFile();
        CreateFileTabel createFileTabel = new CreateFileTabel();
        createFileTabel.createFileDML();




    }
}
