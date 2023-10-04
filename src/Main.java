public class Main {
    public static void main(String[] args) {

        //Задача 1

        byte b = 5;
        short s = 5000;
        int i = 50000;
        long l = 5000000L;
        float f = 5.55f;
        double d = 5.55555555;
        System.out.println("\n" + "Задача 1\n");
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        //Задача 2

        float firstValue = 27.12f;
        long secondValue = 987678965549L;
        float thirdValue = 2.786f;
        short fourthValue = 569;
        short fifthValue = -159;
        short sixthValue = 27897;
        byte seventhValue = 67;
        System.out.println("\n" + "Задача 2\n");
        System.out.println("float firstValue = 27.12f;\n" +
                        "long secondValue = 987678965549L;\n" +
                        "float thirdValue = 2.786f;\n" +
                        "short fourthValue = 569;\n" +
                        "short fifthValue = -159;\n" +
                        "short sixthValue = 27897;\n" +
                        "byte seventhValue = 67;");

        //Задача 3

        byte lpStudents = 23;
        byte asStudents = 27;
        byte eaStudents = 30;
        short totalSheets = 480;
        short totalStudents = (short) (lpStudents + eaStudents + asStudents);
        short sheetsPerStudent = (short) (totalSheets / totalStudents);
        System.out.println("\n" + "Задача 3\n");
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        //Задача 4

        byte bottlesPerMin = 16 / 2;
        short bottlesPer20Min = (short) (bottlesPerMin * 20);
        short bottlesPerDay = (short) (bottlesPerMin * 1440);
        int bottlesPer3Days = bottlesPerMin * 4320;
        int bottlesPerMonth = bottlesPerMin * 44640;
        System.out.println("\n" + "Задача 4\n");
        System.out.println("За 20 минут машина произвела " + bottlesPer20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок");


        //Задача 5

        byte whiteCansPerClass = 2;
        byte brownCansPerClass = 4;
        byte totalCans = 120;
        byte totalCansPerClass = (byte) (whiteCansPerClass + brownCansPerClass);
        byte totalClasses = (byte) (totalCans / totalCansPerClass);
        byte totalWhiteCans = (byte) (whiteCansPerClass * totalClasses);
        byte totalBrownCans = (byte) (brownCansPerClass * totalClasses);
        System.out.println("\n" + "Задача 5\n");
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        //Задача 6

        byte banana = 5;
        byte bananaWeight = 80;
        byte milk = 2;
        byte milkWeight = 105;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        byte egg = 4;
        byte eggWeight = 70;
        short totalWeightGram = (short) ((banana * bananaWeight) + (milk * milkWeight) + (iceCream * iceCreamWeight) + (egg + eggWeight));
        float totalWeightKilo = totalWeightGram / 1000f;
        System.out.println("\n" + "Задача 6\n");
        System.out.println("Вес спортзавтрака " + totalWeightGram + " г или " + totalWeightKilo + " кг");

        //Задача 7

        byte weightLossGoal = 7;
        short weightLossMin = 250;
        short weightLossMax = 500;
        int weightLossGoalGram = weightLossGoal * 1000;
        byte daysMin = (byte) (weightLossGoalGram / weightLossMax);
        byte daysMax = (byte) (weightLossGoalGram / weightLossMin);
        byte daysAverage = (byte) ((daysMax + daysMin) / 2);
        System.out.println("\n" + "Задача 7\n");
        System.out.println("Теряя каждый день по " + weightLossMin + " грамм, спортсмен похудеет на " + weightLossGoal + " кг через " + daysMax + " д.");
        System.out.println("Теряя каждый день по " + weightLossMax + " грамм, спортсмен похудеет на " + weightLossGoal + " кг через " + daysMin + " д.");
        System.out.println("В среднем, чтобы похудеть на " + weightLossGoal + " кг, спортсмену потребуется " + daysAverage + " д.");

        //Задача 8

        int salaryMasha = 67760;
        int increaseSalaryMasha = (salaryMasha * 10) / 100;
        int yearSalaryMasha = salaryMasha * 12;
        int yearSalaryMashaInc = (salaryMasha + increaseSalaryMasha) * 12;
        int salaryDenis = 83690;
        int increaseSalaryDenis = (salaryDenis * 10) / 100;
        int yearSalaryDenis = salaryDenis * 12;
        int yearSalaryDenisInc = (salaryDenis + increaseSalaryDenis) * 12;
        int salaryKristina = 76230;
        int increaseSalaryKristina = (salaryKristina * 10) / 100;
        int yearSalaryKristina = salaryKristina * 12;
        int yearSalaryKristinaInc = (salaryKristina + increaseSalaryKristina) * 12;
        System.out.println("\n" + "Задача 8\n");
        System.out.println("Маша теперь получает " + (salaryMasha + increaseSalaryMasha) + " руб. Годовой доход вырос на " + (yearSalaryMashaInc - yearSalaryMasha) + " руб.");
        System.out.println("Денис теперь получает " + (salaryDenis + increaseSalaryDenis) + " руб. Годовой доход вырос на " + (yearSalaryDenisInc - yearSalaryDenis) + " руб.");
        System.out.println("Кристина теперь получает " + (salaryKristina + increaseSalaryKristina) + " руб. Годовой доход вырос на " + (yearSalaryKristinaInc - yearSalaryKristina) + " руб.");

    }
}