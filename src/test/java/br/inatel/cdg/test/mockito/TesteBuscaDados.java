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

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TesteBuscaDados {

    @Mock
    private DadosService service;

    private BuscaDados buscaDados;

    @Before
    public void setup(){buscaDados = new BuscaDados(service);}

    @Test
    public void testBuscaRenzo(){
        Mockito.when(service.busca(8)).thenReturn(DadosConst.Renzo);

        Dados renzo = buscaDados.buscaDado(8);

        assertEquals("Renzo", renzo.getNomeDoProfessor());
        assertEquals(8, renzo.gethorarioDeAtendimento(),0.1);
        assertEquals(1, renzo.getperiodo(), 0.1);
        assertEquals(1, renzo.getsala(), 0.1);
        assertEquals(1, renzo.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaProfessorMarcelo(){
        Mockito.when(service.busca(9)).thenReturn(DadosConst.Marcelo);

        Dados marcelo = buscaDados.buscaDado(9);

        assertEquals("Marcelo", marcelo.getNomeDoProfessor());
        assertEquals(9, marcelo.gethorarioDeAtendimento(),0.1);
        assertEquals(2, marcelo.getperiodo(), 0.1);
        assertEquals(2, marcelo.getsala(), 0.1);
        assertEquals(1, marcelo.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaProfessorChris(){
        Mockito.when(service.busca(10)).thenReturn(DadosConst.Chris);

        Dados chris = buscaDados.buscaDado(10);

        assertEquals("Chris", chris.getNomeDoProfessor());
        assertEquals(10, chris.gethorarioDeAtendimento(),0.1);
        assertEquals(3, chris.getperiodo(), 0.1);
        assertEquals(10, chris.getsala(), 0.1);
        assertEquals(1, chris.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaProfessorJoao(){
        Mockito.when(service.busca(11)).thenReturn(DadosConst.Joao);

        Dados joao = buscaDados.buscaDado(11);

        assertEquals("Joao", joao.getNomeDoProfessor());
        assertEquals(11, joao.gethorarioDeAtendimento(),0.1);
        assertEquals(4, joao.getperiodo(), 0.1);
        assertEquals(11, joao.getsala(), 0.1);
        assertEquals(1, joao.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaProfessorMaria(){
        Mockito.when(service.busca(12)).thenReturn(DadosConst.Maria);

        Dados maria = buscaDados.buscaDado(12);

        assertEquals("Maria", maria.getNomeDoProfessor());
        assertEquals(12, maria.gethorarioDeAtendimento(),0.1);
        assertEquals(5, maria.getperiodo(), 0.1);
        assertEquals(12, maria.getsala(), 0.1);
        assertEquals(2, maria.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaProfessorJoana(){
        Mockito.when(service.busca(13)).thenReturn(DadosConst.Joana);

        Dados joana = buscaDados.buscaDado(13);

        assertEquals("Joana", joana.getNomeDoProfessor());
        assertEquals(13, joana.gethorarioDeAtendimento(),0.1);
        assertEquals(6, joana.getperiodo(), 0.1);
        assertEquals(13, joana.getsala(), 0.1);
        assertEquals(2, joana.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaProfessorCarol(){
        Mockito.when(service.busca(14)).thenReturn(DadosConst.Carol);

        Dados carol = buscaDados.buscaDado(14);

        assertEquals("Carol", carol.getNomeDoProfessor());
        assertEquals(14, carol.gethorarioDeAtendimento(),0.1);
        assertEquals(7, carol.getperiodo(), 0.1);
        assertEquals(14, carol.getsala(), 0.1);
        assertEquals(2, carol.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaProfessorFlavia(){
        Mockito.when(service.busca(15)).thenReturn(DadosConst.Flavia);

        Dados flavia = buscaDados.buscaDado(15);

        assertEquals("Flavia", flavia.getNomeDoProfessor());
        assertEquals(15, flavia.gethorarioDeAtendimento(),0.1);
        assertEquals(8, flavia.getperiodo(), 0.1);
        assertEquals(15, flavia.getsala(), 0.1);
        assertEquals(2, flavia.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaProfessorMJ(){
        Mockito.when(service.busca(16)).thenReturn(DadosConst.MJ);

        Dados mj = buscaDados.buscaDado(16);

        assertEquals("MJ", mj.getNomeDoProfessor());
        assertEquals(16, mj.gethorarioDeAtendimento(),0.1);
        assertEquals(9, mj.getperiodo(), 0.1);
        assertEquals(16, mj.getsala(), 0.1);
        assertEquals(3, mj.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaProfessorJoaquim(){
        Mockito.when(service.busca(17)).thenReturn(DadosConst.Joaquim);

        Dados joaquim = buscaDados.buscaDado(17);

        assertEquals("Joaquim", joaquim.getNomeDoProfessor());
        assertEquals(17, joaquim.gethorarioDeAtendimento(),0.1);
        assertEquals(10, joaquim.getperiodo(), 0.1);
        assertEquals(17, joaquim.getsala(), 0.1);
        assertEquals(3, joaquim.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaRenzoNomeErrado(){
        Mockito.when(service.busca(8)).thenReturn(DadosConst.Renzo);

        Dados renzo = buscaDados.buscaDado(8);

        assertNotSame("Renzo", renzo.getNomeDoProfessor());
        assertEquals(8, renzo.gethorarioDeAtendimento(),0.1);
        assertEquals(1, renzo.getperiodo(), 0.1);
        assertEquals(1, renzo.getsala(), 0.1);
        assertEquals(1, renzo.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaMarceloHorarioErrado(){
        Mockito.when(service.busca(9)).thenReturn(DadosConst.Marcelo);

        Dados marcelo = buscaDados.buscaDado(9);

        assertEquals("Marcelo", marcelo.getNomeDoProfessor());
        assertNotEquals(8, marcelo.gethorarioDeAtendimento(),0.1);
        assertEquals(2, marcelo.getperiodo(), 0.1);
        assertEquals(2, marcelo.getsala(), 0.1);
        assertEquals(1, marcelo.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaChrisPeriodo(){
        Mockito.when(service.busca(10)).thenReturn(DadosConst.Chris);

        Dados chris = buscaDados.buscaDado(10);

        assertEquals("Chris", chris.getNomeDoProfessor());
        assertEquals(10, chris.gethorarioDeAtendimento(),0.1);
        assertNotEquals(5, chris.getperiodo(), 0.1);
        assertEquals(10, chris.getsala(), 0.1);
        assertEquals(1, chris.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaJoaoSalaErrada(){
        Mockito.when(service.busca(11)).thenReturn(DadosConst.Joao);

        Dados joao = buscaDados.buscaDado(11);

        assertEquals("Joao", joao.getNomeDoProfessor());
        assertEquals(11, joao.gethorarioDeAtendimento(),0.1);
        assertEquals(4, joao.getperiodo(), 0.1);
        assertNotEquals(12, joao.getsala(), 0.1);
        assertEquals(1, joao.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaMariaPeriodoErrado(){
        Mockito.when(service.busca(12)).thenReturn(DadosConst.Maria);

        Dados maria = buscaDados.buscaDado(12);

        assertEquals("Maria", maria.getNomeDoProfessor());
        assertEquals(12, maria.gethorarioDeAtendimento(),0.1);
        assertEquals(5, maria.getperiodo(), 0.1);
        assertEquals(12, maria.getsala(), 0.1);
        assertNotEquals(15, maria.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaJoanaSemNome(){
        Mockito.when(service.busca(13)).thenReturn(DadosConst.Joana);

        Dados joana = buscaDados.buscaDado(13);

        assertNotEquals("", joana.getNomeDoProfessor());
        assertEquals(13, joana.gethorarioDeAtendimento(),0.1);
        assertEquals(6, joana.getperiodo(), 0.1);
        assertEquals(13, joana.getsala(), 0.1);
        assertEquals(2, joana.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaCarolPeriodo(){
        Mockito.when(service.busca(14)).thenReturn(DadosConst.Carol);

        Dados carol = buscaDados.buscaDado(14);

        assertEquals("Carol", carol.getNomeDoProfessor());
        assertEquals(14, carol.gethorarioDeAtendimento(),0.1);
        assertNotEquals(74, carol.getperiodo(), 0.1);
        assertEquals(14, carol.getsala(), 0.1);
        assertEquals(2, carol.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaFlaviaHorarioDeAtendimentoErrado(){
        Mockito.when(service.busca(15)).thenReturn(DadosConst.Flavia);

        Dados flavia = buscaDados.buscaDado(15);

        assertEquals("Flavia", flavia.getNomeDoProfessor());
        assertNotSame("TESTE", flavia.gethorarioDeAtendimento(),0.1);
        assertEquals(8, flavia.getperiodo(), 0.1);
        assertEquals(15, flavia.getsala(), 0.1);
        assertEquals(2, flavia.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaMJSemSala(){
        Mockito.when(service.busca(16)).thenReturn(DadosConst.MJ);

        Dados mj = buscaDados.buscaDado(16);

        assertEquals("MJ", mj.getNomeDoProfessor());
        assertEquals(16, mj.gethorarioDeAtendimento(),0.1);
        assertEquals(9, mj.getperiodo(), 0.1);
        assertNotEquals(0, mj.getsala(), 0.1);
        assertEquals(3, mj.getpredio().get(0).getAsInt());

    }

    @Test
    public void testBuscaJoaquimNomeError(){
        Mockito.when(service.busca(17)).thenReturn(DadosConst.Joaquim);

        Dados joaquim = buscaDados.buscaDado(17);

        assertNotSame("Joaquim", joaquim.getNomeDoProfessor());
        assertEquals(17, joaquim.gethorarioDeAtendimento(),0.1);
        assertEquals(10, joaquim.getperiodo(), 0.1);
        assertEquals(17, joaquim.getsala(), 0.1);
        assertEquals(3, joaquim.getpredio().get(0).getAsInt());

    }



}
