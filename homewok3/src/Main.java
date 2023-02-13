import model.Person;
import repository.IRepository;
import repository.PersonsRepository;

public class Main {
    public static void main(String[] args) {
        PersonsRepository repository = new PersonsRepository();
        System.out.println(repository.getFilesName().size());
        for (String str: repository.getFilesName()) {
            System.out.println(str);
        }
    }
}