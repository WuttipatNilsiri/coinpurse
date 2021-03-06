package coinpurse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CoinUtil {
	
	
	public static List<Coin> filterByCurrency(List<Coin> clist, String curr){
		List <Coin> filterList = new ArrayList<Coin>();
		for(Coin x: clist){
			if(x.getCurrency().equalsIgnoreCase(curr)){
				filterList.add(x);
			}
		}
		return filterList;
	}
	public static List<Coin> sortByCurrency(List<Coin> coins){
		int n = coins.size();
		int  c, d;
		Coin swap;
		for (c = 0; c < ( n - 1 ); c++) {
		      for (d = 0; d < n - c - 1; d++) {
		        if (coins.get(d).getCurrency().compareToIgnoreCase(coins.get(d+1).getCurrency()) > 0) /* For descending order use < */
		        {
		          swap = new Coin(coins.get(d).getValue(),coins.get(d).getCurrency());
		          coins.set(d,coins.get(d+1));
		          coins.set(d+1, swap);
		        }
		    }
		}
		return coins;
	}
	public static void sumByCurrent(List<Coin> coins){
		SumCurr sc = new SumCurr();
		
		sc.filterCurr.add(coins.get(0).getCurrency());
		sc.sumCurr.add(coins.get(0).getValue());
		for(int i = 1 ; i < coins.size() ; i++){
			boolean isAdd = false;
			for(int j = 0 ; j < sc.filterCurr.size() ; j++){
				if(coins.get(i).getCurrency() == sc.filterCurr.get(j)){
					sc.sumCurr.set(j,sc.sumCurr.get(j)+coins.get(i).getValue());
					isAdd = true;
					break;
				}
			}
			if(isAdd == false){
				sc.filterCurr.add(coins.get(i).getCurrency());
				sc.sumCurr.add(coins.get(i).getValue());
			}
		}
		
		sc.print();
		
	}
	
}
