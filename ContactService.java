package contactService;
import java.util.ArrayList;
public class ContactService {
	
	private ArrayList<Contact> contacts;
	public ContactService() {
	// Array List
		contacts = new ArrayList<>();
	}
	// method to add contacts to arrayList
	public boolean addContact(Contact contact) {
		boolean contactExists = false;
		for (Contact contactList:contacts) {
			if (contactList.equals(contact)) {
				contactExists = true;
			}
		}
		if (!contactExists) {
			contacts.add(contact);
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	// method to delete contacts from arrayList
	public boolean deleteContact(String string) {
		for (Contact contactList:contacts) {
			if (contactList.getID().equals(string)) {
				contacts.remove(contactList);
				return true;
			}
		}
		return false;
	}
	// Method to update contacts
	public boolean updateContact(String firstName, String lastName, String id, String phoneNumber, String address) {
		for (Contact contactList:contacts) {
			if (contactList.getID().equals(id)) {
				contactList.setFirstName(firstName);
				contactList.setLastName(lastName);
				contactList.setPhoneNumber(phoneNumber);
				contactList.setAddress(address);
			}
			return true;
		}
		return false;
	
	}

}


