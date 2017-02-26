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
		double amout = console.nextDouble();
//		purse.withdraw(console.nextDouble());
		if(amout >= 20){
			if (purse.insert(new Banknote(amout))){
				System.out.println("Disposting complete");
			}else
				System.out.println("Disposting failed");
		}else
			if (purse.insert(new Coin(amout))){
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
		double amout = console.nextDouble();
//		purse.withdraw(console.nextDouble());
		if(purse.getBalance() < amout) System.out.println("can't withdraw");
		else print(purse.withdraw(amout));
		status();
	}
	/**
	 * print coin array (Trying)
	 * @param c coin array that want to print
	 */
	public void print(Valuable[] c){
		System.out.print("{ ");
		int count = 0;
		for (Valuable x: c){
			
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
		for(Valuable x :purse.ValuablePurse)
			System.out.println(x.toString());
	}

}
