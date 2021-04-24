/*
 * Promociones
 *
 * @version 1.02
 *
 * Fecha 03-04-2021
 *
 * Copyright (c) "Preguntar a la profe"
 */
package just_eatscr;

import javax.swing.JOptionPane;

/**
 * Esta es la clase Promociones, según la cantidad que compre el cliente,
 * se le otorgaría un descuento personalizado. También hay códigos 
 * de descuento, que los compañeros del departamento de Mercadeo se 
 * encargan de distribuir a los clientes frecuentes vía correo.
 *   
 * @author     Brandon Ruiz, Kervin Ruiz, Christopher Hernandez
 * @version    1.01    17 Mar 2021
 *  
*/
public class Promociones 
{
    public String Tipo_Promo = "";
    public double Descuento_Promo; 
    public double Compra;
    
   public Promociones ( String Tipo_Promo, double Descuento_Promo, double Compra)
    {
        this.Tipo_Promo=Tipo_Promo;
        this.Descuento_Promo=Descuento_Promo;
        this.Compra=Compra;
        
    } 
    
 
    /**
     * En este método 
     * se le aplicará un descuento de 15% al cliente, si la compra que ha realizado es mayor 
     * a ¢10.000 
     * 
     */
    
 public void Descuentos()
 {
   double Compra = Double.parseDouble(JOptionPane.showInputDialog("digite el monto a pagar"));

  if(Compra > 10000)
  {
     Compra -=(Compra*0.15); 
  }  
  else
   {
     Compra=Descuento_Promo;
   }
   
  JOptionPane.showMessageDialog(null," El monto a pagar con el descuento aplicado es: "+ Compra);
 }

}
