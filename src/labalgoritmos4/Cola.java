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
 * La clase representa a una cola mediante el uso de un arreglo,
 * cuenta con los atributos de tipo int "inicio" y "fin" para tener 
 * un control de donde se encuentran el inicio y el final de la cola.
 * Además se cuentan con los métodos necesarios para insertar y eliminar
 * elementos siguiendo el principio de las colas.
 * 
 */
public class Cola <T> {
    private T [] cola;
    private int inicio = -1;
    private int fin = -1;
    
    public Cola(){
        cola = (T[]) new Object[10];
    }
    
    public Cola(int cantidad){
        cola = (T[]) new Object[cantidad];
    }
    
    /**
     * Si el final es menor que la longitud del arreglo cola
     * (aun tiene espacio); se recorre el fin (aumenta) y se inserta
     * el dato en cola en la posicion de fin. Si fin es igual a 1,
     * inicio se iguala a 1 porque solo hay un elemento. Si no, la
     * pila esta llena por lo que se muestra un mensaje.
     * @param dato 
     */
    public void insertarDato(T dato) {
        if (fin < cola.length) {
            fin++;
            cola[fin] = dato;
            if (fin == 0) {
                inicio = 0;
            }
        } else {
            System.out.println("Cola llena");
        }
    }
    
    /**
     * crea un objeto que se regresara, si el inicio es diferente
     * de -1 (osea si hay elementos), el objeto se convierte en 
     * el elemento en cola en la posicion de inicio (el primero),
     * si el inicio es igual al fin (solo hay un dato) el inicio y
     * el fin se igualan a -1 (porque ya no va a tener ningun dato)
     * si no, el inicio se recorre (aumenta) para que ahora el 
     * siguiente elemento sea el nuevo primero. Si inicio no es diferente
     * de -1(no hay ningun dato) se muestra mensaje. Se regresa el dato.
     * @return 
     */
    public T eliminarDato(){
        T dato = null;
        if(inicio != -1){
            dato = cola[inicio];
            if(inicio == fin){
                inicio = -1;
                fin = -1;
            }else{
                inicio++;
            }
        }else{
            System.out.println("Desbordamiento");
        }
        return dato;
    }
    
    /**
     * Se crea objeto que se regresara, si el inicio es 
     * diferente de -1 (ya hay datos), el dato se iguala 
     * al elemento en cola en la posicion de inicio (el primero),
     * si no (la cola esta vacia), se muestra mensaje.
     * Se regresa el dato
     * @return 
     */
    public T verPrimero(){
        T dato = null;
        if(inicio != -1){
            dato = cola[inicio];
        }else{
            System.out.println("Cola vacia");
            
        }
        return dato;
    }
    
    /**
     * Método para verificar si la cola esta vacia
     * @return true si la cola esta vacia
     */
    public boolean estaVacia(){
        if(inicio == -1)
            return true;
        else
            return false;
    }
    
    /**
     * Método para verificar si la cola esta llena
     * @return true si la cola esta llena
     */
    public boolean estaLlena(){
        if(fin == cola.length - 1)
            return true;
        else
            return false;
    }

    /**
     * Método para obtener una cadena con los datos de la cola
     * @return una cadena con los atributos de la cola
     */
    @Override
    public String toString() {
        return "Cola{" + "cola=" + cola.toString() + '}';
    }
    
    /**
     * Método para obtener la información de un cliente en la cola, mediante
     * la busqueda de su numero ID
     * @param numeroId
     * @return una cadena con la información del cliente
     */
    public String consultaId(int numeroId) {
        Cliente cliente = null;
        for (int i = inicio; i < fin + 1; i++) {
            if (cola[i] != null) {
                cliente = (Cliente) cola[i];
                if (numeroId == cliente.getNumeroId()) {
                    return cliente.toString();
                }
            }
        }
        return "El número de ID no se encontro en el registro";
    }

    /**
     * Método para obtener la informacion de un cliente en la cola, mediante
     * la busqueda de su nombre
     * @param nombre
     * @return una cadena con la información del cliente
     */
    public String consultaNombre(String nombre) {
        Cliente cliente = null;
        for (int i = inicio; i < fin + 1; i++) {
            if (cola[i] != null) {
                cliente = (Cliente) cola[i];
                if (nombre.matches(cliente.getNombre())) {
                    return cliente.toString();
                }
            }
        }
        return "El nombre de cliente no se encontro en el registro";
    }
    
    /**
     * Método para obtener una cadena con la informacion de todos los clientes
     * en la cola
     * @return una cadena con la informacion de cada uno de los clientes
     */
    public String consultaGeneral() {
        String consulta = "";
        Cliente cliente = null;
        for (int i = inicio; i < fin + 1; i++) {
            if (cola[i] != null) {
                cliente = (Cliente) cola[i];
                consulta += cliente.toString() + "\n";
            }  
        }
        return consulta;
    }
    
    /**
     * Método para asignar la fecha de envio al cliente que sera
     * atendido
     * @param fecha la fecha que se asignará
     */
    public void setFechaDeEnvio(String fecha){
        Cliente conFechaEnvio = (Cliente)cola[inicio];
        conFechaEnvio.setFechaDeEnvio(fecha);
        cola[inicio] = (T) conFechaEnvio;
    }
    
    /**
     * Método para verificar que un cliente sea el primero en la cola
     * @param numeroId
     * @return true si el cliente si es el primero
     */
    public boolean esElPrimero(int numeroId) {
        Cliente cliente;
        cliente = (Cliente)cola[inicio];
        return numeroId == cliente.getNumeroId();
    }
    
}
