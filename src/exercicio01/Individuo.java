package exercicio01;

import javax.swing.JOptionPane;

public class Individuo {

	//Atributos
	String nome;
	int idade, sexo, cargo;
	int masculino=0, feminino=0;
	int gerente=0, atendente=0, acougueiro=0, secretaria=0, almoxarife=0, padeiro=0, estagiario=0;
	int maiorIdade=0, menorIdade=0;
	
	//Laço
	public void laco() {
		
		int continuar = 0;

		do {
			obterDados();
			contarHomensMulheres();
			contarCargos();
			contarIdades();
			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
		}while(continuar == 0);
		
	}
	
	//Obter dados
	public void obterDados() {
		
		//Variável para validar os dados
		boolean valida;
		
		//Nome
		nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		
		//Idade
		valida = false;
		do {
			
			try {
			
				idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
	
				valida = true;
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Informação inválida!");
			}
		
		}while(valida==false);
		
		//Sexo
		valida = false;
		do {
			
			try {
			
				sexo = Integer.parseInt(JOptionPane.showInputDialog("Informe o sexo:\n\n1)Masculino\n2)Feminino"));
			
				if((sexo==1) || (sexo==2)) {
					valida = true;
				}
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Informação inválida!");
			}
		
		}while(valida==false);
		
		//Cargo
		valida = false;
		do {
			
			try {
			
				cargo = Integer.parseInt(JOptionPane.showInputDialog("Informe o cargo:\n\n1)Gerente\n2)Atendente\n3)Açougueiro\n4)Secretária\n5)Almoxarife\n6)Padeiro\n7)Estagiário"));
			
				if((cargo>=1) && (cargo<=7)) {
					valida = true;
				}
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Informação inválida!");
			}
		
		}while(valida==false);
		
	}
	
	//Contabilizar sexos
	public void contarHomensMulheres() {
		
		if(sexo == 1) {
			masculino++;
		}else {
			feminino++;
		}
		
	}
	
	//Contabilizar cargos
	public void contarCargos() {
		
		switch (cargo) {
		case 1:
			gerente++;
		break;
		
		case 2:
			atendente++;
		break;
		
		case 3:
			acougueiro++;
		break;
		
		case 4:
			secretaria++;
		break;
		
		case 5:
			almoxarife++;
		break;
		
		case 6:
			padeiro++;
		break;
		
		case 7:
			estagiario++;
		break;

		}
	}
	
	//Contabilizar idade
	public void contarIdades() {
		if(idade >= 18) {
			maiorIdade++;
		}else {
			menorIdade++;
		}
	}
	
	//Estatísticas
	public void estatisticas() {
		
		String estatisticas = "Homens e Mulheres:";
	           estatisticas+= "\nHá "+masculino+" homens cadastrados.";
	           estatisticas+= "\nHá "+feminino+" mulheres cadastrados.";
	           estatisticas+= "\n\nMaiores e menores de idade";
	           estatisticas+= "\nHá "+maiorIdade+" maiores de idade.";
	           estatisticas+= "\nHá "+menorIdade+" menores de idade.";
	           
                             estatisticas+= "\n\nCargos:";
	           estatisticas+= "\nHá "+gerente+" gerentes cadastrados.";
	           estatisticas+= "\nHá "+atendente+" atendentes cadastrados.";
	           estatisticas+= "\nHá "+acougueiro+" açougueiros cadastrados.";
	           estatisticas+= "\nHá "+secretaria+" secretárias cadastrados.";
	           estatisticas+= "\nHá "+almoxarife+" almoxarifes cadastrados.";
	           estatisticas+= "\nHá "+padeiro+" padeiros cadastrados.";
	           estatisticas+= "\nHá "+estagiario+" estagiarios cadastrados.";
	           
	    JOptionPane.showMessageDialog(null, estatisticas);
		
	}
	
	
}


