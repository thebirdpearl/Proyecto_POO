//tomar en cuenta que la clase al momento de tener el ejercicio bueno debe retornar un 1
//tenemos pensado como hacer las preguntas.
//crear una lista pa las palabras.
//métodos ejercicios y conteo de buebas y malas
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

class saludos2{

    public saludos2(){
    }

    public String ejercicios(){
        //definir las variables de las respuestas
        String a = "";
        String c = "";
        String b = "";
        String pregunta = "";
        String respuesta = "";

        Random rand = new Random();

        //Seguir desplegando ejercicios hasta que el usuario indique lo contrario
        int je = 0;

        int random0 = rand.nextInt(4); //pregunta a realizar
        int random1 = rand.nextInt(4); //la que determina que dira la opcion
        int randombot = rand.nextInt(3);//define en que posicion estará

        //Crear un array por idioma que contiene las palabras de tipo saludos
        ArrayList <String> esp = new ArrayList<String>();
        ArrayList <String> kaq = new ArrayList<String>();
        
        //Agregar palabras al "diccionario" de español
        esp.add("Buenos dias");
        esp.add("Gracias");
        esp.add("Buenas noches");
        esp.add("¿Como estas?");
        esp.add("Bien gracias");

        //Agregar palabras al "diccionario" de k'qchiquel
        kaq.add("Saqer");
        kaq.add("Matyox");
        kaq.add("Xoqa");
        kaq.add("La Utz awach?");
        kaq.add("Utz matyox");
        
        //Definir la pregunta que se desplegará y la palabra que corresponde a la respuesta correcta
        respuesta = kaq.get(random0);
        
        //Definir la opción a desplegar por letra
        //Definiendo el valor que tomará la letra a
        

        int x = -1;
        int xx = 0;
        int xz = 0;
        int xw = 0;
        
        while(x != 0){
            
            randombot = rand.nextInt(4);
            random1 = rand.nextInt(5);

            //Definiendo el valor que tomará la letra a
            if(randombot == 1){
                if (random1 == 1){
                    a = kaq.get(0);
                }else if (random1 == 2){
                    a = kaq.get(1);
                }else if (random1 == 3){
                    a = kaq.get(2);
                }else if (random1 == 4){
                    a = kaq.get(3);
                }
            }
            
            //Definiendo el valor que tomará la letra b
            if(randombot == 2){
                if (random1 == 1){
                    b = kaq.get(0);
                }else if (random1 == 2){
                    b = kaq.get(1);
                }else if (random1 == 3){
                    b = kaq.get(2);
                }else if (random1 == 4){
                    b = kaq.get(3);
                } 
            }

            //Definiendo el valor que tomará la letra c
            if(randombot == 3){
                if (random1 == 1){
                    c = kaq.get(0);
                }else if (random1 == 2){
                    c = kaq.get(1);
                }else if (random1 == 3){
                    c = kaq.get(2);
                }else if (random1 == 4){
                    c = kaq.get(3);
                }
            }
            
        //Aqui miramos que todas las opciones tengan un valor y no va a salir hasta que lo tengan
            if(a != ""){
                xx++;
            }
            if(b != ""){
                xz++;
            }
            if(c != ""){
                xw++;
            }
            if( xx>=1 && xz>=1 && xw>=1){
                x = 0;
            }
        }

        //le damos un valor a una opcion para que sea la respuesta
        randombot = rand.nextInt(3);
        if(randombot == 1){
            a = respuesta;
        }
        if(randombot == 2){
            b = respuesta;
        }
        if(randombot == 3){
            c = respuesta;
        }
        //pos aqui la pregunta y la juntamos toda
        pregunta = "Traduzca la palabras " +esp.get(random0)+ "\n A)" +a+ "\n B" +b+ "\n C)" + c;
        
        //ESTO REGRESAR
        practicar.respuestag = respuesta;
        return pregunta;
    }
}