/*
 * Repartidor
 *
 * @version 1.02
 *
 * Fecha 01-04-2021
 *
 * Copyright (c) "Preguntar a la profe"
 */
package just_eatscr;

/**
 * Esta es la clase Repartidor, cada cliente que solicite el servicio se
 * le asignará un repartidor que se ajuste a sus necesidades, tamaño y 
 * cantidad según sea el pedido del usuario.
 *   
 * @author     Brandon Ruiz, Kervin Ruiz, Christopher Hernandez  
 * @version    1.02    01 de abril 2021
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
