package OnlineClass1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example1 {
	
	//File Not Found

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File ("G://file.txt");
		FileReader fr = new FileReader(file);
	}

}
