package principal;
public class espiral 
{
static int espiral [][] = new int [10][10];
    public static void main(String[] args) 
    {
        
        for(int i = 0;i<=5; i++)
        {
            
        }
        
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
        for(int b = 9 + y; b < 10 - y; b++)
        {
            espiral[b][y] = count;
            count++;
        }
        return count;
    }
    public static int MetodoTres(int x, int count)
    {
        for(int a = 9 - x; a > 0 - x; a++)
        {
            espiral[x][a] = count;
            count++;
        }
        return count;
    }
    public static int imprimir()
    {
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                System.out.print("\t" + espiral[i][j]);            
            }
            System.out.println("");    
        }
    return 0;
    }
}