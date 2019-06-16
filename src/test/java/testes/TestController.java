package testes;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import controller.Control;
import model.Pessoa;

public class TestController {
	
	
	private Control ct;
	private Pessoa p;
	
	@Before
	public void setUp() throws Exception {
		ct = new Control();
	}
	
	
	@Test
	public void calcular_baixo3_2() {
		
		String retorno = "baixo(3/2)";
		
		p = new Pessoa();
		
		p.setMusculacao(30);
		p.setEliptco(1);
		p.setCorrida(0);
		p.setCarb(1);
		p.setNatacao(1);
		p.setBike(1);
		p.setPedal(1);
		p.setTenis(1);
		p.setVoleiAreia(1);
		p.setAtividade(1);
		p.setCaminhada(1);
		p.setPilates(1);
		p.setSono(1);
		
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	
	@Test
	public void calcular_alto_15_3() {
		
		String retorno = "alto(15/3)";
		
		p = new Pessoa();
		
		p.setEliptco(31);
		p.setCorrida(0);
		p.setCarb(0);
		p.setNatacao(0);
		p.setBike(0);
		p.setPedal(0);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(81);
		p.setMusculacao(30);
		p.setCaminhada(0);
		p.setSono(0);
		p.setPilates(0);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	
	@Test
	public void calcular_alto_50_10() {
		
		String retorno = "ideal(50/10)";
		
		p = new Pessoa();
		
		p.setEliptco(31);
		p.setCorrida(0);
		p.setCarb(0);
		p.setNatacao(0);
		p.setBike(0);
		p.setPedal(0);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(80);
		p.setMusculacao(30);
		p.setCaminhada(0);
		p.setSono(0);
		p.setPilates(0);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	
	@Test
	public void calcular_alto_3_1() {
		
		String retorno = "alto(3/1)";
		
		p = new Pessoa();
		
		p.setEliptco(30);
		p.setCorrida(0);
		p.setCarb(255);
		p.setNatacao(0);
		p.setBike(1);
		p.setPedal(1);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(0);
		p.setMusculacao(30);
		p.setCaminhada(0);
		p.setSono(0);
		p.setPilates(0);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	@Test
	public void calcular_ideal_2() {
		
		String retorno = "ideal(2)";
		
		p = new Pessoa();
		
		p.setEliptco(30);
		p.setCorrida(0);
		p.setCarb(255);
		p.setNatacao(0);
		p.setBike(1);
		p.setPedal(0);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(0);
		p.setMusculacao(30);
		p.setCaminhada(0);
		p.setSono(0);
		p.setPilates(0);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	
	@Test
	public void calcular_ideal_123_34() {
		
		String retorno = "ideal(123/34)";
		
		p = new Pessoa();
		
		p.setEliptco(30);
		p.setCorrida(0);
		p.setCarb(255);
		p.setNatacao(0);
		p.setBike(0);
		p.setPedal(0);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(0);
		p.setMusculacao(30);
		p.setCaminhada(0);
		p.setSono(0);
		p.setPilates(0);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	
	@Test
	public void calcular_baixo_3_2() {
		
		String retorno = "baixo(3/2)";
		
		p = new Pessoa();
		
		p.setEliptco(30);
		p.setCorrida(0);
		p.setCarb(255);
		p.setNatacao(1);
		p.setBike(0);
		p.setPedal(0);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(0);
		p.setMusculacao(30);
		p.setCaminhada(0);
		p.setSono(0);
		p.setPilates(0);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	
	@Test
	public void calcular_ideal_5_2() {
		
		String retorno = "ideal(5/2)";
		
		p = new Pessoa();
		
		p.setEliptco(30);
		p.setCorrida(1);
		p.setCarb(255);
		p.setNatacao(1);
		p.setBike(0);
		p.setPedal(0);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(0);
		p.setMusculacao(30);
		p.setCaminhada(0);
		p.setSono(0);
		p.setPilates(0);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	
	@Test
	public void calcular_ideal_25_1() {
		
		String retorno = "ideal(25/1)";
		
		p = new Pessoa();
		
		p.setEliptco(30);
		p.setCorrida(0);
		p.setCarb(257);
		p.setNatacao(1);
		p.setBike(0);
		p.setPedal(0);
		p.setTenis(1);
		p.setVoleiAreia(0);
		p.setAtividade(0);
		p.setMusculacao(30);
		p.setCaminhada(0);
		p.setSono(0);
		p.setPilates(0);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	
	@Test
	public void calcular_ideal_2_1() {
		
		String retorno = "ideal(2/1)";
		
		p = new Pessoa();
		
		p.setEliptco(30);
		p.setCorrida(0);
		p.setCarb(257);
		p.setNatacao(1);
		p.setBike(0);
		p.setPedal(0);
		p.setTenis(0);
		p.setVoleiAreia(1);
		p.setAtividade(0);
		p.setMusculacao(30);
		p.setCaminhada(0);
		p.setSono(0);
		p.setPilates(0);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	
	@Test
	public void calcular_ideal_23_10() {
		
		String retorno = "ideal(23/10)";
		
		p = new Pessoa();
		
		p.setEliptco(30);
		p.setCorrida(0);
		p.setCarb(257);
		p.setNatacao(1);
		p.setBike(0);
		p.setPedal(0);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(80);
		p.setMusculacao(30);
		p.setCaminhada(0);
		p.setSono(0);
		p.setPilates(0);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	
	@Test
	public void calcular_alto_25_5() {
		
		String retorno = "alto(25/5)";
		
		p = new Pessoa();
		
		p.setEliptco(30);
		p.setCorrida(0);
		p.setCarb(257);
		p.setNatacao(1);
		p.setBike(0);
		p.setPedal(0);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(82);
		p.setMusculacao(30);
		p.setCaminhada(0);
		p.setSono(0);
		p.setPilates(0);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	@Test
	public void calcular_ideal_50_10() {
		
		String retorno = "ideal(50/10)";
		
		p = new Pessoa();
		
		p.setEliptco(31);
		p.setCorrida(0);
		p.setCarb(257);
		p.setNatacao(1);
		p.setBike(0);
		p.setPedal(0);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(80);
		p.setMusculacao(30);
		p.setCaminhada(0);
		p.setSono(0);
		p.setPilates(0);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	
	@Test
	public void calcular_baixa_8_16() {
		
		String retorno = "baixo(8/16)";
		
		p = new Pessoa();
		
		p.setEliptco(31);
		p.setCorrida(0);
		p.setCarb(0);
		p.setNatacao(1);
		p.setBike(0);
		p.setPedal(0);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(0);
		p.setMusculacao(31);
		p.setCaminhada(0);
		p.setSono(7);
		p.setPilates(0);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	
	@Test
	public void calcular_ideal_1() {
		
		String retorno = "ideal(1)";
		
		p = new Pessoa();
		
		p.setEliptco(31);
		p.setCorrida(0);
		p.setCarb(0);
		p.setNatacao(1);
		p.setBike(0);
		p.setPedal(0);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(0);
		p.setMusculacao(31);
		p.setCaminhada(0);
		p.setSono(9);
		p.setPilates(0);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	
	@Test
	public void calcular_ideal_alto_8_4() {
		
		String retorno = "alto(8/4)";
		
		p = new Pessoa();
		
		p.setEliptco(31);
		p.setCorrida(0);
		p.setCarb(0);
		p.setNatacao(0);
		p.setBike(0);
		p.setPedal(0);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(0);
		p.setMusculacao(31);
		p.setCaminhada(0);
		p.setSono(9);
		p.setPilates(0);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	
	@Test
	public void calcular_ideal_4() {
		
		String retorno = "ideal(4)";
		
		p = new Pessoa();
		
		p.setEliptco(31);
		p.setCorrida(0);
		p.setCarb(0);
		p.setNatacao(0);
		p.setBike(1);
		p.setPedal(1);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(0);
		p.setMusculacao(31);
		p.setCaminhada(0);
		p.setSono(9);
		p.setPilates(0);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	
	@Test
	public void calcular_alto_15_5() {
		
		String retorno = "alto(15/5)";
		
		p = new Pessoa();
		
		p.setEliptco(31);
		p.setCorrida(0);
		p.setCarb(0);
		p.setNatacao(0);
		p.setBike(1);
		p.setPedal(0);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(0);
		p.setMusculacao(31);
		p.setCaminhada(0);
		p.setSono(9);
		p.setPilates(0);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	
	@Test
	public void calcular_baixo_8_16() {
		
		String retorno = "baixo(8/16)";
		
		p = new Pessoa();
		
		p.setEliptco(31);
		p.setCorrida(0);
		p.setCarb(0);
		p.setNatacao(0);
		p.setBike(1);
		p.setPedal(0);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(0);
		p.setMusculacao(31);
		p.setCaminhada(0);
		p.setSono(7);
		p.setPilates(0);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	@Test
	public void calcular_edeal_63_10() {
		
		String retorno = "ideal(63/10)";
		
		p = new Pessoa();
		
		p.setEliptco(31);
		p.setCorrida(0);
		p.setCarb(0);
		p.setNatacao(0);
		p.setBike(1);
		p.setPedal(0);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(0);
		p.setMusculacao(31);
		p.setCaminhada(80);
		p.setSono(7);
		p.setPilates(1);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	
	@Test
	public void calcular_edeal_3() {
		
		String retorno = "ideal(3)";
		
		p = new Pessoa();
		
		p.setEliptco(31);
		p.setCorrida(0);
		p.setCarb(0);
		p.setNatacao(0);
		p.setBike(1);
		p.setPedal(0);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(0);
		p.setMusculacao(31);
		p.setCaminhada(81);
		p.setSono(7);
		p.setPilates(1);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}
	@Test
	public void calcular_ideal_2_4() {
		
		String retorno = "baixo(2/4)";
		
		p = new Pessoa();
		
		p.setEliptco(31);
		p.setCorrida(0);
		p.setCarb(0);
		p.setNatacao(0);
		p.setBike(1);
		p.setPedal(1);
		p.setTenis(0);
		p.setVoleiAreia(0);
		p.setAtividade(0);
		p.setMusculacao(31);
		p.setCaminhada(81);
		p.setSono(7);
		p.setPilates(1);
		
		System.out.println(ct.calcular(p));
		String calculado = ct.calcular(p);
		
		assertTrue(calculado.equals(retorno));
	}

}
