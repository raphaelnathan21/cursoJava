package logicaDeProgramacao;

public class EstruturaDeDecisao {

	public static void main(String[] args) {
		String nome = "João Reberto";
		int idade = 22;
		char sexo = 'M';

		if (sexo == 'F' && idade < 18) {
			System.out.println("Alistamento militar obrigatório!");
		}

		else {
			System.out.println("Não está dentro das normas do alistmento.");
		}

		System.out.println("________________________________________");

		if (sexo == 'M') {
			if (idade >= 18) {
				System.out.println("Alistamento militar obrigatório!");
			}

			else {
				System.out.println("Você não tem a idade necessária.");
			}

		}

		else {
			System.out.println("É preciso ser do sexo masculino para se alistar" + "com obrigatoriedade!");
		}

	}

}
