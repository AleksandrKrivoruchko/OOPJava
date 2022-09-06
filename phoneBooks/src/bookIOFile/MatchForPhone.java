package bookIOFile;

import phoneBooks.Contact;

public class MatchForPhone extends ConsoleOutput{
    public static void writeError(Contact c1, Contact c2, String t) {
        System.out.println(t);
        System.out.println("Контакт из книги:");
        System.out.println(c1);
        System.out.println("Добавляемый контакт:");
        System.out.println(c2);
    }
}
