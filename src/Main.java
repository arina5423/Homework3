//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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
    }
}