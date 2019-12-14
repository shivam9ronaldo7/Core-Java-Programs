package basicPrograms;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFileAndFolder {

	public static void main(String[] args) {
		createAndWrite(createDirectory("Test1/Test2"));
	}
	
	public static String createDirectory(String folderName) {
		String rootDirectory = "C:/Users/student_v/Desktop/MyReportTest"+"/"+folderName;
		File folder = new File(rootDirectory);
		folder.mkdirs();
		return rootDirectory;
	}
	
	public static String createAndWrite(String directory) {
		String filePath = directory+"/sps.txt";
		try(FileOutputStream fs = new FileOutputStream(filePath);) {		
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filePath;
	}

}
