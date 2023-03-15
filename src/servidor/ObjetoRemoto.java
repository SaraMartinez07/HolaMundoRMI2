/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor;
import compartidos.Auto;
import compartidos.IObjetoRemoto;
import compartidos.Persona;
import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;
import java.util.List;

public class ObjetoRemoto extends UnicastRemoteObject implements IObjetoRemoto {

        public ObjetoRemoto() throws RemoteException{}
    @Override
    public String holamundo(String nombre) throws RemoteException {
        String msg = nombre.toUpperCase();
        return msg;
    }

    @Override
    public boolean mostrarAuto(Auto auto) throws RemoteException {
        System.out.println("Acabo de recibir un auto");
        System.out.println("Marca" + auto.getMarca());
        System.out.println("Modelo" + auto.getModelo());
        return true;
    }
    @Override
    public int hacerFactorial(int n) throws RemoteException {
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    @Override
    public String reversaCadena(String cadena) throws RemoteException {
        StringBuilder sb = new StringBuilder(cadena);
        sb.reverse();
        return sb.toString();
    }
    private List<Persona> listaJung = new ArrayList<Persona>();

@Override
public List<Persona> agregarDatosPersona(Persona persona) throws RemoteException {
    listaJung.add(persona);
    return listaJung;
}
}

