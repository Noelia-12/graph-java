public class pila {
    private int TAMPILA = 50; //tama;o d la pila
    private int cima;
    //estructura que emulara la pila
    private Object[] pilaArray;
    
    public Pila()//EL CONSTRUCTOR PERMITE CRAR LA PILA VACIA
    {
        this.cima = -1;// la pila apunta al vacio 
        this.pilaArray = new Object[TAMPILA];// CREACION DE LA PILA
        
    }

   
    
    //OPERACIONES BASICAS
    //pila llena
    public boolean pilaLLena()
    {
        if(this.cima == TAMPILA -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //pila vacia
    public boolean pilaVacia()
    {
        if(this.cima ==  -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //limpiar cima
    public Object cimaPila()
    {
        if(!pilaVacia())
        {
        return pilaArray[cima];
        }
        else
        {System.out.println("LA PILA ESTA VACIA");
        return null;
            
        }
    }
    
    //insertar pila
    public void insertar(Object elemento)
    {
        if(pilaLLena())// verifica si la pila esta llena
        {
            System.out.println("NO SE PUEDE INSERTAR, la pila esta llena");
        }
        else
        {
         this.cima++; //auementa e puntero cima en una posicion o seas cima+1
         pilaArray[cima] = elemento; //guardo el elemnto en la posicion encontrada
         
        }
    }
        
    //quitar pila
       public Object quitar()
       {
           Object aux= null;
           if(pilaVacia())
           {
               System.out.println("NO SE PUEDE EXTRAER, LA PILA ESTA VACIA");
           }
           else
           {
               aux = pilaArray[cima];
               cima--;
           }
           return aux;
       }
       
        
    //mostrar pila
    public void mostrarPila() {
        if (!pilaVacia()) 
        {
            for (int i = cima; i >= 0; i--) {
                System.out.println("|" + pilaArray[i]+ "|");
            }
        }
        else
        {
            System.out.println("No hay elemntos para mostrar, pila vacia");
        }

        
    }
    
    //limpiar pila
    public void limpiarPila()
    {
        this.cima = -1;
    }
    
}
