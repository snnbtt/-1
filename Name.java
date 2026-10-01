public class Name {
    private String surname;
    private String name;
    private String patronymic;

    // Конструктор 1: только личное имя
    public Name(String name) {
        this(name, null, null);
    }

    // Конструктор 2: личное имя и фамилия
    public Name(String name, String surname) {
        this(name, surname, null);
    }

    // Конструктор 3: все три параметра (имя, фамилия, отчество)
    public Name(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (surname != null) {
            sb.append(surname);
        }
        if (name != null) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(name);
        }
        if (patronymic != null) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(patronymic);
        }
        return sb.toString();
    }
}
