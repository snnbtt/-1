public class Name {
    private String firstName;
    private String lastName;
    private String patronymic;

    public Name(String firstName) {
        this(firstName, null, null);
    }

    public Name(String firstName, String lastName) {
        this(firstName, lastName, null);
    }

    public Name(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        String result = "";

        if (lastName != null && !lastName.isEmpty()) {
            result += lastName + " ";
        }

        if (firstName != null && !firstName.isEmpty()) {
            result += firstName + " ";
        }

        if (patronymic != null && !patronymic.isEmpty()) {
            result += patronymic;
        }

        return result.trim();
    }
}
