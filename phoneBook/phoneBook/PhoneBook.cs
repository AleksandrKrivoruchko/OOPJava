using phoneBook.interfaceBoks;

namespace phoneBook.phoneBook
{
    public class PhoneBook : IPhoneBook
    {
        private List<Contact> contacts = new List<Contact>();
        public List<Contact> Contacts
        {
            get => contacts;
        }

        public virtual bool Add(Contact contact)
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
            Contact? c = SearchByName(contact.FullName);
            if (c != null
                && !c.Equals(contact)
                && IsLooksLike(c, contact))
            {
                if (Remove(c))
                {
                    return Add(contact);
                }
            }
            return false;
        }

        private bool IsLooksLike(Contact c1, Contact c2)
        {
            foreach (string s in c1.Phone.Telephones)
            {
                if (c2.Phone.IsPhone(s))
                {
                    return true;
                }
            }
            return false;
        }

        public virtual bool Remove(Contact contact)
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

        public Contact? SearchByName(string name)
        {
            foreach (Contact item in contacts)
            {
                if (item.FullName.Equals(name))
                {
                    return item;
                }
            }
            return null;
        }

        public override bool Equals(object? obj)
        {
            if (obj != null && this.GetType()
                .Equals(obj.GetType()))
            {
                PhoneBook pB = (PhoneBook)obj;
                foreach (Contact c in pB.Contacts)
                {
                    if (!contacts.Contains(c))
                    {
                        Console.WriteLine("-----3");
                        return false;
                    }
                }
            }
            return true;
        }

        public override int GetHashCode()
        {
            int res = 0;
            foreach (Contact item in contacts)
            {
                res += item.GetHashCode();
            }
            return res;
        }

        public override string ToString()
        {
            string str = string.Empty;
            foreach (Contact item in contacts)
            {
                str += item + "\n";
            }
            return str;
        }

        public string ToFile()
        {
            string str = string.Empty;
            foreach (Contact c in contacts)
            {
                str += c.FullName + ":" + c.Phone.PhonesToFile() + "\n";
            }
            return str;
        }

    }
}