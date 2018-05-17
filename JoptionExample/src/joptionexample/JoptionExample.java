package joptionexample;

import javax.swing.JOptionPane;

public class JoptionExample {

   
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "Mensagem Aqui"); 
        
        // JOptionPane.showMessageDialog(null, "Mensagem Aqui", "TITULO", JOptionPane.ERROR_MESSAGE);
        
        // 0 => Não, 1 => Sim, 2 => Cancelar
        // JOptionPane.showConfirmDialog(null, "Deseja Sair");
        
//        int var = JOptionPane.showConfirmDialog(null, "Deseja Sair");
//        
//        if (var == 1) {
//            JOptionPane.showMessageDialog(null, "Você não saiu", "TITULO", JOptionPane.ERROR_MESSAGE);
//        } else if (var == 0) {
//            System.exit(0);
//        } else {
//            System.out.println("Cancelou");
//        }
//        

        // String nome = JOptionPane.showInputDialog(null, "Digite Nome: "); 
        // JOptionPane.showMessageDialog(null, nome, "Seu nome é: ", JOptionPane.INFORMATION_MESSAGE);
        
//        Por padrão é String, então tem que ser transformada
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Nome: ")); 
        JOptionPane.showMessageDialog(null, idade + " anos", "Sua idade é: ", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
