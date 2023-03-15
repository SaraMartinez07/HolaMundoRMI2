package cliente;

import compartidos.Auto;
import compartidos.IObjetoRemoto;
import compartidos.Persona;
import java.rmi.registry.*;
import java.rmi.*;
import java.util.List;
import java.util.Scanner;

public class cliente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iniciando cliente");
        try {

            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 5001);
            IObjetoRemoto objremoto = (IObjetoRemoto) reg.lookup("remoto");

            int opc = 1;
            while (opc != 0) {
                System.out.println("Elige una opcion");
                System.out.println("(1) Opcion 1: Cambiar a mayusculas");
                System.out.println("(2) Opcion 2: Hacer Factorial");
                System.out.println("(3) Opcion 3: Cadena en reversa");
                System.out.println("(4) Opcion 4: Lista");

                opc = sc.nextInt();

                switch (opc) {
                    case 1:
                        System.out.println("Ingresa un nombre");

                        String nom = sc.nextLine();
                        nom = sc.nextLine();

                        String mensaje = objremoto.holamundo(nom);
                        System.out.println("Mensaje: " + mensaje);
                        break;
                    case 2:
                        System.out.println("Ingresa un número:");
                        int num = sc.nextInt();
                        int factorial = objremoto.hacerFactorial(num);
                        System.out.println(num + "su factorial es  = " + factorial);
                        break;
                    case 3:
                        System.out.println("Ingresa una cadena");
                        sc.nextLine(); // Consumir la nueva línea en blanco
                        String cadena = sc.nextLine();
                        String reversa = objremoto.reversaCadena(cadena);
                        System.out.println("Cadena en reversa: " + reversa);
                        break;

                    case 4:
                        System.out.println("Ingresa el nombre de la persona:");
                        String nombre = sc.next();
                        System.out.println("Ingresa la edad de la persona:");
                        int edad = sc.nextInt();
                        Persona persona = new Persona();
                        persona.setNombre(nombre);
                        persona.setEdad(edad);
                        List<Persona> lista = objremoto.agregarDatosPersona(persona);
                        System.out.println("Lista de personas:");
                        for (Persona p : lista) {
                            System.out.println(p.getNombre() + " - " + p.getEdad());
                        }
                        break;

                }
            }

            String mensaje = objremoto.holamundo("Sara");
            System.out.println("Mensaje: " + mensaje);

            mensaje = objremoto.holamundo("hola");
            System.out.println("Mensaje: " + mensaje);

            Auto auto = new Auto();
            auto.setMarca("Vocho");
            auto.setModelo("2010");
            boolean retorno = objremoto.mostrarAuto(auto);
            System.out.println("Retorno" + retorno);
        } catch (Exception e) {
            System.out.println("Ocurrio um error");
        }
    }
}
