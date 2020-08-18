package edu.escuelaing.arep;

import edu.escuelaing.arep.LinkedList.LinkedList;
import static junit.framework.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;


public class CalculatorTest {
	
	//Test del funcionamineto de las linkedList y sus metodos (6)
	
	@Test
	void deberiaAgregarNodos() {
		LinkedList linkedList= new LinkedList<Integer>();
		//Poblar LinkedList
        for (int i=0;i<20;i++){
            assertTrue(linkedList.add(i));
        }
        assertEquals(20,linkedList.size());
	}
        
    @Test
	void deberiaRemoverNodoPorIndice() {
    	LinkedList linkedList= new LinkedList<Integer>();
    	//Poblar LinkedList
        for (int i=0;i<10;i++){
            assertTrue(linkedList.add(i));
        }
        
        assertEquals(10,linkedList.size());
        assertEquals(5,linkedList.remove(5));
        assertEquals(2,linkedList.remove(2));
        assertEquals(8,linkedList.size());
	}
    
    @Test
	void NoDeberiaRemoverNodoPorIndiceInexistente() {
    	LinkedList linkedList= new LinkedList<Integer>();
    	//Poblar LinkedList
        for (int i=0;i<10;i++){
            assertTrue(linkedList.add(i));
        }
        
        assertEquals(10,linkedList.size());
        assertEquals(5,linkedList.remove(5));
        assertNotEquals(20,linkedList.remove(20));
        assertEquals(9,linkedList.size());
	}
        
    @Test
	void deberiaRetornarObjetoPorIndice() {
    	LinkedList linkedList= new LinkedList<Integer>();
    	//Poblar LinkedList
        for (int i=0;i<10;i++){
            assertTrue(linkedList.add(i));
        }
 
        assertEquals(10,linkedList.size());
        assertEquals(linkedList.get(6),6);
        assertEquals(linkedList.get(4),4);
        assertEquals(10,linkedList.size());
	}
    
    @Test
   	void deberiaRemoveNodorPorObjeto() {
    	LinkedList linkedList= new LinkedList<Integer>();
    	//Poblar LinkedList
        for (int i=0;i<10;i++){
        	assertTrue(linkedList.add(i));
        }

        assertEquals(10,linkedList.size());
        assertTrue(linkedList.removeForObject(1));
        assertTrue(linkedList.removeForObject(2));
        assertEquals(8,linkedList.size());
                  
   	}
    
    @Test
   	void NoDeberiaRemoveNodorPorObjetoInexistente() {
    	LinkedList linkedList= new LinkedList<Integer>();
    	//Poblar LinkedList
        for (int i=0;i<10;i++){
        	assertTrue(linkedList.add(i));
        }

        assertEquals(10,linkedList.size());
        assertTrue(linkedList.removeForObject(1));
        assertFalse(linkedList.removeForObject(15));
        assertEquals(9,linkedList.size());
                  
   	}
    
    //Test del funcionamito de los metodos de mean y Standard Deviation
    
    @Test
    void deberiaCalcularLaMedia(){
        LinkedList linkedList= new LinkedList<Double>();
        linkedList.add(160.0);
        linkedList.add(591.0);
        linkedList.add(114.0);
        linkedList.add(229.0);
        linkedList.add(230.0);
        linkedList.add(270.0);
        linkedList.add(128.0);
        linkedList.add(1657.0);
        linkedList.add(624.0);
        linkedList.add(1503.0);
        
        double mean = Calculadora.getMean(linkedList);
        assertEquals(550.6, (double)Math.round(mean * 10d) / 10d);
    }
     
    @Test
    void noDeberiaCalcularLaMedia(){
        LinkedList linkedList2= new LinkedList<Double>();
        linkedList2.add(15.0);
        linkedList2.add(69.9);
        linkedList2.add(6.5);
        linkedList2.add(22.4);
        linkedList2.add(28.4);
        linkedList2.add(65.9);
        linkedList2.add(19.4);
        linkedList2.add(198.7);
        linkedList2.add(38.8);
        linkedList2.add(138.2);
        
        double mean = Calculadora.getMean(linkedList2);
        mean = Calculadora.getMean(linkedList2);
        assertNotEquals(60.3, (double)Math.round(mean * 100d) / 100d);
        
    }
    
    @Test
    void deberiaCalcularLaDesviacion(){
        LinkedList linkedList= new LinkedList<Double>();
        linkedList.add(160.0);
        linkedList.add(591.0);
        linkedList.add(114.0);
        linkedList.add(229.0);
        linkedList.add(230.0);
        linkedList.add(270.0);
        linkedList.add(128.0);
        linkedList.add(1657.0);
        linkedList.add(624.0);
        linkedList.add(1503.0);
        
        double desviacion = Calculadora.getDeviation(linkedList);
        assertEquals(572.03, (double)Math.round(desviacion * 100d) / 100d);
    }
     
    @Test
    void noDeberiaCalcularLaDesviacion(){
        LinkedList linkedList2= new LinkedList<Double>();
        linkedList2.add(15.0);
        linkedList2.add(69.9);
        linkedList2.add(6.5);
        linkedList2.add(22.4);
        linkedList2.add(28.4);
        linkedList2.add(65.9);
        linkedList2.add(19.4);
        linkedList2.add(198.7);
        linkedList2.add(38.8);
        linkedList2.add(138.2);
        
        double desviacion = Calculadora.getDeviation(linkedList2);
        assertNotEquals(62.3, (double)Math.round(desviacion * 100d) / 100d);
        
    }
    

}
