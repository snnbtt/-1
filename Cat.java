public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println(name + ": мяу!");
    }

    public void meow(int count) {
        String result = name + ": ";

        for (int i = 0; i < count; i++) {
            result += "мяу";

            if (i < count - 1) {
                result += "-";
            }
        }

        result += "!";
        System.out.println(result);
    }

    @Override
    public String toString() {
        return "кот: " + name;
    }
}
