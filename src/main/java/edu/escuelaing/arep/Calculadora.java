package edu.escuelaing.arep;

import edu.escuelaing.arep.LinkedList.LinkedList;

/**
 * Calculadora de la media y la desviacion estandar de una linkedList
 * @author Diego23p
 */
public class Calculadora {
	
	/**
     * Calcula la media de una LinkedList de numeros reales
     * @param list lista a evaluar
     * @return Media de la LinkedList
     */
    public static double getMean(LinkedList<Double> list){
        int size = list.size();
        double suma= 0;
        for(Double num:list){
            suma+=num;
        }
        
        return suma/size;
    }
    
    /**
     * Calcula la desviacion estandar de una LinkedList de numeros reales
     * @param list lista a evaluar
     * @return Desviacion Estandar de la LinkedList
     */
    public static double getDeviation(LinkedList<Double> list){
        double mean = getMean(list);
        double sumatoria=0;
        int size = list.size();
        
        for(Double num:list){
            sumatoria+= Math.pow(num-mean, 2);
        }
        
        return  Math.sqrt((sumatoria)/(size-1));
    }

}
