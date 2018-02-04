package br.gov.ce.secult.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Informative {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String subject;
	private String content;
	private String author;
	@Column(name = "create_date")
	private Date create;
	@Column(name = "expiration_date")
	private Date expiration;

	public Informative() {
	}
}
