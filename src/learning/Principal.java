package learning;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Exer a = new Exer();

		a.Sair();

		while (!a.nome.equals("sair")){
		
		a.Cadastrar();
	    a.Verificar();
	    a.Am();
	    a.Sair();
	    
			
		}
		
		JOptionPane.showMessageDialog(null, "Jogadores Cadastrados: "+a.jogadoresCadastrados+"\nMaior jogador: "+a.nomeMaiorAltura+" "+a.maiorAltura+" m"+"\nJogador mais velho: "+a.nomeMaiorIdade+" "+a.maiorIdade+" anos"+"\nJogafor mais pesado: "+a.nomeMaiorPeso+" "+a.maiorPeso+" kg"+"\nAltura média: "+a.alturaMedia);  
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
