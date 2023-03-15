/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package compartidos;
import java.rmi.*;
import java.util.ArrayList;
import java.util.List;

public interface IObjetoRemoto extends Remote{
   // public static final List <Auto> ListaAuto = new ArrayList;
    public String holamundo(String nombre)
    throws RemoteException;
    
    public boolean mostrarAuto(Auto auto) throws RemoteException;
    public int hacerFactorial(int n) throws RemoteException;
    public String reversaCadena(String cadena) throws RemoteException;
    public List<Persona> agregarDatosPersona(Persona persona) throws RemoteException;

}
