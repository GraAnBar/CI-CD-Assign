import java.util.Scanner;

public class Hello{
	public static void main(String[] arg){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Who are youuu? ");
		String user = keyboard.next();
		System.out.println("Why hello there " + user);
	}
}