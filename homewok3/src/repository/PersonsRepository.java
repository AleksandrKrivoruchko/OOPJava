package repository;

import model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonsRepository {
    private List<Person> listPersons = new ArrayList<>();

    public List<Person> getListPersons() {
        return listPersons;
    }

    public void addPerson(Person person) {
        listPersons.add(person);
    }
}
