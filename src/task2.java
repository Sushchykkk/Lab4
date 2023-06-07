public class task2 {
    public static void main(String[] args) {
        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        // Перебираємо масив циклом while
        System.out.println("Перебір масиву циклом while:");
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();

        // Перебираємо масив циклом for
        System.out.println("Перебір масиву циклом for:");
        for (i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Перебираємо масив циклом while та виводимо тільки непарні індекси
        System.out.println("Перебір масиву циклом while з виводом непарних індексів:");
        i = 1;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i += 2;
        }
        System.out.println();

        // Перебираємо масив циклом for та виводимо тільки парні індекси
        System.out.println("Перебір масиву циклом for з виводом парних індексів:");
        for (i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Виводимо масив в зворотньому порядку
        System.out.println("Масив в зворотньому порядку:");
        for (i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

