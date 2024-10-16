
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo d=new MethodDemo();
		String name=d.getData();
		System.out.println(name);
		MethodDemo2 d1=new MethodDemo2();
		d1.getuserData();
		String Name2=getdata2();
		System.out.println(Name2);

	}
	public String getData() {
		System.out.println("Hello World");
		return "Irfan";
	}
	public static String getdata2() {
		System.out.println("Hello World");
		return "Irfan";
	}

}
