package bookIOFile;

import interfaceBooks.DataInputHelper;
import phoneBooks.Contact;
import phoneBooks.PhoneBook;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileInput implements DataInputHelper {
    private String fileName;

    public FileInput(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void read(PhoneBook book) {
        List<String> phones = new ArrayList<>();
        try {
            phones = Files.readAllLines(Paths.get(fileName));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        for (String s : phones) {
            String[] tmp = s.split(":");
            Contact c = new Contact(tmp[0], tmp[1]);
            book.updateContact(c);
        }
    }
}
