package interfaceBooks;

import phoneBooks.PhoneBook;

public interface OutputHelper extends DataOutputHelper{
    void updateFile(PhoneBook book, String fileName);
}
