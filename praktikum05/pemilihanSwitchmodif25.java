package praktikum05;
import java.util.Scanner;
public class pemilihanSwitchmodif25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angka1, angka2, hasil = 0;
        char operator;
        System.out.println("Masukan angka 1: ");
        angka1 = sc.nextDouble();
        System.out.println("Masukan angka 2: ");
        angka2 = sc.nextDouble();
        System.out.println("Masukan operator (+ - * :)");
        operator = sc.next().charAt(0);
        switch (operator) {
            case '+' :
                hasil = angka1 + angka2;
                break;
            case '-' :
                hasil = angka1 - angka2;
                break;
            case '*' :
                hasil = angka1 * angka2;
                break;
            case '/' :
                hasil = angka1 / angka2;
                break;
                default:
                System.out.println("Operator yang dipilih tidak sesuai. Silakan memilih operator yang valid (+, -, *, /).");
                break;
            
        }
        System.out.println(angka1 + operator + angka2 + "=" + hasil);
    }
    
}


