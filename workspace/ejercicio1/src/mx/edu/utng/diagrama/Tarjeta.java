package mx.edu.utng.diagrama;
import java.util.List;

import mx.edu.utng.diagrama.Dedicatoria;
import mx.edu.utng.diagrama.Destinatario;
import mx.edu.utng.diagrama.Remitente;

public class Tarjeta {

	private int nroDestinatario;
	private List<Remitente> remitentes;
	private List<Destinatario> destinatarios;
	Dedicatoria[] dedicatorias = new Dedicatoria[1];
	private String tipo;

	public Tarjeta(List<Remitente> remitentes, List<Destinatario> destinatarios) {
		this.remitentes = remitentes;
		this.destinatarios = destinatarios;

		// TODO Auto-generated constructor stub
	}

	public void adicionarRemitente(Remitente remitente) {

	}

	public void adicionarDestinatario(Destinatario destinatario) {

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNroDestinatario() {
		return nroDestinatario;
	}

	public void setNroDestinatario(int nroDestinatario) {
		this.nroDestinatario = nroDestinatario;
	}

}