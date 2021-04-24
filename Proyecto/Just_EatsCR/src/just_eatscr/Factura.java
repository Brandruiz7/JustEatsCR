/*
 * Factura
 *
 * @version 1.02
 *
 * Fecha 01-04-2021
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
 * @author     Brandon Ruiz, Kervin Ruiz, Christopher Hernandez
 * @version    1.02    01 de abril 2021
 * 
 */
public class Factura 
{
    /** 
     * En esta clase vamos a usar las variables para calcular la factura,
     * también al menos un método que nos ayude con la impresión de la factura 
     */
    
    private String Codigo_Factura = "";
    private double Sub_Total=0;
    private double Total=0;
    public String Decisión="";
    public double Saldo=0;

    /** 
     * Este es constructor se encargará de traer lo que el cliente decidió comprar
     * @param Decisión      Este parámetro almacenará la elección.
     * @param Saldo         Este parámetro almacenará el precio final.
     */    
    
    public Factura (String Decisión, double Saldo)
    {
        this.Decisión=Decisión; //Compañeros acá podemos guardar el nombre del combo que escogió el cliente
        this.Saldo=Saldo; // Y acá el precio
    }      
    
    /** 
     * Este es el método que se encarga del cálculo del Impuesto del IVA
     * tomando en cuenta el Sub Total de la cuenta.
     * 
     */ 
    
    public void Calculo_IVA ()
    {
        double IVA=0.13;
    
        Sub_Total=Saldo*IVA;
        
    }

    /** 
     * Este es el método que se encarga del cálculo Total de la cuenta
     *
     */
    
    public void Total ()
    {
        Total=Saldo+Sub_Total;
        
    }

    /** 
     * Este método se encargaría de hacer un resumen de la transacción,
     * acá nos muestra desde el nombre de la APP, la orden, placa y el costo
     * desglosado, entiéndase como el Sub Total, Calculo del IVA y el saldo final.
     */
    
    public void Factura ()
    {
        JOptionPane.showMessageDialog(null, "         Just Eats               "
                                         +"\nGracias por usar nuestro servicio"
                                         +"\nEl desglose es el siguiente"
                                         +"\nEl pedido realizado fue:\n"
                                         +Decisión
                                         +"\nDicho costo de servicio es de:\n"
                                         +"\nSub Total: "+Saldo
                                         +"\nEl agregado del IVA: "+Sub_Total
                                         +"\nEl Saldo Final es de: "+Total);     
    }
    
    public String getCodigo_Factura() 
    {
        return Codigo_Factura;
    } 
    
    public void setCodigo_Factura(String Codigo_Factura) 
    {
        this.Codigo_Factura = Codigo_Factura;
    }


    public double getSub_Total() 
    {
        return Sub_Total;
    }

    public void setSub_Total(double Sub_Total) 
    {
        this.Sub_Total = Sub_Total;
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
