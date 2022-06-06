package it.prova.gestioneposte.streams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostaDiPaese {

	private Long id;
	private String Denominazione;
	private String indirizzoSede;
	private Date dataApertura;
	private Integer numeroDipendenti;
	private List<Destinatario> destinatari = new ArrayList<>();

	public PostaDiPaese(Long id, String denominazione, String indirizzoSede, Date dataApertura,
			Integer numeroDipendenti, List<Destinatario> destinatari) {
		super();
		this.id = id;
		Denominazione = denominazione;
		this.indirizzoSede = indirizzoSede;
		this.dataApertura = dataApertura;
		this.numeroDipendenti = numeroDipendenti;
		this.destinatari = destinatari;
	}
	
	public PostaDiPaese(Long id, String denominazione, String indirizzoSede, Date dataApertura,
			Integer numeroDipendenti) {
		super();
		this.id = id;
		Denominazione = denominazione;
		this.indirizzoSede = indirizzoSede;
		this.dataApertura = dataApertura;
		this.numeroDipendenti = numeroDipendenti;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDenominazione() {
		return Denominazione;
	}

	public void setDenominazione(String denominazione) {
		Denominazione = denominazione;
	}

	public String getIndirizzoSede() {
		return indirizzoSede;
	}

	public void setIndirizzoSede(String indirizzoSede) {
		this.indirizzoSede = indirizzoSede;
	}

	public Date getDataApertura() {
		return dataApertura;
	}

	public void setDataApertura(Date dataApertura) {
		this.dataApertura = dataApertura;
	}

	public Integer getNumeroDipendenti() {
		return numeroDipendenti;
	}

	public void setNumeroDipendenti(Integer numeroDipendenti) {
		this.numeroDipendenti = numeroDipendenti;
	}

	public List<Destinatario> getDestinatari() {
		return destinatari;
	}

	public void setDestinatari(List<Destinatario> destinatari) {
		this.destinatari = destinatari;
	}

}
