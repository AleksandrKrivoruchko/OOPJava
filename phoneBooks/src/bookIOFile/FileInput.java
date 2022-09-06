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
            String[] tmpPhone = tmp[1].split(";");
            Contact c = new Contact(tmp[0], tmpPhone[0]);
            if (tmpPhone.length > 1) {
                for (int i = 1; i <tmpPhone.length; i++) {
                    c.getPhone().addTelephone(tmpPhone[i]);
                }
            }
            book.updateContact(c);
        }
    }
}
