package template_demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		FileReader reader;
		BufferedReader br;
		try {
			reader = new FileReader("c://test.txt");

			br = new BufferedReader(reader);

			String str = null;

			int r = 0;

			while ((str = br.readLine()) != null && r < 100) {

				System.out.println(str);
				r++;

			}
			br.close();

			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
