package docComments;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Gets user input from menu with options to
 * show, add, delete, count, and find phones
 * from an ArrayList. Creates a prepopulated
 * ArrayList with 4 phones.
 * 
 * @author Brian
 *
 */
public class DeviceApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Phone> phoneList = PhoneList.createPhoneList();
		int answer = 0;
		
		while(answer != 6) {
			Menu.mainMenu();
			answer = scanner.nextInt();
			switch(answer) {
				case 1:
					System.out.println(showAll(phoneList));
					break;
				case 2:
					System.out.println(addPhone(phoneList) + "\n");
					break;
				case 3:
					System.out.println(findPhone(phoneList, getId()) + "\n");
					break;
				case 4:
					System.out.println(deletePhone(phoneList, getId()) + "\n");
					break;
				case 5:
					System.out.println(countPhones(phoneList) + "\n");
					break;
				case 6:
					System.out.println(exit());
					break;
				default:
					System.out.println("Enter a selection 1 - 6");
				}
		}

	}
	
	/**
	 * Prints prompt to get id input from user for searches.
	 * 
	 * @return id as integer for searches
	 */
	private static int getId() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Id: ");
		int id = scanner.nextInt();
		
		return id;
	}
	
	/**
	 * Shows all phones in phonelist on a separate line.
	 * 
	 * @param phoneList
	 * @return String of phone list
	 */
	private static String showAll(ArrayList<Phone> phoneList) {
		StringBuilder showList = new StringBuilder();
		
		for(Phone phone : phoneList) {
			showList.append(phone + "\n");
		}
		
		return showList.toString();
		
	}
	
	/**
	 * Adds a phone to the phone list
	 * after getting input from user for:
	 * Manufacturer
	 * model
	 * storage size in GB.
	 * 
	 * @param phoneList
	 * @return String confirmation of added phone
	 */
	private static String addPhone(ArrayList<Phone> phoneList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Manufacturer: ");
		String manufacturer = scanner.nextLine();
		System.out.println("Enter Model: ");
		String model = scanner.nextLine();
		System.out.println("Enter storage size in GB: ");
		int storage = scanner.nextInt();
		
		Phone newPhone = new Phone(manufacturer, model, storage);
		phoneList.add(newPhone);
		
		return "adding " + newPhone.toString();
	}
	
	/**
	 * Finds a phone in phone list by Id
	 * if not Id found, will return "id not found".
	 * 
	 * @param phoneList
	 * @param id
	 * @return String of phone info, unless Id not found
	 */
	private static String findPhone(ArrayList<Phone> phoneList, int id) {
		for(Phone phone : phoneList) {
			if(phone.getId() == id) {
				return phone.toString();
			}
		}
		
		return "Id not found\n";
	}
	
	/**
	 * Deletes phone from phone list
	 * using id entered by user
	 * will return "id not found" if no match in list.
	 * 
	 * @param phoneList
	 * @param id
	 * @return String confirmation of deleted phone, unless not found
	 */
	private static String deletePhone(ArrayList<Phone> phoneList, int id) {
		for(Phone phone : phoneList) {
			if(phone.getId() == id) {
				phoneList.remove(phone);
				return phone.toString() + " deleted";
			}
		}
		
		return "Id not found\n";
	}
	
	/**
	 * Counts the number of phones in the phone list.
	 * 
	 * @param phoneList
	 * @return Int size of phone list
	 */
	private static int countPhones(ArrayList<Phone> phoneList) {
		return phoneList.size();
	}
	
	/**
	 * Shows "goodbye!" when user chooses to exit
	 * 
	 * @return String
	 */
	private static String exit() {
		return "Goodbye!";
	}

}
