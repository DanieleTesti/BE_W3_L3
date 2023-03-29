package model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Eventi")
public class Eventi implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(nullable = false)
	private String titolo;

	@Column(nullable = false)
	private LocalDate dataevento;

	@Column(nullable = false)
	private String descrizione;

	@Column(nullable = false)
	private String tipoevento;

	@Column(nullable = false)
	private int numeromassimopartecipanti;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getDataEvento() {
		return dataevento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataevento = dataEvento;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getTipoEvento() {
		return tipoevento;
	}

	public void setTipoEvento(String string) {
		this.tipoevento = string;
	}
	public int getNumeroMassimoPartecipanti() {
		return numeromassimopartecipanti;
	}

	public void setNumeroMassimoPartecipanti(int numeromassimopartecipanti) {
		this.numeromassimopartecipanti = numeromassimopartecipanti;
	}
	@Override
	public String toString() {
		return "Eventi [id=" + id + ", titolo=" + titolo + ", dataevento=" + dataevento + ", descrizione=" + descrizione
				+ ", tipoevento=" + tipoevento + ", numeromassimopartecipanti=" + numeromassimopartecipanti + "]";
	}



}
