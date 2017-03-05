

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class CoinUtil {
	
	/**
	 * filter By Currency
	 * @param clist
	 * @param curr currency
	 * @return filter List
	 */
	public static List<Valuable> filterByCurrency(List<Valuable> clist, String curr){
		List <Valuable> filterList = new ArrayList<Valuable>();
		for(Valuable x: clist){
			if(x.getCurrency().equalsIgnoreCase(curr)){
				filterList.add(x);
			}
		}
		return filterList;
	}
	/**
	 * sort By Currency
	 * @param v valuable list
	 */
	public static void sortByCurrency(List<Valuable> v){
		Collections.sort(v,new currencyComparator());

	}
	/**
	 * sum By Current
	 * @param v valuable list
	 */
	public static void sumByCurrent(List<Valuable> v){
//		SumCurr sc = new SumCurr();
		HashMap<String,Double> hm = new HashMap<String,Double>();
		for (Valuable x: v){
			if(hm.containsKey(x.getCurrency())){
				hm.put(x.getCurrency(), x.getValue() + hm.get(x.getCurrency()));
			}else
				hm.put(x.getCurrency(), x.getValue());
		}
		
		for (String x : hm.keySet()){
			System.out.println(x+" sum value = "+hm.get(x));
		}
	}
	
	
}

class currencyComparator implements Comparator<Valuable>{

	@Override
	public int compare(Valuable arg0, Valuable arg1) {
		return arg0.getCurrency().compareTo(arg1.getCurrency());
	}
	
}
