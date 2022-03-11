import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileTabel {

    FileHandle fileHandle;

    public CreateFileTabel(FileHandle fileHandle) throws FileNotFoundException {
        this.fileHandle = fileHandle;
    }

    public CreateFileTabel() {

    }


    public void createFileDDL() throws IOException {

        FileWriter fileWriter = new FileWriter("ressources/DDL.SQL");
        fileWriter.write(fileHandle.createTableFromFile());
        fileWriter.close();

    }

    public void createFileDML() throws IOException {
        FileWriter fileWriter = new FileWriter("ressources/DML.SQL");
        fileWriter.write(fileHandle.imdbliste().toString());
        fileWriter.close();

    }
}
