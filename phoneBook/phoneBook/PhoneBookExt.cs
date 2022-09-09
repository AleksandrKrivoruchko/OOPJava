using phoneBook.bookIOFile;

namespace phoneBook.phoneBook
{
    public class PhoneBookExt : PhoneBook
    {
        private Telephone contactsPhones = new Telephone();

        public bool IsPhone(Contact contact)
        {
            foreach (string t in contact.Phone.Telephones)
            {
                if (contactsPhones.IsPhone(t))
                {
                    return true;
                }
            }
            return false;
        }

        public string GetPhone(Contact contact)
        {
            string str = string.Empty;
            foreach (string item in contact.Phone.Telephones)
            {
                if (contactsPhones.IsPhone(item))
                {
                    str = item;
                }
            }
            return str;
        }

        public override bool Add(Contact contact)
        {
            if (IsPhone(contact))
            {
                List<string> strList = new List<string>();
                string tmp = GetPhone(contact);
                strList.Add($"тел. {tmp} уже есть!");
                strList.Add("Входяший контакт:");
                strList.Add(contact.ToString());
                strList.Add("Контакт в телефонной книге:");
                strList.Add(SearchByTelephone(tmp)!.ToString());
                ErrorConsole.Message(strList);
                return false;
            }
            else
            {
                contactsPhones.Telephones.AddRange(contact.Phone.Telephones);
                return base.Add(contact);
            }
        }

        public override bool Remove(Contact contact)
        {

            if (base.Remove(contact))
            {
                foreach (string item in contact.Phone.Telephones)
                {

                    if (!contactsPhones.RemovePhone(item))
                    {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    }
}