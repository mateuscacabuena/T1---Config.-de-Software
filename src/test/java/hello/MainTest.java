package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
    @Test
    public void SeBMaiorQueA () {
        assertEquals(Main.iniciar(8,12,1), 4); 
    }

    @Test
    public void SeAMaiorQueB () {
        assertEquals(Main.iniciar(259,111,1), 37); 
    }
}