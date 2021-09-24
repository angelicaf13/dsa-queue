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
 * Clase para representar la direccion del cliente, sus atributos son:
 * calle, numero, ciudad, codigo postal, estado y pais, todos de tipo
 * String.
 */
public class Direccion {
    private String calle;
    private String numero;
    private String ciudad;
    private String codigoPostal;
    private String estado;
    private String pais;

    ///////////////////// constructores //////////////////////////////////
    
    /**
     * Constructor sin parametros
     */
    public Direccion() {
    }

    /**
     * Constructor parametrizados, crea una nueva direccion
     * @param calle
     * @param numero
     * @param ciudad
     * @param codigoPostal
     * @param estado
     * @param pais 
     */
    public Direccion(String calle, String numero, String ciudad, String codigoPostal, String estado, String pais) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.estado = estado;
        this.pais = pais;
    }
    
    ////////////////////// métodos ///////////////////////////////////////

    /**
     * Metodo para obtener la calle de la dirección
     * @return una cadena con la calle de la dirección
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Metodo para asignar la calle de la dirección
     * @param calle la calle que se asignará
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Metodo para obtener el número de la dirección
     * @return una cadena con el numero de la dirección
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Método para asignar el número de la direccion
     * @param numero el numero que se asignara
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Método para obetener la ciudad de la direccion
     * @return una cadena con la ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Método para asignar la ciudad de la direccion
     * @param ciudad la ciudad que se asiganará
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Método para obtener el codigo postal de la direccion
     * @return una cadena con el numero del codigo postal
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Método para asignar el codigo postal a la dirección
     * @param codigoPostal el codigo postal que se asignará
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * Método para obtener el estado de la dirección
     * @return una cadena con el estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Metodo para asignar el estado a la direccion
     * @param estado el estado que se asignara
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Método para obtener el pais
     * @return una cadena con el pais de la dirección
     */
    public String getPais() {
        return pais;
    }

    /**
     * Método para obtener el pais de la dirección
     * @param pais una cadena con el pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Método para obtener una cadena con los datos de la direccion
     * @return una cadena con cada uno de los campos de la direccion,
     * como calle, número y estado.
     */
    @Override
    public String toString() {
        return calle + " #" + numero + ", C.P. " + codigoPostal + "\n" + ciudad +  ", " + estado + ", " + pais;
    }
       
}
