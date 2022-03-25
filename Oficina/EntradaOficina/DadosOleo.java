package EntradaOficina;

import javax.print.attribute.standard.MediaSize.NA;
import javax.swing.JOptionPane;												

public class DadosOleo { 				
	
	public static double setPrecoNum;
	String marcaOleo = JOptionPane.showInputDialog("Informe a marca do óleo a ser colocado no veículo:");
	String visc = JOptionPane.showInputDialog("Informe sua viscuosidade:");
	String preco = JOptionPane.showInputDialog("Informe o preço do litro do óleo:");
	String descSn = JOptionPane.showInputDialog("Informe o percentual de desconto:");
	String quant = JOptionPane.showInputDialog("Informe a quantidade em litros inserida de óleo:");
	
	double precoNum = Double.valueOf(preco).doubleValue();
	double percDesc = Double.valueOf(descSn).doubleValue();
	double quantNum = Double.valueOf(quant).doubleValue();
	double precoTotal = precoNum*quantNum;
	double percentual = +percDesc / 100.0;
	double precoDesc = precoTotal -(percentual*precoTotal);
	
	public String getMarcaOleo() {
		return marcaOleo;
	}
	public void setMarcaOleo(String marcaOleo) {
		this.marcaOleo = marcaOleo;
	}
	public String getVisc() {
		return visc;
	}
	public void setVisc(String visc) {
		this.visc = visc;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getDescSn() {
		return descSn;
	}
	public void setDescSn(String descSn) {
		this.descSn = descSn;
	}
	public String getQuant() {
		return quant;
	}
	public void setQuant(String quant) {
		this.quant = quant;
	}
	public double getPrecoNum() {
		return precoNum;
	}
	public void setPrecoNum(double precoNum) {
		this.precoNum = precoNum;
	}
	public double getPercDesc() {
		return percDesc;
	}
	public void setPercDesc(double percDesc) {
		this.percDesc = percDesc;
	}
	public double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	public double getPercentual() {
		return percentual;
	}
	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}
	public double getPrecoDesc() {
		return precoDesc;
	}
	public void setPrecoDesc(double precoDesc) {
		this.precoDesc = precoDesc;
	}

	public void DadosOleo() {
		
		System.out.println("===== DADOS DO ÓLEO LUBRIFICANTE =====");
		System.out.println("Marca Óleo: " + this.getMarcaOleo());
		System.out.println("Viscuosidade do óleo: " + this.getVisc());
		System.out.println("Preço por litro: R$ " + this.getPrecoNum());
		System.out.println("Quantidade: " + this.getQuant());
		System.out.println("Desconto concedido: " + this.getDescSn() +"%");
		System.out.println("Valor final: R$ " + this.getPrecoTotal());
		System.out.println("Valor com desconto: R$ " + this.getPrecoDesc());
	}

}
