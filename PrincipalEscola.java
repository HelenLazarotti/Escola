public class PrincipalEscola {
	public static void main (String[] args) {
		Pessoa p1 = new Pessoa (null, 0, null);
		Aluno p2 = new Aluno (null, 0, null, 0, null);
		Professor p3 = new Professor (null, 0, null, null, 0);
		Funcionario p4 = new Funcionario (null, 0, null, null, false);
		
		p1.setNome("Helen");
		p2.setNome("Luiz");
		p3.setNome("Jaque");
		p4.setNome("Dora");
		
		p1.setIdade(19);
		p2.setIdade(54);
		p3.setIdade(52);
		p4.setIdade(9);
		
		p1.setSexo("Feminino");
		p2.setSexo("Masculino");
		p3.setSexo("Feminino");
		p4.setSexo("Cachorres");
		
		p2.setCurso("Nutrição");
		p3.setSalario(2500.50f);
		p4.setSetor("Estoque"); 
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		
		
	}
	
		

}
