package phoneBooks;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts = new ArrayList<>();

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        if (contacts.contains(contact)) {
            updateContact(contact);
        } else {
            contacts.add(contact);
        }
    }

    public void updateContact(Contact contact) {
        int i = contacts.indexOf(contact);
        if (i != -1) {
            contacts.set(i, contact);
        } else {
            addContact(contact);
        }
    }
}
