package coinpurse;

import java.util.List;

public class test2 {
	public static void main(String[]args){
		Purse purse = new Purse(10);
		purse.insert(new Coin(9,"a"));
		purse.insert(new Coin(98,"a"));
		purse.insert(new Coin(10,"c"));
		purse.insert(new Coin(9,"c"));
		purse.insert(new Coin(97,"b"));
		purse.insert(new Coin(99,"b"));
//		List <Coin> a = CoinUtil.sortByCurrency(purse.coinPurse);
		CoinUtil.sumByCurrent(purse.coinPurse);
//		for (Coin x : a ){
//			System.out.println(x.toString());
//		}
		
		
	}
}
