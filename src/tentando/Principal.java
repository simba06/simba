package tentando;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Jogadores a = new Jogadores();

		a.Sair();

		while (!a.nome.equals("sair")){
		
		a.obterDados();
	    a.Verificar();
	    a.media();
	    a.Sair();
	    
			
		}
		
		JOptionPane.showMessageDialog(null, "Total de jogadores Cadastrados: "+a.jogCadastrados+"\nO maior jogador �: "+a.nomeMaiorAltura+" "+a.maisAlto+"\nO jogador mais velho �: "+a.nomeMaiorIdade+"com "+a.maiorIdade+"anos\nO jogador mais pesado �: "+a.nomeMaiorPeso+" "+a.maiorPeso+" kg"+"\nA altura m�dia �: "+a.alturaMedia);  
	}

}
