import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static String calc(String input) {
        int x = 0, y = 0;
        boolean IsArabic = false;
        boolean IsArabic1 = false;

        String[] strings = input.split(" ");

        if (strings.length < 3) {
            System.out.println("строка не является математической операцией");
            System.exit(1);
        } else if (strings.length > 3) {
            System.out.println("формат математической операции не удовлетворяет заданию");
            System.exit(1);
        }

        try {
            x = Integer.parseInt(strings[0]);
            y = Integer.parseInt(strings[2]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка типа данных: " + e);
            System.exit(1);
        }

        if (Objects.equals(strings[0], (RomanNumeral.I).toString())) {
            strings[0] = "1";

            IsArabic = true;
        }
        if (Objects.equals(strings[0], (RomanNumeral.II).toString())) {
            strings[0] = "2";
            IsArabic = true;
        }
        if (Objects.equals(strings[0], (RomanNumeral.III).toString())) {
            strings[0] = "3";
            IsArabic = true;
        }
        if (Objects.equals(strings[0], (RomanNumeral.IV).toString())) {
            strings[0] = "4";
            IsArabic = true;
        }
        if (Objects.equals(strings[0], (RomanNumeral.V).toString())) {
            strings[0] = "5";
            IsArabic = true;
        }
        if (Objects.equals(strings[0], (RomanNumeral.VI).toString())) {
            strings[0] = "6";
            IsArabic = true;
        }
        if (Objects.equals(strings[0], (RomanNumeral.VII).toString())) {
            strings[0] = "7";
            IsArabic = true;
        }
        if (Objects.equals(strings[0], (RomanNumeral.VIII).toString())) {
            strings[0] = "8";
            IsArabic = true;
        }
        if (Objects.equals(strings[0], (RomanNumeral.IX).toString())) {
            strings[0] = "9";
            IsArabic = true;
        }
        if (Objects.equals(strings[0], (RomanNumeral.X).toString())) {
            strings[0] = "10";
            IsArabic = true;
        }


        if (Objects.equals(strings[2], (RomanNumeral.I).toString())) {
            strings[2] = "1";
            IsArabic1 = true;
        }
        if (Objects.equals(strings[2], (RomanNumeral.II).toString())) {
            strings[2] = "2";
            IsArabic1 = true;
        }
        if (Objects.equals(strings[2], (RomanNumeral.III).toString())) {
            strings[2] = "3";
            IsArabic1 = true;
        }
        if (Objects.equals(strings[2], (RomanNumeral.IV).toString())) {
            strings[2] = "4";
            IsArabic1 = true;
        }
        if (Objects.equals(strings[2], (RomanNumeral.V).toString())) {
            strings[2] = "5";
            IsArabic1 = true;
        }
        if (Objects.equals(strings[2], (RomanNumeral.VI).toString())) {
            strings[2] = "6";
            IsArabic1 = true;
        }
        if (Objects.equals(strings[2], (RomanNumeral.VII).toString())) {
            strings[2] = "7";
            IsArabic1 = true;
        }
        if (Objects.equals(strings[2], (RomanNumeral.VIII).toString())) {
            strings[2] = "8";
            IsArabic1 = true;
        }
        if (Objects.equals(strings[2], (RomanNumeral.IX).toString())) {
            strings[2] = "9";
            IsArabic1 = true;
        }
        if (Objects.equals(strings[2], (RomanNumeral.X).toString())) {
            strings[2] = "10";
            IsArabic1 = true;
        }




        if (x > 10 || y > 10 || x < 0 || y < 0) {
            System.out.println("Введены неверные входные данные");
            System.exit(1);
        }


        if (!IsArabic && !IsArabic1) {//арабские
            if (Objects.equals(strings[1], "+"))
                System.out.println(x + y);
            else if (Objects.equals(strings[1], "-"))
                System.out.println(x - y);
            else if (Objects.equals(strings[1], "/"))
                System.out.println(x / y);
            else if (Objects.equals(strings[1], "*"))
                System.out.println(x * y);
            else {
                System.out.println("Неверная арифмитическая операция");
                System.exit(1);
            }
        } else {
            if (IsArabic && IsArabic1) { //римские
                int z = 0;
                int lastNumber = 0;
                int dozen = 0;
                if (Objects.equals(strings[1], "+")){
                    z = x + y;
                    switch (z) {
                        case 2: System.out.println(RomanNumeral.II); break;
                        case 3: System.out.println(RomanNumeral.III); break;
                        case 4: System.out.println(RomanNumeral.IV); break;
                        case 5: System.out.println(RomanNumeral.V); break;
                        case 6: System.out.println(RomanNumeral.VI); break;
                        case 7: System.out.println(RomanNumeral.VII); break;
                        case 8: System.out.println(RomanNumeral.VIII); break;
                        case 9: System.out.println(RomanNumeral.IX); break;
                        case 10: System.out.println(RomanNumeral.X); break;
                        case 11: System.out.println(RomanNumeral.XI); break;
                        case 12: System.out.println(RomanNumeral.XII); break;
                        case 13: System.out.println(RomanNumeral.XIII); break;
                        case 14: System.out.println(RomanNumeral.XIV); break;
                        case 15: System.out.println(RomanNumeral.XV); break;
                        case 16: System.out.println(RomanNumeral.XVI); break;
                        case 17: System.out.println(RomanNumeral.XVII); break;
                        case 18: System.out.println(RomanNumeral.XVIII); break;
                        case 19: System.out.println(RomanNumeral.XIX); break;
                        case 20: System.out.println(RomanNumeral.XX); break;
                        default: System.out.println("Введены неверные данные"); break;
                    }

                }

                else if (Objects.equals(strings[1], "-")) {
                    z = x - y;
                    switch (z) {
                        case 1: System.out.println(RomanNumeral.I); break;
                        case 2: System.out.println(RomanNumeral.II); break;
                        case 3: System.out.println(RomanNumeral.III); break;
                        case 4: System.out.println(RomanNumeral.IV); break;
                        case 5: System.out.println(RomanNumeral.V); break;
                        case 6: System.out.println(RomanNumeral.VI); break;
                        case 7: System.out.println(RomanNumeral.VII); break;
                        case 8: System.out.println(RomanNumeral.VIII); break;
                        case 9: System.out.println(RomanNumeral.IX); break;
                        case 10: System.out.println(RomanNumeral.X); break;

                        default: System.out.println("Введены неверные данные"); break;
                    }
                }
                else if (Objects.equals(strings[1], "/")) {
                    z = x / y;
                    switch (z) {
                        case 1: System.out.println(RomanNumeral.I); break;
                        case 2: System.out.println(RomanNumeral.II); break;
                        case 3: System.out.println(RomanNumeral.III); break;
                        case 4: System.out.println(RomanNumeral.IV); break;
                        case 5: System.out.println(RomanNumeral.V); break;
                        case 6: System.out.println(RomanNumeral.VI); break;
                        case 7: System.out.println(RomanNumeral.VII); break;
                        case 8: System.out.println(RomanNumeral.VIII); break;
                        case 9: System.out.println(RomanNumeral.IX); break;
                        case 10: System.out.println(RomanNumeral.X); break;

                        default: System.out.println("Введены неверные данные"); break;
                    }
                }
                else if (Objects.equals(strings[1], "*")){
                    z = x*y;
                    StringBuilder totalDozen = new StringBuilder();

                    if (z<=10) {
                        switch (z){
                            case 1: System.out.println(RomanNumeral.I); break;
                            case 2: System.out.println(RomanNumeral.II); break;
                            case 3: System.out.println(RomanNumeral.III); break;
                            case 4: System.out.println(RomanNumeral.IV); break;
                            case 5: System.out.println(RomanNumeral.V); break;
                            case 6: System.out.println(RomanNumeral.VI); break;
                            case 7: System.out.println(RomanNumeral.VII); break;
                            case 8: System.out.println(RomanNumeral.VIII); break;
                            case 9: System.out.println(RomanNumeral.IX); break;
                            case 10: System.out.println(RomanNumeral.X); break;

                        }
                    } else if (z <= 40) {
                        int kolX = (z % 100) / 10;
                        lastNumber = z % 10;
                        for (int i = 0; i < kolX; i++) {
                            totalDozen.append("X");
                        }
                        switch (lastNumber){
                            case 1: totalDozen.append(RomanNumeral.I); break;
                            case 2: totalDozen.append(RomanNumeral.II); break;
                            case 3: totalDozen.append(RomanNumeral.III); break;
                            case 4: totalDozen.append(RomanNumeral.IV); break;
                            case 5: totalDozen.append(RomanNumeral.V); break;
                            case 6: totalDozen.append(RomanNumeral.VI); break;
                            case 7: totalDozen.append(RomanNumeral.VII); break;
                            case 8: totalDozen.append(RomanNumeral.VIII); break;
                            case 9: totalDozen.append(RomanNumeral.IX); break;

                        }
                        System.out.println(totalDozen);

                    }else if (z<50) {
                        totalDozen.append("XL");
                        lastNumber = z % 10;
                        switch (lastNumber){
                            case 1: totalDozen.append(RomanNumeral.I); break;
                            case 2: totalDozen.append(RomanNumeral.II); break;
                            case 3: totalDozen.append(RomanNumeral.III); break;
                            case 4: totalDozen.append(RomanNumeral.IV); break;
                            case 5: totalDozen.append(RomanNumeral.V); break;
                            case 6: totalDozen.append(RomanNumeral.VI); break;
                            case 7: totalDozen.append(RomanNumeral.VII); break;
                            case 8: totalDozen.append(RomanNumeral.VIII); break;
                            case 9: totalDozen.append(RomanNumeral.IX); break;

                        }
                        System.out.println(totalDozen);
                    }
                    else if (z<60) {
                        totalDozen.append("L");
                        lastNumber = z % 10;
                        switch (lastNumber){
                            case 1: totalDozen.append(RomanNumeral.I); break;
                            case 2: totalDozen.append(RomanNumeral.II); break;
                            case 3: totalDozen.append(RomanNumeral.III); break;
                            case 4: totalDozen.append(RomanNumeral.IV); break;
                            case 5: totalDozen.append(RomanNumeral.V); break;
                            case 6: totalDozen.append(RomanNumeral.VI); break;
                            case 7: totalDozen.append(RomanNumeral.VII); break;
                            case 8: totalDozen.append(RomanNumeral.VIII); break;
                            case 9: totalDozen.append(RomanNumeral.IX); break;

                        }
                        System.out.println(totalDozen);
                    }
                    else if (z<90) {
                        totalDozen.append("L");
                        dozen = (z % 100) / 10;
                        switch (dozen) {
                            case 6: totalDozen.append("X"); break;
                            case 7: totalDozen.append("XX"); break;
                            case 8: totalDozen.append("XXX"); break;
                        }
                        lastNumber = z % 10;
                        switch (lastNumber){
                            case 1: totalDozen.append(RomanNumeral.I); break;
                            case 2: totalDozen.append(RomanNumeral.II); break;
                            case 3: totalDozen.append(RomanNumeral.III); break;
                            case 4: totalDozen.append(RomanNumeral.IV); break;
                            case 5: totalDozen.append(RomanNumeral.V); break;
                            case 6: totalDozen.append(RomanNumeral.VI); break;
                            case 7: totalDozen.append(RomanNumeral.VII); break;
                            case 8: totalDozen.append(RomanNumeral.VIII); break;
                            case 9: totalDozen.append(RomanNumeral.IX); break;

                        }
                        System.out.println(totalDozen);
                    }
                    else if (z <100) {
                        totalDozen.append("XC");
                        lastNumber = z % 10;
                        switch (lastNumber){
                            case 1: totalDozen.append(RomanNumeral.I); break;
                            case 2: totalDozen.append(RomanNumeral.II); break;
                            case 3: totalDozen.append(RomanNumeral.III); break;
                            case 4: totalDozen.append(RomanNumeral.IV); break;
                            case 5: totalDozen.append(RomanNumeral.V); break;
                            case 6: totalDozen.append(RomanNumeral.VI); break;
                            case 7: totalDozen.append(RomanNumeral.VII); break;
                            case 8: totalDozen.append(RomanNumeral.VIII); break;
                            case 9: totalDozen.append(RomanNumeral.IX); break;
                        }

                        System.out.println(totalDozen);
                } else if (z == 100)
                        System.out.println("C");
                     else {
                    System.out.println("Неверная арифмитическая операция");
                    System.exit(1);
                }

                System.exit(1);
            }
            System.out.println("используются одновременно разные системы счисления");
            System.exit(1);
        }
        }

        return "";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        calc(input.trim().toUpperCase());


    }
}