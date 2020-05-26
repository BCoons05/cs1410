package docComments;

import java.util.ArrayList;

/**
 * Prepopulates a list of phones as an
 * ArrayList
 * 
 * @author Brian
 *
 */
public class PhoneList {

	public static ArrayList<Phone> createPhoneList() {
		
		ArrayList<Phone> phones = new ArrayList<Phone>();
		
		Phone iphone6s = new Phone("Apple", "iPhone 6s", 64);
		Phone s10 = new Phone("Samsung", "Galaxy S10", 64);
		Phone iphoneX = new Phone("Apple", "iPhone X", 128);
		Phone s11 = new Phone("Samsung", "Galaxy S11", 128);
		
		phones.add(iphone6s);
		phones.add(s10);
		phones.add(iphoneX);
		phones.add(s11);
		
		return phones;
	}

}
