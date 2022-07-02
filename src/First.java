public class First {
    // Задание 1 - 2 способа
    private final int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void firstTaskArray() {
        int[] firstArray = new int[array.length];
        for (int i : array) {
            int a = 1;
            System.out.println("Элемент в первоначальном массиве " + i);
            a = a + 1;
        }
        System.out.println("\n");
        for (int i = 0; i < array.length; i++) {
            firstArray[i] = array[i];
        }

        for (int i : firstArray) {
            int a = 1;
            System.out.println("Элемент в скопированном массиве " + i);
            a = a + 1;
        }
        System.out.println("\n");

        //Проверка на заполненность массива, возьмем любую цифру до 9, чтобы удостовериться, что в массиве лежит точно, что - то
        int numberExampleFirst = 2;
        for (Object x : firstArray) {
            if (x.equals(numberExampleFirst)) {
                System.out.println("Этот массив точно не пустой, так как в нем лежит " + numberExampleFirst);
                break;
            }
        }

    }

    public void secondTaskArray() {
        int[] secondArray = new int[array.length];
        int numberSecond = 3;
        System.arraycopy(array, 0, secondArray, 0, array.length);
        for (int i : secondArray) {
            int a = 1;
            System.out.println("Элемент в скопированном массиве 2:  " + i);
            a = a + 1;
        }
        int numberExampleSecond = 5;
        for (Object x : secondArray) {
            if (x.equals(numberExampleSecond)) {
                System.out.println("Этот массив точно не пустой, так как в нем лежит " + numberExampleSecond);
                break;
            }
        }

    }


}
