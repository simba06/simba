package exemplo01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar o objeto (criar)
		Pessoa p1 = new Pessoa();
		p1.altura = 1.70;
		p1.idade = 20;
		p1.nome ="Andressa";
		p1.peso = 56;
		
		//Instaciar outro objeto
		Pessoa p2 = new Pessoa();
		p2.altura= 1.81;
		p2.idade= 27;
		p2.nome= "Ricardo";
		p2.peso = 79;
		
		//Chamar m�todos
		p1.apresentacao();
		p1.verificarIdade();
		JOptionPane.showMessageDialog(null, p1.calculoIMC());
		p1.situacaoIMC();
		
		p2.apresentacao();
		p2.verificarIdade();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		

	}

}
