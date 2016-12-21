
		/*
		 * 演示如何创建文件
		 * 如何创建文件并写入内容（绝对路径和相对路径）
		 * 列出目录下的所有文件
		 * 读取文件内容
		 * 删除文件
		 * copy文件
		 * */

package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Learnio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		File f=new File("E:\\java");
//		System.out.println(f.exists());
//		System.out.println(f.isDirectory());
//		System.out.println(f.isFile());
		String folderPath="E:\\lx\\test1";
		createFolder(folderPath);

		
		String fileName="E:\\lx\\test.txt";
		createFile(fileName);
		
		
		//listAndDeleteFiles(folderPath);
		
		writeToFile(fileName);
		readToFile( fileName);
	}
	
	public static void readToFile(String fileName){
		File file=new File(fileName);
		BufferedReader bRead=null;
		try {
			FileReader read=new FileReader(file);
			bRead=new BufferedReader(read);
				String line=bRead.readLine();
				while(line !=null){
					System.out.println(line);
					line=bRead.readLine();
				}
		} catch (FileNotFoundException e){	
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	//写入内容
	public static void writeToFile(String fileName){
		File file=new File(fileName);
		BufferedWriter bwriter=null;
		try {
			FileWriter writer=new FileWriter(file);
			bwriter =new BufferedWriter(writer);         //装饰器
			bwriter.write("你好！");
			bwriter.newLine();
			bwriter.write(123);
			bwriter.newLine();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}finally{
			if(bwriter !=null){
				try {
					bwriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	//创建文件夹
	public static void createFolder(String folderPath){
		File file =new File(folderPath);
		file.mkdirs();
		
	}
	
	//创建文件
	public static boolean createFile(String fileName){
		File file =new File(fileName);
		//System.out.println(file.getAbsolutePath());
		Boolean  isSuccess=false;
		try{
			isSuccess=file.createNewFile();
		}catch (IOException e){
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	//列出和删除文件
	public static void listAndDeleteFiles(String folderPath){
		File file=new File(folderPath);
		for(String fileName:file.list()){
			File newFile=new File(folderPath+"/"+fileName);
			newFile.delete();
			System.out.println(fileName);
		}
	}

}
