

import java.util.Comparator;
import java.util.List;

public interface Valuable extends Comparable<Valuable> {
	/**
	 * get value
	 * @return value
	 */
	public double getValue();
	/**
	 * get currency
	 * @return currency
	 */
	public String getCurrency();
	/**
	 * convert to string
	 * @return string that contain value and currency
	 */
	public String toString();
	


}
