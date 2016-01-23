package mx.edu.utng.diagrama;

import java.util.ArrayList;
import java.util.List;

import mx.edu.utng.diagrama.Dedicatoria;
import mx.edu.utng.diagrama.Destinatario;
import mx.edu.utng.diagrama.Fondo;
import mx.edu.utng.diagrama.Imagen;
import mx.edu.utng.diagrama.Remitente;

public class TarjetaAnimada extends Tarjeta {

	private List<Imagen> imagens;
	private List<Fondo> fondos;
	private List<Dedicatoria> dedicatorias;
	private String codigo;

	public TarjetaAnimada(List<Remitente> remitentes, List<Destinatario> destinatarios, List<Imagen> imagens,
			List<Fondo> fondos) {

		super(remitentes, destinatarios);
		this.dedicatorias = new ArrayList<Dedicatoria>();
		this.imagens = imagens;
		this.fondos = fondos;
		// TODO Auto-generated constructor stub
	}
	
}