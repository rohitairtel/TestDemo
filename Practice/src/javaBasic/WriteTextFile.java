/**
 * 
 */
package javaBasic;

import java.io.*;

/**
 * @author A1SKIVA4
 *
 */
public class WriteTextFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	/*	String txt = "This is temporary file to write";
		
		FileWriter writefile = new FileWriter("D:\\Airtel\\temp.txt");

		BufferedWriter write = new BufferedWriter(writefile);
		
		write.write(txt);

		write.close();
		*/
		
		
		String abc = "This is temporary file";
		FileWriter writefile = new FileWriter("D:\\Airtel\\testtemp.txt");
		
		BufferedWriter writee = new BufferedWriter(writefile);
		
		writee.write(abc);
		writefile.close();
	}

}
