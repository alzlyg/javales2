package ru.zlygostev;

/**
 * Класс ArraySum в функции analyzeAr() получает на входе массив
 * размерностью ariSize*arjSize
 * Проверяет соостветствие фактической и ожидаемой размерности массива
 * Проверяет возможность преобразовать элементы массива в int
 * Суммирует элементы массива
 */

public class ArraySum {
    public static final int ariSize = 4;
    public static final int arjSize = 4;

    public void ArraySum() {
    }

    public int analyzeAr(String[][] arOfS)  throws MyArrayDataException, MySizeArrayException {
        int sumAr = 0;
        if(arOfS.length != ariSize){
            throw new MySizeArrayException();
        }
        for(int i = 0; i < ariSize; i++) {
            if(arOfS[i].length != arjSize) {
                throw new MySizeArrayException();
            }
            else {
                for(int j = 0; j < arjSize; j++) {
                    try {
                        sumAr += Integer.parseInt(arOfS[i][j]);

                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }

        }
        return sumAr;
    }
}
