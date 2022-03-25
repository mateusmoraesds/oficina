package EntradaOficina;

import javax.swing.JOptionPane;

public class DadosVeiculo {
	
		public String placa = JOptionPane.showInputDialog( "Informe a placa do veículo :");
		public String modelo = JOptionPane.showInputDialog("Informe o modelo do veículo:");
		public String km = JOptionPane.showInputDialog("Informe o KM atual do veículo:");
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
		System.out.println("Placa do veículo: " + this.getPlaca());
		System.out.println("Modelo do veículo: " + this.getModelo());
		System.out.println("KM: " + this.getKm());
		System.out.println("Condutor: " + this.getNomeCond());
		System.out.println("\n");
		
		}
}