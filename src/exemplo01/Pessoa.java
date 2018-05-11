//Classe = Molde
package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa{

    //Atributos
    String nome;
    int idade;
    double peso, altura;
    
    //Método de apresentação
    public void apresentacao(){
       JOptionPane.showMessageDialog(null, "Olá! Meu nome é "+nome);
    }
      
    //Método para informar se é maior de idade
       public void verificarIdade() {
    	   
    	   //Situação
    	  String situacao = idade >=18 ? "maior de idade" : "menor de idade";
    	  
    	  //Exibir situacao
    	  JOptionPane.showMessageDialog(null, nome+" é "+situacao);
       }
       
       
       //Método para realizar o calculo de IMC
       public double calculoIMC(){
    	   
    	   //Váriavel contendo o calculo do IMC
    	   double imc = peso / Math.pow(altura, 2);
    	   
    	   //Retorno
    	   return imc;
       }
       
    //Método para exibir a situação do IMC da pessoa
       public void situacaoIMC(){
    	
    	   
    	   //Obter o calculo IMC
    	   double imc = calculoIMC();
    	   
    	   //Situaçao
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