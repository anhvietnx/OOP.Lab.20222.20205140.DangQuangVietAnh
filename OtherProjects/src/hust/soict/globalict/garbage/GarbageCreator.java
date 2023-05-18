package hust.soict.globalict.garbage;
import java.io.FileReader;
import java.io.IOException;


public class GarbageCreator {
	public static void main(String[] args) throws IOException {
		
		long start = System.currentTimeMillis();
		try {
            String fileContents  = readFileToString("C:\\Users\\ankvi\\eclipse-workspace\\OtherProjects\\src\\hust\\soict\\globalict\\garbage\\b1.txt"); //fileContens is contents            
			System.out.println("Length of file :" + fileContents.length());			
			System.out.println("Time execute(ms) "+ (System.currentTimeMillis() - start));
			} catch(IOException e) {
			e.printStackTrace();
		}		
	}	
	private static String readFileToString(String filePath) throws IOException {
    	//passing path to file to read file (read by char)
		FileReader reader = new FileReader (filePath);
        int c;
        String contents =""; //create String to save content of files
        while ((c = reader.read()) != -1) {
            contents += c;
        }
        reader.close();
        return contents;
    }
}






