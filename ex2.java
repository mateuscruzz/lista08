import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 15 numeros: ");
        int[] t = new int[15];
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }

        int maior = t[0];
        int menor = t[0];
        int i = 1;
        while (i<t.length){
            if (t[i] > maior) {
                maior = t[i];
            }
            if (t[i] < menor) {
                menor = t[i];
            }
            i++;
        }
        System.out.println("maior = " + maior);
        System.out.println("menor = " + menor);
        sc.close();
    }
}
