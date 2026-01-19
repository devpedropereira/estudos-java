package entities;

public class PessoaJuridica extends Contribuintes{

	private Integer numeroDeFuncionarios;

	public PessoaJuridica() {
	}

	public PessoaJuridica(String name, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(name, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	
	@Override
	public double imposto() {
		double imp;
		if (numeroDeFuncionarios > 10) {
			imp = rendaAnual * 0.14;
		}
		else {
			imp = rendaAnual * 0.16;
		}
		
		return imp;
		
		} 
	
	
}
