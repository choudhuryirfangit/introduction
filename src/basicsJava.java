
public class basicsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum=5;
		String Website="Rahul Shetty Academy";
		double dec=5.99;
		boolean myCard=true;
		
		System.out.println(myCard);
		//Array
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=3;
		arr[2]=6;
		arr[3]=9;
		arr[4]=12;
		
		int[] arr2= {3,4,5,6,7};
		
		//System.out.println(arr2[4]);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		String[] name= {"Rahul", "Shetty", "Selenium"};
		for (int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		for(String s: name) {
			System.out.println(s);
		}
		for(int p:arr) {
			System.out.println(p);
		}

	}

}
