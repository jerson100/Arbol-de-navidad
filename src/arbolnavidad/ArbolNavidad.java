package arbolnavidad;


import java.lang.Math; 

public class ArbolNavidad
{
  
  public static void main(String[] args)
  {
    
    int tallo=9;
    int al = 3;//altura de cada tri�ngulo
    int cA;//por cada fila se imprime cierta cantidad de *
    int eG;
    String iniA="";
    
    for(int y=0;y<tallo;y++){
      
      cA = 2*y+1;//de acuerdo al �ndice nos dice con cuantos asteriscos inicia 
    
      iniA = llenarA(cA,'*');//asteriscos iniciales
      
      eG = tallo-1;//espacios generales de acuerdo a la cantidad de tr�angulos a mostrar :D
      
      for(int i=0;i<al;i++){
    	
        //imprimimos la cantidad de espacios
        System.out.print(llenarA(al-i-1-y+eG,' '));
        
        //imprimimos la cantidad de asteriscos
        System.out.println(iniA);
        iniA += "**";
    
      }
    }
    
    //realizamos el tallo :v
    
    //nos da la cantidad m�xima de aster�scos que aparecen en la �ltima base
    int baseMax = iniA.length() - 2;//funciona para cualquier altura de los tri�ngulo :D
    //baseMax = (tallo + 2) * 2 - 1;//si quieres tomar para solo altura 3 del tri�ngulo, descomenta esto
    
    for(int i=0;i<tallo;i++){
    	System.out.println(llenarA((baseMax/2)-(tallo/2),' ')+llenarA(tallo,'*'));
    }
    
    
  }
  
  public static String llenarA(int ca,char car){
    String cA = "";
    for(int i=0;i<ca;i++){
    	cA+=String.valueOf(car);
    }
    return cA;
  }
}


