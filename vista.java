/*******************************************************************************************************
Vista.java
Autor: Diego Perdomo, Ana Ramirez, Maria Fernanada Argueta, Jose Gonzalez, Carol Arevalo
Última modificación: 25/09/20

Vista
********************************************************************************************************/

//P= Print
//S= Scan

//FALTAN VALIDACIONES

public class vista{

//Imprime opcion de Menu principal
public void Pmenu(){

    System.out.println("\n\nBienvenido a K' la app para aprender idioma maya");
    System.out.println("Escoge una opcion marcando el numero que le antecede");
    System.out.println("1. Traductor");
    System.out.println("2. Lecciones");
    System.out.println("3. Nosotros");
    System.out.println("4. Cerrar la App\n\n");

}

//Imrprime opciones de Menu TRADUCTOR
public void Pmenu_tradctor(){
    System.out.println("Has ingresado a traductor");
    System.out.println("Escoge una opcion marcando el numero que le antecede");
    System.out.println("1. K'iche - Espanol");
    System.out.println("2. Espanol - K'iche");
    System.out.println("3. Cerrar Traductor\n\n");
}

//Pregunta palabra en kiche

public String Spalabra_kiche(){

    System.out.println("Ingrese la palabra en K'iche:");
    String palab = scan.next();
    
    return palab;
}

//Regresa la palabra en español del diccionario

public void Ppalabra_espanol(String sele){
    System.out.println("La palabra en espanol seria: " + sele);
}

//Indica que la palabra no existe

public void Pno_existe(){
    System.out.println("La palabra que ingreso no existe en nuestro registro, lo lamentamos\n");
}

//Pregunta palabra en esapañol

public String Spalabra_espanol(){
    System.out.println("Ingrese la palabra en espanol:");
    String palab = scan.next();
    return palab;
}

//Indica la palabra en kiche
public void Ppalabra_kiche(String sele){
    System.out.println("La palabra en K'iche seria: " + sele);
}

//Despedida traductor
public void Pdespedida_traductor(){
    System.out.println("Gracias por utilizar el traductor");
}


//Numero invalido

public void Pnumero_invalido(){
    System.out.println("Por favor ingrese un numero valido");
}

//Mennu lecciones

public void Pmenu_lecciones(){
    System.out.println("Has ingresado a lecciones");
    System.out.println("Escoge una opcion marcando el numero que le antecede");
    System.out.println("1. Saludos");
    System.out.println("2. Familia");
    System.out.println("3. Vida cotidiana");
    System.out.println("4. Cerrar Lecciones\n\n");
}

public void Pnuestra_historia(){
    System.out.println("\t\t\tNUESTRA HISTORIA");
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
    int opciont;
    try{
        opciont = scan.nextInt(); //se copia la respuesta del ususario en una variable


    }catch(Exception e){
        System.out.println("Por favor ingrese un numero validop");
        opciont=3;
    }

    return opciont;

}

//devuelve opcion de menu lecciones

public int Sopcion_menu_lecciones(){
    int opcionl;

    try{
        opcionl = scan.nextInt(); //se copia la respuesta del ususario en una variable

    }catch(Exception e){
        System.out.println("Por favor ingrese un numero validop");
        opcionl=4;
    }

}

public void Pseleccion_practica(String seleccion){
    System.out.println(seleccion);
}



public Pdespedida_lecciones(){
    System.out.println("Has salido de las lecciones");
}

}

