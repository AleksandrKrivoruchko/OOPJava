package bookIOFile;

import interfaceBooks.DataOutputHelper;
import phoneBooks.PhoneBook;

public class ConsoleOutput implements DataOutputHelper {
    @Override
    public void write(PhoneBook book) {
        System.out.println(book);
    }
}
