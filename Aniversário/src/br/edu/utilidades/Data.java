package br.edu.utilidades;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	private String nomeMes;
	
	public Data() {
		
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
		
	public String getNomeMes() {
		return nomeMes;
	}

	public void setNomeMes(String nomeMes) {
		this.nomeMes = nomeMes;
	}

	public void mostrarData() {
		if (getMes() == 1) {
			setNomeMes("Janeiro");
		}
		else if(getMes() == 2) {
			setNomeMes("Fevereiro");
		}
		else if(getMes() == 3) {
			setNomeMes("Março");
		}
		else if(getMes() == 4) {
			setNomeMes("Abril");
		}
		else if(getMes() == 5) {
			setNomeMes("Maio");
		}
		else if(getMes() == 6) {
			setNomeMes("Junho");
		}
		else if(getMes() == 7) {
			setNomeMes("Julho");
		}
		else if(getMes() == 8) {
			setNomeMes("Agosto");
		}
		else if(getMes() == 9) {
			setNomeMes("Setembro");
		}
		else if(getMes() == 10) {
			setNomeMes("Outubro");
		}
		else if(getMes() == 11) {
			setNomeMes("Novembro");
		}
		else if(getMes() == 12) {
			setNomeMes("Dezembro");
		}
		else {
			System.out.println("Digite um valor válido!");
		}
		
		System.out.println("Você nasceu dia " + getDia() + ", de " + getNomeMes() + ", de " + getAno() + ".");
	}

}
