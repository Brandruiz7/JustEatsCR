/*
 * Promociones
 *
 * @version 1.03
 *
 * Fecha 06-04-2021
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
 * @author      Brandon Ruiz, Kervin Ruiz, Christopher Hernández
 * @version     1.03    6 Abril 2021
 * @see         Class
 * @see         Factura
 * 
*/
public class Promociones 
{ 
    public double Compra=0;

    /**
     * Este sería el constructor que nos permite traer datos de la clase Producto.
     */
    
   public Promociones (double Compra)
    {
        this.Compra=Compra;
        
    } 
    
 
    /**
     * En este método 
     * se le aplicará un descuento de 15% al cliente, si la compra que ha realizado es mayor 
     * a ¢10.000 
     * @param Saldo         Este parámetro trae información de otra clase ya creada para 
     *                      manipular el método de descuentos.
     */
    
 public void Descuentos(double Saldo)
 {
     
    Compra = Saldo;

  if(Compra > 10000)
  {    
    Compra -=(Compra*0.15); 
    JOptionPane.showMessageDialog(null," Felicidades ha ganado un descuento, su nuevo saldo es: ¢"+ Compra);      
  }  
        Factura PasoFinal = new Factura (Compra);          
        PasoFinal.Cálculo();
        PasoFinal.Factura();
        
 }

}
