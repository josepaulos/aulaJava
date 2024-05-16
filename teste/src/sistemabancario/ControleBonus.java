package sistemabancario;

public class ControleBonus {
	private double totalBonus = 0;
	
	public void setTotalBonus(Funcionario funcionario) {
		this.totalBonus = this.totalBonus + funcionario.getBonus();
	}
	
	public double getTotalBonus() {
		return this.totalBonus;
	}
	
	

}
