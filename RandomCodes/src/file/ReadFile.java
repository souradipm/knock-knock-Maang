package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File file = new File("C:\\Algo\\MyTxt.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
		}

	}

}
