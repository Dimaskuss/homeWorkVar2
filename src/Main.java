public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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
        System.out.println();
    }
    public static void task5 () {
        System.out.println("Задача 5");
        System.out.println();

        byte cans = 120;
        byte canWhite = 2;
         byte canBrown = 4;
         int classes = cans / ( canWhite + canBrown );
         int allWhite = classes * canWhite;
         int allBrown = classes * canBrown;
         System.out.println("В школе, где " + classes + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски.");
        System.out.println();


    }
    public static void task6() {
        System.out.println("Задача 6");
        System.out.println();

        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceWeight = 100;
        byte eggWeight = 70;

        int grammWeight = bananaWeight * 5 + milkWeight * 2 + iceWeight * 2 + eggWeight * 4;
        System.out.println("Вес напитка " + grammWeight + " граммов!");

        float kgWeight = grammWeight / 1000f;
        System.out.println("Вес напитка " + kgWeight + " кг !");
        System.out.println("Вес напитка " + grammWeight * 0.001 + " кг !");
        System.out.println();


    }
    public static void task7() {
        System.out.println("Задача 7");
        System.out.println();

        short weight = 7000;
        short  loseLight = 250;
        short loseHard = 500;

        int dayLoseLigth = weight / loseLight;
        int dayLoseHard = weight / loseHard;

        int someDay = (dayLoseHard + dayLoseLigth) / 2;

        System.out.println("По легкой диете удет " + dayLoseLigth + " дней.");
        System.out.println("По тяжелой диете удет " + dayLoseHard + " дней.");
        System.out.println("Среднее количество " + someDay + " дней на диету.");
        System.out.println();


    }
}
