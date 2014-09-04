package br.senai.sc.ti20131n.pw.introducaojpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Banda implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue //auto increment.
	private Long id;
	@Column(length=50) //Define o tamanho do varchar. Separar por virgula para por mais atributos.
	private String nome;
	@Lob //Define como longtext no db.
	private String historia;
	
	public String getHistoria() {
		return historia;
	}
	public void setHistoria(String historia) {
		this.historia = historia;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
