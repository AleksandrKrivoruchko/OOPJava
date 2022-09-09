using phoneBook.bookIOFile;

namespace phoneBook.phoneBook
{
    public class Telephone
    {
        public List<string> Telephones
        {
            get => telephones;
            set { }
        }
        private List<string> telephones = new List<string>();

        public Telephone() { }

        public Telephone(string t) => telephones.Add(t);

        public Telephone(List<string> list) => telephones.AddRange(list);

        public bool AddTelephone(string t)
        {
            if (telephones.Contains(t))
            {
                List<string> strList = new List<string>();
                strList.Add($"тел. {t} уже есть!");
                ErrorConsole.Message(strList);
                return false;
            }
            else
            {
                telephones.Add(t);
                return true;
            }
        }

        public bool RemovePhone(string t)
        {
            if (telephones.Contains(t))
            {
                telephones.Remove(t);
                return true;
            }
            return false;
        }


        public bool IsPhone(string t)
        {
            return telephones.Contains(t);
        }

        public int Count => telephones.Count;

        public string PhonesToFile()
        {
            string str = string.Empty;
            foreach (string s in telephones)
            {
                str += s + ";";
            }
            return str.Remove(str.Length - 1);
        }

        public override bool Equals(object? obj)
        {
            if (obj == null || !this.GetType().Equals(obj.GetType()))
            {
                return false;
            }
            Telephone t = (Telephone)obj;
            foreach (string s in t.telephones)
            {
                if (!this.telephones.Contains(s))
                {
                    return false;
                }
            }
            return true;
        }

        public override int GetHashCode()
        {
            int result = 0;
            foreach (string s in telephones)
            {
                result += s.GetHashCode();
            }
            return result;
        }

        public override string ToString()
        {
            string str = string.Empty;
            foreach (string s in telephones)
            {
                str += String.Format("тел. {0}\n", s);
            }
            return str;
        }
    }
}