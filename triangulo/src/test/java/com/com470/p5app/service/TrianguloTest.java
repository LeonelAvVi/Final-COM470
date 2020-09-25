/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.p5app.service;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author LEO
 */
@RunWith(Parameterized.class)
public class TrianguloTest {
    
        
    
    @Parameterized.Parameters
    public static List<Object>datos(){
        return Arrays.asList(new Object[][]{
            {2,2,2,"Equilatero"},{3,3,1,"Isoceles"},{3,1,3,"Isoceles"},{1,3,3,"Isoceles"},{1,2,3,"Escaleno"},
                {3,3,3,"Equilatero"},{12,12,1,"Isoceles"},{5,2,5,"Isoceles"},{10,30,30,"Isoceles"},{15,27,35,"Escaleno"}
        });
    }
    
    @Parameterized.Parameter(0)
    public int lado1;
    @Parameterized.Parameter(1)
    public int lado2;
    @Parameterized.Parameter(2)
    public int lado3;
    @Parameterized.Parameter(3)
    public String resultado;
     Triangulo utils = new Triangulo();
    public TrianguloTest() {
    }
    @Test
    public void testTipoTriangulo() {
        System.out.println("tipoTriangulo");   
        System.out.println("Ejecucion son:"+lado1+" "+lado2+" "+lado3);
        String tipoResultado = utils.tipoTriangulo(lado1, lado2,lado3);
        assertThat(tipoResultado, Matchers.is(resultado));
    }
    
}
