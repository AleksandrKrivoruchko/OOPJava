package model;

public class ErrorMessage {
    private final static int len = 6;
    public final static String incorrectData = "Нужно ввести:\n%s\nДлина строки "
            + len + "\nВы ввели:\n%s\nДлина строки %d\n";
    public final static String template =
            "Фамилия Имя Отчество дата рождения номер телефона пол\n" +
            "Например:\n" +
            "Иванов Иван Иванович 12.05.1968 89198943456 m\n" +
            "Иванова Светлана Ивановна 24.08.1970 89886185432 f";
}
