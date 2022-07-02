package Task1;

import java.util.Scanner;

public class RailFenceCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.print("Enter rails : ");
        int countRails = scanner.nextInt();
        String encode = encode(text, countRails);
        System.out.println(encode);
        System.out.println(decode(encode, countRails));
    }

    private static String encode(String text, int countRails) {
        String encode = "";
        boolean check = false;
        int j = 0;
        int row = countRails;
        int col = text.length();
        char[][] a = new char[row][col];
        if (countRails >= 2) {
            for (int i = 0; i < col; i++) {
                if (j == 0 || j == countRails - 1) {
                    check = !check;
                }
                a[j][i] = text.charAt(i);

                if (check)
                    j++;
                else
                    j--;
            }
            for (int i = 0; i < row; i++) {
                for (int k = 0; k < col; k++) {
                    if (a[i][k] != 0) {
                        encode += a[i][k];
                    }
                }
            }
            for (int i = 0; i < row; i++) {
                for (int k = 0; k < col; k++) {
                    System.out.print(a[i][k] + " ");
                }
                System.out.println();
            }

            System.out.println("Encode: ");
        } else {
            System.out.println();
        }
        return encode;
    }

    private static String decode(String text, int countRails) {
        String decode = "";
        boolean check = false;
        int j = 0;
        int row = countRails;
        int col = text.length();
        char[][] a = new char[row][col];
        if (countRails >= 2) {
            for (int i = 0; i < col; i++) {
                if (j == 0 || j == countRails - 1) {
                    check = !check;
                }
                a[j][i] = '*';

                if (check)
                    j++;
                else
                    j--;
            }
            int index = 0;
            check = false;
            for (int i = 0; i < row; i++) {
                for (int k = 0; k < col; k++) {
                    if (a[i][k] == '*' && index < col) {
                        a[i][k] = text.charAt(index++);
                    }
                }
            }
            for (int i = 0; i < row; i++) {
                for (int k = 0; k < col; k++) {
                    System.out.print(a[i][k] + " ");
                }
                System.out.println();
            }

            j = 0;
            for (int i = 0; i < col; i++) {
                if (j == 0 || j == countRails - 1) {
                    check = !check;
                }
                decode += a[j][i];

                if (check)
                    j++;
                else
                    j--;
            }
            System.out.println("Decode: ");
        } else {
            System.out.println();
        }
        return decode;
    }

}

