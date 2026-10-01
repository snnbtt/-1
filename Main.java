public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 1.3: Имена ===");
        Name n1 = new Name("Клеопатра");
        Name n2 = new Name("Александр", "Пушкин", "Сергеевич");
        Name n3 = new Name("Владимир", "Маяковский");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        System.out.println();
        System.out.println("=== Задание 2.2: Человек с именем ===");
        Person p1 = new Person(n1, 152);
        Person p2 = new Person(n2, 167);
        Person p3 = new Person(n3, 189);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println();
        System.out.println("=== Задание 2.3: Человек с родителем ===");
        Person ivan = new Person(new Name("Иван", "Чудов"), 180);
        Person pyotr = new Person("Пётр", 175, ivan);
        Person boris = new Person("Борис", 170, pyotr);
        System.out.println(ivan);
        System.out.println(pyotr);
        System.out.println(boris);

        System.out.println();
        System.out.println("=== Задание 3.3: Города ===");
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
        e.addPath(d, 2);
        d.addPath(c, 4);
        c.addPath(b, 3);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        System.out.println();
        System.out.println("=== Задание 4.5: Создаём Имена ===");
        Name n4 = new Name("Клеопатра");
        Name n5 = new Name("Александр", null, "Сергеевич");
        Name n6 = new Name("Владимир", "Пушкин");
        Name n7 = new Name("Христофор", "Бонифатьевич", "Маяковский");
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println(n7);

        System.out.println();
        System.out.println("=== Задание 4.6: Создаём Человека ===");
        Person lev = new Person("Лев", 170);
        Person sergey = new Person(new Name("Сергей", "Пушкин"), 168, lev);
        Person alexander = new Person("Александр", 167, sergey);
        System.out.println(lev);
        System.out.println(sergey);
        System.out.println(alexander);

        System.out.println();
        System.out.println("=== Задание 5.2: Кот мяукает ===");
        Cat cat = new Cat("Барсик");
        System.out.println(cat);
        cat.meow();
        cat.meow(3);
    }
}
