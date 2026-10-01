public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void meow() {
        System.out.println(name + ": мяу!");
    }

    public void meow(int n) {
        StringBuilder sb = new StringBuilder(name + ": ");
        for (int i = 0; i < n; i++) {
            sb.append("мяу");
            if (i < n - 1) sb.append("-");
        }
        sb.append("!");
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        return "кот: " + name;
    }
}
