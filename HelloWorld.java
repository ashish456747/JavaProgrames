public class HelloWorld{
	static int test(int x){
		x=5;
		System.out.println("from test: " x);
	}
	public static void main (String args[]){
		System.out.println("Main Start");
		System.out.println("Hello World");
		int x=0;
		test(x);
		System.out.println("from test: " x);
	}

}
