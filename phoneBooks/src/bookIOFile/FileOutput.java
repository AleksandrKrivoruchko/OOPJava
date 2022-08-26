package bookIOFile;

import interfaceBooks.DataInputHelper;
import interfaceBooks.OutputHelper;
import phoneBooks.Contact;
import phoneBooks.PhoneBook;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class FileOutput implements OutputHelper {
    private String fileName;

    public FileOutput(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void write(PhoneBook book) {
        File file = new File(fileName);
        try {
            FileWriter writer = new FileWriter(file);
            for (Contact c : book.getContacts()) {
                writer.write(String.format("%s:%s\n",
                        c.getFullName(), c.getTelephone()));
            }

            writer.flush();
            writer.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public void updateFile(PhoneBook book, String fileName) {
        DataInputHelper fr = new FileInput(fileName);
        PhoneBook tmpBook = new PhoneBook();
        fr.read(tmpBook);
        if (tmpBook.equals(book)) {
            return;
        }
        List<Contact> ib = book.getContacts();
        List<Contact> tb = tmpBook.getContacts();
        for (Contact c : ib) {
            if (tb.contains(c)) {
                continue;
            }
            tmpBook.updateContact(c);
        }
        new FileOutput(fileName).write(tmpBook);
    }
}
