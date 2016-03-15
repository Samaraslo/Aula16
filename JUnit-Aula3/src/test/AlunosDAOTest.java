package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import to.AlunoTO;
import dao.AlunosDAO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AlunosDAOTest {
	AlunosDAO dao;
	AlunoTO to;
	
	/*
	 * Antes de rodar este teste, certifique-se que nao ha no banco
	 * nenhuma linha com o id igual ao do escolhido para o to instanciado
	 * abaixo. Se houver, delete. 
	 * Certifique-se de que o fixture cliente 1 existe no banco.
	 * Certifique-se também que sobrecarregou o equals na classe ClienteTO
	 * Além disso, a ordem de execução dos testes é importante; por isso a anotação
	 * FixMethodOrder logo acima do nome desta classe
	 */
	@Before
	public void setUp() throws Exception {
		dao = new AlunosDAO();
		to = new AlunoTO();
		to.setTelefone("123456789");
		to.setNome("Bela Lugosi");
		to.setCpf(3);
	}
	
	@Test
	public void test00Carregar() {
		//para funcionar o cliente 1 deve ter sido carregado no banco por fora
		//insert into cliente (id, nome, fone) values (1, 'nome1', 'fone1');
		AlunoTO fixture = new AlunoTO();
		fixture.setTelefone("fone1");
		fixture.setNome("nome1");
		fixture.setCpf(1);
		AlunoTO novo = dao.carregarAluno(1);
		novo.setCpf(1);
		assertEquals("testa inclusao", novo, fixture);
	}

	@Test
	public void test01Inserir() {
		try {
			dao.Create(to);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AlunoTO novo = dao.carregarAluno(to.getCpf());
		novo.setCpf(to.getCpf());
		assertEquals("testa inclusao", novo, to);
	}
	
	@Test
	public void test02Atualizar() {
		to.setTelefone("999999");
		try {
			dao.update(to);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AlunoTO novo = dao.carregarAluno(to.getCpf());
		novo.setCpf(to.getCpf());
		assertEquals("testa inclusao", novo, to);
	}
	
	@Test
	public void test03Excluir() {
		to.setNome(null);
		to.setTelefone(null);
		try {
			dao.delet(to);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AlunoTO novo = dao.carregarAluno(to.getCpf());
		novo.setCpf(to.getCpf());
		assertEquals("testa inclusao", novo, to);
	}
}
