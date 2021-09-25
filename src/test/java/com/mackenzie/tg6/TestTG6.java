package com.mackenzie.tg6;

import static org.junit.Assert.assertEquals;

import com.mackenzie.tg6.models.Cliente;

import org.junit.Test;

public class TestTG6 {
    @Test
    public void CT1() {
        String negado = "Empréstimo Negado";

        assertEquals(negado, TG6.liberarEmprestimo(new Cliente(950, false, false)));
    }

    @Test
    public void CT2(){
        String liberado = "Empréstimo Concedido";
        assertEquals(liberado, TG6.liberarEmprestimo(new Cliente(2000, true, true)));
    }

    @Test
    public void CT3(){
        String liberado = "Empréstimo Concedido";
        assertEquals(liberado, TG6.liberarEmprestimo(new Cliente(2000, true, true)));
    }
    @Test
    public void CT4(){
        String liberado = "Empréstimo Concedido";
        assertEquals(liberado, TG6.liberarEmprestimo(new Cliente(2000, false, true)));

    }
    @Test
    public void CT5(){
        String liberado = "Empréstimo Concedido";
        assertEquals(liberado, TG6.liberarEmprestimo(new Cliente(2000, true, false)));

    }
    @Test
    public void CT6(){
        String liberado = "Empréstimo Concedido";
        assertEquals(liberado, TG6.liberarEmprestimo(new Cliente(2000, false, false)));
    }
    @Test
    public void CT7(){
        String liberado = "Empréstimo Concedido";
        assertEquals(liberado, TG6.liberarEmprestimo(new Cliente(950, false, true)));

    }
    @Test
    public void CT8(){
        String liberado = "Empréstimo Concedido";
        assertEquals(liberado, TG6.liberarEmprestimo(new Cliente(950, true, false)));

    }
    @Test
    public void CT9(){
        String liberado = "Empréstimo Concedido";
        assertEquals(liberado, TG6.liberarEmprestimo(new Cliente(950, true, false)));
    }
    @Test
    public void CT10(){
        String negado = "Empréstimo Negado";
        assertEquals(negado, TG6.liberarEmprestimo(new Cliente(950, true, true)));

    }
}
