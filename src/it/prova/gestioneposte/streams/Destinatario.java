package it.prova.gestioneposte.streams;

public class Destinatario {

	private Long id;
	private String nome;
	private String cognome;
	private Integer eta;
	private String indirizzo;
	private boolean possessoreDiContoCorrente;
	private PostaDiPaese postaDiPaese;

	public Destinatario(Long id, String nome, String cognome, Integer eta, String indirizzo, boolean possessoreDiContoCorrente) {
		super();
		this.id=id;
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.indirizzo = indirizzo;
		this.possessoreDiContoCorrente = possessoreDiContoCorrente;
	}
	
	public Destinatario(String nome, String cognome, Integer eta, String indirizzo, boolean possessoreDiContoCorrente,
			PostaDiPaese postaDiPaese) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.indirizzo = indirizzo;
		this.possessoreDiContoCorrente = possessoreDiContoCorrente;
		this.postaDiPaese = postaDiPaese;
	}
	
	public Destinatario(String nome, String cognome, Integer eta, String indirizzo, boolean possessoreDiContoCorrente) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.indirizzo = indirizzo;
		this.possessoreDiContoCorrente = possessoreDiContoCorrente;
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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public boolean isPossessoreDiContoCorrente() {
		return possessoreDiContoCorrente;
	}

	public void setPossessoreDiContoCorrente(boolean possessoreDiContoCorrente) {
		this.possessoreDiContoCorrente = possessoreDiContoCorrente;
	}

	public PostaDiPaese getPostaDiPaese() {
		return postaDiPaese;
	}

	public void setPostaDiPaese(PostaDiPaese postaDiPaese) {
		this.postaDiPaese = postaDiPaese;
	}
	

}
