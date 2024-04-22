
import java.util.ArrayList;
import java.util.Scanner;

//El usuario ingresa dos elementos de la sucesion,
// las posiciones que ocupan dichos numeros en la sucesion
// (tener en cuenta que se pueden ingresar valores que no sean consecutivos.)
// Ademas el usuario debe ingresar cuantos términos de la sucesion desea generar n,
// Mostrar por pantalla los datos generados de izquierda a derecha y de derecha a izquierda
public class Main {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int elemento1=0;
        int posicion1=0;
        int elemento2=0;
        int posicion2=0;
        int n=0;
        int d=0;
        System.out.println("Sucesiones Aritmeticas");
        System.out.println("Ingrese el primer numero:");
        elemento1=t.nextInt();
        System.out.println("¿En que posicion esta el primer numero ingresado?\nIngrese:");
        posicion1=t.nextInt();
        System.out.println("Ingrese el segundo numero:");
        elemento2=t.nextInt();
        System.out.println("¿En que posicion esta el segundo numero ingresado?\nIngrese:");
        posicion2=t.nextInt();
        System.out.println("ingrese cuantos termino quiere que tenga la sucesion Aritmetica:");
        n=t.nextInt();
        d=Distancia(elemento1,elemento2,posicion1,posicion2, n, d);
        CrearNumeros(elemento1,d,n);
        ArrayList<Integer> miLista = CrearNumeros(elemento1, d, n);
        System.out.println("Datos mostrados organizados");
        mostrarLista(miLista);
        System.out.println("Datos mostrados al revez");
        mostrarListaInversa(miLista);
    }
    public static int Distancia(int elemento1, int elemento2, int posicion1, int posicion2,int n,int d){
        if(posicion1<posicion2){
        if(posicion1==1 && posicion2==2){
            d=elemento2-elemento1;
        }else if (posicion1==1 && posicion2==n){
            d=(posicion2-posicion1)/(n-1);
        }else {
            d=(elemento2-elemento1)/(posicion2-1);
        }}
        if(posicion2<posicion1){
            if(posicion2==1 && posicion1==2){
                d=elemento1-elemento2;
            }else if (posicion2==1 && posicion1==n){
                d=(posicion1-posicion2)/(n-1);
            }else {
                d=(elemento1-elemento2)/(posicion1-1);
            }
        }
        return d;
    }
    public static ArrayList<Integer> CrearNumeros(int elemento1, int d, int n) {
        ArrayList<Integer> miLista = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            miLista.add(elemento1);
            elemento1 = elemento1 + d;
        }

        return miLista;
    }

    public static void mostrarLista(ArrayList<Integer> miLista) {
        for (Integer j : miLista) {
            System.out.println(j);
        }
    }
    public static void mostrarListaInversa(ArrayList<Integer> miLista) {
        for (int i = miLista.size() - 1; i >= 0; i--) {
            System.out.println(miLista.get(i));
        }
    }
}