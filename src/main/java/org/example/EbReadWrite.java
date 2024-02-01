package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class EbReadWrite {
    public void readWrite(String url, String fileName) {
        try {
            URL urlEB = new URL(url);
            BufferedReader in = new BufferedReader(new InputStreamReader(urlEB.openStream()));
            String inputLine;
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            while ((inputLine = in.readLine()) != null) {
                bw.write(inputLine);
            }
        } catch (Exception e) {
            System.out.println("Fejl i URL");
        }
    }
}
}