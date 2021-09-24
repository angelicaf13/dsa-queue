/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labalgoritmos4;

/**
 *
 * @author Angelica Figueroa Muñiz
 * Marzo 06, 2018.
 * La clase Pedido cuenta con los atributos fechaEnvio y cantidadImpresoras, en
 * donde se almacenara la información del pedido. Esta clase se utiliza en la
 * clase Cliente, en donde se como atributo un objeto de tipo Pedido.
 * 
 */
public class Pedido {
    private String fechaEnvio;
    private String cantidadImpresoras;

    ///////////////////// constructores //////////////////////////////////
    
    public Pedido() {
    }

    public Pedido(String fechaEnvio, String cantidadImpresoras) {
        this.fechaEnvio = fechaEnvio;
        this.cantidadImpresoras = cantidadImpresoras;
    }

    ////////////////////// métodos ///////////////////////////////////////
    
    /**
     * Método para obtener la fecha de envio del pedido
     * @return 
     */
    public String getFechaEnvio() {
        return fechaEnvio;
    }

    /**
     * Método para asignar la fecha de envio del pedido
     * @param fechaEnvio 
     */
    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    /**
     * Método para obtener la cantidad de impresoras del pedido
     * @return una cadena con la cantidad de impresoras
     */
    public String getCantidadImpresoras() {
        return cantidadImpresoras;
    }

    /**
     * Método para asignar la cantidad de impresoras del pedido
     * @param cantidadImpresoras 
     */
    public void setCantidadImpresoras(String cantidadImpresoras) {
        this.cantidadImpresoras = cantidadImpresoras;
    }

    /**
     * Método para obtener una cadena con la información del pedido
     * @return una cadena con los datos del envio
     */
    @Override
    public String toString() {
        return "Fecha de envio: " + fechaEnvio + "\nCantidad de impresoras: " + cantidadImpresoras;
    } 
}
