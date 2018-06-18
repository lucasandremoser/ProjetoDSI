package br.univille.projetodsi.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Consulta {
	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private long id;
	    @Temporal(value=TemporalType.TIMESTAMP)
	    private Date data;
	    @Column(length=10000)
	    private String status;
	    
	    @ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH})
	    private Paciente paciente;
	    
	    @ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH})
	    private Medico medicoResponsavel;

	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }

	    public Date getData() {
	        return data;
	    }

	    public void setData(Date data) {
	        this.data = data;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	    public Paciente getPaciente() {
	        return paciente;
	    }

	    public void setPaciente(Paciente paciente) {
	        this.paciente = paciente;
	    }

	    public Medico getMedicoResponsavel() {
	        return medicoResponsavel;
	    }

	    public void setMedicoResponsavel(Medico medicoResponsavel) {
	        this.medicoResponsavel = medicoResponsavel;
	    }
}