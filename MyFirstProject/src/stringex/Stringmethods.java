package stringex;

public class Stringmethods {

	public static void main(String[] args) {
		String s="welcome to Besant";
////		char d=s.charAt(5);//as the return type is char
////		System.out.println(s.charAt(5));char charAt(int index)
//       System.out.println(s.length());
//        System.out.println(s.substring(2));//substring
//        System.out.println(s.substring(11,17));//first is until what you want to remove and last is the total letters+1substring which will count the spaces and remove them
//		System.out.println(s.contains("to"));//boolean contains
//			String s1=s.replace('t','n');
//	System.out.println(s1);	
//	String s2= "deaf";
//	String s3="Dear";
//	System.out.println(s2.equals(s3));
//	String arr[]=s.split("");
//	System.out.println(arr[0]);
	String s2=s.replace(s.charAt(0),'W');
	System.out.println(s2);
	
	
	
	}
	

}
