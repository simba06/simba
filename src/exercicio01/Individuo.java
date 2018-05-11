package exercicio01;

import javax.swing.JOptionPane;

public class Individuo {

	//Atributos
	String nome;
	int idade, sexo, cargo;
	int masculino=0, feminino=0;
	int gerente=0, atendente=0, acougueiro=0, secretaria=0, almoxarife=0, padeiro=0, estagiario=0;
	int maiorIdade=0, menorIdade=0;
	
	//La�o
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
		
		//Vari�vel para validar os dados
		boolean valida;
		
		//Nome
		nome = JOptionPane.showInputDialog("Qual � o seu nome?");
		
		//Idade
		valida = false;
		do {
			
			try {
			
				idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
	
				valida = true;
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Informa��o inv�lida!");
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
				JOptionPane.showMessageDialog(null, "Informa��o inv�lida!");
			}
		
		}while(valida==false);
		
		//Cargo
		valida = false;
		do {
			
			try {
			
				cargo = Integer.parseInt(JOptionPane.showInputDialog("Informe o cargo:\n\n1)Gerente\n2)Atendente\n3)A�ougueiro\n4)Secret�ria\n5)Almoxarife\n6)Padeiro\n7)Estagi�rio"));
			
				if((cargo>=1) && (cargo<=7)) {
					valida = true;
				}
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Informa��o inv�lida!");
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
	
	//Estat�sticas
	public void estatisticas() {
		
		String estatisticas = "Homens e Mulheres:";
	           estatisticas+= "\nH� "+masculino+" homens cadastrados.";
	           estatisticas+= "\nH� "+feminino+" mulheres cadastrados.";
	           estatisticas+= "\n\nMaiores e menores de idade";
	           estatisticas+= "\nH� "+maiorIdade+" maiores de idade.";
	           estatisticas+= "\nH� "+menorIdade+" menores de idade.";
	           
                             estatisticas+= "\n\nCargos:";
	           estatisticas+= "\nH� "+gerente+" gerentes cadastrados.";
	           estatisticas+= "\nH� "+atendente+" atendentes cadastrados.";
	           estatisticas+= "\nH� "+acougueiro+" a�ougueiros cadastrados.";
	           estatisticas+= "\nH� "+secretaria+" secret�rias cadastrados.";
	           estatisticas+= "\nH� "+almoxarife+" almoxarifes cadastrados.";
	           estatisticas+= "\nH� "+padeiro+" padeiros cadastrados.";
	           estatisticas+= "\nH� "+estagiario+" estagiarios cadastrados.";
	           
	    JOptionPane.showMessageDialog(null, estatisticas);
		
	}
	
	
}


