package tentando;

import javax.swing.JOptionPane;

public class Jogadores {
	
     //Atributos
	  String nome; 
      String nomeMaiorAltura;
      String nomeMaiorPeso;
      String nomeMaiorIdade;
	 int idade, maiorIdade, jogCadastrados;
	 double altura, peso, maisAlto, maiorPeso, totalaltura, alturaMedia;

	  //Obter os dados dos jogadores
	  public void obterDados() {

		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
		
		jogCadastrados ++;
        totalaltura += altura;

	}
        //Verificar as informações
        public void Verificar() {

		if (altura > maisAlto) {
			maisAlto = altura;
			nomeMaiorAltura = nome;
		}
		if (peso > maiorPeso) {
			maiorPeso = peso;
			nomeMaiorPeso = nome;
		}
		if (idade > maiorIdade) {
			maiorIdade = idade;
			nomeMaiorIdade = nome;
		}
	}
		//Informar um nome ou sair
		public void Sair() {
			
			nome = JOptionPane.showInputDialog("Informe o seu nome ou SAIR para finalizar");
        } 
		
		//Média
		public double media() {
			
			alturaMedia = totalaltura/jogCadastrados;
			return alturaMedia;
		}
		
	}

