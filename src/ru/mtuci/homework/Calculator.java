package ru.mtuci.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

   * @param args
   */
  public static void main(String[] args) throws IOException {
    // Создание класса калькулятор. Класс создается с помощью ключевого слова 'new'
    Calculator calculator = new Calculator();

    // Создание считывателя ввода из консоли
    BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

    // Вывод на консоль предложения ввести число
    System.out.println("Введите первое число:");

    // Считывание ввода из консоли. Нужно ввести число и нажать Enter
    String aValue = consoleReader.readLine();

    // Преобразование типа String в тип double. Почитай про типы в Java, чтобы было понятно
    double a = Double.parseDouble(aValue);

    // Тоже самое для второго числа
    System.out.println("Введите второе число");
    String bValue = consoleReader.readLine();
    double b = Double.parseDouble(bValue);

    System.out.println("Введите операцию:");
    // Считывание операции над числами. Нужно ввести операцию и нажать Enter.
    // Примеры ввода: "+", "-", "*" или "/".
    String operation = consoleReader.readLine();

    // Условие для определения какую операцию нужно выполнить.
    if        ("+".equals(operation)) {System.out.println("Результат: " + calculator.sum(a, b));
    } else if ("-".equals(operation)) {System.out.println("Результат: " + calculator.subtract(a, b));
    } else if ("-".equals(operation)) {System.out.println("Результат: " + calculator.multiply(a, b));
    } else if ("-".equals(operation)) {System.out.println("Результат: " + calculator.divide(a, b));
    }

  }

  private double sum(double a, double b) {
    return a + b;
  }
  private double subtract(double a, double b) {
    return a - b;
  }
  private double multiply(double a, double b) {
    return a * b;
  }
  private double divide(double a, double b) {
    return a / b;
  }

}

}