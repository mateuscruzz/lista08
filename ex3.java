import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 20 numeros inteiros: ");
        int[] vet = new int[20];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        System.out.println("Numeros pares:");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0){
                System.out.println(vet[i]);
            }
        }
        System.out.println("Numeros impares:");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 != 0){
                System.out.println(vet[i]);
            }
        }
        sc.close();
    }
}
