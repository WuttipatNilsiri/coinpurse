package coinpurse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CoinUtil {
	
	
	public List<Coin> filterByCurrency(List<Coin> clist, String curr){
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
		List<String> filterCurr = new ArrayList<String>();
		List<Double> sumCurr = new ArrayList<Double>();
		for(int k = 0 ; k < coins.size() ; k++){ 
			sumCurr.add(0.0);
		}
		int count = 0;
		filterCurr.add(coins.get(0).getCurrency());
		sumCurr.set(0,coins.get(0).getValue());
		count++;
		for(int i = 1 ; i < coins.size() ;i++){
			for (int j = 0 ; j < filterCurr.size() ; j++){
				if (coins.get(i).getCurrency().equalsIgnoreCase(filterCurr.get(j))){
					sumCurr.set(j,sumCurr.get(j) + coins.get(i).getValue());
					
				}else
					filterCurr.add(coins.get(i).getCurrency());
					sumCurr.add(sumCurr.get(count) + coins.get(i).getValue());
					count++;
			}
		}
		for(int o = 0 ; o <= filterCurr.size(); o++){
			System.out.println(filterCurr.get(o));
			System.out.println(sumCurr.get(o));
			
		}
	}
	
}
