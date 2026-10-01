public class Main {
    public static void main(String[] args) {

        // Задание 1.3
        System.out.println("Задание 1.3");
        Name name1 = new Name("Клеопатра");
        Name name2 = new Name("Александр", "Пушкин", "Сергеевич");
        Name name3 = new Name("Владимир", "Маяковский");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println();

        // Задание 2.2
        System.out.println("Задание 2.2");
        Person person1 = new Person(name1, 152);
        Person person2 = new Person(name2, 167);
        Person person3 = new Person(name3, 189);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println();

        // Задание 2.3
        System.out.println("Задание 2.3");
        Person ivan = new Person(new Name("Иван", "Чудов"), 180);
        Person petr = new Person(new Name("Петр", "Чудов"), 175, ivan);
        Person boris = new Person("Борис", 170, petr);
        System.out.println(ivan);
        System.out.println(petr);
        System.out.println(boris);
        System.out.println();

        // Задание 3.3
        System.out.println("Задание 3.3");
        City a = new City("A");
        City b = new City("B");
        City c = new City("C");
        City d = new City("D");
        City e = new City("E");
        City f = new City("F");

        a.addPath(b, 5);
        a.addPath(f, 1);
        a.addPath(d, 6);
        f.addPath(b, 1);
        f.addPath(e, 2);
        b.addPath(c, 3);
        c.addPath(d, 4);
        e.addPath(d, 2);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println();

        // Задание 4.5
        System.out.println("Задание 4.5");
        Name cleopatra = new Name("Клеопатра");
        Name pushkin = new Name("Александр", "Пушкин", "Сергеевич");
        Name mayakovsky = new Name("Владимир", "Маяковский");
        Name christopher = new Name("Христофор", "Бонифатьевич");
        System.out.println(cleopatra);
        System.out.println(pushkin);
        System.out.println(mayakovsky);
        System.out.println(christopher);
        System.out.println();

        // Задание 4.6
        System.out.println("Задание 4.6");
        Person lev = new Person("Лев", 170);
        Person sergey = new Person(new Name("Сергей", "Пушкин"), 168, lev);
        Person alexander = new Person("Александр", 167, sergey);
        System.out.println(lev);
        System.out.println(sergey);
        System.out.println(alexander);
        System.out.println();

        // Задание 5.2
        System.out.println("Задание 5.2");
        Cat cat = new Cat("Барсик");
        System.out.println(cat);
        cat.meow();
        cat.meow(3);
    }
}
