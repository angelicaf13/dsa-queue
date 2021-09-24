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
 * La clase Cliente se utiliza para representar a cada uno de los clientes que 
 * se registraran en el sistema de ventas, cuentas con atributos los cuales 
 * seran la informacion personal de cada cliente. Dentro de esta clase se utilizan
 * las clases Direccion, Pedido y TarjetaDeCredito que tambien fueron creadas.
 */
public class Cliente {
    private String nombre;
    private Direccion direccion;
    private String numeroTelefonico;
    private String email;
    private int numeroId;  
    private TarjetaDeCredito tarjeta;
    private Pedido pedido;
    
    ///////////////////// constructores //////////////////////////////////
    
    /**
     * Constructor sin parametros
     */
    public Cliente(){
        
    }
    
    /**
     * Constructor parametrizado, crea un nuevo cliente con la 
     * informacion indicada
     * @param nombre el nombre del cliente
     * @param direccion la direccion del cliente
     * @param numeroTelefonico el numero telefonico del cliente
     * @param email el correo electronico del cliente
     * @param numeroId el numero de identifiacion del cliente
     * @param tarjeta la tarjeta de credito del cliente
     * @param pedido el pedido del cliente
     */
    public Cliente(String nombre, Direccion direccion, String numeroTelefonico, String email, int numeroId, TarjetaDeCredito tarjeta, Pedido pedido){
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroTelefonico = numeroTelefonico;
        this.email = email;
        this.numeroId = numeroId;
        this.tarjeta = tarjeta;
        this.pedido = pedido;
    }
    
    ////////////////////// métodos ///////////////////////////////////////

    /**
     * Método para obtener el nombre del cliente
     * @return una cadena con el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para asignar el nombre del cliente
     * @param nombre el nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la direccion del cliente
     * @return la direccion del cliente
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Método para asignar la dirección del cliente
     * @param direccion la dirección del cliente
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Método para obtener el número telefonico del cliente
     * @return una cadena con el número telefonico
     */
    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    /**
     * Método para asignar el número telefonico del cliente
     * @param numeroTelefonico 
     */
    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    /**
     * Método para obtener el email del cliente
     * @return una cadena con el email del cliente
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método para asignar el email del cliente
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método para obtener el número ID del cliente
     * @return el número del cliente
     */
    public int getNumeroId() {
        return numeroId;
    }

    /**
     * Método para asignar el número ID al cliente
     * @param numeroId 
     */
    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    /**
     * Método para obtener la tajeta del cliente
     * @return la tarjeta del cliente
     */
    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    /**
     * Método para asignar la tarjeta de credito al cliente
     * @param tarjeta 
     */
    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    /**
     * Método para obtener el pedido del cliente
     * @return el pedido del cliente
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * Método para asignar el pedido al cliente
     * @param pedido 
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    /**
     * Método para asignar la fecha de envio al pedido del cliente
     * @param fecha 
     */
    public void setFechaDeEnvio(String fecha){
        pedido.setFechaEnvio(fecha);
    }

    /**
     * Método para obtener una cadena con la información del cliente
     * @return una cadena con los datos del clientes
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDirección: " + direccion.toString() + "\nNúmero telefonico: " + numeroTelefonico
                + "\ne-Mail: " + email + "\nNúmero Id: " + numeroId + "\n" + tarjeta.toString() + "\n"  + pedido.toString();
    }
   
}

