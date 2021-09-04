package kompleksniZadaci;

import java.util.*;

public class MojKomparator implements Comparator<Klijent> {

	@Override
	public int compare(Klijent o1, Klijent o2) {
		int i = o1.getJmbg().compareTo(o2.getJmbg());
		if (i > 0) {
			return -1;
		} else if (i < 0) {
			return 1;
		}
		return 0;
	}
}
