package dev.hugo;

public class MultiplicationTable {
    public static String[] generateMultiplicationTable(int n) {
        String[] table = new String[10];
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = n + " x " + i + " = " + (n * i);
        }
        return table;
    }

    public static void main(String[] args) {
        int n = 5;
        String[] multiplicationTable = generateMultiplicationTable(n);
        for (String line : multiplicationTable) {
            System.out.println(line);
        }
    }
}

