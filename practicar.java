/*******************************************************************************************************
Vista.java
Autor: Diego Perdomo, Ana Ramirez, Maria Fernanada Argueta, Jose Gonzalez, Carol Arevalo
Última modificación: 29/09/20
Practicar
********************************************************************************************************/

//clase que desgloza los diversos ejercicios a realizar

import java.util.Scanner;

public class practicar{
  saludos sal = new saludos();
  familia fam = new familia();
  diario diar = new diario();

  public practicar(){

  }
  //crear una variable del tipo de cada clase que corresponde a un tema de aprendizaje

  //desde el driver se debe indicar el número que corresponde al tema escogido y del cual se desplegará el ejercicio a realizar
  //Dentro de los ejercicio este no se detendra hasta el momento que el usuario desea salir del propio ejercicio
  public void seleccion(int op){

    if (op == 1){
      sal.ejercicios();
       //desplegar un ejercicio del tema saludos

    }else if(op == 2){
      fam.ejercicios();
       //desplegar un ejercicio del tema familia


    }else if(op == 3){
      diar.ejercicios();
      //diar.ejercicios(); //desplegar un ejercicio del tema vida diaria

    }

  }
}
