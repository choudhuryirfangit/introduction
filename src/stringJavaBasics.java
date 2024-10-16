
public class stringJavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Rahul shetty Academy";
		String s2="Hello";
		
		//new
		String s=new String("Rahul Shetty Academy");
		//Or
		//String s="Rahul Shetty Academy";
		
		String[] splittedString= s.split(" ");
		//String[] splittedString= s.split("Shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2].trim());
		//System.out.println(splittedString[2]);
		
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("***************************************");
		for (int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	

	}

}
