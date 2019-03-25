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
public class novapessoa {
    
    public static void main (String [] args){
        
        Pessoa eduardo = new Pessoa();
        
        eduardo.setNome ("Eduardo Gomes");
        
        eduardo.setIdade(19);
        
        eduardo.setIdade (22);
        
        System.out.println("Seu nome é " + eduardo.getNome());
        System.out.println("Sua idade é " + eduardo.getIdade());
        
        
        
    }
    
    
    
}
