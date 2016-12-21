package qingke;

public class sort {

	public static void main(String[] args) {
//		int[] sort = { 21, 47, 33, 11, 93, 84, 20, 30, 99, 8 };
//
//		for (int a = 0; a < sort.length; a++) {
//			for (int b = a + 1; b < sort.length; b++) {
//				if (sort[a] > sort[b]) {
//					int temp;
//					temp = sort[a];
//					sort[a] = sort[b];
//					sort[b] = temp;
//				}
//			}
//			System.out.println(sort[a]);
//		}
		//makeChocolate(1000, 1000000, 5000006);
//		makeChocolate(3, 1, 9);s
		xyBalance("aaaaxxxyyy");
	}

	public String endUp(String str) {
		String s = "1,23,4,556,we";
		int[] a={1,2,3,4,5,6,7};
		a.toString();
		String[] ss = s.split(",");
//		String.v
//		s.endsWith("ly");
		
		if (str.length() <= 3) {
			return str.toUpperCase();
		}
		String big = str.substring(str.length() - 3, str.length());
		String small = str.substring(0, str.length() - 3);
		char[] cs = big.toCharArray();
		return small + big.toUpperCase();

	}
	
	public static int makeChocolate(int small, int big, int goal) {
		  int count=0;
		  System.out.println(goal/5 );
		  if(goal/5<=big){
		    if((goal-(goal/5)*5)<=small);{
		      count=(goal-(goal/5)*5);
		      return count;
		    }
		  }if(goal/5>big){
			  
		    if(goal-(goal-big*5)<=small){
		      count=goal-big*5;
		      System.out.println(goal+","+count);
		      return count;
		    }
		  }return -1;
		}
	public static boolean xyBalance(String str) {
		  int x1=0,y1=0;
		  for(int i=str.length();i>0;i--){
			    if(str.substring(i-1,i).equals("y")){
			      y1=i-1;
			      System.out.println("y1:"+y1);
			      break;
			    }
		  }
		  for(int i=str.length();i>0;i--){
			    if(str.substring(i-1,i).equals("x")){
			      x1=i-1;
			      System.out.println("x1:"+x1);
			      break;
			    }
		  }
			  if(x1<y1){
			    return true;
			  }
			  return false;
			}
}
