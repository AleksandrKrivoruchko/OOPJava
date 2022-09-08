using System.IO;

using phoneBook.interfaceBoks;
using phoneBook.phoneBook;

namespace phoneBook.bookIOFile
{
    public class PhoneFileInput : IDataInputHelper
    {
        private string file;

        public PhoneFileInput(string file) => this.file = file;

        public void read(IPhoneBook book)
        {
            string[] strBook = File.ReadAllLines(file);
            foreach (var item in strBook)
            {
                string tmp = item.Trim();
                if (item == string.Empty)
                {
                    continue;
                }
                string[] tmpStr = tmp.Split(":");
                string[] phones = tmpStr[1].Split(";");
                Telephone tel = new Telephone(new List<string>(phones));
                Contact c = new Contact(tmpStr[0], tel);
                book.Add(c);
            }
        }
    }
}