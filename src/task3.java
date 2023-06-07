public class task3 {
        public static void main(String[] args) {
            double[] arr = {1.5, 2.3, 4.7, 3.2, 5.1}; // масив дійсних чисел
            double sum = 0.0; // змінна, що містить суму елементів масиву

            // Обчислюємо суму елементів масиву
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }

            System.out.println("Сума елементів масиву: " + sum);
        }
    }



