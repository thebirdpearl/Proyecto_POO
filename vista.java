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
    public void Pmenu(){
    
        System.out.println("\n\nBienvenido a K' la app para aprender idioma maya");
        System.out.println("Escoge una opcion marcando el numero que le antecede");
        System.out.println("1. Traductor");
        System.out.println("2. Lecciones");
        System.out.println("3. Nosotros");
        System.out.println("4. Cerrar la App\n\n");
    
    }

    //ingreso  
    public void invalido()
    {
        System.out.println("Ingreso inválido.\n");
    }

    
    //Imrprime opciones de Menu TRADUCTOR
    public void Pmenu_traductor(){
        System.out.println("Has ingresado a traductor");
        System.out.println("Escoge una opcion marcando el numero que le antecede");
        System.out.println("1. Kaqchikel - Español");
        System.out.println("2. Español - Kiche");
        System.out.println("3. Cerrar Traductor\n\n");
    }
    
    //Pregunta palabra en kiche
    
    public String Spalabra_kiche(){
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la palabra en Kaqchikel:");
        String palab = scan.nextLine();
        
        return palab;
    }

    //Indica que una función está fuera de servicio
    public void oos()
    {
        System.out.println("Fuera de servicio por el momento, lo sentimos.\n");
    }

    //Función traductora de español a kaqchikel
    
    public void espanol_a_kaqchikel(String e)
    {
        traductor t = new traductor();
        if(t.checkesp(e))
        {
            System.out.println("Traducción: " + t.eak(e) + "\n");
        }        
        else
        {
            System.out.println("La palabra que ingreso no existe en nuestro registro, lo lamentamos\n");
        }
    }


    
    //Regresa la palabra en español del diccionario
    
    public void Ppalabra_espanol(String sele){
        System.out.println("La palabra en español seria: " + sele);
    }
    
    //Indica que la palabra no existe
    
    public void Pno_existe(){
        System.out.println("La palabra que ingreso no existe en nuestro registro, lo lamentamos\n");
    }
    
    //Pregunta palabra en esapañol
    
    public String Spalabra_espanol(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la palabra en espanol:");
        String palab = scan.nextLine();
        return palab;
    }
    
    /*//Indica la palabra en kiche
    public void Ppalabra_kiche(String sele){
        System.out.println("La palabra en K'iche seria: " + sele );
    }*///Esta función queda relevada por la función traductora en la línea 68
    
    //Despedida traductor
    public void Pdespedida_traductor(){
        System.out.println("Gracias por utilizar el traductor");
    }
    //Despedida de lecciones
    public void Pdespedida_lecciones(){
        System.out.println("Gracias por utilizar las lecciones >:( ");
    }

    //Numero invalido
    
    public void Pnumero_invalido(){
        System.out.println("Por favor ingrese un numero valido");
    }
    
    //Mennu lecciones
    
    public void Pmenu_lecciones(){
        System.out.println("\nHas ingresado a lecciones");
        System.out.println("Escoge una opcion marcando el numero que le antecede");
        System.out.println("1. Saludos");
        System.out.println("2. Familia");
        System.out.println("3. Vida cotidiana");
        System.out.println("4. Cerrar Lecciones\n");
    }
    
    public void Pnuestra_historia(){
        System.out.println("\n\t\t\tNUESTRA HISTORIA");
        System.out.println("Somos un grupo de estudiantes de la Universidad del Valle de Guatemala con el objetivo de ayudar a nuestro pais en sus dificultades.");
        System.out.println("Durante nuestro curso de Programacion Orientada a Objetos tuvimos la oportunidad de ponernos manos a la obra y comenzar un proyecto.");
        System.out.println("Decidimos que tenía que ser algo orientado a la calidad educativa e igualdad entre los guatemaletecos. Es con ello que surgio la idea de K'.");
        System.out.println("Esta es una aplicacion que permite a las personas de nuestra bella nacion reconectar con sus raices a traves de los lenguajes nativos");
        System.out.println("Consideramos que si nosotros como ciudadanos buscamos herramientas para comunicarnos unos con otros, la brecha de la desigualdad se reduciria");
        System.out.println("\nGracias por apollarnos");
    }
    
    public void Pdespedida(){
        System.out.println("Gracias por utilizar este programa.¡Hasta pronto!");
        
    }
    
    //Devuelve opcion de menu principal
    public int Sopcion_menu(){
        Scanner scan = new Scanner(System.in);
        int opcion;
        try{
            opcion = scan.nextInt(); //se copia la respuesta del ususario en una variable
    
        }catch(Exception e){
            System.out.println("Por favor ingrese un numero valido");
            opcion=4;
        }
    
        return opcion;
    
    }
    
    //devuelve opcion de menu traductor
    
    public int Sopcion_menu_traductor(){
        Scanner scan = new Scanner(System.in);
        int opciont;
        try{
            opciont = scan.nextInt(); //se copia la respuesta del ususario en una variable
    
    
        }catch(Exception e){
            System.out.println("Por favor ingrese un numero valido");
            opciont=3;
        }
    
        return opciont;
    
    }
    
    //devuelve opcion de menu lecciones
    
    public int Sopcion_menu_lecciones(){
        Scanner scan = new Scanner(System.in);
        int opcionl;
    
        try{
            opcionl = scan.nextInt(); //se copia la respuesta del ususario en una variable
    
        }catch(Exception e){
            System.out.println("Por favor ingrese un numero valido");
            opcionl=4;
        }
        return opcionl;
    }
    
    public void Pseleccion_practica(String seleccion){
        System.out.println(seleccion);
    }
    
    public String creapregunta(String pregunta){
        //CAMBIAR LOS JOPOTION POR PRINTS NORMALES PORFAVOR
        //String respuesta = JOptionPane.showInputDialog(null, pregunta);
        Scanner scan = new Scanner(System.in);
        String respuesta = "";
        System.out.println(pregunta);
        respuesta = scan.nextLine();
        return respuesta;
    }
    public void puntaje(int puntos){
      //JOptionPane.showMessageDialog(null, "Su puntaje a sido de "+puntos+"/5");
      System.out.println("Su puntaje a sido de "+puntos+"/5");
    
    }
    public void val(boolean ans, String res, String vv){

        if(ans == true){

            //JOptionPane.showMessageDialog(null,"La respuesta "+ res +" es correcta");
            System.out.println("La respuesta "+ res +" es correcta");

          }else{

            //JOptionPane.showMessageDialog(null,"La respuesta "+ res +" es incorrecta");
            System.out.println("La respuesta "+ vv +" es incorrecta, la correcta es: " + res);

          }
    }
    
}