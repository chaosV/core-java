package qk.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class LearnRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnRegex reg=new LearnRegex();
		String[] phoneNums={"12345","0123-2345678"};
		for(String str:phoneNums){
			reg.test(str);
		}
	}
	
	public boolean test(String str){
		Pattern p=Pattern.compile("0\\d{2,3}-\\d{7,8}");
		Matcher matcher=p.matcher(str);
		System.out.println(str+":"+matcher.matches());
		
		return matcher.matches();
	}
}
