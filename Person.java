public class Person {
    private Name name;
    private int height;
    private Person father;

    public Person(String firstName, int height) {
        this(new Name(firstName), height, null);
    }

    public Person(String firstName, int height, Person father) {
        this(new Name(firstName), height, father);
    }

    public Person(Name name, int height) {
        this(name, height, null);
    }

    public Person(Name name, int height, Person father) {
        this.name = name;
        this.height = height;
        this.father = father;
    }

    public Name getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public Person getFather() {
        return father;
    }

    @Override
    public String toString() {
        if (father != null) {
            if (name.getLastName() == null && father.getName().getLastName() != null) {
                name.setLastName(father.getName().getLastName());
            }

            if (name.getPatronymic() == null && father.getName().getFirstName() != null) {
                name.setPatronymic(father.getName().getFirstName() + "ович");
            }
        }

        return name + ", рост: " + height;
    }
}
