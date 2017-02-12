package coinpurse;

public class test {
	public static void main(String[]args){
		Purse purse = new Purse(10);
		ConsoleDialog ui = new ConsoleDialog(purse);
		ui.run();
	}
}
