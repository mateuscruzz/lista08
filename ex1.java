import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tamanho do array: ");
        int n = sc.nextInt();
        int[] t = new int[n];
        int med =0;
        System.out.println("Digite os numeros:");
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
            med += t[i];
        }
        System.out.println("Media: " + med/n);

        sc.close();
    }
}