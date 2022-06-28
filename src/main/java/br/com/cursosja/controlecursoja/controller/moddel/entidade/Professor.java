package br.com.cursosja.controlecursoja.controller.moddel.entidade;

public class Professor {
	private long id;
	private String nome;
	private String celular;
	private double valorHora;
	
	public Professor() {
		this.id=0;
		this.celular="";
		this.valorHora=0;
	}
	public Professor(long codigo, String n,String c, double vh) {
		this.id=codigo;
		this.nome=n;
		this.celular=c;
		this.valorHora=vh;
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
	public void setCelular(String celular) {
		this.celular=celular;
	}
	public String getCelular() {
		return this.celular;
	}
	public void setValorHora(double valorHora) {
		this.valorHora=valorHora;
	}
}
