import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please put your name:");
		String name=sc.nextLine();
		System.out.println("Hello World, "+name);
		System.out.println("Please print a number<100: ");
		int n=sc.nextInt();
		int accumulator=0;
		for(int i=1;i<=n;i+=2) {
			accumulator+=i;
		}
		System.out.println(accumulator);
		
		System.out.println("This is to demo the collaboration");
	}

}
