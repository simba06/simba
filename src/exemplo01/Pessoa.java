//Classe = Molde
package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa{

    //Atributos
    String nome;
    int idade;
    double peso, altura;
    
    //M�todo de apresenta��o
    public void apresentacao(){
       JOptionPane.showMessageDialog(null, "Ol�! Meu nome � "+nome);
    }
      
    //M�todo para informar se � maior de idade
       public void verificarIdade() {
    	   
    	   //Situa��o
    	  String situacao = idade >=18 ? "maior de idade" : "menor de idade";
    	  
    	  //Exibir situacao
    	  JOptionPane.showMessageDialog(null, nome+" � "+situacao);
       }
       
       
       //M�todo para realizar o calculo de IMC
       public double calculoIMC(){
    	   
    	   //V�riavel contendo o calculo do IMC
    	   double imc = peso / Math.pow(altura, 2);
    	   
    	   //Retorno
    	   return imc;
       }
       
    //M�todo para exibir a situa��o do IMC da pessoa
       public void situacaoIMC(){
    	
    	   
    	   //Obter o calculo IMC
    	   double imc = calculoIMC();
    	   
    	   //Situa�ao
    	   if(imc<17){
    		   JOptionPane.showMessageDialog(null, "Muito abaixo do peso");
    	}else if(imc < 18.5){
    		   JOptionPane.showMessageDialog(null,"Abaixo do peso");
    	}else if(imc < 25){
    		JOptionPane.showMessageDialog(null,"Peso normal");
    	}else if(imc < 30){
    		JOptionPane.showMessageDialog(null, "Obesidade I");
    	}else if (imc < 35){
    		JOptionPane.showMessageDialog(null,"Obesidade II");
    	}else{
    		JOptionPane.showMessageDialog(null,"Obesidade III" );
    	}
      
       
       
       }
       
       
       
       
       
       
 
       
       
}