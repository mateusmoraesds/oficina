package EntradaOficina;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;


public class ClassePrincipal {

	public static void main(String[] args) {
		
		Scanner loc = new Scanner(System.in);
		
		int tentativa = 0;
		String quest2 ="";
		String quest3 ="";
		int rev = 0;
		int revOleo = 0;
     
		while (tentativa < 5){
    
        String usuario = JOptionPane.showInputDialog(null,"Digite o Usu�rio: ");
        int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a Senha: "));
       
        if ("oficina".equals(usuario) && senha == Integer.valueOf(1234)){
            JOptionPane.showMessageDialog(null, "Seja Bem-vindo! Acesso Liberado!");
            break;
        } else {
            JOptionPane.showMessageDialog(null, "Usu�rio ou Senha Incorreto ! Tente Novamente !");
            tentativa++;
        	}
		}
		
		while (rev < 5){

		DadosVeiculo v1 = new DadosVeiculo();
		v1.statusCad();
		
		int rev1 = JOptionPane.showConfirmDialog(null, "Deseja revisar os dados referente ao cadastro ?");
        // 0=yes, 1=no, 2=cancel
		if (rev1 == Integer.valueOf(1)){
            JOptionPane.showMessageDialog(null, "Dados de cadastro confirmados!");
            break;
			}else if(rev1 == Integer.valueOf(2)){	
			JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
			System.exit(2);
            }else{
            JOptionPane.showMessageDialog(null, "Preencha novamente os dados:");
            rev++;
            	}
		}
		
		while (revOleo < 5){
		
		DadosOleo o1 = new DadosOleo();
		o1.DadosOleo();
		
		int rev2 = JOptionPane.showConfirmDialog(null, "Deseja revisar os dados referente ao cadastro do �leo?");
        // 0=yes, 1=no, 2=cancel
		if (rev2 == Integer.valueOf(1)){
            JOptionPane.showMessageDialog(null, "Dados de cadastro confirmados!");
            ;
			}else if(rev2 == Integer.valueOf(2)){	
			JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
			System.exit(2);
            }else{
            JOptionPane.showMessageDialog(null, "Preencha novamente os dados:");
            	}
		if(o1.getPrecoNum() >= 24.999) {
			JOptionPane.showMessageDialog(null,"Pre�o do litro do �leo acima do pre�o de mercado, favor verificar.");
			revOleo++;
		}else {
			JOptionPane.showMessageDialog(null,"Or�amento inserido com sucesso.");
			break;
			}
		}
	}
}
	

	

	
		
		
		
		
		