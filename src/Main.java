//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Продолжите работать с кодом, который вы написали в предыдущем уроке —
        // в задачах с накоплениями.
        //С помощью цикла while посчитайте, сколько месяцев потребуется,
        // чтобы накопить 2 459 000 рублей при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        //Результат программы должен быть выведен в консоль с тем количеством месяцев,
        // которое необходимо для накопления данной суммы. Формат сообщения: «Месяц …, сумма накоплений равна … рублей» .
        System.out.println("Задача 1");
        int targetAmount = 2_459_000; // Целевая сумма
        int monthDeposit = 15_000; // Ежемесячный вклад
        int currentSavings = 0;      // Текущие накопления
        int monthsCount = 0; // Количество месяцев
        while (currentSavings < targetAmount) {
            currentSavings = currentSavings + monthDeposit; // Добавляем ежемесячный вклад
            monthsCount = monthsCount + 1; // Увеличиваем счетчик месяцев
            System.out.println("Месяц " + monthsCount + " , сумма накоплений равна " + currentSavings + " рублей.");
        }
        //Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        //На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        //Для обоих циклов можно использовать как одну общую переменную, так и свою в каждом цикле.
        //Не забудьте выполнить переход на новую строку между двумя циклами.
        //В результате программы вывод должен получиться следующим:
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(); // Переход на новую строку
        // Цикл for для вывода чисел от 10 до 1
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        //В стране Y население — 12 миллионов человек.
        //Рождаемость составляет 17 человек на 1000, смертность — 8 человек. Рассчитайте, какая численность населения будет через 10 лет,
        // если показатели рождаемости и смертности постоянны.
        //В консоль выведите результат операции на каждый год в формате: «Год …, численность населения составляет …».
        System.out.println();
        System.out.println("Задача 3");
        int population = 12_000_000; // Население 12 миллионов
        int birthRate = 17; // Рождаемость
        int deathRate = 8; // Смертность
        int currentYear = 2024;
        for (int year = currentYear ; year < currentYear + 10; year++) {
            population += population / 1000 * birthRate - population / 1000 * deathRate;
            System.out.println("Год " + year + " , численность населения составляет " + population);
        }
        //Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%.
        // Первоначальная сумма вклада — 15 тысяч рублей.
        //Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей при условии,
        // что процент банка от накоплений не меняется, а всегда равен 7%.
        //Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
        System.out.println("Задача 4");
        int currentAmount = 15_000; // первоначальная сумма вклада
        int targetAmounts = 12_000_000; // целевая сумма
        int interestRate = 7; // процентная ставка
        int month = 0 ; // количество месяцев
        while (currentAmount < targetAmounts) {
            currentAmount = currentAmount + currentAmount * interestRate/100; // добавляем 7% к текущей сумме
            month = month + 1; // увеличиваем счетчик месяцев
            System.out.println("Месяц " + month + " Сумма накоплений " + currentAmount);
        }
        System.out.println("Василию потребуется " + month + " месяцев, чтобы накопить 12 миллионов рублей.");

        //Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд,
        // а только каждый шестой. Должны быть видны накопления за 6-й, 12-й, 18-й, 24-й и следующие месяцы.
        System.out.println("Задача 5");
        int deposit = 15000; // первоначальная сумма вклада
        int targetAmount1 = 12000000; // целевая сумма
        int percentage = 7; // процентная ставка
        int month1 = 0; // количество месяцев
        while (deposit < targetAmount1) {
            deposit = deposit + deposit * percentage / 100; // добавляем 7% к текущей сумме
            month1 = month1 + 1; // увеличиваем счетчик месяцев
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " Сумма накоплений равна " + deposit + " рублей");
            }
        }
        System.out.println("Задача 6");
        int summDeposit = 15_000;
        int monthStart = 0;
        int monthsEnd = 108;
        int percentage1 = 7;
        while (monthStart < monthsEnd) {
            summDeposit += summDeposit * percentage1/100;
            monthStart = monthStart + 1;
            if (monthStart % 6 == 0)
                System.out.println("Месяц " + monthStart + " , сумма накоплений равна " + summDeposit + " рублей");
        }
        System.out.println("Задача 7");
        int firstFriday = 3;
        for (int day = firstFriday; day <= 31; day+=7) {
            System.out.println("Сегодня пятница, " + day + " - е число. Необходимо подготовить отчет.");
        }
        System.out.println("Задача 8");
        int period = 79;
        int startSeeing = 0;
        int currentYear1 = 2024;
        int start = currentYear1 - 200;
        int end = currentYear1 + 100;
        for (int year = startSeeing; year  < end; year+= period) {
            if (year > start) {
                System.out.println(year);
            }
        }
    }
}
