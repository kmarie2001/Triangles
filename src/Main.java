import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner triangleSize = new Scanner(System.in);
        Scanner triangleFill = new Scanner(System.in);
        System.out.println("Enter a whole number to be the size of your triangle: ");
        int size = triangleSize.nextInt();
        System.out.println("Enter a character you want to draw your triangle with: ");
        char fill = triangleFill.next().charAt(0);


        for (int row = 1; row <= size; row++) {

            for(int s = 0; s <= size - row; s++){
                System.out.print(" ");
            }
            for(int j = 1; j<=row; j++){
                System.out.print(fill+ " ");
            }
            System.out.println(" ");
        }

    }}