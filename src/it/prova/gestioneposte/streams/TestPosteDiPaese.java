package it.prova.gestioneposte.streams;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class TestPosteDiPaese {

	public static void main(String[] args) throws Exception {

		List<PostaDiPaese> listaPosteMock = MockData.POSTE_LIST;

		System.out.println("Voglio tutte le poste che nell'indirizzo hanno 'MI'");
		List<PostaDiPaese> listaPosteConMi = listaPosteMock.stream()
				.filter(posteItem -> posteItem.getIndirizzoSede().contains("Mi")).collect(Collectors.toList());
		listaPosteConMi.forEach(posteItem -> System.out
				.println(posteItem.getDenominazione() + " situata a " + posteItem.getIndirizzoSede()));

		System.out.println("Voglio tutte le poste aperte dopo il primo marzo 2019");
		Date dataMarzo = new SimpleDateFormat("dd/MM/yyyy").parse("01/03/2019");
		List<PostaDiPaese> posteAperteDopoMarzo = listaPosteMock.stream()
				.filter(posteItem -> posteItem.getDataApertura().after(dataMarzo)).collect(Collectors.toList());

		posteAperteDopoMarzo.forEach(posteItem -> System.out.println(posteItem.getDenominazione()));

		System.out.println("Voglio la lista di indirizzi di poste il cui numero di dipendenti è superiore a 20");
		List<String> listaIndirizziPiuDiVenti = listaPosteMock.stream()
				.filter(posteItem -> posteItem.getNumeroDipendenti() > 20)
				.map(posteItem -> posteItem.getIndirizzoSede())
				.peek(indirizzoItem -> System.out.println("Voglio capire cosa passa: " + indirizzoItem))
				.collect(Collectors.toList());
		listaIndirizziPiuDiVenti.forEach(l -> System.out.println(l));

		System.out.println("Voglio la lista di indirizzi di destinatari di poste con almeno 10 dipendenti");
		List<String> listaIndirizziConPosteDaDieciDipendenti = listaPosteMock.stream()
				.filter(posteItem -> posteItem.getNumeroDipendenti() > 10)
				.flatMap(x -> x.getDestinatari().stream().map(y -> y.getIndirizzo())).collect(Collectors.toList());
		listaIndirizziConPosteDaDieciDipendenti.forEach(l -> System.out.println(l));

		System.out.println("Voglio la lista di destinatari con conto corrente e poste con dipendenti tra 50 e 100");
		List<Destinatario> destinatariContoCorrente = listaPosteMock.stream()
				.filter(posteItem -> posteItem.getNumeroDipendenti() > 50 && posteItem.getNumeroDipendenti() < 100)
				.flatMap(x -> x.getDestinatari().stream()
						.filter(destinatarioItem -> destinatarioItem.isPossessoreDiContoCorrente()))
				.collect(Collectors.toList());
		destinatariContoCorrente.forEach(l -> System.out.println(l.getNome() + " " + l.getCognome()));

		System.out.println("Voglio la lista delle eta di destinatari di una posta centrale fondata almeno nel 2000");
		Date dataDuemila = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2000");
		List<Integer> etaPerPostaCentral = listaPosteMock.stream()
				.filter(posteItem -> posteItem.getDenominazione().contains("Centrale")
						&& posteItem.getDataApertura().after(dataDuemila))
				.flatMap(x -> x.getDestinatari().stream().map(y -> y.getEta())).collect(Collectors.toList());
		etaPerPostaCentral.forEach(l -> System.out.println(l));
	}

}
