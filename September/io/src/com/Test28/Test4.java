package com.Test28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test4 {

	public static void main(String[] args) {

		String folderPath = "E:\\lx\\test1";
		createFolder(folderPath);

		String fileName = "E:\\lx\\test1\\test.bat";
		creatFileName(fileName);

		writeToFile(fileName);
		
		readToFile(fileName);
	}

	public static void createFolder(String folderPath) {
		File file = new File(folderPath);
		file.mkdirs();

	}

	public static Boolean creatFileName(String fileName) {
		File creatFileName = new File(fileName);
		Boolean isSuccess = false;
		try {
			isSuccess = creatFileName.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

	public static void writeToFile(String fileName) {
		File file = new File(fileName);
		BufferedWriter bwriter = null;
		try {
			FileWriter writer = new FileWriter(file);
			bwriter = new BufferedWriter(writer);
			bwriter.write("    zzzzzz");
			bwriter.newLine();
			bwriter.write("  xxxxxxxxx");
			bwriter.newLine();
			bwriter.write(" cccccccccccc");
			bwriter.newLine();
			bwriter.write("vvvvvvvvvvvvvvc");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bwriter != null) {
				try {
					bwriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static void readToFile(String fileName) {
		File file = new File(fileName);
		BufferedReader bRead = null;
		try {
			FileReader reader = new FileReader(file);
			bRead = new BufferedReader(reader);

			String line = bRead.readLine();
			while (line != null) {
				System.out.println(line);
				line = bRead.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
