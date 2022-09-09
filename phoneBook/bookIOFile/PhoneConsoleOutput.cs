using phoneBook.interfaceBoks;

namespace phoneBook.bookIOFile
{
    public class PhoneConsoleOutput : IDataOutputHelper<string>
    {
        public void write(string book)
        {
            Console.WriteLine(book);
        }
    }
}