package xuepa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Comparator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class XuePaTest {

	private final static String EXIT = "exit";
	private final static String HELP = "help";
	private final static String ASK = "ask";
	private final static String ANSWER = "answer";
	private final static String LIST = "list";
	private final static String SCORE = "score";

	private static String command;
	private static XuPa xupa;
	private static User play = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//loadXuPa();
	}

//	private static void loadXuPa(){
//		if(!new File("xupa.xml").exists()){
//			xupa=new XuPa();
//			return;
//			
//			
//		}
//		try {
//			JAXBContext ctx=JAXBContext.newInstance(XuPa.class);
//			xupa=(XuPa) ctx.createUnmarshaller().unmarshal(new FileInputStream("xupa.xml"));
//			Collections.sort(xupa.getQuestions(), Comparator<Question>(){
//				public int compare(Question o1,Question o2){
//					boolean isSovled1=o1.isSolve();
//					boolean isSovled2=o2.isSolve();
//					
//					if (isSovled1==isSovled2) {
//						String id1=o1.getId();
//						String id2=o2.getId();
//						
//						return id1.compareTo(id2);
//					}else if (isSovled1) {
//						return 1;
//					}else if (isSovled2) {
//						return -1;
//					}
//					return 0;
//				}
//				
//			});
//					
//			
//			
//		} catch (JAXBException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
