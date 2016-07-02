import br.com.study.dao.impl.TesteDAOIMPL;
import br.com.study.entities.Teste;


public class TesteProg {
	public static void main(String[] args) {
		TesteDAOIMPL test = new TesteDAOIMPL();
		Teste teste = new Teste();
		System.out.println("inicio");
		teste.setValue("Geovan");
		test.save(teste);
		System.out.println("Fim");
	}
}
