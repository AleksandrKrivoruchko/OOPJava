namespace phoneBook.phoneBook
{
    public class PhoneBook
    {
        private List<Contact> contacts = new List<Contact>();
        public List<Contact> Contacts
        {
            get => contacts;
        }

        public bool Add(Contact contact)
        {
            if (!contacts.Contains(contact))
            {
                contacts.Add(contact);
                return true;
            }
            return false;
        }

        public bool Update(Contact contact)
        {
            if (contacts.Remove(contact))
            {
                return this.Add(contact);
            }
            return false;
        }

        public bool Remove(Contact contact)
        {
            return contacts.Remove(contact);
        }

        public Contact? SearchByTelephone(string t)
        {
            foreach (Contact item in contacts)
            {
                if (item.Phone.IsPhone(t))
                {
                    return item;
                }
            }
            return null;
        }




    }
}