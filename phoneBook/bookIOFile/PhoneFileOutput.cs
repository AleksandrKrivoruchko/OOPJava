using System.IO;
using phoneBook.interfaceBoks;

namespace phoneBook.bookIOFile
{
    public class PhoneFileOutput : IDataOutputHelper<IPhoneBook>
    {
        private string file;

        public PhoneFileOutput(string file) => this.file = file;
        public void write(IPhoneBook book)
        {
            File.WriteAllText(file, book.ToFile());
        }
    }
}