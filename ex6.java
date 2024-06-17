import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        for (int i =0;i< vet.length;i++){
            vet[i] = (int) (Math.random() * 101);
            System.out.println(vet[i]);
        }
        System.out.println("Soma dos numeros: ");
        int sum = 0;
        for (int i = 0; i < vet.length; i++) {
            sum += vet[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
