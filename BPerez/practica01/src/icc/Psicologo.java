import java.util.Scanner;
/*
*Programa para simular una sesion con un psicologo.
*
*@author Brandon Perez Hernandez
*@version 1.0
*@version de Java: OpenJDK 25.0.4.1
*/
public class Psicologo {
    public static void main(String [] args){  

        Scanner in =  new Scanner (System.in);
        String nombre;
        String problema;
        String razon;

        System.out.println("Bienvenido, cual es su nombre? ");
        //Pido nombre al usuario
        System.out.println("Dame tu nombre ");
        nombre = in.nextLine();

        //Pido el problema al usuario
        System.out.println("Buenas tardes "+nombre);
        System.out.println("Digame, cual es su problema en la vida?");
        problema = in.nextLine();

        //Pido la razon del problema al usuario
        System.out.println("MMMM... ya veo" + "\n" + "Y digame ... ");
        System.out.println("Por que dice " + " \" " +problema + " \" ?");
        razon = in.nextLine();
        System.out.println("Muy interesante!! Hablaremos de ello con mas detalle en la siguiente sesion. ");
        in.close();
    }
}
