/*
 * Repartidor
 *
 * @version 1.04
 *
 * Fecha 06-04-2021
 *
 * Copyright (c) "Preguntar a la profe"
 */
package just_eatscr;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Esta es la clase Repartidor, cada cliente que solicite el servicio se
 * le asignará un repartidor que se ajuste a sus necesidades, tamaño y 
 * cantidad según sea el pedido del usuario.
 *   
 * @author      Brandon Ruiz, Kervin Ruiz, Christopher Hernandez  
 * @version     1.04    06 de abril 2021
 * 
*/
public class Repartidor 
{
    /** 
     * En esta clase vamos a usar algunas variables para poder identificar,
     * los principales datos del repartidor de comida.
     * 
     */
        
    private String ID_Repartidor = "";
    private String Nombre = ""; 
    public int NúmeroRandom=0;
    
    Repartidor Repartidores_APP [] = new Repartidor[9];
    
    /**
     * Este sería el constructor vacío de esta clase.
     */ 
    
    public Repartidor ()
    {
        
    }
    
    /**
     * Este sería el constructor que nos permite tener acceso al orden del arreglo.
     * @param Placa         Acá se guardan las placas de cada conductor registrado.
     * @param Nombre        Acá se guarda el nombre del conductor.
     */ 
    
    public Repartidor (String Placa, String Nombre)
    {
        this.ID_Repartidor=Placa;
        this.Nombre=Nombre;
    
    }    

    /**
     * En este método se van a guardar los datos del arreglo creado anteriormente.
     */ 
    
    public void Lista_Repartidores_Registrados ()
    {
       Repartidores_APP [0]= new Repartidor("UB3R21", "Fiorella");
       Repartidores_APP [1]= new Repartidor("A6WR39", "Daniel");
       Repartidores_APP [2]= new Repartidor("S28HC0", "Marcos");
       Repartidores_APP [3]= new Repartidor("J4FV89", "Kevin");
       Repartidores_APP [4]= new Repartidor("NVC432", "Fénix");
       Repartidores_APP [5]= new Repartidor("O7HR32", "Lucía");
       Repartidores_APP [6]= new Repartidor("I39H1S", "Tatiana");
       Repartidores_APP [7]= new Repartidor("B8GF32", "Harry");       
       Repartidores_APP [8]= new Repartidor("JHG345", "Keytlin");       
       Repartidores_APP [9]= new Repartidor("GN32V1", "Bryan");       
       
    }
    
    /**
     * Chicos mi idea era que el cliente no tenga que elegir el conductor sino que se elija uno random,
     * pero la verdad no sé como hacerle...
     */ 
    
    public void Elegir_Random ()
    {
        NúmeroRandom= (int)(Math.random()*(Repartidores_APP.length));     //Acá elige un número random entre 0 y el total de entradas en el arreglo   
            JOptionPane.showMessageDialog(null, "Se le ha asignado un repartidor\n"
                                               +Repartidores_APP[NúmeroRandom]);
    }
   
    public String getID_Repartidor() 
    {
        return ID_Repartidor;
    }

    public void setID_Repartidor(String ID_Repartidor) 
    {
        this.ID_Repartidor = ID_Repartidor;
    }

    public String getNombre() 
    {
        return Nombre;
    }

    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

}
