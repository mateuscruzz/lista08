import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 5 numeros inteiros: ");
        int[] vet = new int[5];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        for (int i = vet.length - 1; i > 0; i--) {
            System.out.println(vet[i]);
        }


        sc.close();
    }
}
