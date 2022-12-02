//Задача 3. Сделать простой калькулятор

import java.util.Scanner; //импортировал сканер, который может принимать данные из терминала

public class Zadacha3Calc {
    public static void main(String[] args) {
        //1.Составляю сканер
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println("Ответ: " + c);
    }
    
}