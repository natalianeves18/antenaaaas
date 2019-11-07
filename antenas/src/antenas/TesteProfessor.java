package antenas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteProfessor {

	@Test
	void retornaEmailCorreto() {
		Professor professor = new Professor(new DadosLogin("joao@gmail.com", "456"));

		assertEquals("joao@gmail.com", professor.getEmail());
	}
	
	@Test
	void alteraCorretamenteEmail() {
		Professor professor = new Professor(new DadosLogin("joao@gmail.com", "456"));
		professor.setEmail("joao1@gmail.com");

		assertEquals("joao1@gmail.com", professor.getEmail());
	}
	
	@Test
	void retornaSenhaCorreto() {
		Professor professor = new Professor(new DadosLogin("joao@gmail.com", "456"));

		assertEquals("456", professor.getSenha());
	}
	
	@Test
	void alteraCorretamenteSenha() {
		//arrange (condição/preparo do teste/preciso de um valor para depois necessariamente testar outro valor)
		Professor professor = new Professor(new DadosLogin("joao@gmail.com", "456"));
		
		//act
		professor.setSenha("1234");

		//assert
		assertEquals("1234", professor.getSenha());
	}
	
	
	
	
	
	
}