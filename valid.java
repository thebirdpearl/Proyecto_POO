public class valid 
{
    public boolean check(String s)//Método para checar si un string es numérico
    {
        boolean numeric = true;
        try 
        {
            int n = Integer.parseInt(s);
        } 
        catch (NumberFormatException e) 
        {
            numeric = false;
        }

        if(numeric)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean rango(int min, int max, int x)
    {
        if (x > min && x <= max)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
