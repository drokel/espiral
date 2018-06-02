package principal;
public class espiral 
{
static int espiral [][] = new int [10][10];
    public static void main(String[] args) 
    {
        int contador = 1;
        for(int i = 0;i<=5; i++)
        {
           contador = MetodoUno(i, contador);
           contador = MetodoDos(i, contador);
           contador = MetodoTres(i, contador);
           contador = MetodoCuatro(i, contador);
        }
    imprimir();    
    }
    
    //Metodos
    public static int MetodoUno(int x, int count)
    {
        
        for(int a = 0 + x; a < 10 - x; a++)
        {
            espiral[x][a]=count;
            count++;
        }
        return count;
    }
    public static int MetodoDos(int y, int count)
    {
        for(int b = 1 + y; b < 9 - y; b++)
        {
            espiral[b][9-y] = count;
            count++;
        }
        return count;
    }
    public static int MetodoTres(int x, int count)
    {
        for(int a = 9-x; a >= 0+x; a--)
        {
            espiral[9-x][a] = count;
            count++;
        }
        return count;
    }
    public static int MetodoCuatro(int y, int count)
    {
        for(int a = 8-y; a >= y; a--)
        {
            espiral[a][y] = count;
            count++;
        }
        return count;
    }
    //Funcion Imprimir
    public static void imprimir()
    {
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                System.out.print("\t" + espiral[i][j]);            
            }
            System.out.println("");    
        }
    }
}