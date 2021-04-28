/*
 * Factura
 *
 * @version 1.06
 *
 * Fecha 22-04-2021
 *
 * Copyright (c) 
 */
package just_eatscr;

import javax.swing.JOptionPane;

/**
 * Esta es la clase Factura, en este apartado estará el detalle de los 
 * costos totales del servicio, cálculo  del Sub total, cobro del Impuesto
 * de Valor Agregado (I.V.A) y el total final.
 *   
 * @author      Brandon Ruiz, Kervin Ruiz, Christopher Hernandez
 * @version     1.06    22 de abril 2021
 * 
 */
public class Factura 
{
    /** 
     * En esta clase vamos a usar las variables para calcular la factura,
     * también al menos un método que nos ayude con la impresión de la factura 
     */
    
    private int Codigo_Factura[] = new int[10];
    private double Total=0;
    private String Decisión="";
    private double Saldo=0;
    private double IVA=0.13;
    private double CálculoIVA=0;
    private int Contador=0;
    
    Factura Ventas[] = new Factura[10];

    /**
     * Este sería el constructor vacío de esta clase.
     */
    
    public Factura()
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
     * Este es el método encargado de calcular el impuesto de Venta.
     */
    
    public void Cálculo () {      
        CálculoIVA=Saldo*IVA;
        Total=Saldo+CálculoIVA;
    }
    
    /**
     *  En este método, se usará para indicarle al cliente cuál es método de cancelación
     */
    
    public void metodoPago() {
        int Option=0;
        
        do {
            Option = Integer.parseInt(JOptionPane.showInputDialog("Metdo de cancelacion."
                    + "\n1. Tarjeta."
                    + "\n2. Efectivo"));
            
            if (Option == 1) {
                Decisión = ("Tarjeta");
                Option = 0;
            }else if(Option == 2) {
                Decisión = ("Efectivo");
                Option = 0;
            } 
            
        }while(Option!=0);
        
    }
    
    /**
     * En este método, se imprime los datos totales como el sub total, el costo de IVA y el total.
     */
    
    public void Facturacion () {
        
        JOptionPane.showMessageDialog(null, "            Just Eats CR              "
                                         + "\nResumen del pedido:"
                                         + "\nN° Factura: " + Contador
                                         + "\nTotal: ¢"+Saldo
                                         + "\nImpuesto del Valor Agregado (IVA): ¢"+CálculoIVA
                                         + "\nEl total de compra realizada es: ¢"+Total
                                         + "\nPaga con: " +Decisión
                                         + "\nEl pedido solicitado llegará en breve."
                                         + "\n          Gracias por preferirnos"
                                          + "");
        Contador++;
        
    }
    
    /** 
     * Getters y setters necesarios para la clase.
     */
    
    public double getTotal() 
    {
            
        return Total;
    }

    public void setTotal(double Total) 
    {
        this.Total = Total;
    }

    public int[] getCodigo_Factura() {
        return Codigo_Factura;
    }

    public void setCodigo_Factura(int[] Codigo_Factura) {
        this.Codigo_Factura = Codigo_Factura;
    }

    public String getDecisión() {
        return Decisión;
    }

    public void setDecisión(String Decisión) {
        this.Decisión = Decisión;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public double getCálculoIVA() {
        return CálculoIVA;
    }

    public void setCálculoIVA(double CálculoIVA) {
        this.CálculoIVA = CálculoIVA;
    }    
}
