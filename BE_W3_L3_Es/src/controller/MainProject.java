package controller;

import java.time.LocalDate;

import model.Eventi;

public class MainProject {

	static evento_DAO ev = new evento_DAO();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eventi e = new Eventi();
		e.setTitolo("titolo6");
		e.setDescrizione("Descrizione evento 6");
		e.setTipoEvento(Eventi_enum.Publico.getEventEnum());
		e.setNumeroMassimoPartecipanti(800);
		e.setDataEvento(LocalDate.of(1999, 3, 27));
		ev.addEvent(e);


		try {
			// Lettura evento
//			Eventi eventoLetto = ev.findById(2l);
//			System.out.println(eventoLetto);
//
//			// eliminazione
//			ev.removeEvent(eventoLetto);
//
//			// visualizzazione totale
//			ev.refresh(eventoLetto);

		} catch (Exception ex) {
		} finally {
			// em.close();
			// emf.close();
		}

	}
}
