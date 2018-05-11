package palavra;

import javax.swing.JOptionPane;

public class Palavra {

	//Atributos
	String palavra;
	
	//Obter palvra 
	public void obterPalavra(){
		palavra = JOptionPane.showInputDialog("Informe uma palavra");
		
	}
	
	//Formatar palavra
	public String formatarPalavra(){
		String palavraFormatada = "";
		for(int i =0; i< palavra.length(); i++){
			if(i % 2 ==0){
				palavraFormatada += String.valueOf(palavra.charAt(i)).toUpperCase();
			}else{
				palavraFormatada += String.valueOf(palavra.charAt(i)).toLowerCase();
			}
		}
		return palavraFormatada;
	}
	
	//Exibir palavra
	public void exibirPalavraFormatada(){
		JOptionPane.showMessageDialog(null, formatarPalavra());
	}
	

}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

