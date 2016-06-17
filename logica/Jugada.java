package logica;

import java.io.Serializable;

public class Jugada implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PosicionAjedrez posOrigen, posDestino;
	private Pieza laPiezaMovida, laPiezaComida;
	private PosicionAjedrez posOrigenExtra, posDestinoExtra;
	private Pieza piezaExtra;

	Jugada(PosicionAjedrez posOrigen, PosicionAjedrez posDestino, Pieza laPiezaMovida, Pieza laPiezaComida) {
		this(posOrigen,posDestino,laPiezaMovida,laPiezaComida,null,null,null);
	}

	Jugada(PosicionAjedrez posOrigen, PosicionAjedrez posDestino, Pieza laPiezaMovida, Pieza laPiezaComida, PosicionAjedrez posOrigenExtra, PosicionAjedrez posDestinoExtra, Pieza piezaExtra) {
		this.posOrigen = posOrigen;
		this.posDestino = posDestino;
		this.laPiezaMovida = laPiezaMovida;
		this.laPiezaComida = laPiezaComida;
		this.posOrigenExtra = posOrigenExtra;
		this.posDestinoExtra = posDestinoExtra;
		this.piezaExtra = piezaExtra;
	}
	
	public PiezaColor damePiezaColorMovida() {
		return new PiezaColor(laPiezaMovida.dameNombre(),laPiezaMovida.dameColor());
	}

	public PiezaColor damePiezaColorComida() {
		if (laPiezaComida == null)
			return null;
		return new PiezaColor(laPiezaComida.dameNombre(),laPiezaComida.dameColor());
	}
	
	public boolean hayPiezaComida(){
		if(laPiezaComida== null){
			return false;
		}
			return true;
	}

	public PosicionAjedrez damePosicionOrigen() {
		return posOrigen;
	}

	public PosicionAjedrez damePosicionDestino() {
		return posDestino;
	}

	public PosicionAjedrez damePosicionOrigenExtra() {
		return posOrigenExtra;
	}
	
	public PosicionAjedrez damePosicionDestinoExtra() {
		return posDestinoExtra;
	}

	Pieza damePiezaMovida() {
		return laPiezaMovida;
	}

	Pieza damePiezaMovidaExtra() {
		return piezaExtra;
	}

	Pieza damePiezaComida() {
		return laPiezaComida;
	}
}