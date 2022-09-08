using phoneBook.phoneBook;

namespace phoneBook.interfaceBoks
{
    public interface IPhoneBook
    {
        bool Add(Contact c);
        bool Remove(Contact c);
        bool Update(Contact c);
        Contact? SearchByTelephone(string t);
        Contact? SearchByName(string name);
    }
}