package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {

	//Atributos
	String nome;
	double nota1, nota2, nota3;
	
	//Obter os dados do aluno
	public void obterDados(){
		
		nome = JOptionPane.showInputDialog("Bom Dia!\n Qual � o seu nome? ");
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1� nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2� nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 3� nota"));
	}
	
	//Relizar a m�dia 
	public double calcularMedia(){
		
		double media = (nota1+nota2+nota3)/3;
		
		return media;
	}
	 
	//Obter a condi��o
	public String condicao(){
		
		String condicao = calcularMedia() >= 7 ? "Aprovado" : "Reprovado";
		
		return condicao;
	}
	
	//Exibir informa��es do aluno
	public void informacoes (){
		JOptionPane.showMessageDialog(null, 
	"O aluno "+nome+" obteve m�dia: "+calcularMedia()+ "\n e sua condi��o �: "+condicao());
	}
	
	//M�todo de repeti��o
	public void laco(){
		
		//Continuar
		int continuar = 0;
		
		//La�o
		do{
			
			obterDados();
			informacoes();
			
             continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
       
	}while(continuar == 0);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
