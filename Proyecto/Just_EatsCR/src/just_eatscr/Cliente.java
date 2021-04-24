/*
 * Cliente
 *
 * @version 1.03
 *
 * Fecha 01-04-2021
 *
 * Copyright (c) "Preguntar a la profe"
 */
package just_eatscr;

import javax.swing.JOptionPane;

/**
 * Esta es la clase Cliente, acá podemos encontrar la información sobre
 * el usuario y datos de inicio de Sesión en la app Just Eats.
 *   
 * @author     Brandon Ruiz, Kervin Ruiz, Christopher Hernandez
 * @version    1.03    01 de Abril 2021
 * 
*/


public class Cliente 
{
    
   /** 
    * En esta clase se usarían las variables para poder identificar al cliente
    * en el inicio de sesión. También para asegurar la dirección donde se hará
    * el pedido, tomando en cuenta el número de celular y el nombre del cliente.
    */
    
    private String ID_Cliente = "";
    private String Nombre = "";
    private String Usuario = "";
    private String Password = "";
    private String Ubicación = "";
    private String Correo = "";
    private String Teléfono = "";
    
    
    public Cliente()
    {
        
    }

   /** 
    * En este contructor se recopilaría información básica del cliente
    * 
    * @param Nombre
    * @param Usuario
    * @param Password
    * @param Ubicación
    * @param Correo
    * @param Teléfono
    * 
    */
    
    public Cliente(String Nombre, String Usuario, String Password, String Ubicación, String Correo, String Teléfono)
    {
        this.Nombre=Nombre;
        this.Usuario=Usuario;
        this.Password=Password;
        this.Ubicación=Ubicación;
        this.Correo=Correo;
        this.Teléfono=Teléfono;
    }
    
    /** 
    * En este metodo que permite al cliente realizar compras de los diferentes
    * productos dentro de la App.
    * 
    * 
    */
    
    public void realizarCompra()
    {
        
    }
    
    /** 
    * Este es el metodo que permite al cliente realizar reclamos sobre sus peidos o 
    * productos comprados en la App. Dependiendo del reclamo este se almacenara 
    * de forma textual en una variable String.
    */
    
    public void realizarReclamo() {
        String Recl_Producto = "";
        String Recl_Pedido = "";
        int    Option; 
        
        do {
        Option = Integer.parseInt(JOptionPane.showInputDialog("         Just Eats               "
                                                           +"\nGracias por usar nuestro servicio"
                                                           +"\nPor favor indicar tipo de reclamo"
                                                           +"\n1-Recalmo sobre producto" 
                                                           +"\n2-Reclamo sobre pedido" 
                                                           +"\n3-Atras"));
        switch(Option) {
            case 1:
                Recl_Producto = JOptionPane.showInputDialog("Indique Reclamo de Preducto");
                JOptionPane.showMessageDialog(null, "Su reclamo sera tomado"
                                                  + "\n                     Gracias");
                break;
            case 2:
                Recl_Pedido = JOptionPane.showInputDialog("Indique Reclamo de Pedido");
                JOptionPane.showMessageDialog(null, "Su reclamo sera tomado"
                                                  + "\n                   Gracias");
                break;
            default:
                break;
        }
        } while(Option!=3);
    }
    
    /** 
    * Este es el metodo que permite al cliente realizar sugerencias a productos o bien
    * funciones de la App. Esta informacion se guardara en un variable tipo String.
    */
    
    public void realizarSugerencia() {
        String Sugerencia = "";
        
        Sugerencia = JOptionPane.showInputDialog("Indique cual es su sugerencia");
        JOptionPane.showMessageDialog(null, "Su sugerencia sera tomada en cuenta"
                                          + "\n                    Gracias");
    }
    

    public String getID_Cliente() 
    {
        return ID_Cliente;
    }

    public void setID_Cliente(String ID_Cliente) 
    {
        this.ID_Cliente = ID_Cliente;
    }

    public String getNombre() 
    {
        return Nombre;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }

    public String getUsuario() 
    {
        return Usuario;
    }

    public void setUsuario(String Usuario) 
    {
        this.Usuario = Usuario;
    }

    public String getPassword() 
    {
        return Password;
    }

    public void setPassword(String Password) 
    {
        this.Password = Password;
    }

    public String getUbicación() 
    {
        return Ubicación;
    }

    public void setUbicación(String Ubicación) 
    {
        this.Ubicación = Ubicación;
    }

    public String getCorreo() 
    {
        return Correo;
    }

    public void setCorreo(String Correo) 
    {
        this.Correo = Correo;
    }

    public String getTeléfono() 
    {
        return Teléfono;
    }

    public void setTeléfono(String Teléfono) 
    {
        this.Teléfono = Teléfono;
    }

  
}
