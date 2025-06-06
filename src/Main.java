//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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