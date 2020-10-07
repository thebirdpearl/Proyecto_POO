import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class traductor 
{
    dictionary d = new dictionary();
    
    //diccionario español a kaqchikel
    public HashMap<String, String> spa = new HashMap<String, String>();
    //diccionario kaqchikel a español
    public HashMap<String, String> kqc = new HashMap<String, String>();//*no funcional por el momento*

    public traductor()
    {                
        //ciclos para agragar todas las palabras correspondientes a los diccionarios
        for(int i = 0; i < d.esp.size(); i++)
        {
            spa.put(d.esp.get(i).toLowerCase(), d.kaq.get(i).toLowerCase());
        }
        for(int i = 0; i < d.kaq.size(); i++)
        {
            kqc.put(d.kaq.get(i).toLowerCase(), d.esp.get(i).toLowerCase());
        }

    }


    //funciones que sirven para traducir
    //IMPORTANTE: ESTAS FUNCIONES SE DEBEN UTILIZAR ÚNICAMENTE DESPUÉS DE HABER UTILIZADO LAS FUNCIONES DE CHEQUEO QUE SE ENCUENTRAN A PARTIR DE LA LÍNEA 45
    public String eak(String e)//función para devolver el valor de la traducción de español a kaqchikel
    {
        e = e.toLowerCase();
        return spa.get(e);
    }

    public String kae(String e)//función para devolver el valor de la traducción de kaqchikel a español *no funcional por el momento*
    {
        e = e.toLowerCase();
        return kqc.get(e);
    }



    //funciones que sirven para checar si una palabra ingresada está registrada
    public boolean checkesp(String e)//función para checar que, efectivamente, la palabra que ingresó está registrada en español
    {    
        if(spa.containsKey(e.toLowerCase()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean checkkaq(String e)//función para checar que, efectivamente, la palabra que ingresó está registrada en kaqchikel *no funcional por el momento*
    {
        if(kqc.containsKey(e.toLowerCase()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
