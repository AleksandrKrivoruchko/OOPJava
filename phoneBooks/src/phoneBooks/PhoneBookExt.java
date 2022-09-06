package phoneBooks;

import bookIOFile.MatchForPhone;

public class PhoneBookExt extends PhoneBook{
    Telephone contactsPhones = new Telephone();

    public PhoneBookExt() {
        super();
    }

    public void addToBook(Contact contact) {
        getContacts().add(contact);
        for (String t: contact.getPhone().getTelephones()) {
            contactsPhones.addTelephone(t);
        }
    }

    @Override
    public void addContact(Contact contact) {
        if (contactsPhones.phoneCount() == 0 ||
                !getContacts().contains(contact)) {
            if (isHasPhone(contact.getPhone())) {
                for (String t : contact.getPhone().getTelephones()) {
                    Contact tmp = searchByTelephone(t);
                    if (tmp != null) {
                        MatchForPhone.writeError(tmp, contact,
                                String.format("Телефон %s уже есть!", t));
                        return;
                    }
                }
            }
            addToBook(contact);
        } else {
            Contact tmp = searchByName(contact.getFullName());
            if (tmp.getPhone().phoneCount() < contact
                    .getPhone().phoneCount()) {
                removeContact(tmp);
                addContact(contact);
                if (!getContacts().contains(contact)) {
                    addContact(tmp);
                }
            }
//            MatchForPhone.writeError(tmp, contact,
//                    "Контакт уже есть!");
        }
    }

    @Override
    public Contact searchByTelephone(String phone) {
        for (Contact c : getContacts()) {
            if (c.getPhone().isTelephone(phone)) {
                return c;
            }
        }
        return null;
    }

    public  boolean isHasPhone(Telephone tp) {
        for (String t : tp.getTelephones()) {
            if (contactsPhones.isTelephone(t)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeContact(Contact contact) {
        if (getContacts().contains(contact)) {
            for (String t : contact.getPhone().getTelephones()) {
                contactsPhones.removePhone(t);
            }
            super.removeContact(contact);
            return true;
        }
        return false;
    }
}
