public class Person {
    private Name name;
    private int height;
    private Person parent;

    // Главный конструктор — все присвоения только здесь
    public Person(Name name, int height, Person parent) {
        this.name = name;
        this.height = height;
        this.parent = parent;
        if (parent != null) {
            // Если нет фамилии — берём фамилию отца
            if (name.getSurname() == null && parent.name.getSurname() != null) {
                name.setSurname(parent.name.getSurname());
            }
            // Если нет отчества — формируем от имени отца
            if (name.getPatronymic() == null && parent.name.getName() != null) {
                String fatherName = parent.name.getName();
                String patronymic;
                if (fatherName.equals("Лев")) {
                    patronymic = "Львович";
                } else if (fatherName.endsWith("й")) {
                    patronymic = fatherName.substring(0, fatherName.length() - 1) + "евич";
                } else {
                    patronymic = fatherName + "ович";
                }
                name.setPatronymic(patronymic);
            }
        }
    }

    // Конструктор: Имя (объект), рост
    public Person(Name name, int height) {
        this(name, height, null);
    }

    // Конструктор: имя (строка), рост, отец
    public Person(String name, int height, Person parent) {
        this(new Name(name), height, parent);
    }

    // Конструктор: имя (строка), рост
    public Person(String name, int height) {
        this(new Name(name), height, null);
    }

    @Override
    public String toString() {
        return name + ", " + height;
    }
}
