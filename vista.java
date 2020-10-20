/*******************************************************************************************************
Vista.java
Autor: Diego Perdomo, Ana Ramirez, Maria Fernanada Argueta, Jose Gonzalez, Carol Arevalo
Última modificación: 25/09/20
Vista
********************************************************************************************************/

//P= Print
//S= Scan

//FALTAN VALIDACIONES

import java.util.Scanner;
import javax.swing.JOptionPane;

public class vista{

    public vista(){
        Scanner scan = new Scanner(System.in);
    }
    //Imprime opcion de Menu principal
    public String Pmenu(){
    
    //CREAMOS UN JOption para dar las opciones del menu principal
        
        String a = JOptionPane.showInputDialog(null, "\n\nBienvenido a K' la app para aprender idioma maya \nEscoge una opcion marcando el numero que le antecede \n1. Traductor \n2. Lecciones \n3. Nosotros \n4. Cerrar la App\n\n");
        //int b = Integer.parseInt(a);
        return a;
        
    }

    //ingreso  
    public void invalido()
    {    
      JOptionPane.showMessageDialog(null, "Ingreso inválido.\n", "Advertencia!!", JOptionPane.WARNING_MESSAGE); 
    }

    
    //Imrprime opciones de Menu TRADUCTOR
    public int Pmenu_traductor(){
      
        //AQUI NOS VA HACER FALTA UN TRY CATH PARA VER QUE NO FALLE POR ALGUN GRACIOSOS
        while (true) { //Se repite hasta que se logre el return
            try { 
                String a = JOptionPane.showInputDialog(null ,"Has ingresado a traductor \n Escoge una opcion marcando el numero que le antecede \n 1. Kaqchikel - Español \n 2. Español - Kiche \n 3. Cerrar Traductor\n\n ", "Palabra a traducir...");
                //String a = JOptionPane.showInputDialog(null ,"Has ingresado a traductor \n Escoge una opcion marcando el numero que le antecede \n 1. Kaqchikel - Español \n 2. Español - Kiche \n 3. Cerrar Traductor\n\n ", "Traductor");
                int x = Integer.parseInt(a);
                if (x > 0 && x < 4) {
                    return x; //Devuelve la selección del usuario
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "\nERROR: La opción ingresada no es válida, ingrese un número en el rango de opciones" ,"Advertencia!!", JOptionPane.WARNING_MESSAGE); }
        }

    }
    
    //Pregunta palabra en kiche
    
    public String Spalabra_kiche(){
    
        //Scanner scan = new Scanner(System.in);
        String palab = JOptionPane.showInputDialog(null, "Ingrese la palabra en Kaqchikel:");
        //String palab = scan.nextLine();
        
        return palab;
    }

    //Indica que una función está fuera de servicio
    public void oos()
    {
        JOptionPane.showMessageDialog(null,"Fuera de servicio por el momento, lo sentimos.\n","ALERTA!!",JOptionPane.WARNING_MESSAGE);//ALERTA
        
    }

    //Función traductora de español a kaqchikel
    
    public void espanol_a_kaqchikel(String e)
    {
        traductor t = new traductor();
        if(t.checkesp(e))
        {
            JOptionPane.showMessageDialog(null,"Traducción: " + t.eak(e) + "\n");
        }        
        else
        {
            JOptionPane.showMessageDialog(null,"La palabra que ingreso no existe en nuestro registro, lo lamentamos\n");//ALERTA
        }
    }


    
    //Regresa la palabra en español del diccionario
    
    public void Ppalabra_espanol(String sele){
        JOptionPane.showMessageDialog(null,"La palabra en español seria: " + sele);
    }
    
    //Indica que la palabra no existe
    
    public void Pno_existe(){
        JOptionPane.showMessageDialog(frame,"La palabra que ingreso no existe en nuestro registro, lo lamentamos\n","ALERTA!!",JOptionPane.WARNING_MESSAGE);//ALERTA
    }
    
    //Pregunta palabra en esapañol
    
    public String Spalabra_espanol(){
        String palab = JOptionPane.showInputDialog(null, "Ingrese la palabra en espanol:");
        return palab;
    }
    
    /*//Indica la palabra en kiche
    public void Ppalabra_kiche(String sele){
        System.out.println("La palabra en K'iche seria: " + sele );
    }*///Esta función queda relevada por la función traductora en la línea 68
    
