/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.vn.IntroJava.Ordenamiento;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



/**
 *
 * @author Equipo 1
 */
public class TestOrdenamiento {
    
    public TestOrdenamiento() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void probarOrdenamientoSistemaHumano_negativos() {
        int[] array = {34, 2, 15, 23, -7, 0, -1};
        int[] solv = {-7, -1, 0, 2, 15, 23, 34};
        assertArrayEquals(solv, Ordenamiento.ordenarArray(array));
    }
    
    //@Test
    private void probarOrdenamientoSistemaHumano(int[] array, int[] solv) {
        assertArrayEquals(solv, Ordenamiento.ordenarArray(array));
    }
    
    @Test
    public void probarOrdenamientoSistemaHumano_invertido() {
        int[] array = {9,8,7,6,5,4,3,2,1};
        int[] solv = {1,2,3,4,5,6,7,8,9};
        assertArrayEquals(solv, Ordenamiento.ordenarArray(array));
    }
    
    @Test
    public void probarOrdenamientoSistemaHumano_minimos() {
        int[] array = {9,8,7,6,5,4,3,Integer.MIN_VALUE,1};
        int[] solv = {Integer.MIN_VALUE,1,3,4,5,6,7,8,9};
        assertArrayEquals(solv, Ordenamiento.ordenarArray(array));
    }
    
    @Test
    public void probarOrdenamientoSistemaHumano_maximos() {
        int[] array = {Integer.MAX_VALUE,8,7,6,5,4,3,2,1};
        int[] solv = {1,2,3,4,5,6,7,8,Integer.MAX_VALUE};
        assertArrayEquals(solv, Ordenamiento.ordenarArray(array));
    }
    
    @Test
    public void probarOrdenamientoSistemaHumano_repetido() {
        int[] array = {9,8,8,8,3,5,4,3,2,1};
        int[] solv = {1,2,3,3,4,5,8,8,8,9};
        assertArrayEquals(solv, Ordenamiento.ordenarArray(array));
    }
    
    @Test
    public void probarOrdenamientoSistemaHumano_ordenado() {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] solv = {1,2,3,4,5,6,7,8,9};
        assertArrayEquals(solv, Ordenamiento.ordenarArray(array));
    }
    
    @Test
    public void probarOrdenamientoSistemaHumano_vacio() {
        int[] array = {};
        int[] solv = {};
        assertArrayEquals(solv, Ordenamiento.ordenarArray(array));
    }
    
    @Test
    public void probarOrdenamientoSistemaHumano_null() {
        int[] array = null;
        int[] solv = null;
        assertArrayEquals(solv, Ordenamiento.ordenarArray(array));
    }
//    @Test
//    public void probarOrdenamientoSistemaHumano_MAL() {
//        
//        assertEquals(10,10);
//        assertTrue(5.5f==5.05f);
//        assertNotEquals("AA", "AA");
//    }
}
