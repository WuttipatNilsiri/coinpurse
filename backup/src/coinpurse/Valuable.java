package coinpurse;


import java.util.List;

public interface Valuable  {
	
	public double getValue();
	public String getCurrency();
	public boolean compareTo();
	public static void sort(List<Valuable> V){
		int n = V.size();
		int  c, d;
		Coin swap;
		for (c = 0; c < ( n - 1 ); c++) {
		      for (d = 0; d < n - c - 1; d++) {
		        if (V.get(d).getValue() - V.get(d+1).getValue() > 0)
		        {
		          swap = new Coin(V.get(d).getValue(),V.get(d).getCurrency());
		          V.set(d,V.get(d+1));
		          V.set(d+1, swap);
		        }
		    }
		
		}
	}

}
