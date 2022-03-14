//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.IOException;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        FileHandle fileHandle = new FileHandle();
        fileHandle.createTableFromFile();
        CreateFileTabel createFileTabel = new CreateFileTabel(fileHandle);
        createFileTabel.createFileDDL();
        createFileTabel.createFileDML();
    }
}
