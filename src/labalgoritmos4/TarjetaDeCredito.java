/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labalgoritmos4;

/**
 *
 * @author Angelica Figueroa Muñiz
 * Marzo 06, 2018
 * La clase TarjetaDeCredito representa la tarjeta del cliente, esta cuenta
 * con informacion como el numero de tarjeta, la fecha de vencimiento y la
 * institución que la expide.
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private String institucion;
    
    ///////////////////// constructores //////////////////////////////////

    /**
     * Constructor sin parametros
     */
    public TarjetaDeCredito() {
    }

    /**
     * Constructor parametrizado, crea una nueva tarjeta a partir de la informacion
     * que recibe
     * @param numero el número de la tarjeta
     * @param fechaVencimiento la fecha de vencimiento de la tarjeta
     * @param institucion la institución que expide la tarjeta
     */
    public TarjetaDeCredito(String numero, String fechaVencimiento, String institucion) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.institucion = institucion;
    }
    
    ////////////////////// métodos ///////////////////////////////////////

    /**
     * Método para obtener el número de la tarejta
     * @return una cadena con el número de la tarjeta
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Método para asignar el número de la tarjeta
     * @param numero 
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Método para obtener la fecha de vencimiento
     * @return una cadena con la fecha de vencimiento
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Método para asignar la fecha de vencimiento
     * @param fechaVencimiento 
     */
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * Método pra obtener la institución que expide la tarjeta
     * @return 
     */
    public String getInstitucion() {
        return institucion;
    }

    /**
     * Método para asignar la institución que expide la tarjeta
     * @param institucion 
     */
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    /**
     * Método para obtener una cadena con los datos de la tarjeta
     * @return una cadena con la información de la tarjeta de credito, como:
     * número, fechas de vencimiento y la intitución
     */
    @Override
    public String toString() {
        return "No. tarjeta de credito: " + numero + "\nFecha de vencimiento: " 
                + fechaVencimiento + "\nInstitucion: " + institucion;
    }  
}
