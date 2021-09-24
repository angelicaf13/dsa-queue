/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labalgoritmos4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Angelica Figueroa Muñiz 
 * Marzo 06, 2018.
 * Este programa trabaja como un sistema de ventas, en el cual se
 * pueden hacer diferentes operaciones las cuales son: registros
 * de clientes, envio de pedido y diferentes tipos de consultas.
 * En esta clase se utilizan las colas para almacenar los clientes
 * registrados asi como los clientes atendidos.
 */
public class LabAlgoritmos4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola <Cliente> clientes = new Cola<>();
        Cola <Cliente> atendidos = new Cola<>();
        Scanner lector = new Scanner(System.in);
        Scanner sublector = new Scanner(System.in);
        String opcion, opcionConsulta;
        String nombre, numeroTel, email;
        String calle, numeroD, ciudad, codigoPostal, estado, pais;
        int numeroId = 0;
        String noTarjeta, fechaTarjeta, insTarjeta;
        String cantidadImpresoras;
        String nombreB = null;
        int idAtendido;
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-yyyy");
        Date now = new Date();
        String fechaEnvio = sdfDate.format(now);

        do {//se muestra el menú de opciones al usuario
            System.out.println("==== Sistema de ventas de impresoras 4D ====");
            System.out.println("1.Registro de clientes    2.Envio de pedido"
                    + "\n3.Consultas               4.Salir");
            System.out.println("Ingrese una opción: ");//se pide que ingrese una opción
            opcion = lector.nextLine();//se lee el valor y se asigna a la variable "opcion"
            switch (opcion) {//se crea un switch para las opciones
                case "1"://registro
                    System.out.println("=========== Registro de clientes ===========");
                    if(clientes.estaLlena()){//en caso de que la cola este llena
                        System.out.println("Los pedidos se han agotado");
                    }else{//si la cola tiene espacio, se pide la informacion del cliente
                    System.out.println("Ingrese la siguiente informarción: ");
                    System.out.print("Nombre: ");
                    nombre = sublector.nextLine();
                    System.out.print("Calle: ");
                    calle = sublector.nextLine();
                    System.out.print("Número: ");
                    numeroD = sublector.nextLine();
                    System.out.print("Ciudad: ");
                    ciudad = sublector.nextLine();
                    System.out.print("Codigo postal: ");
                    codigoPostal = sublector.nextLine();
                    System.out.print("Estado: ");
                    estado = sublector.nextLine();
                    System.out.print("País: ");
                    pais = sublector.nextLine();
                    //se crea un objeto de tipo Direccion
                    Direccion direccion = new Direccion(calle, numeroD, ciudad, codigoPostal, estado, pais);
                    System.out.print("No. telefonico: ");
                    numeroTel = sublector.nextLine();
                    System.out.print("E-mail: ");
                    email = sublector.nextLine();
                    System.out.print("No. de tarjeta bancaria: ");
                    noTarjeta = sublector.nextLine();
                    System.out.print("Fecha de vencimiento: ");
                    fechaTarjeta = sublector.nextLine();
                    System.out.print("Institución: ");
                    insTarjeta = sublector.nextLine();
                    System.out.print("Cantidad de impresoras: ");
                    cantidadImpresoras = sublector.nextLine();
                    numeroId++;//se aumenta el contador de clientes
                    TarjetaDeCredito tarjeta = new TarjetaDeCredito(noTarjeta, fechaTarjeta, insTarjeta);//se crea un objeto de tipo TarjetaDeCredito
                    Pedido pedido = new Pedido("Sin fecha asignada", cantidadImpresoras);//se crea un nuevo pedido
                    //se crea un nuevo cliente con los datos obtenidos
                    Cliente cliente = new Cliente(nombre, direccion, numeroTel, email, numeroId, tarjeta, pedido);
                    clientes.insertarDato(cliente);//se agrega el cliente a la cola de clientes
                    System.out.println("--------------------------------------------");
                    }
                    break;
                case "2"://envio
                    if(clientes.estaVacia()){//se verifica que la cola no este vacia
                        System.out.println("--------------------------------------------");
                        System.out.println("Aún no se ha registrado ningun cliente");
                        System.out.println("--------------------------------------------");
                    }else{//si la cola no esta vacia se pide el ID del cliente que se atendera
                    System.out.print("Ingrese el ID del cliente que sera atendido: ");
                    idAtendido = lector.nextInt();
                    lector.nextLine();
                    if(clientes.esElPrimero(idAtendido)){//se verifica que el ID sea del cliente al principio de la cola
                        System.out.println("--- Información del Cliente ---");//si es primero, se muestra la info del cliente
                        System.out.println(clientes.verPrimero().toString());
                        //se pide confirmacion para realizar el cambio de cola
                        System.out.print("Para confirmar el cambio de cola ingrese S, o cualquier letra para cancelar: ");
                        String confirmar = lector.nextLine();
                        confirmar = confirmar.toUpperCase();
                        if(confirmar.matches("S")){
                        //se asigna la fecha del envio
                        clientes.setFechaDeEnvio(fechaEnvio);
                        //se elimina el cliente de la cola de clientes y se inserta en la cola de clientes atendidos
                        atendidos.insertarDato(clientes.eliminarDato());
                            //se avisa que el cambio se realizo de manera correcta
                            System.out.println("--------------------------------------------");
                            System.out.println("El cambio de cola se realizo correctamente");
                            System.out.println("--------------------------------------------");
                        }else{//en caso de cancelar el cambio, se avisa al usuario
                            System.out.println("--------------------------------------------");
                            System.out.println("El cambio de cola ha sido cancelado");
                            System.out.println("--------------------------------------------");
                        }
                    }else{//si el ID no coincide con el del primer cliente en la cola, se muestra mensaje
                        System.out.println("--------------------------------------------");
                        System.out.println("El cliente con el ID: " + idAtendido + " no es el primero en la cola");
                        System.out.println("--------------------------------------------");
                    }
                    }
                    break;
                case "3"://consultas
                    do {//se muestran las opciones de consulta
                        System.out.println("================= Consultas ================");
                        System.out.println("1.Por número ID    2.Por nombre de cliente"
                                + "\n3.General de todos los clientes con pedido"
                                + "\n4.General de todos los clientes atendidos"
                                + "\n5.Volver al menú principal");
                        System.out.println("Ingrese una opción: ");//se pide una opción
                        opcionConsulta = lector.nextLine();
                        System.out.println("--------------------------------------------");
                        switch (opcionConsulta) {//switch para los tipo de consulta
                            case "1"://por ID
                                if(clientes.estaVacia()){//se revisa que la cola no este vacia
                                    System.out.println("No hay ningun cliente en el registro");
                                }else{
                                System.out.print("Ingrese el ID del cliente: ");//se pide el ID del cliente que se desea consultar
                                int id = sublector.nextInt();
                                sublector.nextLine();
                                    System.out.println(clientes.consultaId(id));//se imprime la informacion del cliente
                                    System.out.println("--------------------------------------------");
                                }
                                break;
                            case "2"://por nombre
                                if(clientes.estaVacia()){//se revisa que la cola no este vacia
                                    System.out.println("No hay ningun cliente en el registro");
                                }else{
                                System.out.print("Ingrese el nombre del cliente: ");//se pide el nombre del cliente que se desea consultar
                                nombreB = lector.nextLine();
                                    System.out.println(clientes.consultaNombre(nombreB));//se imprime la informacion del cliente
                                    System.out.println("--------------------------------------------");
                                }
                                break;
                            case "3"://general clientes con pedido
                                if(clientes.estaVacia()){//se revisa que la cola no este vacia
                                    System.out.println("No hay ningun cliente en el registro");
                                }else{
                                System.out.println(clientes.consultaGeneral());//se imprime la informacion de todos los clientes en la cola
                                System.out.println("--------------------------------------------");
                                }
                                break;
                            case "4"://general clientes atendidos
                                if(atendidos.estaVacia()){//se revisa que la cola no este vacia
                                    System.out.println("Ningun cliente ha sido atendido");
                                }else{
                                System.out.println(atendidos.consultaGeneral());//se imprime la informacion de todos los clientes atendidos
                                System.out.println("--------------------------------------------");
                                }
                                break;
                            case "5"://volver al menú principal
                                
                                break;
                            default: System.out.println("Opción invalida");//se muestra mensaje en caso de ingresar una opción invalida
                        }//fin switch de submenú
                    } while (!opcionConsulta.matches("5"));//se repite el ciclo mientras la opción sea diferente de 5
                    break;
                case "4"://salir
                    System.out.println("--------------------------------------------");
                    System.out.println("¡Adios!");//mensaje de despedida
                    System.exit(0);
                    break;
                default: System.out.println("Opción invalida");//se muestra mensaje en caso de ingresar una opción invalida
            }//fin del switch
        } while (!opcion.matches("4"));//se repite el ciclo mientras la opción sea diferente de 4

    }

}
