package dataVerification;

import model.ErrorMessage;
import model.FullName;
import model.Person;
import repository.PersonsRepository;
import userInterface.ConsoleOutput;
import userInterface.IOutput;

import java.util.List;

public class CheckInputData {
    private static CheckInputData checkInputData;
    private PersonsRepository pr;
    private final int countWords = 6;
    private int[] indexData = new int[countWords];

    {
        initializationIndexData();
    }

    public static CheckInputData create() {
        if (checkInputData == null) {
            return new CheckInputData();
        }
        checkInputData.initializationIndexData();
        return checkInputData;
    }

    private CheckInputData() {
        checkInputData = this;
    }

    private  void initializationIndexData() {
        for (int i = 0; i < countWords; i++) {
            indexData[i] = -1;
        }
    }

    public PersonsRepository getPr() {
        return pr;
    }

    public void setPr(PersonsRepository pr) {
        this.pr = pr;
    }

    public boolean isPerson(String str) {
        CheckLength checkLength = new CheckLength(str);
        int lenCheck = checkLength.check();
        if (lenCheck != 0) {
            IOutput output = new ConsoleOutput();
            output.print(String.format(ErrorMessage.incorrectData,ErrorMessage.template
                                        , str, checkLength.getList().size()));
            return false;
        }
        List<String> tmpList = checkLength.getList();

        int lenGender = 1;
        for (int i = 0; i < tmpList.size(); i++) {
            if (tmpList.get(i).length() == lenGender) {
                if (tmpList.get(i).charAt(0) == 'f' || tmpList.get(i).charAt(0) == 'm') {
                    indexData[5] = i;
                    continue;
                }
            }
            if (CheckDigits.isDigits(tmpList.get(i))) {
                indexData[4] = i;
                continue;
            }
            if (CheckDate.isDate(tmpList.get(i))) {
                indexData[3] = i;
                continue;
            }
            if (indexData[0] < 0) {
                indexData[0] = i;
                continue;
            }
            if (indexData[1] < 0) {
                indexData[1] = i;
                continue;
            }
            indexData[2] = i;
        }

        for (int i = 0; i < countWords; i++) {
            if (indexData[i] < 0) {
                switch (i) {
                    case 3 -> System.out.println("Некоррктная дата");
                    case 4 -> System.out.println("Некорректый номер телефона");
                    case 5 -> System.out.println("Некорректный пол");
                }
                return false;
            }
        }

        Person p = new Person(
                new FullName(tmpList.get(indexData[1]),
                        tmpList.get(indexData[2]), tmpList.get(indexData[0])),
                tmpList.get(indexData[3]), Long.parseLong(tmpList.get(indexData[4])),
                tmpList.get(indexData[5]).charAt(0));
        if(pr == null) {
            pr = new PersonsRepository();
        }
        pr.add(p);
        return true;
    }
}
