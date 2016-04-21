package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StudentFactory {
	
	private final String PATH= "src/base"; 
	
	private static StudentFactory instance;
	
	private StudentFactory() {
		
	}
	
	
	public static StudentFactory getInstance() {
		if (null == instance) {
			instance = new StudentFactory();
			return instance;
		} else {
			return instance; }
	}
	
	public List<Student> getSFromFile() {
		try {
			return readFrom(new FileInputStream(PATH));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Student> getFromConsole() {
		//System.out.print("Enter Names sep by space: ");
		return readFrom(System.in);
	
	}
	
	public List<Student> readFrom(InputStream in) {
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		List<Student> result = new ArrayList<Student>();
		try {
			String line = null;
			//for (String line = br.readLine(); line != null; line = br.readLine()) {
			while (null != (line = br.readLine()) && line.length() > 0)  {
				String[] indiv = line.split(" ");
				Student stud = new Student();
				stud.setFirstname(indiv[0]);
				
				String last="";
				for (byte i = 1; i < indiv.length; i++) {
					if (i == indiv.length - 1) {
						last += indiv[i];
					} else {last += indiv[i]+", "; }
				}
				//last = last.substring(0, last.length()-2);
				stud.setLastname(last);
				result.add(stud);
				
			}
			in.close();
			br.close();
			
		} catch (FileNotFoundException e) {	e.printStackTrace();
		} catch (IOException e) {e.printStackTrace(); }
		return result;
	}

	
	
	public void writeToFile (List<Student> studs) {
		try {
			RandomAccessFile raf = new RandomAccessFile(new File(PATH),"rw");
			long offset = raf.length();
			raf.seek(offset);
			//raf.writeUTF("\n");
			for (Student stud : studs) {
				raf.writeUTF("\n"+stud.getFirstname()+" "+stud.getLastname());
			}
			raf.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void consoleToFile() {
		writeToFile(getFromConsole());
	}
}
