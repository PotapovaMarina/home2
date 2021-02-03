package array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] array = {{"1", "1"}, {"1", "2"}, {"1", "nhb"},{"1", "4"}};
        checkArray(array);
    }

    public static void checkArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
       // System.out.println(array[0].length);
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4 на 4");
        }
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               try {
                   sum += Integer.parseInt(array[i][j]);
               }
               catch (NumberFormatException nfe)
               {
                 throw new MyArrayDataException("In array in ["+i+"]["+j+"] there is '"+array[i][j]+"' instead of number") ;
               }
               }
            }
        System.out.println("Сумма элементов массива= "+sum);

        }
    }
