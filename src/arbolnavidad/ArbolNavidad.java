package arbolnavidad;


import java.lang.Math; 

public class ArbolNavidad
{
  
  public static void main(String[] args)
  {
    
    int tallo=9;//El ancho y alto del tallo
    int al = 3;//altura de cada triángulo
    int cA;//por cada fila se imprime cierta cantidad de *
    int eG;
    String iniA="";//asteriscos iniciales por cada fila del triángulo
    
    for(int y=0;y<tallo;y++){
      
      cA = 2*y+1;//de acuerdo al índice nos dice con cuantos asteriscos inicia cada triángulo, aunque solo el primero es un triángulo 
    
      iniA = llenarA(cA,'*');//asteriscos iniciales por cada fila del triángulo
      
      eG = tallo-1;//espacios adicionales para mantener la correcta figura del árbol
      
      for(int i=0;i<al;i++){//recorremos cada fila "triángulo"
    	
        //imprimimos la cantidad de espacios
        System.out.print(llenarA(al-i-1-y+eG,' '));
        
        //imprimimos la cantidad de asteriscos
        System.out.println(iniA);
        iniA += "**";//agregamos 2, por que cada fila va incrementando de 2 en 2
    
      }
    }
    
    //Ahora solo nos queda hacer el tallo que va a ser un cuadrado
    
    //nos da la cantidad máxima de asteríscos que aparecen en la última base
    int baseMax = iniA.length() - 2;//funciona para cualquier altura de los triángulos :D
    //baseMax = (tallo + 2) * 2 - 1;//si quieres tomar para solo altura 3 del triángulo, descomenta esto
    
    for(int i=0;i<tallo;i++){
      /*
        Calculamos la cantidad de espacios a recorrer
        baseMax/2 -> nos da el punto central del último triángulo
        tallo/2 -> nos da la mitad del tallo(cuadrado)
        entonces simplemente restamos para centar el tallo con respecto al último triángulo, ok
        y luego le concatenamos la cantidad de asteriscos del tallo en sí.
      */
    	System.out.println(llenarA((baseMax/2)-(tallo/2),' ')+llenarA(tallo,'*'));
    }
    
    
  }
  
  /*
    Nos devuelve una cadena una cierta cantidad de carácteres
  */
  public static String llenarA(int ca,char car){
    String cA = "";
    for(int i=0;i<ca;i++){
    	cA+=String.valueOf(car);
    }
    return cA;
  }
}


