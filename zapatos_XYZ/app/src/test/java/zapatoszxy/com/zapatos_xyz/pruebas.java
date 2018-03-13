package zapatoszxy.com.zapatos_xyz;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class pruebas {


    @Test
    public void zapatillasHombre1(){
        //Zapatillas Nike Hombre, 1
        assertEquals(120000, metodos.preciosHombre(1,1));
    }

    @Test
    public void zapatillasHombre2(){
        //Zapatillas Adidas Hombre, 1
        assertEquals(140000, metodos.preciosHombre(1,2));
    }

    @Test
    public void zapatillasHombre3(){
        //Zapatillas Puma Hombre, 1
        assertEquals(130000, metodos.preciosHombre(1,3));
    }

    @Test
    public void clasicosHombre1(){
        //Clasicos Nike Hombre, 1
        assertEquals(50000, metodos.preciosHombre(2,1));
    }

    @Test
    public void clasicosHombre2(){
        //Clasicos Adidas Hombre, 1
        assertEquals(80000, metodos.preciosHombre(2,2));
    }

    @Test
    public void clasicosHombre3(){
        //Clasicos Puma Hombre, 1
        assertEquals(100000, metodos.preciosHombre(2,3));
    }

    @Test
    public void clasicosHombre1Multiplicando(){
        //Clasicos Nike Hombre, 100
        int precio=metodos.preciosHombre(2,1);
        assertEquals(5000000, metodos.valorAPagar(precio, 100));
    }

    @Test
    public void zapatillaMujer1(){
        //Zapatillas Nike Mujer, 1
        assertEquals(100000, metodos.preciosMujer(1,1));
    }

    @Test
    public void zapatillaMujer2(){
        //Zapatillas Adidas Mujer, 1
        assertEquals(130000, metodos.preciosMujer(1,2));
    }

    @Test
    public void zapatillasMujer3(){
        //Zapatillas Puma Mujer, 1
        assertEquals(110000, metodos.preciosMujer(1,3));
    }

    @Test
    public void clasicosMujer1(){
        //Clasicos Nike Mujer, 1
        assertEquals(60000, metodos.preciosMujer(2,1));
    }

    @Test
    public void clasicosMujer2(){
        //Clasicos Adidas Mujer, 1
        assertEquals(70000, metodos.preciosMujer(2,2));
    }

    @Test
    public void clasicosMujer3(){
        //Clasicos Puma Mujer, 1
        assertEquals(120000, metodos.preciosMujer(2,3));
    }

}