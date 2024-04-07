import javax.swing.*;

/*Actividad. Defina la clase Empleado, esta clase debe almacenar la siguiente información dni,
nombre, apellido, domicilio, fecha nacimiento y sueldo bruto.
Todos estos datos son de tipo String excepto el sueldo bruto que es double.
Todos los atributos son de acceso privado.
Defina el método constructor de la clase
Instancie 3 objetos
Realice método calcular_edad()
Realice método mostrar_datos()
Realice el diagrama de clases de la clase empleado
Subir código y diagrama en un archivo word.

*/

public class Main {

    public static void main(String[] args) {

        empleado empleado1 = new empleado("11", "maxi", "fusco","casa1","22/04/2003",100000);
        empleado empleado2 = new empleado("22", "edu", "lucero","casa2","04/04/1988",2000000);
        empleado empleado3 = new empleado("33", "pau", "dimilta","casa3","01/01/1980",5000000);

        empleado1.mostrar_datos();
        System.out.println("Edad: " + empleado1.calcular_edad() + " años");
        empleado2.mostrar_datos();
        System.out.println("Edad: " + empleado2.calcular_edad() + " años");
        empleado3.mostrar_datos();
        System.out.println("Edad: " + empleado3.calcular_edad() + " años");
    }

}