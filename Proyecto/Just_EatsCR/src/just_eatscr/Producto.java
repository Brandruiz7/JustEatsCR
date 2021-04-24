/*
 * Producto
 *
 * @version 1.04
 *
 * Fecha 03-04-2021
 *
 * Copyright (c) "Preguntar a la profe"
 */
package just_eatscr;

import javax.swing.JOptionPane;

/**
 * Esta es la clase Producto, podemos encontrar el tipo de producto elegido 
 * así como la cantidad, tamaño y el precio según sea el caso.
 *   
 * @author     Brandon Ruiz, Kervin Ruiz, Christopher Hernandez
 * @version    1.03    04 de abril 2021
 * 
*/
public class Producto 
{
    public String Codigo= "";
    public String Tipo= "";
    public String Tamaño="";
    public double Precio=0; 
    public int Elección;
    
    Producto Menú_Pizza[] = new Producto[12]; 
    Producto Menú_TacoBell[] = new Producto[10];
    Producto Menú_BurguerKing[] = new Producto[10];
    Producto Menú_Pops[] = new Producto[10];
    /** 
     * Este es constructor se encargará de traer lo que el cliente decidió comprar
     * @param Código        Este parámetro almacenará el número de combo.
     * @param Tipo          Este parámetro almacenará la descripción o tipo de producto.
     * @param Tamaño        Este parámetro almacenará el tamaño del combo.      
     * @param Precio        Este almacenará el precio.
     */    
    
    public Producto() {
        
    }
            
    public Producto (String Código, String Tipo, String Tamaño, double Precio)
    {
        this.Codigo=Código;
        this.Tipo=Tipo;
        this.Tamaño=Tamaño;
        this.Precio=Precio;
    }

    /** 
     * Este es el método que se encarga de almacenar el menú de el Restaurante Pizza Hut, con el número de combo,
     * descripción, tamaño y precio.
     * 
     */
    
    public void Menú_Pizza_Hut () {
        /*JOptionPane.showMessageDialog(null, "Pizza Hut Menu" 
                + "\nCombo 1 -- Pizza de Pepperoni Lovers + Pepsi 2L -- Mediana -- Precio 9950"
                + "\nCombo 2 -- Pizza Suprema + Pepsi 2L -- Mediana -- Precio 9950"
                + "\nCombo 3 -- Pizza Jamón y Hongos + Pepsi 2L -- Mediana -- Precio 9950"
                + "\nCombo 4 -- Pizza Chesse Lovers + Pepsi 1.6 0hz -- Personal -- Precio 2500"
                + "\nCombo 5 -- Pizza Hawaiana + Pepsi 2L -- Grande -- Precio 11950"
                + "\nCombo 6 -- Pizza Súper Suprema + Pepsi 2L -- Grande -- Precio 11950"
                + "\nCombo 7 -- Pizza de Pepperoni Lovers + Pepsi 2L -- Grande -- Precio 11950"
                + "\nCombo 8 -- Pizza Suprem+ Pepsi 1.6 0hz -- Personal -- Precio 2500"
                + "\nCombo 9 -- Pizza Jamón y Hongos + Pepsi 1.6 0hz -- Personal -- Precio 2250"
                + "\nCombo 10 -- Pizza Chesse Lovers + Pepsi 2L -- Mediana -- Precio 9950"
                + "\nCombo 11 -- Pizza Hawaiana + Pepsi 2L -- Mediana -- Precio 9950"
                + "\nCombo 12 -- Pizza Súper Suprema + Pepsi 2L -- Mediana -- Precio 9950");
        */
        
        Menú_Pizza[0] = new Producto("Combo 1","Pizza de Pepperoni Lovers + Pepsi 2L", "Mediana", 9950); 
        Menú_Pizza[1] = new Producto("Combo 2","Pizza Suprema + Pepsi 2L", "Mediana", 9950);         
        Menú_Pizza[2] = new Producto("Combo 3","Pizza Jamón y Hongos + Pepsi 2L", "Mediana", 9950);        
        Menú_Pizza[3] = new Producto("Combo 4","Pizza Chesse Lovers + Pepsi 1.6 0hz", "Personal", 2500);        
        Menú_Pizza[4] = new Producto("Combo 5","Pizza Hawaiana + Pepsi 2L", "Grande", 11950);        
        Menú_Pizza[5] = new Producto("Combo 6","Pizza Súper Suprema + Pepsi 2L", "Grande", 11950);        
        Menú_Pizza[6] = new Producto("Combo 7","Pizza de Pepperoni Lovers + Pepsi 2L", "Grande", 11950); 
        Menú_Pizza[7] = new Producto("Combo 8","Pizza Suprema + Pepsi 1.6 0hz", "Personal", 2500);         
        Menú_Pizza[8] = new Producto("Combo 9","Pizza Jamón y Hongos + Pepsi 1.6 0hz", "Personal", 2250);        
        Menú_Pizza[9] = new Producto("Combo 10","Pizza Chesse Lovers + Pepsi 2L", "Mediana", 9950);        
        Menú_Pizza[10] = new Producto("Combo 11","Pizza Hawaiana + Pepsi 2L", "Mediana", 9950);        
        Menú_Pizza[11] = new Producto("Combo 12","Pizza Súper Suprema + Pepsi 2L", "Mediana", 9950); 
        
        int Opcion;
        
        Opcion = Integer.parseInt(JOptionPane.showInputDialog("Pizza Hut Menu"
                            + "\nCombo 1 -- Pizza de Pepperoni Lovers + Pepsi 2L -- Mediana -- Precio ¢9950"
                            + "\nCombo 2 -- Pizza Suprema + Pepsi 2L -- Mediana -- Precio ¢9950"
                            + "\nCombo 3 -- Pizza Jamón y Hongos + Pepsi 2L -- Mediana -- Precio ¢9950"
                            + "\nCombo 4 -- Pizza Chesse Lovers + Pepsi 1.6 0hz -- Personal -- Precio ¢2500"
                            + "\nCombo 5 -- Pizza Hawaiana + Pepsi 2L -- Grande -- Precio ¢11950\""
                            + "\nDigite Numero de combo:"));
        
        JOptionPane.showMessageDialog(null, "Tu combo es: \n" + Menú_Pizza[(Opcion-1)].Codigo
                                     + "\nPrecio a cancelar: " + Menú_Pizza[(Opcion-1)].Precio);
        
        
    }
 
