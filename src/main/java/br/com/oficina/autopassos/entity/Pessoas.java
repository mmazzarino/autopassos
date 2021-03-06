package br.com.oficina.autopassos.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OfcPessoas")
public class Pessoas {
	
	@Id
	@Column(name ="CodPessoa")
	private Integer codPessoa;
	
	@Column(name = "NomePessoa")
	private String nomePessoa;
	
	@Column(name = "TipoPessoa")
	private char tipoPessoa;
	
	@Column(name = "Apelido")
	private String apelido;
	
	@Column(name = "DataNascimento")
	private Date dataNascimento;
	
	@Column(name ="CodContato")
	private Integer codContato;
	
	@Column(name ="CodEndereco")
	private Integer codEndereco;

	@Column(name = "CPF")
	private String cpf;
	
	@Column(name = "CNPJ")
	private String cnpj;

	public Integer getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(Integer codPessoa) {
		this.codPessoa = codPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public char getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(char tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getCodContato() {
		return codContato;
	}

	public void setCodContato(Integer codContato) {
		this.codContato = codContato;
	}

	public Integer getCodEndereco() {
		return codEndereco;
	}

	public void setCodEndereco(Integer codEndereco) {
		this.codEndereco = codEndereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
