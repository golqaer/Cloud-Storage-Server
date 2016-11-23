package com.MechLIB;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try
        {
            FileWriter fileWriter = new FileWriter("src\\test.txt", true);
            BufferedWriter bf = new BufferedWriter(fileWriter);
            for (int i=0; i <10;i++)
                bf.write("new row"+"\r\n");
            bf.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }
}
