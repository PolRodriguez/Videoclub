package com.example.demo.util;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.dto.HistoricoDTO;
import com.example.demo.dto.ReservaDTO;
import com.example.demo.model.Historico;
import com.example.demo.model.Reserva;

public class Convertidor {
	
	public static List<ReservaDTO> convertirListaReservas(List<Reserva> reservas) {
		return reservas.stream().map(ReservaDTO::new).collect(Collectors.toList());
	}
	
	public static ReservaDTO convertirReserva(Reserva reserva) {
		return new ReservaDTO(reserva);
	}
	
	public static Reserva convertirReservaDTO(ReservaDTO reserva) {
		return new Reserva(reserva);
	}
	
	public static List<HistoricoDTO> convertirListaHistorico(List<Historico> historico) {
		return historico.stream().map(HistoricoDTO::new).collect(Collectors.toList());
	}
	
	public static HistoricoDTO convertirHistorico(Historico historico) {
		return new HistoricoDTO(historico);
	}
	
	public static Historico convertirHistoricoDTO(HistoricoDTO historico) {
		return new Historico(historico);
	}
	
	public static java.sql.Date convertFromJAVADateToSQLDate(java.util.Date javaDate) {
        java.sql.Date sqlDate = null;
        if (javaDate == null) {
            javaDate = new java.util.Date();
        }
        sqlDate = new Date(javaDate.getTime());
        return sqlDate;
    }
	
}
