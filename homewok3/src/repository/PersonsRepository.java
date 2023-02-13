package repository;

import model.Person;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PersonsRepository implements IRepository<Person>{
    private List<Person> listPersons = new ArrayList<>();
    private List<String> filesName = new ArrayList<>();
    private File dirPersonsFiles = new File("./filesPersons");

    public PersonsRepository() {
        if(dirPersonsFiles.exists()) {
            System.out.println("Read files names");
            for (File item: dirPersonsFiles.listFiles(n -> n.getName().contains(".csv"))) {
                filesName.add(item.getName());
            }
        } else {
            System.out.println("Create dir");
            dirPersonsFiles.mkdir();
        }
    }

    public List<String> getFilesName() {
        return filesName;
    }

    public List<Person> getListPersons() {
        return listPersons;
    }

    public void add(Person person) {
        listPersons.add(person);
    }

    @Override
    public void delete(Person person) {

    }

    @Override
    public void save(Person person) {

    }

    @Override
    public Person read() {
        return null;
    }

}
