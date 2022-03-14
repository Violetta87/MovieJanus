import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandle {

    CreateFileTabel createFileTabel = new CreateFileTabel(this);
    String filename = "Imdb-data";
    File file = new File("ressources/" + filename + ".csv");
    Scanner scan = new Scanner(file);

    public FileHandle() throws FileNotFoundException {
    }

    public String createTableFromFile() throws FileNotFoundException {

        String[] array = scan.nextLine().split(";");


        String sql = "";


        for (int i = 0; i < array.length; i++) {
            sql = sql + array[i] + " varChar(255), \n";
        }

        String creatTable = "CREATE TABEl " + filename + "(\n" + sql +"\n);";

        System.out.println(creatTable);
        return creatTable;
    }

    public ArrayList<String> imdbliste() throws IOException {

        String insertInto = "";
        String array1 [];
        ArrayList<String> listny = new ArrayList<>();

        //Vi springer første linje over (Eftersom at vi ikke beder om at det printes ud)
        scan.nextLine();


        //vi laver et whileloop for at gennemgå file.
        while (scan.hasNextLine()) {

            //Opretter en String så vi kan læse hver linje i fil (Vi arbejder med en linje af gangen)
            String currentline = scan.nextLine();
            String[] array = currentline.split(";");/*vi laver et String array til alle atributerne, som deles når der står ";"*/

            //Vi opretter en String så vi kan definerer hvordan det skal gemmes i de forskellige koloner.
            //Vi definerer kolonernes værdier.
            String dataLinje = array[0] + ","+ array[1]+","+array[2]+","+array[3]+","+array[4]+","+array[5];

            //Definer hvordan linjen skal skrives skal skrives i MYsqL.
            insertInto = "INSERT INTO " + filename + "\nVALUES(" + dataLinje +");";
            System.out.println(insertInto);
            listny.add(insertInto);
        }
        return listny;
    }



}
