import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 10 numeros inteiros: ");
        int[] vet = new int[10];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        int contN = 0;
        int contP = 0;
        int contNull = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < 0){
                contN ++;
            } else if (vet[i] == 0) {
                contNull ++;
            }
            else {
                contP++;
            }
        }
        System.out.println("Quantidade de negativos: " + contN);
        System.out.println("Quantidade de positivos: " + contP);
        System.out.println("Quantidade de zeros: " + contNull);
        sc.close();
    }
}
