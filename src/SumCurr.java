

import java.util.ArrayList;
import java.util.List;

public class SumCurr {
	List<String> filterCurr;
	List<Double> sumCurr;
	int count;
	public SumCurr(){
		this.sumCurr = new ArrayList<Double>();
		this.filterCurr = new ArrayList<String>();
	}
	public void print(){
		for (int  x = 0 ; x < filterCurr.size() ; x++){
			System.out.println(filterCurr.get(x));
			System.out.println(sumCurr.get(x));
		}
	}
}
