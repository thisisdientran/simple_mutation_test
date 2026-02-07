package com.Mutations;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Mutations{ 
    public static void find() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberTest = 0;
        try {
            numberTest = reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        for(int i = 0; i < numberTest; i++) {
            try {
                String lineA = reader.readLine();
                String lineB = reader.readLine();
                String result = "";
                for (int j = 0; j < lineA.length(); j++) {
                    if (lineA.charAt(j) != lineB.charAt(j)) {
                        result += ".";
                    }
                    result += "*";
                }
                System.out.println(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}