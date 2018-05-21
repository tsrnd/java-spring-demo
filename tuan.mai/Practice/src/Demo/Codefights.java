package Demo;

import java.util.Arrays;

public class Codefights {
	int add(int param1, int param2) {
        return param1 + param2;
    }

    int centuryFromYear(int year) {
        if (year % 100 > 0) {
            return year / 100 + 1;
        } else {
            return year / 100;
        }
    }

    boolean checkPalindrome(String inputString) {
        String re = new StringBuffer(inputString).reverse().toString();
        return re.equals(inputString);
    }

    int adjacentElementsProduct(int[] inputArray) {
        int sum = -1000;
        for (int i = 0; i < inputArray.length - 1; i = i + 1) {
            int s = inputArray[i] * inputArray[i + 1];
            if (s > sum) {
                sum = s;
            }
        }
        return sum;
    }

    int shapeArea(int n) {
        return 2*n*(n - 1) + 1;
    }


    int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues);
        int need = 0;
        for (int index = 0; index < statues.length - 1; index += 1) {
            need = need + statues[index + 1] - statues[index] - 1;
        }
        return need;
    }

    int checkA(int[] array) {
        for (int index = 0; index < array.length - 1; index += 1) {
            if (array[index] >= array[index + 1]) {
                return index;
            }
        }
        return -1;
    }
    void removeElement(int[] arr, int removedIdx) {
        System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
    }

    boolean almostIncreasingSequence(int[] sequence) {
        int[] backup = sequence;
        Arrays.sort(sequence);
        int[] status = sequence;
        int sumsame = 0;
        boolean stttam = false;
        int count = backup.length - 1;
        int index = checkA(status);
        if (index == -1) {
            return true;
        } else {
            removeElement(status, index);
            int index1 = checkA(status);
            if (index1 == -1) {
                return true;
            } else {
                removeElement(backup, index1);
                int index2 = checkA(backup);
                if (index2 == -1) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    int matrixElementsSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i += 1) {
            for (int j = 0; j < matrix[0].length; j += 1) {
                if (i == 0) {
                    sum += matrix[i][j];
                } else {
                    if (matrix[i - 1][j] == 0) {
                        matrix[i][j] = 0;
                    } else {
                        sum += matrix[i][j];
                    }
                }
            }
        }
        return sum;
    }

}
