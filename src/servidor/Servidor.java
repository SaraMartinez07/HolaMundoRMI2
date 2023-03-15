/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor;

import compartidos.IObjetoRemoto;
import java.rmi.registry.*;

public class Servidor {
    public static void main(String[] args) {
        System.out.println("Abriendo servidor");
        try {
            LocateRegistry.createRegistry(5001);
            IObjetoRemoto objRemoto = new ObjetoRemoto();
            Registry reg = LocateRegistry.getRegistry(5001);
            reg.rebind("remoto", objRemoto);
            System.out.println("Servidor activo!!!");
                            
                          
        } catch (Exception e) {
            System.out.println("Hay un error");
        }
    }
}
