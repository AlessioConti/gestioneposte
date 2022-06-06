package it.prova.gestioneposte.streams;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class MockData {

	public static final List<PostaDiPaese> POSTE_LIST = new ArrayList<PostaDiPaese>();

	static {
		
		try {
			PostaDiPaese posta1 = new PostaDiPaese(1L, "Trullo", "Via Trullo, 26",
					new SimpleDateFormat("dd/MM/yyyy").parse("10/05/2002"), 25);
			Destinatario persona1 = new Destinatario(10L, "Alessio", "Conti", 20, "Via della Magliana, 244", false);
			posta1.getDestinatari().add(persona1);
			Destinatario persona2 = new Destinatario(11L, "Andrea", "Verdi", 44, "Viale Trastevere, 12", true);
			posta1.getDestinatari().add(persona2);

			PostaDiPaese posta2 = new PostaDiPaese(2L, "Magliana", "Via Migliana, 188",
					new SimpleDateFormat("dd/MM/yyyy").parse("13/09/2019"), 30);
			Destinatario persona3 = new Destinatario(12L, "Luca", "Ilarioni", 21, "Via della Magliana, 10", true);
			posta2.getDestinatari().add(persona3);
			Destinatario persona4 = new Destinatario(13L, "Giulia", "Rosi", 16, "Via Fonte Meravigliosa, 35", false);
			posta2.getDestinatari().add(persona4);

			PostaDiPaese posta3 = new PostaDiPaese(3L, "EUR Centrale", "Viale Europa, 60",
					new SimpleDateFormat("dd/MM/yyyy").parse("01/12/1996"), 9);
			Destinatario persona5 = new Destinatario(14L, "Alberto", "Rossi", 39, "Via Fonte Meravigliosa, 35", true);
			posta3.getDestinatari().add(persona5);

			PostaDiPaese posta4 = new PostaDiPaese(4L, "Tor Vergata Centrale", "Via Tor Vergata, 78",
					new SimpleDateFormat("dd/MM/yyyy").parse("29/05/2000"), 99);
			Destinatario persona6 = new Destinatario(15L, "Mario", "Rossi", 57, "Via Fonte Meravigliosa, 34", false);
			posta4.getDestinatari().add(persona6);
			Destinatario persona7 = new Destinatario(16L, "Luca", "Verdi", 33, "Via Fonte Meravigliosa, 44", true);
			posta4.getDestinatari().add(persona7);
			Destinatario persona8 = new Destinatario(17L, "Lucia", "Magenti", 17, "Via Fonte Meravigliosa, 78", true);
			posta4.getDestinatari().add(persona8);
			Destinatario persona9 = new Destinatario(18L, "Giulio", "Marini", 81, "Viale Trastevere, 81", false);
			posta4.getDestinatari().add(persona9);

			POSTE_LIST.add(posta1);
			POSTE_LIST.add(posta2);
			POSTE_LIST.add(posta3);
			POSTE_LIST.add(posta4);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
