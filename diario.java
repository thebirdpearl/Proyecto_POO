//tomar en cuenta que la clase al momento de tener el ejercicio bueno debe retornar un 1
//tenemos pensado como hacer las preguntas.
//crear una lista pa las palabras.
//métodos ejercicios y conteo de buebas y malas
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

class diario{

    public diario(){
    }

    public void ejercicios(){
        //definir las variables de las respuestas
        String a = "";
        String c = "";
        String b = "";
        String pregunta = "";
        String respuesta = "";
        int puntaje = 0;
        int cantpre = 0;

        //INSTANCIAR EL VISUAL
        vista vista = new vista();
        Random rand = new Random();

        //Seguir desplegando ejercicios hasta que el usuario indique lo contrario
        int je = 0;
        while(je != 0){

            int random0 = rand.nextInt(4); //pregunta a realizar
            int random1 = rand.nextInt(4); //la que determina que dira la opcion
            int randombot = rand.nextInt(3);//define en que posicion estará

            //Crear un array por idioma que contiene las palabras de tipo saludos
            ArrayList <String> esp = new ArrayList<String>();
            ArrayList <String> kaq = new ArrayList<String>();
            
            //Agregar palabras al "diccionario" de español
            esp.add("¿Cual es tu nombre?");
            esp.add("Dormitorio");
            esp.add("Sala");
            esp.add("Baño");
            esp.add("Cocina");

            //Agregar palabras al "diccionario" de k'qchiquel
            kaq.add("Achike ab’i’ rat?");
            kaq.add("warab’äl");
            kaq.add("nimajay");
            kaq.add("ruxikin jay");
            kaq.add("ruchi’ q’aq’");
            
            //Definir la pregunta que se desplegará y la palabra que corresponde a la respuesta correcta
            respuesta = kaq.get(random0);
            
            kaq.remove(random0);
            esp.remove(random0);
            //Definir la opción a desplegar por letra
            //Definiendo el valor que tomará la letra a
            

            int x = 0;
            int xx = 0;
            int xz = 0;
            int xw = 0;
            
            while(x != 0){
                
                randombot = rand.nextInt(3);
                random1 = rand.nextInt(5);

                //Definiendo el valor que tomará la letra a
                if(randombot == 1){
                if (random1 == 1){
                    a = esp.get(0);
                }else if (random1 == 2){
                    a = esp.get(1);
                }else if (random1 == 3){
                    a = esp.get(2);
                }else if (random1 == 4){
                    a = esp.get(3);
                }
                }
                
                //Definiendo el valor que tomará la letra b
                if(randombot == 2){
                if (random1 == 1){
                    b = esp.get(0);
                }else if (random1 == 2){
                    b = esp.get(1);
                }else if (random1 == 3){
                    b = esp.get(2);
                }else if (random1 == 4){
                    b = esp.get(3);
                } 
                }

                //Definiendo el valor que tomará la letra c
                if(randombot == 3){
                if (random1 == 1){
                    c = esp.get(0);
                }else if (random1 == 2){
                    c = esp.get(1);
                }else if (random1 == 3){
                    c = esp.get(2);
                }else if (random1 == 4){
                    c = esp.get(3);
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
                x = 3;
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
            
            String larespuesta = vista.creapregunta(pregunta);

            //veriicamos la respuesta sea correcta o incorrecta, si es correcta se suma un punto y se imprime que es correcta de lo contrario no se le pone un punto
            cantpre++;
            if(a==respuesta && larespuesta==a){
                vis.val(false, larespuesta, esp.get(random0), respuesta ); 
                puntaje++;
            }else if(b==respuesta && larespuesta==b){
                vis.val(false, larespuesta, esp.get(random0), respuesta ); 
                puntaje++;
            }else if(c==respuesta && larespuesta==c){
                vis.val(false, larespuesta, esp.get(random0), respuesta ); 
                puntaje++;
            }else{
                vis.val(false, larespuesta, esp.get(random0), respuesta ); 
            }

            //Aqui se le pregunta al usuario si desea continuar practicando o no
            boolean res;
            int res1 = vista.continua();
            if(res1 == 1){
                res = true;
            } else{
                res = false;
            }

            if(res == true){
            }else{
                je++;
                vista.puntaje(puntaje, cantpre);
            }
        }
    }
}