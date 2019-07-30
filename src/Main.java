import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap size cua mang: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("nhap phan tu thu " + i  + " :");
            array[i] = scanner.nextInt();
        }
        System.out.print("nhap phan tu muon xoa: ");
        int x = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (array[i] == x) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = 0;
                size--;
            } else i++;
        }
        System.out.println("mang sau khi xoa: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