    /** 
     * Este es el método que se encarga de almacenar el menú de el Restaurante Taco Bell, con el número de combo,
     * descripción, tamaño y precio.
     * 
     */
      
    public void Menú_Taco_Bell ()
    {      
        Menú_TacoBell[0] = new Producto("Combo 1","3 Tacos, papas y bebida 21 Oz", "Regular", 3450); 
        Menú_TacoBell[1] = new Producto("Combo 2","Burrito Supreme, Taco Supreme, papas y bebida 21 Oz", "Regular", 3950);         
        Menú_TacoBell[2] = new Producto("Combo 3","Crunchy Wrap Supreme, papas y bebida 21 Oz", "Regular", 3950);        
        Menú_TacoBell[3] = new Producto("Combo 4","Bacon Cheddar Burrito, Taco Supreme, Papas y bebida 21 Oz", "Regular", 3950);        
        Menú_TacoBell[4] = new Producto("Combo 5","Xtra Big Burrito, papas y bebida 21 Oz", "Regular", 3950);        
        Menú_TacoBell[5] = new Producto("Combo 6","Crispy Chicken Bacon Chalupa, papas y bebida 21 Oz", "Regular", 3950);        
        Menú_TacoBell[6] = new Producto("Combo 7","Crispy Chicken Sliders, papas y bebida 21 Oz", "Regular", 4850); 
        Menú_TacoBell[7] = new Producto("Combo 8","Xtreme Chickern Crunchy Wrap, papas y bebida 21 Oz", "Regular", 4850);        
        Menú_TacoBell[8] = new Producto("Combo 9","Triple Steak Burrito, papas y bebida 21 Oz", "Regular", 4850);        
        Menú_TacoBell[9] = new Producto("Combo 10","Steak Quesadilla, papas y bebida 21 Oz", "Regular", 4850);
        
        int Opcion;
        
        Opcion = Integer.parseInt(JOptionPane.showInputDialog("Taco Bell Menu"
                            + "\nCombo 1 -- 3 Tacos, papas y bebida 21 Oz -- Regular -- Precio ¢3450"
                            + "\nCombo 2 -- Burrito Supreme, Taco Supreme, papas y bebida 21 Oz -- Regular -- Precio ¢3950"
                            + "\nCombo 3 -- Crunchy Wrap Supreme, papas y bebida 21 Oz -- Regular -- Precio ¢3950"
                            + "\nCombo 4 -- Bacon Cheddar Burrito, Taco Supreme, Papas y bebida 21 Oz -- Regular -- Precio ¢3950"
                            + "\nCombo 5 -- Xtra Big Burrito, papas y bebida 21 Oz -- Regular -- Precio ¢3950"
                            + "\nDigite Numero de combo:"));
        
        JOptionPane.showMessageDialog(null, "Tu combo es: " + Menú_TacoBell[(Opcion-1)].Codigo
                                     + "\nPrecio a cancelar: " + Menú_TacoBell[(Opcion-1)].Precio);
    }

    /** 
     * Este es el método que se encarga de almacenar el menú de el Restaurante Burguer King, con el número de combo,
     * descripción, tamaño y precio.
     * 
     */
   
