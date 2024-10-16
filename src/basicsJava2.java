import java.util.ArrayList;

public class basicsJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5,6,7,8,9,10,122};
		//2,4,6,8,10,122
		//check id array has multiple of 2
		for (int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
				break;
			}
			else {
				System.out.println(arr[i]+" is not a multiple of 2");
			}
		}
		ArrayList<String> a= new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("academy");
		a.add("selenium");
		//a.remove(2);
		//System.out.println(a.get(3));
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
			
		}
		System.out.println("*****************************");
			for(String val :a) {
				System.out.println(val);
			
		}

	}

}
