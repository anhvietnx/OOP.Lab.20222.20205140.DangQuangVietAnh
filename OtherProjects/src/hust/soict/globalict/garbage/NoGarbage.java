package hust.soict.globalict.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*In the case of reading files , when there is no requirement to synchronize with multiple threads (non-multithreaded environment),
it is better to use StringBuilder instead of StringBuffer.
With StringBuilder, you can efficiently build and edit strings, as it has no synchronization overhead like StringBuffer. 
Therefore, if you don't need to synchronize data in case of reading files, using StringBuilder can provide better performance and save more resources.*/

public class NoGarbage {

    public static void main(String[] args) {
        // Create garbage as much as possible
    	long start = System.currentTimeMillis();
        try {
            String fileContents = readFileToString("C:\\Users\\ankvi\\eclipse-workspace\\OtherProjects\\src\\hust\\soict\\globalict\\garbage\\b1.txt");
            System.out.println("File content length: " + fileContents.length());
            System.out.println("Time execute(ms) " + (System.currentTimeMillis() - start));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFileToString(String filePath) throws IOException {
    	//still read by character to compare with not use buffer , but we can read by line by use reader.readLine()
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder content = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            content.append((char)c);
        }
        reader.close();
        return content.toString();
    }
}

