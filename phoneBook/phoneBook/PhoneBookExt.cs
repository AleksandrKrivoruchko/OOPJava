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

        public override bool Add(Contact contact)
        {
            if (IsPhone(contact))
            {
                Console.WriteLine("Error added!");
                return false;
            }
            contactsPhones.Telephones.AddRange(contact.Phone.Telephones);
            return base.Add(contact);
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