
package compartidos;

import java.io.Serializable;

/**
 *
 * @author lenovo
 */
public class Auto implements Serializable{
    String modelo;
    String marca;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
