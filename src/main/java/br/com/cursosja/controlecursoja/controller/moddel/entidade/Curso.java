package br.com.cursosja.controlecursoja.controller.moddel.entidade;

public class Curso {
	private long id;
	private String nome;
	
	public Curso() {
		this.id=0;
		this.nome="";
	}
	public Curso(long codigo, String n) {
		this.id=codigo;
		this.nome=n;
	}
	public void setId(int i) {
		this.id=i;
		
	}
	public long getId() {
		return this.id;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return this.nome;
	}

}
