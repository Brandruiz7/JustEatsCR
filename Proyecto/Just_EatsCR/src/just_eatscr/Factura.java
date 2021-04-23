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

    /** 
     * Este es el método que se encarga del cálculo del Impuesto del IVA
     * tomando en cuenta el Sub Total de la cuenta.
     * @param Saldo         Se refiere al total en saldo bruto de la compra
     * @return Sub_Total    Devuelve el saldo junto con el impuesto del IVA
     */
    
    public static double Calculo_IVA (double Saldo)
    {
        double IVA=0.13;
        double Sub_Total;
        
        Sub_Total=Saldo*IVA;
        
        return Sub_Total;
    }

    /** 
     * Este es el método que se encarga del cálculo Total de la cuenta
     * @param Total_IVA     Se refiere al saldo anterior junto con el IVA
     * @param Saldo         Se refiere a el saldo bruto de la compra
     * @return Total        Devuelve el saldo total de la compra.
     */
    
    public static double Total (double Total_IVA, double Saldo)
    {
        double Total;
        
        Total=Total_IVA+Saldo;
        
        return Total;
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
                                         +"\nDicho costo de servicio es de:\n"
                                         +"\nSub Total: "
                                         +"\nEl agregado del IVA: "
                                         +"\nEl Saldo Final es de: ");     
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
