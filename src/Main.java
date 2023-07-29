// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }




    public static void task1() {
        System.out.println("Домашнее задание №7");
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 1 ===========");
        System.out.println("============================");
        int money = 15000;
        int savings = 0;
        int month = 0;
        while ( savings<=2_459_000) {
            savings=savings+money;
            month++;
            System.out.println("Месяц " + month +" , сумма накоплений равна " + savings + " рублей");
        }
        System.out.println("===== Конец задачи 1 =======");

    }
    private static void task2() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 2 ===========");
        System.out.println("============================");
        int i=0;
        while(i<10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int j=10; j>0; j=j-1) {
            System.out.print(j + " ");
        }
        System.out.println("");
        System.out.println("===== Конец задачи 2 =======");
    }
    private static void task3() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 3 ===========");
        System.out.println("============================");
        int people = 12_000_000;
        int birthPer1000 = 17;
        int deathPer1000 = 8;
        int birth = 0;
        int death = 0;
        int year= 0;
        while(year<10) {
            birth=(birthPer1000*people)/1000;
            death = (deathPer1000*people)/1000;
            year++;
            people=people+birth-death;
            System.out.println("Год " + year +" , численность населения составляет " + people);
        }
        System.out.println("===== Конец задачи 3 =======");
    }
    private static void task4() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 4 ===========");
        System.out.println("============================");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total<12_000_000) {
            total = total + (total/100)*7;
            total = total + salary;
            month++;
            System.out.println("Месяц " + month +", сумма накоплений равна " + total+ " рублей");
        }
        System.out.println("===== Конец задачи 4 =======");

    }
    private static void task5() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 5 ===========");
        System.out.println("============================");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total<12_000_000) {
            total = total + (total/100)*7;
            total = total + salary;
            month++;
            if (month%6==0) {
                System.out.println("Месяц " + month +", сумма накоплений равна " + total+ " рублей");
            }

        }
        System.out.println("===== Конец задачи 5 =======");
    }
    private static void task6() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 6 ===========");
        System.out.println("============================");
        int salary = 15000;
        int total = 0;
        int month = 0;
        int nineYears= 12*9;
        while (month<=nineYears) {
            total = total + (total/100)*7;
            total = total + salary;
            month++;
            if (month%6==0) {
                System.out.println("Месяц " + month +", сумма накоплений равна " + total+ " рублей");
            }

        }
        System.out.println("===== Конец задачи 6 =======");
    }
    private static void task7() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 7 ===========");
        System.out.println("============================");
        int fryday = 4;
        int allDaysInMonth=31;
        while (fryday<=allDaysInMonth) {
            System.out.println("Сегодня пятница, " + fryday + "-е число");
            fryday=fryday+7;
        }
        System.out.println("===== Конец задачи 7 =======");
    }
    private static void task8() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 8 ===========");
        System.out.println("======= вариант 1 ==========");
        int flyCometa = 0;
        int yearNow = 2023;
        int yearBefore = yearNow - 200;
        int yearAfter = yearNow + 100;
        while (yearBefore <= yearAfter) {
            yearBefore++;
            flyCometa=0;
            while (flyCometa <= yearBefore) {
                flyCometa = flyCometa + 79;
                if (flyCometa == yearBefore) {
                    System.out.println(flyCometa);
                }
            }
        }
        System.out.println("===== Конец задачи 8 =======");
        System.out.println("======= вариант 1 ==========");

        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 8 ===========");
        System.out.println("======= вариант 2 ==========");
        int flyCometa_2 = 79;
        int yearNow_2 = 2023;
        int yearBefore_2 = yearNow_2 - 200;
        int yearAfter_2 = yearNow_2 + 100;
        while (yearBefore_2 <= yearAfter_2) {
            yearBefore_2++;
            if (yearBefore_2%flyCometa_2==0) {
                    System.out.println(yearBefore_2);
                }
            }
        System.out.println("===== Конец задачи 8 =======");
        System.out.println("======= вариант 2 ==========");
        }




}



