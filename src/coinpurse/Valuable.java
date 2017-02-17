package coinpurse;

import java.util.Comparator;
import java.util.List;

public interface Valuable extends Comparable<Valuable> {
	
	public double getValue();
	public String getCurrency();
	public String toString();
	public boolean equals();
//	public static void sort(List<Valuable> V) {
//		int n = V.size();
//		int  c, d;
//		Valuable swap;
////		for (c = 0; c < ( n - 1 ); c++) {
////		      for (d = 0; d < n - c - 1; d++) {
////		        if (V.get(d).getValue() - V.get(d+1).getValue() > 0)
////		        {
////		        	if(V.get(d).getValue() >= 20) swap = new Banknote(V.get(d).getValue(),V.get(d).getCurrency());
////		        	else swap = new Coin(V.get(d).getValue(),V.get(d).getCurrency());
////		        	V.set(d,V.get(d+1));
////		        	V.set(d+1, swap);
////		        }
////		    }
////		
////	}
//		
//	}

}
