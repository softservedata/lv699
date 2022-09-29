package org.example;
import org.json.simple.parser.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException{
            MongoDB mongo = new MongoDB();
            UI ui = new UI(mongo);

            ui.updateTable();
            ui.revalidateTable();


    }
}