public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int dima = 1;
        byte sasha = 24;
        short lena = 3455;
        long lida = 4546445577575674L;
        float gena = 5.35756f;
        double felix = 8.883366444553355;
        System.out.println(dima);
        System.out.println(sasha);
        System.out.println(lena);
        System.out.println(lida);
        System.out.println(gena);
        System.out.println(felix);
        System.out.println();
    }

    public static void task2 () {
        System.out.println("Задача 2");

        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println();
    }
        public static void task3 () {
            System.out.println("Задача 3");
 byte class1 = 23;
 byte class2 = 27;
 byte class3 = 30;
 int children = class1 + class2 + class3;
System.out.println("Всего учеников : " + children);
 int sheets = 480;
            sheets = sheets / children;
            System.out.println("На каждого ученика рассчитано " + sheets + " листов бумаги!");
            System.out.println();


        }
    public static void task4 () {
        System.out.println("Задача 4");
        int bottles = 8;
        int time = 1;
        System.out.println("За " + time * 2 + " минуты машина произвела " + bottles * 2 + " штук бутылок.");

        time = time * 20;
          System.out.println("За " + time +  " минут машина произвела " + bottles * time + " штук бутылок.");

        time = 60 * 24;
        System.out.println("За " + time + " минут (Сутки) машина произвела " + bottles * time + " штук бутылок.");

        time = 60 * 24 * 3;
        System.out.println("За " + time + " минут (3 суток) машина произвела " + bottles * time + " штук бутылок.");

        time = 60 * 24 * 30;
        System.out.println("За " + time + " минут (Месяц) машина произвела " + bottles * time + " штук бутылок.");





    }
}
