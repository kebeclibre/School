package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StudentFactory {
	
	
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
			return readFrom(new FileInputStream("src/base"));
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
			//while (true) {
				//if (br.ready()) {
				//String response =  br.readLine();
				//if (response == null) {break;}
				String[] indiv = line.split(" ");
				Student stud = new Student();
				stud.setFirstname(indiv[0]);
				
				String last="";
				for (byte i = 1; i < indiv.length; i++) {
					last += indiv[i];
				}
				stud.setLastname(last);
				result.add(stud);
				
			}
			in.close();
			br.close();
			
		} catch (FileNotFoundException e) {	e.printStackTrace();
		} catch (IOException e) {e.printStackTrace(); }
		return result;
	}
	
// http://codereview.stackexchange.com/questions/44135/is-it-ok-to-use-while-line-r-readline-null-construct
	
	
	public void writeToFile () {
		
	}
}
