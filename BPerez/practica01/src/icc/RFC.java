import java.util.Scanner;

/*
 * Programa para generar el RFC de una persona a partir de su nombre
 * y su fecha de nacimiento
 * @author Brandon Perez Hernandez
 * @version 1.0
 * Version de Java:OpenJDK 25.0.4.1
 */
public class RFC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Solicitar el nombre y fecha de nacimiento 
        System.out.println("Dame el nombre completo");
        String nombreCompleto = in.nextLine();

        System.out.println("ingresa la fecha de nacimiento en formato dd/mm/aa");
        String fechaDeNacimiento = in.nextLine();

        // Separar el nombre y los apellidos usando los espacios en blanco
        int Posicion1 = nombreCompleto.indexOf(" "); // Se crea una variable para almacenar la posición del primer espacio en blanco
        String nombre = nombreCompleto.substring(0, Posicion1); // Se crea una variable para almacenar el nombre que abarca desde la posición 0 hasta el primer espacio en blanco

        String Posicion2 = nombreCompleto.substring(Posicion1 + 1); // Se crea una variable para almacenar los apellidos que hace que empieze en la inicial del primer appellido
        int Posicion3 = Posicion2.indexOf(" "); // Se crea una variable para almacenar la posición del segundo espacio en blanco
        String aPaterno = Posicion2.substring(0, Posicion3); // Se crea una variable para almacenar el apellido paterno que abarca desde la posición 0 hasta el segundo espacio en blanco
        String aMaterno = Posicion2.substring(Posicion3 + 1); // Se crea una variable para almacenar el apellido materno que abarca desde la posición del segundo espacio en blanco hasta el final

        //  Extraer la inicial del nombre
        String inicialNombre = nombre.substring(0, 1);

        // Extraer las dos primeras letras del apellido paterno
        String letrasPaterno = aPaterno.substring(0, 2);

        // Extraer la inicial del apellido materno
        String inicialMaterno = aMaterno.substring(0, 1);

        // (h) Extraer el año, el mes y el día de la fecha "dd/mm/aa"
        String dia = fechaDeNacimiento.substring(0, 2);
        String mes = fechaDeNacimiento.substring(3, 5);
        String año = fechaDeNacimiento.substring(6, 8);

        // Formar la fecha del RFC: año (aa) + mes (mm) + día (dd)
        String fechaRFC = año + mes + dia;

        // Formacion el RFC juntando las variables, y convertiendo a mayúsculas
        String rfc = (letrasPaterno + inicialMaterno + inicialNombre + fechaRFC);
        rfc = rfc.toUpperCase();
        
        // Resultado
        System.out.println("El RFC de " + nombreCompleto + " es: " + rfc);

        in.close();
    }
}
