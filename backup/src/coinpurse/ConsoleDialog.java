package coinpurse;

import java.util.Scanner;

public class ConsoleDialog implements Runnable{
	String curr = "thb";
	Purse purse;
	/**
	 * contractor of ConsoleDialog
	 * @param purse that use in ConsoleDialog
	 */
	public ConsoleDialog(Purse purse){
		this.purse=purse;
	}
	/**
	 * run ask user what want to do
	 */
	public void run(){
		Scanner console = new Scanner(System.in);
		char con = '\0';
		while (con != 'q'){
			System.out.print("dispost // withdraw // status // quit : ");
			con = console.nextLine().charAt(0);
			if(con == 'd'){
				dispostDialog();
			}else if (con == 'w'){
				withdrawDialog();
			}else if (con == 's'){
				status();
			}else if (con == 'q'){
				break;
			}
		}
		
	}
	/**
	 * show dispostDialog like how much that want to dispost
	 */
	public void dispostDialog(){
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to dispost system");
		System.out.println("Enter amount : ");
//		purse.withdraw(console.nextDouble());
		if (purse.insert(new Coin(console.nextDouble()))){
			System.out.println("Disposting complete");
		}else
			System.out.println("Disposting failed");
		
		status();
	}
	/**
	 * show withdrawDialog such as how much want to withdraw
	 */
	public void withdrawDialog(){
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to withdraw system");
		System.out.println("Enter amount : ");
//		purse.withdraw(console.nextDouble());
		print(purse.withdraw(console.nextDouble()));
		status();
	}
	/**
	 * print coin array (Trying)
	 * @param c coin array that want to print
	 */
	public void print(Coin[] c){
		System.out.print("{ ");
		int count = 0;
		for (Coin x: c){
			if(count == c.length-1){
				System.out.print(" "+x.toString());
			}else
				System.out.print(" "+x.toString()+",");
			count++;
		}
		System.out.print( " }\n");
	}
	/**
	 * show status of purse
	 */
	public void status(){
		System.out.println(purse.toString());
	}

}
