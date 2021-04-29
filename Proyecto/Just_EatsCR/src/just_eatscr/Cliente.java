/*
 * Cliente
 *
 * @version 1.09
 *
 * Fecha 29-04-2021
 *
 * Copyright (c) 
 */
package just_eatscr;

import javax.swing.JOptionPane;

/**
 * Esta es la clase Cliente, acá podemos encontrar la información sobre
 * el usuario y datos de inicio de Sesión en la app Just Eats.
 *   
 * @author      Brandon Ruiz, Kervin Ruiz, Christopher Hernandez
 * @version     1.09    29 de Abril 2021
 * 
*/


public class Cliente 
{
    
   /** 
    * En esta clase se usarán las variables para poder identificar al cliente
    * en el inicio de sesión. También para asegurar la dirección donde se hará
    * el pedido, tomando en cuenta el número de celular y el nombre del cliente.
    */
    
    private int ID_Cliente = 0;
    private String Nombre = "";
    private String Usuario = "";
    private String Password = "";
    private String Ubicación = "";
    private String Correo = "";
    private String Teléfono = "";
    private int Contador=1;
    
    Cliente DatosUser[] = new Cliente [3];
    
    /**
     * Este sería el constructor vacío de esta clase.
     */
    
    public Cliente()
    {
        
    }

   /** 
    * En este contructor se recopilaría información básica del cliente
    * 
    * @param Nombre
    * @param Usuario
    * @param Password
    * @param Ubicación
    * @param Correo
    * @param Teléfono
    * 
    */
    
    public Cliente(String Nombre, String Usuario, String Password, String Ubicación, String Correo, String Teléfono)
    {
        this.Nombre=Nombre;
        this.Usuario=Usuario;
        this.Password=Password;
        this.Ubicación=Ubicación;
        this.Correo=Correo;
        this.Teléfono=Teléfono;
    }
    
    /** 
    * Este es el metodo que permite al cliente registrar los datos 
    * que son necesarios dentro de la aplicacion. Las variables 
    * creadas dentro del método son para llenar el arreglo
    * de objeto DatosUser.
    */
    
    public void registrarDatos(){
        Cliente verificacion = new Cliente();
        
        String nombre;
        String usuario;
        String password;
        String Ubicacion;
        String correo;
        String teléfono; 
        
        if(Contador != DatosUser.length) {
            
            nombre = JOptionPane.showInputDialog("Digite su nombre: ");
            usuario = JOptionPane.showInputDialog("Digite su alias de usuario: ");
            password = verificacion.verificarPass();
            Ubicacion = JOptionPane.showInputDialog("Digite su ubicación: ");
            correo = verificacion.verificarEmail();
            teléfono = verificacion.verificarTele();
            
            DatosUser[ID_Cliente+1] = new Cliente(nombre, usuario, password, Ubicacion, correo, teléfono );
            Contador++;
            ID_Cliente++;
        }else {
            JOptionPane.showMessageDialog(null,"Maximo de usuarios registrados alcanzado");
        }
    }
    
   /** 
    * Este es el  metodo que permite verificar que el correo ingreado tenga formato adecuado.
    * @return correoV        Esta variable retorna el correo correcto para ser almacenado  
    */
    
    public String verificarEmail()
    {
        boolean verificar=false;
        String correoV="";
        
        while(verificar == false) {
            correoV = JOptionPane.showInputDialog("Digite su Correo: ");
            for(int f = 0; f < correoV.length(); f++) {
                if(correoV.charAt(f) == '@') {
                    verificar=true;
                }
            }
            if(verificar==true) {
                JOptionPane.showMessageDialog(null,correoV + " Correo válido");
            } else {
                JOptionPane.showMessageDialog(null,correoV + " Correo inválido");        
            }
        }
        return correoV;
    }
    
    /** 
    * Este es el  metodo que permite verificar que la contraseña ingresado tenga formato adecuado.
    * @return passV        Esta variable retorna el password correcto para ser almacenado  
    */
    
    public String verificarPass()
    {
        boolean verificar=false;
        String passV="";
        
        while(verificar == false) {
            passV = JOptionPane.showInputDialog("Digite Password: ");
            
            if(passV.length() >= 8) {
                JOptionPane.showMessageDialog(null,passV.substring(0,3) + "******* " + " password válido");
                verificar=true;
            } else {
                JOptionPane.showMessageDialog(null,"Password inválido \nLongitud no valida \nDebe ser mayor a 8 caracteres");        
            }
        }
        return passV;
    }
    
    /** 
    * Este es el  metodo que permite verificar que le numero telefonico ingresado tenga formato adecuado.
    * @return teleV        Esta variable retorna el teléfono correcto para ser almacenado  
    */
    
    public String verificarTele()
    {
        boolean verificar=false;
        String teleV="";
        
        while(verificar == false) {
            teleV = JOptionPane.showInputDialog("Digite su teléfono: ");
            
            if(teleV.length() == 8) {
                JOptionPane.showMessageDialog(null,teleV.substring(0,4) +"-" + teleV.substring(4,8) + " Telefono válido");
                verificar=true;
            } else {
                JOptionPane.showMessageDialog(null,"Telefono inválido \nLongitud no valida \nDebe ser de 8 digitos");        
            }
        }
        return teleV;
    }
    
