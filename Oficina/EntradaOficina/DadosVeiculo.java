package EntradaOficina;

import javax.swing.JOptionPane;

public class DadosVeiculo {
	
		public String placa = JOptionPane.showInputDialog( "Informe a placa do ve�culo :");
		public String modelo = JOptionPane.showInputDialog("Informe o modelo do ve�culo:");
		public String km = JOptionPane.showInputDialog("Informe o KM atual do ve�culo:");
		public String nomeCond = JOptionPane.showInputDialog("Informe o nome do condutor:");
		
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getKm() {
			return km;
		}
		public void setKm(String km) {
			this.km = km;
		}
		public String getNomeCond() {
			return nomeCond;
		}
		public void setNomeCond(String nomeCond) {
			this.nomeCond = nomeCond;
		} 
		
		public void statusCad () {
		
		System.out.println("===== DADOS CADASTRAIS =====");
		System.out.println("Placa do ve�culo: " + this.getPlaca());
		System.out.println("Modelo do ve�culo: " + this.getModelo());
		System.out.println("KM: " + this.getKm());
		System.out.println("Condutor: " + this.getNomeCond());
		System.out.println("\n");
		
		}
}