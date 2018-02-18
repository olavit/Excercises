package ru.javametods.glava10.exc14a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class FromFile {
    public void read() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line;
        try{
            while ((line = reader.readLine()) !=null) {
                list.add(line);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        Collections.sort(list);
        System.out.println(list);
    }
}
