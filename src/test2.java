

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test2 {
	public static void main(String[]args){
//		List<Valuable> lstVal = new ArrayList<Valuable>(10);
//		lstVal.add(new Banknote(100,"THB"));
//		lstVal.add(new Banknote(80,"THB"));
//		lstVal.add(new Coin(5,"THB"));
//		lstVal.add(new Banknote(50,"THB"));
//		lstVal.add(new Coin(1,"THB"));
//		lstVal.add(new Coin(2,"THB"));
//		lstVal.add(new Banknote(20,"THB"));
//		lstVal.add(new Coin(10,"THB"));
//		lstVal.add(new Banknote(10000,"JPY"));
//		lstVal.add(new Coin(5,"JPY"));
//		lstVal.add(new Banknote(5000,"JPY"));
//		lstVal.add(new Banknote(1000,"JPY"));
//		lstVal.add(new Coin(500,"JPY"));
//		lstVal.add(new Coin(300,"JPY"));
//		lstVal.add(new Coin(100,"JPY"));
//		lstVal.add(new Banknote(3000,"JPY"));
//		lstVal.add(new Banknote(5000,"USA"));
//		lstVal.add(new Banknote(10000,"USA"));
//		lstVal.add(new Banknote(3000,"USA"));
//		lstVal.add(new Coin(5,"USA"));
//		lstVal.add(new Coin(10,"USA"));
//		Collections.sort(lstVal);
//		Purse purse = new Purse(10);
//		purse.insert(new Coin(9,"a"));
//		purse.insert(new Coin(98,"a"));
//		purse.insert(new Coin(10,"c"));
//		purse.insert(new Coin(1000,"c"));
//		purse.insert(new Coin(97,"b"));
//		purse.insert(new Coin(99,"b"));
////		List <Coin> a = CoinUtil.sortByCurrency(purse.coinPurse);
//		CoinUtil.sumByCurrent(purse.ValuablePurse);
//		for (Valuable x : lstVal ){
//			System.out.println(x.toString());
//		}
		MoneyFactory.setMoneyFactory("malay");
		MoneyFactory factory = MoneyFactory.getInstance();
		Valuable m = factory.createMoney(20);
		System.out.println(m.toString());
		
		
	}
}