    //Despedida traductor
    public void Pdespedida_traductor(){
        JOptionPane.showMessageDialog(null,"Gracias por utilizar el traductor");
    }
    //Despedida de lecciones
    public void Pdespedida_lecciones(){
        JOptionPane.showMessageDialog(null,"Gracias por utilizar las lecciones :3 ");
    }

    //Numero invalido
    
    public void Pnumero_invalido(){
        JOptionPane.showMessageDialog(pane,"Por favor ingrese un numero valido","ALERTA!!",JOptionPane.WARNING_MESSAGE);//ALERTA
    }
    
    //Mennu lecciones
    //PMENU LECCIONES FUE FUNADO
    
    public void Pnuestra_historia(){
      
        JOptionPane.showMessageDialog(null,"\n\t\t\tNUESTRA HISTORIA \n Somos un grupo de estudiantes de la Universidad del Valle de Guatemala con el objetivo de ayudar a nuestro pais en sus dificultades. \n Durante nuestro curso de Programacion Orientada a Objetos tuvimos la oportunidad de ponernos manos a la obra y comenzar un proyecto. \n Decidimos que tenía que ser algo orientado a la calidad educativa e igualdad entre los guatemaletecos. Es con ello que surgio la idea de K'. \n Esta es una aplicacion que permite a las personas de nuestra bella nacion reconectar con sus raices a traves de los lenguajes nativos \n Consideramos que si nosotros como ciudadanos buscamos herramientas para comunicarnos unos con otros, la brecha de la desigualdad se reduciria \n \nGracias por apollarnos","NUESTRA HISTORIA", JOptionPane.PLAIN_MESSAGE);
        //todo el texto se incluye dentro de un mismo Joption
    }
    
    public void Pdespedida(){
        JOptionPane.showMessageDialog(null,"Gracias por utilizar este programa.¡Hasta pronto!");
        
    }
    
    //Devuelve opcion de menu principal
    public int Sopcion_menu(){
        Scanner scan = new Scanner(System.in);
        int opcion;
        try{
            String a = JOptionPane.showInputDialog(null, "ingrese aqui");
            opcion = Integer.parseInt(a);//se copia la respuesta del ususario en una variable 
    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero valido");
            opcion=4;
        }
    
        return opcion;
    
    }
    
    //devuelve opcion de menu traductor
    
    public int Sopcion_menu_traductor(){//AQUI LA COSA ES QUE ES ALGO QUE YA NO NO ES UNITL BORRAR
        //Scanner scan = new Scanner(System.in);
        int opciont;
        try{
            String a = JOptionPane.showInputDialog(null, "ingrese aqui");
            opciont = Integer.parseInt(a);//se copia la respuesta del ususario en una variable 
    
    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero valido");
            opciont=3;
        }
    
        return opciont;
    
    }
    
    //devuelve opcion de menu lecciones
        
    public int Sopcion_menu_lecciones(){
        
        int opcionl;
    
        try{
            String a = JOptionPane.showInputDialog(null, "\nHas ingresado a lecciones \n Escoge una opcion marcando el numero que le antecede \n 1. Saludos \n 2. Familia \n 3. Vida cotidiana \n 4. Cerrar Lecciones\n");
            opcionl = Integer.parseInt(a);//se copia la respuesta del ususario en una variable 
    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero valido");
            opcionl=4;
        }
        return opcionl;
    }
    
    public void Pseleccion_practica(String seleccion){
        JOptionPane.showMessageDialog(null, seleccion);
    }
    
    public String creapregunta(String pregunta){
        String respuesta = JOptionPane.showInputDialog(null, pregunta);
        return respuesta;
    }
    public void puntaje(int puntos){
      //JOptionPane.showMessageDialog(null, "Su puntaje a sido de "+puntos+"/5");
      JOptionPane.showMessageDialog(null,"Su puntaje ha sido de "+puntos+"/5");
    
    }
    public void val(boolean ans, String res, String vv){

        if(ans == true){

            //JOptionPane.showMessageDialog(null,"La respuesta "+ res +" es correcta");
            JOptionPane.showMessageDialog(null,"La respuesta "+ res +" es correcta");

          }else{

            //JOptionPane.showMessageDialog(null,"La respuesta "+ res +" es incorrecta");
            JOptionPane.showMessageDialog(null,"La respuesta "+ vv +" es incorrecta, la correcta es: " + res);
          }
    }
    
}