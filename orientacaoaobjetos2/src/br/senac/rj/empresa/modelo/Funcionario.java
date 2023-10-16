package br.senac.rj.empresa.modelo;

public class Funcionario {
    private int registro;
    private String nome;
    private int cargo;
    private double salario;
    

    public int getRegistro() {
		return registro;
	}


	public void setRegistro(int registro) {
		this.registro = registro;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCargo() {
		return cargo;
	}


	public void setCargo(int cargo) {
		this.cargo = cargo;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public void aplicarBonificacao() {
        double novaSalario;

        switch (cargo) {
            case 1:
                novaSalario = this.salario * 1.20;
                break;
            case 2:
                novaSalario = this.salario * 1.40;
                break;
            case 3:
                novaSalario = this.salario * 1.60;
                break;
            default:
                novaSalario = this.salario;
        }

        this.salario = novaSalario;
    }
}
