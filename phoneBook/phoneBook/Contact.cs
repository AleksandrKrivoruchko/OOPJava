

namespace phoneBook.phoneBook
{
    public class Contact
    {
        private string? fullName;
        public string FullName
        {
            get => fullName!;
            set => fullName = value;
        }
        private Telephone? phone;
        public Telephone Phone
        {
            get => phone!;
            set => phone = value;
        }

        public Contact(string fullName, Telephone phone)
        {
            this.fullName = fullName;
            this.phone = phone;
        }

        public override bool Equals(object? obj)
        {
            if (obj != null && this.GetType()
                .Equals(obj.GetType()))
            {
                Contact c = (Contact)obj;
                return phone!.Equals(c.Phone)
                   && fullName!.Equals(c.FullName);
            }
            return false;
        }

        public override int GetHashCode()
        {
            return fullName!.GetHashCode()
                   + phone!.GetHashCode();
        }

        public override string ToString()
        {
            return String.Format("{0}\n{1}",
                                 fullName, phone);
        }
    }
}