
import java.util.Random;
import java.util.Scanner;;

public class Main {
    public static void main(String[] args) {

         int pop=1;
        Scanner in=new Scanner(System.in);
        int chislo=0;
        int record=0;
        System.out.println("Угадай число от 1 до 100");
        String  str="";
        String str2;
        do{
            int max=100;
           int  sicret=(int)(Math.random()*++max);
            while (sicret!=chislo) {
                System.out.print("Введи число: ");
                str= in.next();
                if ((str.equals("RESULT")&&(record==0))){
                    System.out.println("Количество попыток "+pop);
                    continue;
                }else if (str.equals("RESULT")){
                    System.out.println("Количество попыток "+pop+"лучшая игра "+record);
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


            if (record==0){
                record=pop;
            } else if (record>pop) {
                record=pop;
            }

            System.out.println("Поздравляю! Вы угадали число " + sicret +" за "+pop+" попыток лучшая попытка: " +record);

            System.out.println("Играем еще?");
            pop=0;
            str2=in.next();
        } while (str2.equals("y"));





        in.close();
    }

}
