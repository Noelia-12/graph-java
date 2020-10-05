package data.structure;

public class cola {
    private int MAXTAM = 5;
    private int frente;
    private int fin;
    
    private Object[] cola; // creacion del arreglo cola
     //constructores para crear cola
    public ColaArray()
    {
        frente = 0;
        fin = -1;
        cola = new Object[MAXTAM]; //INICIALIZACION DE LA COLA
    }
     //OPERACIONES 
    
    //OPERACION COLA LLENA
    public boolean colaLlena()
    {
        if(fin == MAXTAM-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //OPERACION INSERTAR ELEMENTOS
    public void insertar(Object dato)
    {
        if(!colaLlena())
        {
            fin ++;
            cola[fin] = dato;
        }
        else
        {
            System.out.println("NO SE PUEDE INSERTAR, COLA LLENA");
 
        }
    }
    //OPERACION QUITAR
    public Object quitar()
    {
        Object aux= null;
        if(!colaVacia())
        {
            aux = cola[frente];
            frente++;
            
        }
        else
        {
            System.out.println("NO SE PUEDE EXTRAER, COLA VACIA");
        }
        return aux;
    }
    //TAMANO MAXIMO
    public void tamano()
    {
        System.out.println(" EL TAMANO MAXIMO ES:"+MAXTAM);
    }
    //OPERACION MOSTRAR FRENTE 
    public Object frente()
    {
        return cola[frente];
    }
    //OPERACION COLA VACIA
    public boolean colaVacia()
    {
        if(frente < fin)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    //OPERACION MOSTRAR COLA
    public void mostrarCola()
    {
        System.out.println("COLA ACTUAL: ");
        for(int i=frente; i<=fin;i++ )
        {
            System.out.print(cola[i]+"\t");
        }
    }

    
}
