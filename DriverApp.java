/*******************************************************************************************************
DriverApp.java
Autor: Diego Perdomo, Ana Ramirez, Maria Fernanada Argueta, Jose Gonzalez, Carol Arevalo
Última modificación: 11/09/20

Driver
********************************************************************************************************/

import java.util.Scanner;
public class DriverApp{
	public static void main(String args[]){
		// se usa la utielidad de scaner para recibir la respuesta del ususario
		//Se instancian los atributos de la clase
		int opcion = 0;
		Scanner scan = new Scanner(System.in);
		boolean bandc=true;//detiene el while principal si el usuario metió un numero invalido (band==true--> todo en orden)(band==false--> hubo un error)
		
		//instancias
		practicar practica = new practicar();
		traductor traductor = new traductor();
		vista vista= new vista();

		while (opcion != 4){//loop que genera el menú para el usuario

			vista.Pmenu();

			opcion=vista.Sopcion_menu();


			if (opcion == 1 ){//aqui va la página de traducción
			    boolean bandt=true; //ayuda a validar al igual que bandc
				int opciont=0;//variable donde se guarda la opcion que se escoge en traductor
				
				while (opciont != 3 && bandt==true){

					vista.Pmenu_traductor();

					opciont= vista.Sopcion_menu_traductor();

					if(opciont==1){//K'iche - Espanol
					////////////////////////////////////////////////////////////////////////////////////////////////HACER
						
						String palab= vista.Spalabra_kiche();

						boolean existencia = traductor.checkkaq(palab);
						if(existencia == true){

							String sele = traductor.kae(palab);
							vista.Ppalabra_espanol(sele);

						}else{

							vista.Pno_existe();

						}
					}else if(opciont==2){//Espanol - K'iche

						String palab= vista.Spalabra_espanol();

						boolean existencia = traductor.checkesp(palab);
						if(existencia == true){

							String sele = traductor.eak(palab);
							vista.Ppalabra_kiche(sele);

						}else{
							vista.Pno_existe();

						}

					}else if(opciont==3){//salir del traductor
						vista.Pdespedida_traductor();
						//System.out.println("Gracias por utilizar el traductor");
					}else{
						vista.Pnumero_invalido();
						//System.out.println("Por favor ingrese un numero valido");
					}
				}
			} else if (opcion == 2){//agui va la pagina de lecciones
				boolean bandl=true; //ayuda a validar al igual que bandc
				int opcionl=0;//variable donde se guarda la opcion que se escoge en lecciones


				while (opcionl != 4 && bandl==true){
					//se despliega el menú de lecciones (solo puse 2 por el momento)

					vista.Pmenu_lecciones();

					opcionl=vista.Sopcion_menu_lecciones();
					
					if(opcionl >=1 && opcionl <=3){//TODAS LAS LECCIONES VAN AQUI

						System.out.println("x");
						practicar pra = new practicar();
						int puntitos = 0;
				
						for(int i = 0; i < 6; i++){
				
							String impi = pra.ejercitar(opcionl);
							String vv = vista.creapregunta(impi);
							boolean probar = pra.analisis(vv);
							if(probar == true){
				
								puntitos++;
								vista.val(probar, practicar.respuestag);
				
							}else{
				
								vista.val(probar, practicar.respuestag);
				
							}
				
							//CAROL NO ME PERMITE MEJORAR COMO PROGRAMADOR, CAROL-MALCADA.EXE HA SIDO EJECUTADO >:3
						}
						vista.puntaje(puntitos);				
					} else if(opcionl == 4){

						vista.Pdespedida_lecciones();

					} else{
						vista.Pnumero_invalido();
					}
				}
			} else if (opcion == 3){//aqui va la info de nosotros
				vista.Pnuestra_historia();
				
			} else if (opcion == 4){//opcion para sair
				vista.Pdespedida();
			}
		}
	}
}
