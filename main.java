import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Начинается игра Крестики-нолики");
        System.out.println("Выберите, чем будете играть: крестиками или ноликами. Нажмите английскую 'x' или '0'");
        //Scanner sc = new Scanner(System.in);
        String user="*";
        while(true) {
            Scanner sc = new Scanner(System.in);
            String u=sc.next();
                if ((u.equals("x"))|u.equals("0")){
                    user=u;
                    break;
                }
                else {
                    System.out.println("Нажмите 'x' или '0'");

                }
            }


        String a1="*";
        String a2="*";
        String a3="*";
        String b1="*";
        String b2="*";
        String b3="*";
        String c1="*";
        String c2="*";
        String c3="*";
        System.out.println(a1 + " | " + a2 + " | " + a3);
        System.out.println(b1 + " | " + b2 + " | " + b3);
        System.out.println(c1 + " | " + c2 + " | " + c3);

    }
}
















