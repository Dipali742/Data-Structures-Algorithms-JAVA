package algorithms;

import java.io.*;

public class InputReadWrite {
     void readInput() {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("src/main/resources/input.txt"));
            PrintWriter pw = new PrintWriter(new
                    BufferedWriter(new FileWriter("src/main/resources/output.txt")));
            String line = "";
            while((line = br.readLine()) != null) {
                Integer input = Integer.parseInt(line);
                pw.println(input);
            }
            pw.flush();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
