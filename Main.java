
import java.util.Random;
import java.util.Scanner;;

public class Main {
    public static void main(String[] args) {
        int max=100;
        int sicret=(int)(Math.random()*++max);
         int pop=1;
        Scanner in=new Scanner(System.in);
        int Chislo=0;
        System.out.println("Угадай число от 1 до 100");

       while (sicret!=Chislo) {
           pop++;
            System.out.print("Введи число: ");
            Chislo= in.nextInt();
            if (sicret < Chislo) {
                System.out.println("Я сам в шоке, но, загаданное число меньше, брат");
            } else if (sicret > Chislo) {
                System.out.println("Не ожидал от тебя такого. Загаданное число больше, брат");
            }


        }
        System.out.println("Поздравляю! Вы угадали число " + sicret +" за "+pop+" попыток");
        in.close();
    }

}
