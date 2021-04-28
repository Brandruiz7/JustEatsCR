/*
 * @(#)Just_EatsCR.java
 *
 * @version 1.10
 *
 * Fecha 28/04/2021
 *
 * Copyright (c) 
 */
package just_eatscr;

import javax.swing.JOptionPane;

/**
 * Esta es la sección principal, desde acá vamos a realizar las llamadas
 * de las clases que se vayan creando para el desarrollo del
 * proyecto. Encontrará un menú de elección, donde el cliente puede 
 * seleccionar el restaurante que desea, responder a la información
 * que se le solicita y finalizar con el pedido del restaurante elegido 
 *        
 * @version     1.10    28 Apr 2021 
 * @author      Brandon Ruiz, Kervin Ruiz, Christopher Hernandez     
 * @see         Class
 * @see         Class#Cliente
 * @see         Class#Restaurantes
 * @see         Class#Repartidor
 * @see         Class#Producto
 * @see         Class#Factura
 * @see         Class#Promociones
 * 
 */

public class Just_EatsCR 
{

    /**
     * Para poder ejecutar el programa, se necesita una serie de variables,
     * cuya función se detallará en este apartado.
     * 
     * @param args
     */
      
    public static void main(String[] args) 
            
    {
       Just_EatsCR a = new Just_EatsCR();
       
       a.inicioSesion();
      
    }

    /** 
     * Este método se encargaría de el menú desplegable que tendrá el cliente cuando acceda 
     * a la aplicación, desde acá se incluirán otras clases, para poder ser llamadas desde el Main.
     * 
     */    
    
    public void Elección_Restaurante () {
        Producto ClassProducto = new Producto();
        Repartidor ClassElegirRepartidor = new Repartidor ();
        Restaurantes ClassRestaurante = new Restaurantes();
        Factura ClassFactura;
        Promociones ClassPromo = new Promociones();
        
        String Elección="";
        boolean Verificar = false;
        do {
            Elección = JOptionPane.showInputDialog
                                ("Por favor, elija el restaurante de su preferecia:"
                                + "\n1. Pizza Hut."
                                + "\n2. Taco Bell."
                                + "\n3. Pops."
                                + "\n4. Burguer King.\n"
                                + "\nOpciones del pedido:"
                                + "\n5. Revisar pedido"
                                + "\n6. Pagar pedido"
                                + "\n7. Contacto restaurantes"
                                + "\n0. 0 para ir Atras y borrar pedido"
                                + "\n"
                                + ""
                                + ""
                                + "\nNota: Solo se permiten 4 pedidos a la vez");
            switch(Elección) {
                case "1":
                    ClassProducto.Menú_Pizza_Hut();
                    break;
                case "2":
                    ClassProducto.Menú_Taco_Bell();
                    break;
                case "3":
                    ClassProducto.Menú_Pops();
                    break;
                case "4":
                    ClassProducto.Menú_Burguer_King();
                    break;
                case "5":
                    ClassProducto.mostrarPedido();
                    break;
                case "6":
                    ClassFactura = new Factura(ClassPromo.Descuentos(ClassProducto.Suma()));
                    ClassFactura.metodoPago();
                    ClassFactura.Cálculo();
                    ClassFactura.Facturacion();
                    ClassElegirRepartidor.Lista_Repartidores_Registrados();
                    Verificar = true;
                    break;
                case "7":
                    ClassRestaurante.infoRestaurantes();
                    break;
                default:
                    break;                    
            }
        }while((!Elección.equals("0")) && (Verificar == false));
        
    }
        
    /** 
     * Este método se encargaría del inicio desplegable de la aplicación, 
     * desde acá el usuario iniciará sesión o se registrara.
     * 
     */
    
    public void inicioSesion(){
        //Realizamos las instancias de las clases necesarias.
        Cliente ClassCliente = new Cliente();           
                
        String Opcion="";
        
        do{
            Opcion = JOptionPane.showInputDialog("                Just Eats                "
                                                           +"\nGracias por usar nuestro servicio, bienvenido"
                                                           +"\n1. Iniciar sesión." 
                                                           +"\n2. Registrarse." 
                                                           +"\n0. 0 Salir de la App");
            switch(Opcion){
                case "1":
                    if(ClassCliente.iniciarSesion() == true) {
                        ClassCliente.realizarAccion();
                    }
                    break;
                case "2":
                    ClassCliente.registrarDatos();
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Gracias por preferirnos");
                    break;
                default:
                    break;
            }
            
            
        } while(!Opcion.equals("0"));
    }


}
