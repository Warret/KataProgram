import java.util.Objects;

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

        if (Objects.equals(strings[0], (RomanNumerals.I).toString())) {
            strings[0] = "1";

            IsArabic = true;
        }
        if (Objects.equals(strings[0], (RomanNumerals.II).toString())) {
            strings[0] = "2";
            IsArabic = true;
        }
        if (Objects.equals(strings[0], (RomanNumerals.III).toString())) {
            strings[0] = "3";
            IsArabic = true;
        }
        if (Objects.equals(strings[0], (RomanNumerals.IV).toString())) {
            strings[0] = "4";
            IsArabic = true;
        }
        if (Objects.equals(strings[0], (RomanNumerals.V).toString())) {
            strings[0] = "5";
            IsArabic = true;
        }
        if (Objects.equals(strings[0], (RomanNumerals.VI).toString())) {
            strings[0] = "6";
            IsArabic = true;
        }
        if (Objects.equals(strings[0], (RomanNumerals.VII).toString())) {
            strings[0] = "7";
            IsArabic = true;
        }
        if (Objects.equals(strings[0], (RomanNumerals.VIII).toString())) {
            strings[0] = "8";
            IsArabic = true;
        }
        if (Objects.equals(strings[0], (RomanNumerals.IX).toString())) {
            strings[0] = "9";
            IsArabic = true;
        }
        if (Objects.equals(strings[0], (RomanNumerals.X).toString())) {
            strings[0] = "10";
            IsArabic = true;
        }


        if (Objects.equals(strings[2], (RomanNumerals.I).toString())) {
            strings[2] = "1";
            IsArabic1 = true;
        }
        if (Objects.equals(strings[2], (RomanNumerals.II).toString())) {
            strings[2] = "2";
            IsArabic1 = true;
        }
        if (Objects.equals(strings[2], (RomanNumerals.III).toString())) {
            strings[2] = "3";
            IsArabic1 = true;
        }
        if (Objects.equals(strings[2], (RomanNumerals.IV).toString())) {
            strings[2] = "4";
            IsArabic1 = true;
        }
        if (Objects.equals(strings[2], (RomanNumerals.V).toString())) {
            strings[2] = "5";
            IsArabic1 = true;
        }
        if (Objects.equals(strings[2], (RomanNumerals.VI).toString())) {
            strings[2] = "6";
            IsArabic1 = true;
        }
        if (Objects.equals(strings[2], (RomanNumerals.VII).toString())) {
            strings[2] = "7";
            IsArabic1 = true;
        }
        if (Objects.equals(strings[2], (RomanNumerals.VIII).toString())) {
            strings[2] = "8";
            IsArabic1 = true;
        }
        if (Objects.equals(strings[2], (RomanNumerals.IX).toString())) {
            strings[2] = "9";
            IsArabic1 = true;
        }
        if (Objects.equals(strings[2], (RomanNumerals.X).toString())) {
            strings[2] = "10";
            IsArabic1 = true;
        }

        try {
            x = Integer.parseInt(strings[0]);
            y = Integer.parseInt(strings[2]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка типа данных: " + e);
            System.exit(1);
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
                if (Objects.equals(strings[1], "+")){
                    z = x + y;
                    switch (z) {
                        case 2: System.out.println(RomanNumerals.II); break;
                        case 3: System.out.println(RomanNumerals.III); break;
                        case 4: System.out.println(RomanNumerals.IV); break;
                        case 5: System.out.println(RomanNumerals.V); break;
                        case 6: System.out.println(RomanNumerals.VI); break;
                        case 7: System.out.println(RomanNumerals.VII); break;
                        case 8: System.out.println(RomanNumerals.VIII); break;
                        case 9: System.out.println(RomanNumerals.IX); break;
                        case 10: System.out.println(RomanNumerals.X); break;
                        case 11: System.out.println(RomanNumerals.XI); break;
                        case 12: System.out.println(RomanNumerals.XII); break;
                        case 13: System.out.println(RomanNumerals.XIII); break;
                        case 14: System.out.println(RomanNumerals.XIV); break;
                        case 15: System.out.println(RomanNumerals.XV); break;
                        case 16: System.out.println(RomanNumerals.XVI); break;
                        case 17: System.out.println(RomanNumerals.XVII); break;
                        case 18: System.out.println(RomanNumerals.XVIII); break;
                        case 19: System.out.println(RomanNumerals.XIX); break;
                        case 20: System.out.println(RomanNumerals.XX); break;
                        default: System.out.println("Введены неверные данные"); break;
                    }

                }

                else if (Objects.equals(strings[1], "-")) {
                    z = x - y;
                    switch (z) {
                        case 1: System.out.println(RomanNumerals.I); break;
                        case 2: System.out.println(RomanNumerals.II); break;
                        case 3: System.out.println(RomanNumerals.III); break;
                        case 4: System.out.println(RomanNumerals.IV); break;
                        case 5: System.out.println(RomanNumerals.V); break;
                        case 6: System.out.println(RomanNumerals.VI); break;
                        case 7: System.out.println(RomanNumerals.VII); break;
                        case 8: System.out.println(RomanNumerals.VIII); break;
                        case 9: System.out.println(RomanNumerals.IX); break;
                        case 10: System.out.println(RomanNumerals.X); break;

                        default: System.out.println("Введены неверные данные"); break;
                    }
                }
                else if (Objects.equals(strings[1], "/")) {
                    z = x / y;
                    switch (z) {
                        case 1: System.out.println(RomanNumerals.I); break;
                        case 2: System.out.println(RomanNumerals.II); break;
                        case 3: System.out.println(RomanNumerals.III); break;
                        case 4: System.out.println(RomanNumerals.IV); break;
                        case 5: System.out.println(RomanNumerals.V); break;
                        case 6: System.out.println(RomanNumerals.VI); break;
                        case 7: System.out.println(RomanNumerals.VII); break;
                        case 8: System.out.println(RomanNumerals.VIII); break;
                        case 9: System.out.println(RomanNumerals.IX); break;
                        case 10: System.out.println(RomanNumerals.X); break;

                        default: System.out.println("Введены неверные данные"); break;
                    }
                }
                else if (Objects.equals(strings[1], "*"))
                    System.out.println(x * y);
                else {
                    System.out.println("Неверная арифмитическая операция");
                    System.exit(1);
                }
                System.exit(1);
            }
            System.out.println("используются одновременно разные системы счисления");
            System.exit(1);
        }

        return "";
    }


    public static void main(String[] args) {
        calc("2 + 2");
    }
}