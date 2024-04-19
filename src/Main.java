import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1.");

        int[] integerNums = new int[]{1, 2, 3}; //целочисленный массив с тремя цифрами

        double[] doubleNums = {1.57, 7.654, 9.986}; //массив с тремя дробными числами

        boolean[] randomNums = new boolean[4];  //произвольный массив
        randomNums[0] = true;
        randomNums[1] = false;
        randomNums[2] = true;
        randomNums[3] = true;

        System.out.println();

        //Задача 2
        System.out.println("Задача 2.");

        //вывод целочисленного массива
        for (int i = 0; i < integerNums.length; i++){
            if (i == integerNums.length - 1){
                System.out.print(integerNums[i]);
            } else{
                System.out.print(integerNums[i] + ", ");
            }
        }

        System.out.println();

        //вывод массива дробных чисел
        for (int i = 0; i < doubleNums.length; i++){
            if (i == doubleNums.length - 1){
                System.out.print(doubleNums[i]);
            } else{
                System.out.print(doubleNums[i] + ", ");
            }
        }

        System.out.println();

        //вывод произвольного массива
        for (int i = 0; i < randomNums.length; i++){
            if (i == randomNums.length - 1){
                System.out.print(randomNums[i]);
            } else{
                System.out.print(randomNums[i] + ", ");
            }
        }

        System.out.println();

        //Задача 3
        System.out.println("Задача 3.");

        //вывод целочисленного массива в обратном порядке
        for (int i = integerNums.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.print(integerNums[i]);
            } else{
                System.out.print(integerNums[i] + ", ");
            }
        }

        System.out.println();

        //вывод массива дробных чисел в обратном порядке
        for (int i = doubleNums.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.print(doubleNums[i]);
            } else{
                System.out.print(doubleNums[i] + ", ");
            }
        }

        System.out.println();

        //вывод произвольного массива в обратном порядке
        for (int i = randomNums.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.print(randomNums[i]);
            } else{
                System.out.print(randomNums[i] + ", ");
            }
        }

        System.out.println();

        //Задача 4
        System.out.println("Задача 4.");

        //замена в целочисленном массиве нечетных чисел на четные
        for (int i = 0; i < integerNums.length; i++){
            if(integerNums[i] % 2 != 0){
                integerNums[i] += 1;
            }
        }

        //вывод массива одной строчкой в квадратных скобках
        System.out.println(Arrays.toString(integerNums));

        System.out.println();

    }
}