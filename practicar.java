import userinput.vista;

class practicar{

    public static String respuestag;

    public practicar(){
    }
    
    public String ejercitar(int num){

        familia2 fam = new familia2();
        saludos2 sal = new saludos2();
        diario2 dia = new diario2();
        String pregunta = "";

        //SE SELECCIONA EL HACERLO CON FAMILIA
        if(num == 1){

            pregunta = fam.ejercicios();

        } else if (num == 2){

            pregunta = sal.ejercicios();

        } else if(num == 3){

            pregunta = dia.ejercicios();
        }
        return pregunta;
    }
    public boolean analisis(String a){

        boolean respuesta = false;

        if(a.equals(respuestag)){

            respuesta = true;

        }

        return respuesta;
    }
}