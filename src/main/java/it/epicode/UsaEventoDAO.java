package it.epicode;

import it.epicode.dao.EventoDAO;
import it.epicode.entities.Evento;
import it.epicode.entities.TipoEvento;

import java.time.LocalDate;

public class UsaEventoDAO {
    public static void main(String[] args) {
        Evento ev = new Evento();
        EventoDAO DAO = new EventoDAO();
        ev.setTitolo("test");
        ev.setDataEvento(LocalDate.now());
        ev.setDescrizione("test");
        ev.setTipoEvento(TipoEvento.PRIVATO);
        ev.setNumeroMassimoPartecipanti(10);
        DAO.nuovoEvento(ev);
        System.out.println(ev);

    }

    }