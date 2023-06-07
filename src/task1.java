public class task1 {
    public static void main(String[] args) {
        // Створення пустого масиву на 50 елементів
        int[] evenNumbers = new int[50];
        int[] oddNumbers = new int[50];

        // Заповнення масиву парними числами
        for (int i = 0; i < 50; i++) {
            evenNumbers[i] = i * 2;
        }

        // Заповнення масиву непарними числами
        for (int i = 0; i < 50; i++) {
            oddNumbers[i] = i * 2 + 1;
        }

        // Виведення масивів на екран
        System.out.println("Парні числа:");
        for (int i = 0; i < 50; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.println("\nНепарні числа:");
        for (int i = 0; i < 50; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}



