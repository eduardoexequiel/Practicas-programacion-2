import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        ArrayList<Integer> numero=new ArrayList<>();
        int n=0;
        int contador=0;
        for(int i=0;i<3;i++) {
            System.out.println("ingrese un numero:");
            n= t.nextInt();
            numero.add(n);
            contador=contador+1;
        }
        for(int i=0;i<3;i++) {
            System.out.println("los numeros ingresados son:" +numero.get(i));

        }
        Collections.sort(numero);

        for(int i=0;i<3;i++) {
            numero.remove(i);
        }

    }
}