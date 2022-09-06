import bookIOFile.ConsoleOutput;
import bookIOFile.FileInput;
import bookIOFile.FileOutput;
import interfaceBooks.DataInputHelper;
import phoneBooks.Contact;
import phoneBooks.PhoneBook;
import phoneBooks.PhoneBookExt;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("Иванов Сергей Федорович",
                "+7(988) 345-97-32");
        Contact contact1 = new Contact("Иванов Сергей Иванович",
                "+7(952) 345-97-32");
        contact1.getPhone().addTelephone("+7(988) 345-97-34");
        Contact contact2 = new Contact("Ивницкий Сергей Федорович",
                "+7(988) 345-57-32");
        contact2.getPhone().addTelephone("+7(919) 546 34 45");
        contact2.getPhone().addTelephone("+7(918) 546 34 45");
        contact2.getPhone().addTelephone("+7(919) 546 34 41");
        contact2.getPhone().addTelephone("+7(919) 546 34 42");
        contact2.getPhone().addTelephone("+7(919) 546 34 43");
        PhoneBook book = new PhoneBookExt();
        book.addContact(contact);
        book.addContact(contact1);
        book.addContact(contact2);
        ConsoleOutput con = new ConsoleOutput();
        con.write(book);
        System.out.println("--------------------------------------------");
        FileOutput fw = new FileOutput("dataPhone.txt");
        fw.write(book);
        DataInputHelper fr = new FileInput("dataPhone.txt");
        PhoneBook book1 = new PhoneBookExt();
        fr.read(book1);
        if (book.searchByName(contact.getFullName()) != null) {
            book.removeContact(contact);
        }
        con.write(book);
        System.out.println("--------------------------------------------");
        Contact contact4 = new Contact("Ивницкий Сергей Федорович",
                "+7(988) 345-57-42");
        book1.addContact(contact4);
        con.write(book1);
        System.out.println("--------------------------------------------");
        contact.getPhone().addTelephone("+7(919) 546 34 45");

        book1.addContact(contact);
        System.out.println("--------------------------------------------");
        book1.removeContact(contact1);
        con.write(book1);
        System.out.println("--------------------------------------------");
        if (book1.searchByTelephone(contact1.getPhone()
                .getTelephones().get(0)) == null) {
            book1.updateContact(contact1);
        }
        con.write(book1);

        fw.updateFile(book1, "dataPhone.txt");
        System.out.println("--------------------------------------------");
    }
}
