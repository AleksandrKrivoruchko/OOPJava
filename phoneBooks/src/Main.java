import bookIOFile.ConsoleOutput;
import bookIOFile.FileInput;
import bookIOFile.FileOutput;
import interfaceBooks.DataInputHelper;
import phoneBooks.Contact;
import phoneBooks.PhoneBook;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("Иванов Сергей Федорович",
                "+7(988) 345-97-32");
        Contact contact1 = new Contact("Иванов Сергей Иванович",
                "+7(952) 345-97-32");
        Contact contact2 = new Contact("Ивницкий Сергей Федорович",
                "+7(988) 345-57-32");
        contact2.addTelephone("+7(919) 546 34 45");
        PhoneBook book = new PhoneBook();
        book.addContact(contact);
        book.addContact(contact1);
        book.addContact(contact2);
        ConsoleOutput con = new ConsoleOutput();
        con.write(book);
//        FileOutput fw = new FileOutput("dataPhone.txt");
//        fw.write(book);
//        DataInputHelper fr = new FileInput("dataPhone.txt");
//        PhoneBook book1 = new PhoneBook();
//        fr.read(book1);
//        if (book.searchByName(contact.getFullName()) != null) {
//            book1.removeContact(contact);
//        }
//        Contact contact4 = new Contact("Ивницкий Сергей Федорович",
//                "+7(988) 345-57-42");
//        book1.addContact(contact4);
//        con.write(book1);
//
//        if (book1.searchByTelephone(contact.getTelephones()) == null) {
//            book1.updateContact(contact);
//        }
//        con.write(book1);
//
//        fw.updateFile(book1, "dataPhone.txt");
    }
}
