//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* задача 1
        byte a = 1;
        short b = 30000;
        int c = 35000;
        long d = 3000000000L;
        float e = 1.5f;
        double f = 1.567844673;
        System.out.println("Значение переменной a с типом byte равно "+ a);
        System.out.println("Значение переменной b с типом short равно "+ b);
        System.out.println("Значение переменной c с типом int равно "+ c);
        System.out.println("Значение переменной d с типом long равно "+ d);
        System.out.println("Значение переменной e с типом float равно "+ e);
        System.out.println("Значение переменной f с типом double равно "+ f);
         задача 2
        short a = -159;
        short b = 27897;
        long c = 987678965549L;
        short d = 569;
        float e = 2.786f;
        float f = 27.12f;
        byte i = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(i);
        задача 3

        byte students1 = 23;
        byte students2 = 27;
        byte students3 = 30;
        short paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper/(students1+students2+students3) + " листов бумаги");
        задача 4

        byte time1 = 2;
        byte time2 = 20;
        short time3 = 24*60;
        int time4=time3*3;
        int time5 = time3*30;
        byte bottle = 16;
        System.out.println("За 20 минут машина произвела " + time2/time1*bottle + " штук бутылок" );
        System.out.println("За сутки машина произвела " + time3/time1*bottle + " штук бутылок" );
        System.out.println("За 3 суток машина произвела " + time4/time1*bottle + " штук бутылок" );
        System.out.println("За месяц машина произвела " + time5/time1*bottle + " штук бутылок" );
        задача 5

        byte bank =120;
        byte white =2;
        byte brown =4;
        int class1 = bank/(white+brown);
        System.out.println("В школе,где "+ class1 + " классов,нужно " +class1*white + " банок белой краски и " + class1*brown + " банок коричненой краски");
        задача 6

        short banana = 5*80;
        short milk = 105*2;
        short iceCream = 100*2;
        short egg = 4*70;
        int summa = banana+milk+iceCream+egg;
        float summa1 = (banana+milk+iceCream+egg)/1000f;
        System.out.println(summa + " грамм");
        System.out.println(summa1 + " кг");
        задача 7

        short needToReset = 7*1000;
        short weight1 = 250;
        short weight2 = 500;
        System.out.println((needToReset/weight1) + " дней, если скидывать по " + weight1 + " грамм");
        System.out.println((needToReset/weight2) + " дней, если скидывать по " + weight2 + " грамм");
        задача 8
         */
        int salary1= 67760;
        int salary2 = 83690;
        int salary3 =  76230;
        int new_salary1 = salary1/100*10+salary1;
        int new_salary2 = salary2/100*10 + salary2;
        int new_salary3 = salary3/100*10+ salary3;
        System.out.println("Маша теперь получает " +new_salary1+ " рублей. Годовой доход вырос на " + (new_salary1 - salary1)+" рублей");
        System.out.println("Денис теперь получает " +new_salary2+ " рублей. Годовой доход вырос на " + (new_salary2 - salary2)+" рублей");
        System.out.println("Кристина теперь получает " +new_salary3+ " рублей. Годовой доход вырос на " + (new_salary3 - salary3)+" рублей");




    }
}