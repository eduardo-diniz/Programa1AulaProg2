/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author eduardo
 */
public class Pessoa {

   private String nome;
   private int idade;
   
   
   public void setNome(String nome){
     this.nome = nome;
   }
   
   public void  setIdade(int idade){
       this.idade = idade;
   }
   
    public String getNome(){
       return nome;
   }
   
   public int  getIdade(){
       return idade;
   }
   
    public static void fazerAniversario (String[] args) {
        
    }
    
}