   /** 
    * Este es el  metodo que permite al cliente iniciar sesion.
    * @return Verificacion        Esta variable retorna valor booleano necesario para seguir el procesos  
    */
    
    public boolean iniciarSesion() {
        DatosUser[0] = new Cliente("Alan","Alan","alan12","Los Yoses","Alan12@hotmail.com","87943560");      //Usuario previamente registrado
        String User;
        String Pass;
        boolean Verificacion = false;
        
        User = JOptionPane.showInputDialog("Digite su alias de usuario: ");
        Pass = JOptionPane.showInputDialog("Digite su password: ");
        
        for(int i = 0; i < Contador; i++) {
            if ((User.equals(DatosUser[i].Usuario)) && (Pass.equals(DatosUser[i].Password))) {  
                JOptionPane.showMessageDialog(null,"Datos correctos");
                i = DatosUser.length;
                Verificacion=true;
            }else if((i+1) == Contador ) {
                JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos"
                                            + "\nIngrese nuevamente");
            }
            
        }
        return Verificacion;
    }
    
    public void realizarAccion() {
        Just_EatsCR MenElec = new Just_EatsCR();
        Cliente ClassCliente = new Cliente();
        String Option="";
        
        do {
            Option = JOptionPane.showInputDialog("         Just Eats               "
                                                           + "\nSeleccione un opción."
                                                           + "\n1. Realizar pedido"
                                                           + "\n2. Realizar reclamo" 
                                                           + "\n3. Realizar sugerencia"
                                                           + "\n0. Cerrar sesión");
            switch(Option) {
                case "1":
                    MenElec.Elección_Restaurante();
                    break;
                case "2":
                    ClassCliente.realizarReclamo();
                    break;
                case "3":
                    ClassCliente.realizarSugerencia();
                    break;
                default:
                    break;
            }
        } while(!Option.equals("0"));
    }
    
    /** 
    * Este es el método que permite al cliente realizar reclamos sobre sus pedidos o 
    * productos comprados en la App. Dependiendo del reclamo este se almacenara 
    * de forma textual en una variable String.
    */
    
    public void realizarReclamo() {
        String Recl_Producto = "";
        String Recl_Pedido = "";
        String Option=""; 
        
        do {
            Option = JOptionPane.showInputDialog("         Just Eats               "
                                                           +"\nGracias por usar nuestro servicio"
                                                           +"\nPor favor indicar tipo de reclamo"
                                                           +"\n1. Reclamo sobre producto" 
                                                           +"\n2. Reclamo sobre pedido" 
                                                           +"\n0. 0 para ir Atras");
            switch(Option) {
                case "1":
                    Recl_Producto = JOptionPane.showInputDialog("Indique reclamo de producto");
                    JOptionPane.showMessageDialog(null, "Su reclamo será tomado en cuenta"
                                                       +"\n                       Gracias");
                    break;
                case "2":
                    Recl_Pedido = JOptionPane.showInputDialog("Indique reclamo de pedido");
                    JOptionPane.showMessageDialog(null, "Su reclamo será tomado en cuenta"
                                                       +"\n                       Gracias");
                    break; 
                default:
                    break;
            }
        } while(!Option.equals("0"));
    }
    
    /** 
    * Este es el método que permite al cliente realizar sugerencias a productos o bien
    * funciones de la App. Esta información se guardará en un variable tipo String.
    */
    
    public void realizarSugerencia() {
        String Sugerencia = "";
        
        Sugerencia = JOptionPane.showInputDialog("Indique cuál es su sugerencia");
        JOptionPane.showMessageDialog(null, "Su sugerencia será tomada en cuenta"
                                          + "\n                          Gracias");
    }
    
    /** 
     * Getters y setters necesarios para la clase.
     */

    public int getID_Cliente() 
    {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) 
    {
        this.ID_Cliente = ID_Cliente;
    }

    public String getNombre() 
    {
        return Nombre;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }

    public String getUsuario() 
    {
        return Usuario;
    }

    public void setUsuario(String Usuario) 
    {
        this.Usuario = Usuario;
    }

    public String getPassword() 
    {
        return Password;
    }

    public void setPassword(String Password) 
    {
        this.Password = Password;
    }

    public String getUbicación() 
    {
        return Ubicación;
    }

    public void setUbicación(String Ubicación) 
    {
        this.Ubicación = Ubicación;
    }

    public String getCorreo() 
    {
        return Correo.substring(0,3) + "...." + Correo.substring(Correo.indexOf("@"));
    }

    public void setCorreo(String Correo) 
    {
        this.Correo = Correo;
    }

    public String getTeléfono() 
    {
        return Teléfono;
    }

    public void setTeléfono(String Teléfono) 
    {
        this.Teléfono = Teléfono;
    }
        
}
