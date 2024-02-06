package main;

import java.util.Scanner;

public class LoopMenu{
    main.TextPrintes tx = new main.TextPrintes();

    public void loopEngine(){
        while (true) {
            clearConsole();
            tx.menuGuard();
            tx.menuSploit();
            tx.menuTxt();

            Scanner sc = new Scanner(System.in);
            System.out.print("                                                        \u001B[38;2;255;89;89m[*] Введите число :\u001B[0m ");
            String input = sc.nextLine();

            if (input.equals("Exit") || input.equals("exit") || input.equals("EXIT")) {
                break;
            }


            int choice = Integer.parseInt(input);
            switch (choice) {
                case 1:
                    tx.searchMenu();
                    break;
                case 2:
                    tx.toolOsint();
                    break;
                case 6:
                    tx.ddosFlood();
                    break;
            
                default:
                    break;
            }
        }
    }

    private static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            // Очистка консоли в зависимости от операционной системы
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LoopMenu lp = new LoopMenu();
        lp.loopEngine();
    }

   
}
