/*
 * Factura
 *
 * @version 1.04
 *
 * Fecha 06-04-2021
 *
 * Copyright (c) "Preguntar a la profe"
 */
package just_eatscr;

import javax.swing.JOptionPane;

/**
 * Esta es la clase Factura, en este apartado estará el detalle de los 
 * costos totales del servicio, calculo  del Sub total, cobro del Impuesto
 * de Valor Agregado (I.V.A) y el total final.
 *   
 * @author      Brandon Ruiz, Kervin Ruiz, Christopher Hernandez
 * @version     1.04    06 de abril 2021
 * 
 */
public class Factura 
{
    /** 
     * En esta clase vamos a usar las variables para calcular la factura,
     * también al menos un método que nos ayude con la impresión de la factura 
     */
    
    private String Codigo_Factura = "";
    private double Total=0;
    public String Decisión="";
    public double Saldo=0;
    public double IVA=0.13;
    public double CálculoIVA=0;

    /**
     * Este sería el constructor vacío de esta clase.
     */
    
    public Factura ()
    {
        
    }
    
    /** 
     * Este es constructor se encargará de traer lo que el cliente decidió comprar
     * @param Saldo         Este parámetro almacenará el precio final.
     */    
    
    public Factura (double Saldo)
    {
        this.Saldo=Saldo; // Y acá el precio
    }      

    /**
     * Este sería el constructor vacío de esta clase.
     */
    
    public void Cálculo ()
    {      
        CálculoIVA=Saldo*IVA;
        Total=Saldo+CálculoIVA;
        
    }
    
    /**
     * En este método, se imprime los datos totales como el sub total, el costo de Iva y el total.
     */
    
    public void Factura ()
    {
        Cálculo();
        
        JOptionPane.showMessageDialog(null, "            Just Eats CR              "
                                         +"\nResumen del pedido:"
                                         +"\nTotal:"+Saldo
                                         +"\nImpuesto del Valor Agregado (IVA)"+CálculoIVA
                                         +"\nEl total de compra realizada es: "+Total
                                         +"\nEl pedido solicitado llegará en breve."
                                         +"\n          Gracias por preferirnos");
    }
     
    
    
    public String getCodigo_Factura() 
    {
        return Codigo_Factura;
    } 
    
    public void setCodigo_Factura(String Codigo_Factura) 
    {
        this.Codigo_Factura = Codigo_Factura;
    }

    public double getTotal() 
    {
            
        return Total;
    }

    public void setTotal(double Total) 
    {
        this.Total = Total;
    }
}
