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

    public boolean removeContact(Contact contact) {
        if (contacts.contains(contact)) {
            contacts.remove(contact);
            return true;
        }
        return false;
    }

    public Contact searchByTelephone(String phone) {
        for (Contact c : contacts) {
            if(c.getTelephone().equals(phone)) {
                return c;
            }
        }
        return null;
    }

    public Contact searchByName(String name) {
        for (Contact c : contacts) {
            if (c.getFullName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Contact c : contacts) {
            sb.append(c.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        PhoneBook b = (PhoneBook) o;
        List<Contact> bList = b.getContacts();
        if (contacts.size() != bList.size()) {
            return false;
        }
        for (Contact c : bList) {
            if (!contacts.contains(c)) {
                return false;
            }
        }
        return true;
    }
}
