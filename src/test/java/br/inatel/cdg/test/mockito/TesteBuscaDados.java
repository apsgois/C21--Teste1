package br.inatel.cdg.test.mockito;


import br.inatel.cdg.BuscaDados;
import br.inatel.cdg.DadosService;
import br.inatel.cdg.Dados;
import br.inatel.cdg.test.DadosConst;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class TesteBuscaDados {

    @Mock
    private DadosService service;

    private BuscaDados buscaDados;

    @Before
    public void setup(){buscaDados = new BuscaDados(service);}

    @Test
    public void testBuscaProfessorRenzo(){
        Mockito.when(service.busca(8)).thenReturn(DadosConst.Renzo);

        Dados renzo = buscaDados.buscaDado(8);

        assertEquals("Renzo", renzo.getNomeDoProfessor());
        assertEquals(8, renzo.gethorarioDeAtendimento(),0.1);
        assertEquals(1, renzo.getperiodo(), 0.1);
        assertEquals(1, renzo.getsala(), 0.1);
        assertEquals(1, renzo.getpredio().get(0));

    }

    @Test
    public void testBuscaProfessorMarcelo(){
        Mockito.when(service.busca(8)).thenReturn(DadosConst.Marcelo);

        Dados marcelo = buscaDados.buscaDado(8);

        assertEquals("Marcelo", marcelo.getNomeDoProfessor());
        assertEquals(9, marcelo.gethorarioDeAtendimento(),0.1);
        assertEquals(2, marcelo.getperiodo(), 0.1);
        assertEquals(2, marcelo.getsala(), 0.1);
        assertEquals(1, marcelo.getpredio().get(0));

    }

    @Test
    public void testBuscaProfessorChris(){
        Mockito.when(service.busca(8)).thenReturn(DadosConst.Chris);

        Dados chris = buscaDados.buscaDado(8);

        assertEquals("Chris", chris.getNomeDoProfessor());
        assertEquals(10, chris.gethorarioDeAtendimento(),0.1);
        assertEquals(3, chris.getperiodo(), 0.1);
        assertEquals(3, chris.getsala(), 0.1);
        assertEquals(1, chris.getpredio().get(0));

    }

    @Test
    public void testBuscaProfessorJoao(){
        Mockito.when(service.busca(8)).thenReturn(DadosConst.Joao);

        Dados joao = buscaDados.buscaDado(8);

        assertEquals("Joao", joao.getNomeDoProfessor());
        assertEquals(11, joao.gethorarioDeAtendimento(),0.1);
        assertEquals(4, joao.getperiodo(), 0.1);
        assertEquals(4, joao.getsala(), 0.1);
        assertEquals(1, joao.getpredio().get(0));

    }

    @Test
    public void testBuscaProfessorMaria(){
        Mockito.when(service.busca(8)).thenReturn(DadosConst.Maria);

        Dados maria = buscaDados.buscaDado(8);

        assertEquals("Maria", maria.getNomeDoProfessor());
        assertEquals(12, maria.gethorarioDeAtendimento(),0.1);
        assertEquals(5, maria.getperiodo(), 0.1);
        assertEquals(5, maria.getsala(), 0.1);
        assertEquals(1, maria.getpredio().get(0));

    }

    @Test
    public void testBuscaProfessorJoana(){
        Mockito.when(service.busca(8)).thenReturn(DadosConst.Joana);

        Dados joana = buscaDados.buscaDado(8);

        assertEquals("Maria", joana.getNomeDoProfessor());
        assertEquals(13, joana.gethorarioDeAtendimento(),0.1);
        assertEquals(6, joana.getperiodo(), 0.1);
        assertEquals(6, joana.getsala(), 0.1);
        assertEquals(1, joana.getpredio().get(0));

    }

    @Test
    public void testBuscaProfessorCarol(){
        Mockito.when(service.busca(8)).thenReturn(DadosConst.Carol);

        Dados carol = buscaDados.buscaDado(8);

        assertEquals("Maria", carol.getNomeDoProfessor());
        assertEquals(14, carol.gethorarioDeAtendimento(),0.1);
        assertEquals(7, carol.getperiodo(), 0.1);
        assertEquals(7, carol.getsala(), 0.1);
        assertEquals(1, carol.getpredio().get(0));

    }

    @Test
    public void testBuscaProfessorFlavia(){
        Mockito.when(service.busca(8)).thenReturn(DadosConst.Flavia);

        Dados flavia = buscaDados.buscaDado(8);

        assertEquals("Flavia", flavia.getNomeDoProfessor());
        assertEquals(15, flavia.gethorarioDeAtendimento(),0.1);
        assertEquals(8, flavia.getperiodo(), 0.1);
        assertEquals(8, flavia.getsala(), 0.1);
        assertEquals(1, flavia.getpredio().get(0));

    }

    @Test
    public void testBuscaProfessorMJ(){
        Mockito.when(service.busca(8)).thenReturn(DadosConst.MJ);

        Dados mj = buscaDados.buscaDado(8);

        assertEquals("MJ", mj.getNomeDoProfessor());
        assertEquals(16, mj.gethorarioDeAtendimento(),0.1);
        assertEquals(9, mj.getperiodo(), 0.1);
        assertEquals(9, mj.getsala(), 0.1);
        assertEquals(1, mj.getpredio().get(0));

    }

    @Test
    public void testBuscaProfessorJoaquim(){
        Mockito.when(service.busca(8)).thenReturn(DadosConst.Joaquim);

        Dados joaquim = buscaDados.buscaDado(8);

        assertEquals("Joaquim", joaquim.getNomeDoProfessor());
        assertEquals(17, joaquim.gethorarioDeAtendimento(),0.1);
        assertEquals(10, joaquim.getperiodo(), 0.1);
        assertEquals(10, joaquim.getsala(), 0.1);
        assertEquals("1", joaquim.getpredio().get(0));

    }

    @Test
    public void testBuscaProfessorInexistente(){
        Mockito.when(service.busca(8)).thenReturn(DadosConst.INEXISTENTE);

        Dados inexistente = buscaDados.buscaDado(8);

        assertEquals("INEXISTENTE", inexistente.getNomeDoProfessor());
        assertEquals(00, inexistente.gethorarioDeAtendimento(),0.1);
        assertEquals(0, inexistente.getperiodo(), 0.1);
        assertEquals(1, inexistente.getsala(), 0.1);
        assertEquals(1, inexistente.getpredio().get(0));

    }


}
