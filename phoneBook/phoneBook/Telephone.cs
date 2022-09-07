using System;
using System.Collections.Generic;

namespace phoneBook.phoneBook
{
    public class Telephone
    {
        public List<string> Telephones
        {
            get => telephones;
            set => telephones = value;
        }
        private List<string> telephones = new List<string>();

        public Telephone() { }

        public Telephone(string t)
        {
            telephones.Add(t);
        }

        public bool AddTelephone(string t)
        {
            if (telephones.Contains(t))
            {
                return false;
            }
            telephones.Add(t);
            return true;
        }


    }
}