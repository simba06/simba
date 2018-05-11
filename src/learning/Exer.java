package learning;

import javax.swing.JOptionPane;


public class Exer {
	
                   
		String nome, nomeMaiorAltura, nomeMaiorPeso, nomeMaiorIdade;
		int idade, maiorIdade, jogadoresCadastrados;
		double altura, peso, maiorAltura, maiorPeso, totalaltura, alturaMedia;

		public void Cadastrar() {

			
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
			altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));
			peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso"));
			
			jogadoresCadastrados ++;
	        totalaltura += altura;

		}

		public void Verificar() {

			if (altura > maiorAltura) {
				maiorAltura = altura;
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
			
			public void Sair() {
				
				nome = JOptionPane.showInputDialog("Informe o seu nome ou SAIR para finalizar");
	        } 
			
			public double Am() {
				
				alturaMedia = totalaltura/jogadoresCadastrados;
				return alturaMedia;
			}
			
		}



