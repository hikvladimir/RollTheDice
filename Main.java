

import java.util.Scanner;;

public class Main {
    public static void main(String[] args) {
        int sicret;
        int pop;

        Scanner in=new Scanner(System.in);
        int chislo=0;
        System.out.println("Угадай число от 1 до 100");
        String  str="";
        String str2="";

        do{
            int max=100;
            sicret=(int)(Math.random()*++max);
            System.out.println("Играем еще?");
            str2=in.next();
        } while (str2.equals("y"));
        do {


            pop=0;
            System.out.print("Введи число: ");
            str= in.next();
            if (str.equals("RESULT")){
                System.out.println("Количество попыток "+pop);
                continue;
            }
            try {
                chislo=Integer.parseInt(str);
            } catch (Exception e){
                System.out.println("Нет это не число от 0 до 100");
                continue;
            }
            if (sicret < chislo) {
                System.out.println("Я сам в шоке, но, загаданное число меньше, брат");
            } else if (sicret > chislo) {
                System.out.println("Не ожидал от тебя такого. Загаданное число больше, брат");
            }
            pop++;
        }
       while (sicret!=chislo);
        System.out.println("Поздравляю! Вы угадали число " + sicret +" за "+pop+" попыток");

        System.out.println("Сыграем еще?");
        str2=in.next();



    }

}
