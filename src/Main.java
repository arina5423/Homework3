//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte bank =120;
        byte white =2;
        byte brown =4;
        int class1 = bank/(white+brown);
        System.out.println("В школе,где "+ class1 + " классов,нужно " +class1*white + " банок белой краски и " + class1*brown + " банок коричненой краски");

    }
}