package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextBox {
    public static void readAndPrintFile(String filePath){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = reader.readLine()) != null) {
                formatAndPrint(line);
            }

            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private static void formatAndPrint(String line){
        String[] parts = line.split(":");
        if (parts.length == 2) {
            String key = parts[0].trim();
            String value = parts[1].trim();

            switch (key) {
                case "fullname":
                    System.out.println("                                                        [\u001B[38;2;31;156;0m+\u001B[0m] \u001B[38;2;130;130;130mФамилия Имя Отчество: \u001B[3;4;36m" + value + "\u001B[0m");
                    break;
                case "number":
                    System.out.println("                                                        [\u001B[38;2;31;156;0m+\u001B[0m] \u001B[38;2;130;130;130mНомет телефона: \u001B[32m" + value + "\u001B[0m");
                    break;
                case "operator":
                    System.out.println("                                                        [\u001B[38;2;31;156;0m+\u001B[0m] \u001B[38;2;130;130;130mОператор: \u001B[1;4;32m" + value + "\u001B[0m");
                    break;
                case "email":
                    System.out.println("                                                        [\u001B[38;2;31;156;0m+\u001B[0m] \u001B[38;2;130;130;130mПочта: \u001B[1;31m" + value + "\u001B[0m");
                case "data":
                    System.out.println("                                                        [\u001B[38;2;31;156;0m+\u001B[0m] \u001B[38;2;130;130;130mДата рождения: \u001B[3;4;36m" + value + "\u001B[0m");
                    break;
                case "ip":
                    System.out.println("                                                        [\u001B[38;2;31;156;0m+\u001B[0m] \u001B[38;2;130;130;130mIP: \u001B[31m" + value + "\u001B[0m");
                    break;
                case "region_ip":
                    System.out.println("                                                        [\u001B[38;2;31;156;0m+\u001B[0m] \u001B[38;2;130;130;130mРегиональный IP: \u001B[31m" + value + "\u001B[0m");
                    break;
                case "Possibledevices":
                    System.out.println("                                                        [\u001B[38;2;31;156;0m+\u001B[0m] \u001B[38;2;130;130;130mВозможные устроуства: \u001B[1;3;4;34m" + value + "\u001B[0m");
                    break;
                case "adress":
                    System.out.println("                                                        [\u001B[38;2;31;156;0m+\u001B[0m] \u001B[38;2;130;130;130mАдрес : \u001B[1;4;0m" + value + "\u001B[0m");
                    break;
                case "passport":
                    System.out.println("                                                        [\u001B[38;2;31;156;0m+\u001B[0m] \u001B[38;2;130;130;130mПаспорт: \u001B[1;4;0m" + value + "\u001B[0m");
                    break;
                case "inn":
                    System.out.println("                                                        [\u001B[38;2;31;156;0m+\u001B[0m] \u001B[38;2;130;130;130mИнн: \u001B[1;4;0m" + value + "\u001B[0m");
                    break;
                case "snils":
                    System.out.println("                                                        [\u001B[38;2;31;156;0m+\u001B[0m] \u001B[38;2;130;130;130mСнисл: \u001B[1;4;0m" + value + "\u001B[0m");
                    break;
                case "tguser":
                    System.out.println("                                                        [\u001B[38;2;31;156;0m+\u001B[0m] \u001B[38;2;130;130;130mТелеграмм: \u001B[3;4;31m" + value + "\u001B[0m");
                    break;
                case "tgid":
                    System.out.println("                                                        [\u001B[38;2;31;156;0m+\u001B[0m] \u001B[38;2;130;130;130mID Tg: \u001B[3;4;31m" + value + "\u001B[0m");
                    break;
                case "vk":
                    System.out.println("                                                        [\u001B[38;2;31;156;0m+\u001B[0m] \u001B[38;2;130;130;130mВК: \u001B[36m" + value + "\u001B[0m");
                    break;
                case "whatsapp":
                    System.out.println("                                                        [\u001B[38;2;31;156;0m+\u001B[0m] \u001B[38;2;130;130;130mWhatsapp: \u001B[3;4;32m" + value + "\u001B[0m");
                    break;
                case "PossibleLogin":
                    System.out.println("                                                        [\u001B[38;2;31;156;0m+\u001B[0m] \u001B[38;2;130;130;130mВозможные логины: \u001B[3;4;34m" + value + "\u001B[0m");
                    System.out.println("                                                        Для выхода введите '0'");
                    break;
            
                default:
                    break;
            }
        }
    }
}
