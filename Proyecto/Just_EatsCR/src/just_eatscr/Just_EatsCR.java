/*
 * @(#)Just_EatsCR.java        1.09  Fecha 22/04/2021
 * 
 * Copyright (c) "Preguntar a la profe"
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
 * @version     1.09    22 Apr 2021 
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
        
        int Elección;
        boolean Verificar = false;
        do {
            Elección=Integer.parseInt(JOptionPane.showInputDialog
                                ("Por favor, elija el restaurante de su preferecia:"
                                + "\n1. Pizza Hut."
                                + "\n2. Taco Bell."
                                + "\n3. Pops."
                                + "\n4. Burguer King."
                                + "\n   Opciones del pedido!"
                                + "\n5. Revisar Pedido"
                                + "\n6. Pagar pedido"
                                + "\n7. Contacto Restaurantes"
                                + "\n0. 0 para ir Atras y borrer pedido"
                                + "\n"
                                + ""
                                + ""
                                + "\n Nota: solo se permiten 4 pedidos a la vez"));
            switch(Elección) {
                case 1:
                    ClassProducto.Menú_Pizza_Hut();
                    break;
                case 2:
                    ClassProducto.Menú_Taco_Bell();
                    break;
                case 3:
                    ClassProducto.Menú_Pops();
                    break;
                case 4:
                    ClassProducto.Menú_Burguer_King();
                    break;
                case 5:
                    ClassProducto.mostrarPedido();
                    break;
                case 6:
                    ClassFactura = new Factura(ClassPromo.Descuentos(ClassProducto.Suma()));
                    ClassFactura.metodoPago();
                    ClassFactura.Cálculo();
                    ClassFactura.Facturacion();
                    ClassElegirRepartidor.Lista_Repartidores_Registrados();
                    Verificar = true;
                    break;
                case 7:
                    ClassRestaurante.restaurantes();
                    break;
                default:
                    
                    break;                    
            }
        }while((Elección!=0) && (Verificar == false));
        
    }
        
    /** 
     * Este método se encargaría de el Inicio desplegable de la Aplicación, 
     * desde acá el usuario iniciará sesion o se registrara.
     * 
     */
    
    public void inicioSesion(){
        //Realizamos las instancias de las clases necesarias.
        Cliente ClassCliente = new Cliente();           
                
        
        int Opcion=0;
        
        do{
            Opcion = Integer.parseInt(JOptionPane.showInputDialog("                Just Eats                "
                                                           +"\nGracias por usar nuestro servicio, Bienvenido"
                                                           +"\n1. Iniciar Sesion." 
                                                           +"\n2. Registrarse." 
                                                           +"\n0. 0 Salir de la App"));
            switch(Opcion){
                case 1:
                    if(ClassCliente.iniciarSesion() == true) {
                        ClassCliente.realizarAccion();
                    }
                    break;
                case 2:
                    ClassCliente.registrarDatos();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Gracias por preferirnos");
                    break;
                default:
                    ClassCliente.Mostrar();
                    break;
            }
            
            
        } while(Opcion!=0);
    }


}
