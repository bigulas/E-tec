/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domainModel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Paulo
 */
@Entity
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int numatricula;
    @Column(nullable = false)
    private String nome;
    @Column(length = 12)
    private String cpf;
    private String telcelular;
    private String telfixo;
    @Column(nullable = false)
    private String encinomedio;
    @Column(nullable = false)
    private String modalidade;
    private String email;
    private String titulonumero;
    private String titulozona;
    private String titulosecao;
    private String titulocidade;
    private String militarnumero;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date militardataemicao;
    private String rgnumero;
    private String rgexpedicao;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date rgdataexpedicao;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datanascimento;
    private String cidadenascimento;
    private String estadonascimento;
    private String sexo;
    private String nomepai;
    private String nomemae;
    private String estadocivil;
    private String tipocertidao;
    private String numcertidao;
    private String nomecartorio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataexpedicao;
    private String folhacertidao;
    private String livrocertidao;
    private String trabalha;
    private String proficao;
    private String qtdpessoafamilia;
    private String rendafamiliar;
    private String etinia;
    private String necessidade;
    private String necessidadequal;
    private String formacaoprevia;
    private String formacaoinstituicao;
    private String formacaoano;
    private String formacaocidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumatricula() {
        return numatricula;
    }

    public void setNumatricula(int numatricula) {
        this.numatricula = numatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelcelular() {
        return telcelular;
    }

    public void setTelcelular(String telcelular) {
        this.telcelular = telcelular;
    }

    public String getTelfixo() {
        return telfixo;
    }

    public void setTelfixo(String telfixo) {
        this.telfixo = telfixo;
    }

    public String getEncinomedio() {
        return encinomedio;
    }

    public void setEncinomedio(String encinomedio) {
        this.encinomedio = encinomedio;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitulonumero() {
        return titulonumero;
    }

    public void setTitulonumero(String titulonumero) {
        this.titulonumero = titulonumero;
    }

    public String getTitulozona() {
        return titulozona;
    }

    public void setTitulozona(String titulozona) {
        this.titulozona = titulozona;
    }

    public String getTitulosecao() {
        return titulosecao;
    }

    public void setTitulosecao(String titulosecao) {
        this.titulosecao = titulosecao;
    }

    public String getTitulocidade() {
        return titulocidade;
    }

    public void setTitulocidade(String titulocidade) {
        this.titulocidade = titulocidade;
    }

    public String getMilitarnumero() {
        return militarnumero;
    }

    public void setMilitarnumero(String militarnumero) {
        this.militarnumero = militarnumero;
    }

    public Date getMilitardataemicao() {
        return militardataemicao;
    }

    public void setMilitardataemicao(Date militardataemicao) {
        this.militardataemicao = militardataemicao;
    }

    public String getRgnumero() {
        return rgnumero;
    }

    public void setRgnumero(String rgnumero) {
        this.rgnumero = rgnumero;
    }

    public String getRgexpedicao() {
        return rgexpedicao;
    }

    public void setRgexpedicao(String rgexpedicao) {
        this.rgexpedicao = rgexpedicao;
    }

    public Date getRgdataexpedicao() {
        return rgdataexpedicao;
    }

    public void setRgdataexpedicao(Date rgdataexpedicao) {
        this.rgdataexpedicao = rgdataexpedicao;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getCidadenascimento() {
        return cidadenascimento;
    }

    public void setCidadenascimento(String cidadenascimento) {
        this.cidadenascimento = cidadenascimento;
    }

    public String getEstadonascimento() {
        return estadonascimento;
    }

    public void setEstadonascimento(String estadonascimento) {
        this.estadonascimento = estadonascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNomepai() {
        return nomepai;
    }

    public void setNomepai(String nomepai) {
        this.nomepai = nomepai;
    }

    public String getNomemae() {
        return nomemae;
    }

    public void setNomemae(String nomemae) {
        this.nomemae = nomemae;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getTipocertidao() {
        return tipocertidao;
    }

    public void setTipocertidao(String tipocertidao) {
        this.tipocertidao = tipocertidao;
    }

    public String getNumcertidao() {
        return numcertidao;
    }

    public void setNumcertidao(String numcertidao) {
        this.numcertidao = numcertidao;
    }

    public String getNomecartorio() {
        return nomecartorio;
    }

    public void setNomecartorio(String nomecartorio) {
        this.nomecartorio = nomecartorio;
    }

    public Date getDataexpedicao() {
        return dataexpedicao;
    }

    public void setDataexpedicao(Date dataexpedicao) {
        this.dataexpedicao = dataexpedicao;
    }

    public String getFolhacertidao() {
        return folhacertidao;
    }

    public void setFolhacertidao(String folhacertidao) {
        this.folhacertidao = folhacertidao;
    }

    public String getLivrocertidao() {
        return livrocertidao;
    }

    public void setLivrocertidao(String livrocertidao) {
        this.livrocertidao = livrocertidao;
    }

    public String getTrabalha() {
        return trabalha;
    }

    public void setTrabalha(String trabalha) {
        this.trabalha = trabalha;
    }

    public String getProficao() {
        return proficao;
    }

    public void setProficao(String proficao) {
        this.proficao = proficao;
    }

    public String getQtdpessoafamilia() {
        return qtdpessoafamilia;
    }

    public void setQtdpessoafamilia(String qtdpessoafamilia) {
        this.qtdpessoafamilia = qtdpessoafamilia;
    }

    public String getRendafamiliar() {
        return rendafamiliar;
    }

    public void setRendafamiliar(String rendafamiliar) {
        this.rendafamiliar = rendafamiliar;
    }

    public String getEtinia() {
        return etinia;
    }

    public void setEtinia(String etinia) {
        this.etinia = etinia;
    }

    public String getNecessidade() {
        return necessidade;
    }

    public void setNecessidade(String necessidade) {
        this.necessidade = necessidade;
    }

    public String getNecessidadequal() {
        return necessidadequal;
    }

    public void setNecessidadequal(String necessidadequal) {
        this.necessidadequal = necessidadequal;
    }

    public String getFormacaoprevia() {
        return formacaoprevia;
    }

    public void setFormacaoprevia(String formacaoprevia) {
        this.formacaoprevia = formacaoprevia;
    }

    public String getFormacaoinstituicao() {
        return formacaoinstituicao;
    }

    public void setFormacaoinstituicao(String formacaoinstituicao) {
        this.formacaoinstituicao = formacaoinstituicao;
    }

    public String getFormacaoano() {
        return formacaoano;
    }

    public void setFormacaoano(String formacaoano) {
        this.formacaoano = formacaoano;
    }

    public String getFormacaocidade() {
        return formacaocidade;
    }

    public void setFormacaocidade(String formacaocidade) {
        this.formacaocidade = formacaocidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataAccess.Aluno[ id=" + id + " ]";
    }

}