    public void Menú_Burguer_King ()
    {      
        Menú_BurguerKing[0] = new Producto("Combo 1"," Crispy Chicken, papas regulares y Pepsi 1/2 L", "Regular", 5200); 
        Menú_BurguerKing[1] = new Producto("Combo 2","Spicy Crispy Chiken, papas regulares y Pepsi 1/2 L", "Regular", 5200);         
        Menú_BurguerKing[2] = new Producto("Combo 3","King de Pollo,papas regulares y Pepsi 1/2 L", "Regular", 4700);        
        Menú_BurguerKing[3] = new Producto("Combo 4","Tender Grill, papas regulares y Pepsi 1/2 L", "Regular", 5500);        
        Menú_BurguerKing[4] = new Producto("Combo 5","Tender Grill Tejano,papas regulares y Pepsi 1/2 L", "Regular", 5950);        
        Menú_BurguerKing[5] = new Producto("Combo 6","Chicken Wrap, papas regulares y Pepsi 1/2 L", "Regular", 5650);        
        Menú_BurguerKing[6] = new Producto("Combo 7","Whopper Triple, papas regulares y Pepsi 1/2 L", "Regular", 7750); 
        Menú_BurguerKing[7] = new Producto("Combo 8","Chiken Nuggets 10 piezas, papas regulares y Pepsi 1/2 L", "Regular", 4700);        
        Menú_BurguerKing[8] = new Producto("Combo 9","Whopper Clásico, papas regulares y Pepsi 1/2 L", "Regular", 4950);        
        Menú_BurguerKing[9] = new Producto("Combo 10","Whopper Tejano, papas regulares y Pepsi 1/2 L", "Regular", 5800);            
    
    
     int Opcion;
        
        Opcion = Integer.parseInt(JOptionPane.showInputDialog("Burguer King Menu"
                            + "\nCombo 1 -- Crispy Chicken-- papas regulares y Pepsi 1/2 L-- Regular-- ¢5200 "
                            + "\nCombo 2 -- Spicy Crispy Chiken-- papas regulares y Pepsi 1/2 L-- Regular-- ¢5200"
                            + "\nCombo 3 -- King de Pollo-- papas regulares y Pepsi 1/2 L-- Regular-- ¢4700"
                            + "\nCombo 4 -- Tender Grill-- papas regulares y Pepsi 1/2 L-- Regular-- ¢5500"
                            + "\nCombo 5 -- Tender Grill Tejano-- papas regulares y Pepsi 1/2 L-- Regular-- ¢5950"
                            + "\nDigite Numero de combo:"));
        
        JOptionPane.showMessageDialog(null, "Tu combo es: " + Menú_BurguerKing[(Opcion-1)].Codigo
                                     + "\nPrecio a cancelar: " + Menú_BurguerKing[(Opcion-1)].Precio);
    
    
    }    

    /** 
     * Este es el método que se encarga de almacenar el menú de la Heladería Pops, con el número de combo,
     * descripción, tamaño y precio.
     * 
     */
   
    public void Menú_Pops ()
    {      
        Menú_Pops[0] = new Producto("Opción 1","Milk Shake Clásica", "Regular", 2400); 
        Menú_Pops[1] = new Producto("Opción 2","Banana Split Cup Clásica", "Regular", 2350);         
        Menú_Pops[2] = new Producto("Opción 3","Sundae Clásico", "Regular", 2100);        
        Menú_Pops[3] = new Producto("Opción 4","Churchill Shake", "Regular", 2350);        
        Menú_Pops[4] = new Producto("Opción 5","Jelly Pops", "Regular", 1900);        
        Menú_Pops[5] = new Producto("Opción 6","Milk Shake Deluxe", "Regular", 2600);        
        Menú_Pops[6] = new Producto("Opción 7","Frozen Cappuccino", "Regular", 2350); 
        Menú_Pops[7] = new Producto("Opción 8","Piña Colada", "Regular", 2350);        
        Menú_Pops[8] = new Producto("Opción 9","Mint Cappuccino", "Regular", 2350);        
        Menú_Pops[9] = new Producto("Opción 10","Happy Sundae Clasico", "Regular", 2300);            
    
    
     int Opcion;
        
        Opcion = Integer.parseInt(JOptionPane.showInputDialog("Pops Menu"
                            + "\nCombo 1 --Milk Shake Clásica--Regular-- ¢2400 "
                            + "\nCombo 2 --Banana Split Cup Clásica--Regular-- ¢2350 "
                            + "\nCombo 3 --Sundae Clásico--Regular--¢2100 "
                            + "\nCombo 4 --Churchill Shake--Regular-- ¢2350"
                            + "\nCombo 5 --Jelly Pops--Regular-- ¢1900 "
                            + "\nDigite Numero de combo:"));
        
        JOptionPane.showMessageDialog(null, "Tu combo es: " + Menú_Pops[(Opcion-1)].Codigo
                                     + "\nPrecio a cancelar: " + Menú_Pops[(Opcion-1)].Precio);
    }    

    
}
