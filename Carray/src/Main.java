import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        ArrayList<Integer> numero=new ArrayList<>();
        int n=0;
        for(int i=0;i<3;i++) {
            System.out.println("ingrese un numero:");
            n= t.nextInt();
            numero.add(n);
        }

    }
}