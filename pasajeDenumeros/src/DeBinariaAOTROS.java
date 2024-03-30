import java.util.Scanner;

//ingresa un numero de 16 dijitos en binario y tranformar en deximal,octal,hexadecimal
public class DeBinariaAOTROS {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] numero = new int[16];
        int sumaD = 0;
        int decimal;

        System.out.println("Ingrese un numero binario de 16 dígitos:");
        String numeroB = teclado.next();

        // Verificar que el número binario tenga 16 dígitos

        if (numeroB.length() != 16) {
            System.out.println("El número binario debe tener 16 dígitos.");
            return;
        }

        for (int i = 0; i < 16; i++) {
            numero[i] = Character.getNumericValue(numeroB.charAt(i));
        }

        for (int e = 0; e < 16; e++) {
            sumaD += numero[15 - e] * Math.pow(2, e);
        }
        System.out.println("El número en decimal es: " + sumaD);

        //pasar a octal

        decimal=sumaD;
        int[] reciduo = new int[6];
        for(int j=0;j<6;j++){
            reciduo[5-j]= decimal % 8;
            decimal=decimal/8;
        }
        System.out.println("El numero en octal es:"+reciduo[0]+reciduo[1]+reciduo[2]+reciduo[3]+reciduo[4]+reciduo[5]);

        //pasar a hexadecimal

        decimal = sumaD;
        String[] reciduo2 = new String[4];
        for (int h = 0; h < 4; h++) {
            int residuo = decimal % 16;
            decimal = decimal / 16;
            if (residuo >= 10 && residuo <= 15) {
                reciduo2[3 - h] = String.valueOf((char) ('A' + residuo - 10));
            } else {
                reciduo2[3 - h] = String.valueOf(residuo);
            }
        }
        System.out.println("El número en hexadecimal es: " + reciduo2[0] + reciduo2[1] + reciduo2[2] + reciduo2[3]);

        //Forma facil
        /*
        System.out.println("El número en octal es: " + Integer.toOctalString(sumaD));
        System.out.println("El número en hexadecimal es: " + Integer.toHexString(sumaD));*/
    }
}
