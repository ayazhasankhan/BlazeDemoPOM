package basicConcepts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {

	public static void main(String[] args) throws Exception {
		
		File file = new File("/Users/mr.a2z/apache-jmeter-5.5/Scripts/UserData.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);

		//var rc=prev.getResponseCode();
		String rc="200";
		
		if(rc.equals("200")){

			bw.write("Test is passed");
			
			
		}
		else{
			bw.write("Failed");
		}

		bw.close();
		fw.close();

	}

}
