package Task3;

import java.util.*;

public class Sudoku {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to do?");
        System.out.println("1 - create sudoku by yourself");
        System.out.println("2 - create sudoku by random");
        System.out.println("3 - finish program ");

        while (sc.hasNext()) {
            int select = 0;
            if (sc.hasNextInt()) {
                select = sc.nextInt();
            }
            switch (select) {
                case 1:
                    createMatrixByKeyboard();
                    break;
                case 2:
                    createMatrixByRandom();
                    break;
                case 3:
                    System.out.println("You finish program");
                    return;
                default:
                    System.out.print("You must to choose, 1 - create sudoku by yourself or 2 - create sudoku by random, or 3 - finish program: ");
            }
        }
    }


    public static boolean isValidSudoku(int[][] board, int N) {
        Set seen = new HashSet();
        if (isPerfectSquareByUsingSqrt(N) && N > 1) {
            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    int number = board[i][j];
                    if (number != '.')
                        if (!seen.add(number + " in row " + i) ||
                                !seen.add(number + " in column " + j) ||
                                !seen.add(number + " in block " + i / Math.sqrt(N) + "-" + j / Math.sqrt(N)))
                            return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean isPerfectSquareByUsingSqrt(long n) {
        if (n <= 0) {
            return false;
        }
        double squareRoot = Math.sqrt(n);
        long tst = (long) (squareRoot + 0.5);
        return tst * tst == n;
    }

    public static int[][] createMatrixByKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N, and then build matrix N*N: ");
        int N = scanner.nextInt();
        int[][] arr = new int[N][N];
        if (!isPerfectSquareByUsingSqrt(N)) {
            System.out.println("Write a matrix N*N, that the condition √N == integer will be true and N > 1");
            System.out.print("You must to choose, 1 - create sudoku by yourself or 2 - create sudoku by random, or 3 - finish program: ");
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                    arr[i][j] = scanner.nextInt();
                }
            }
            scanner.close();

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
        }
        if (isValidSudoku(arr, N)) {
            System.out.println("Valid");
        } else if (!isValidSudoku(arr, N) && isPerfectSquareByUsingSqrt(N)) {
            System.out.println("Not Valid");
        } else {
            System.out.println();
        }

        return arr;

    }

    public static int[][] createMatrixByRandom() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N, and then build matrix N*N: ");
        int N = scanner.nextInt();
        int arr[][] = new int[N][N];

        if (!isPerfectSquareByUsingSqrt(N)) {
            System.out.println("Write a matrix N*N, that the condition √N == integer will be true and N > 1");
            System.out.print("You must to choose, 1 - create sudoku by yourself or 2 - create sudoku by random, or 3 - finish program: ");
        } else {
            Random random = new Random();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = random.nextInt(N) + 1;
                }
            }
            Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);
        }



        if (isValidSudoku(arr, N)) {
            System.out.println("Valid");
        } else if (!isValidSudoku(arr, N) && isPerfectSquareByUsingSqrt(N)) {
            System.out.println("Not Valid");
        } else {
            System.out.println();
        }
        return arr;
    }

}


