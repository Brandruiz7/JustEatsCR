/*
 * Restaurantes
 *
 * @version 1.04
 *
 * Fecha 28-04-2021
 *
 * Copyright (c) 
 */
package just_eatscr;

import javax.swing.JOptionPane;

/**
 * Esta es la clase Restaurante, se puede encontrar el comercio a elegir,
 * el Menú que ofrece ese Punto de Servicio para el cliente y guarda el
 * pedido en un método.
 *   
 * @author     Brandon Ruiz, Kervin Ruiz, Christopher Hernandez 
 * @version    1.04    28 Apr 2021
 * 
*/
public class Restaurantes 
{
    private String ID_Restaurante = "";
    private String Nombre = "";
    private String Teléfono = "";
    private String Menú = "";
    private String Dirección = "";
    
    /**
     * Este sería el constructor vacío de esta clase.
     */
    
    public Restaurantes() 
    {
        
    }    
     
    /** 
     * Este es constructor se encargará de llenar los datos de los restaurantes
     * @param Código        Este parámetro almacenará el código del restaurante.
     * @param Nombre        Este parámetro almacenará el nombre del restaurante.
     * @param Tele          Este parámetro almacenará el teléfono de contacto de restaurante.      
     * @param Direc         Este parámetro almacenará la dirección del restaurante.
     */    
    
            
    public Restaurantes (String Código, String Nombre, String Tele, String Direc)
    {
        this.ID_Restaurante=Código;
        this.Nombre=Nombre;
        this.Teléfono=Tele;
        this.Dirección=Direc;
    }
    
    /** 
     * Este es el método que se encarga de almacenar la información del Restaurante.
     * 
     */
    
    public void infoRestaurantes() {
        Restaurantes infoRestaurantes[] = new Restaurantes[4];
        
        infoRestaurantes[0] = new  Restaurantes("R-pizza", "Pizza Hut", "22022789", "Zapote");
        infoRestaurantes[1] = new  Restaurantes("R-burger", "Burger King", "22024032", "San José");
        infoRestaurantes[2] = new  Restaurantes("R-taco", "Taco Bell", "22056030", "San José, Catedral");
        infoRestaurantes[3] = new  Restaurantes("R-pops", "Helados Pops", "22066000", "Zapote");
        
        String Option="";
        
        do {
            Option = JOptionPane.showInputDialog("Eliga el restaurante"
                    + "\n1. Pizza Hut"
                    + "\n2. Burger King"
                    + "\n3. Taco Bell"
                    + "\n4. Helados Pops");
            
            switch(Option) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Direccion: " + infoRestaurantes[0].Dirección + "\nTeléfono: " + infoRestaurantes[0].Teléfono);
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Direccion: " + infoRestaurantes[1].Dirección + "\nTeléfono: " + infoRestaurantes[1].Teléfono);
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Direccion: " + infoRestaurantes[2].Dirección + "\nTeléfono: " + infoRestaurantes[2].Teléfono);
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Direccion: " + infoRestaurantes[3].Dirección + "\nTeléfono: " + infoRestaurantes[3].Teléfono);
                    break;
                default:
                    break;
            }
            
        }while(!Option.equals("0"));
    }
    
    /** 
     * Getters y setters necesarios para la clase.
     */

    public String getID_Restaurante() {
        return ID_Restaurante;
    }

    public void setID_Restaurante(String ID_Restaurante) {
        this.ID_Restaurante = ID_Restaurante;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(String Teléfono) {
        this.Teléfono = Teléfono;
    }

    public String getMenú() {
        return Menú;
    }

    public void setMenú(String Menú) {
        this.Menú = Menú;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }
    
}
