package it.polito.tdp.bar.model;

import java.time.Duration;

public class Event implements Comparable<Event>{
//mettere sempre il compareTo per indicare l'ordine in cui vanno presi gli eventi!!
	
	
	//prima cosa da creare, dobbiamo pensare a quanti possibili eventi possiamo avere
	
	//enum!
	public enum EventType {
		ARRIVO_GRUPPO_CLIENTI,
		TAVOLO_LIBERATO
	}
	
	//numero di minuti che parte da 0 e va avanti (Duration va importato da Java.time!)
	private Duration time;
	private EventType type;
	private int nPersone;
	private Duration durata;
	private double tolleranza; //probabilità
	private Tavolo tavolo; //riferimento a quale tavolo assegnamo a quel gruppo
	
	public Event(Duration time, EventType type, int nPersone, Duration durata, double tolleranza, Tavolo tavolo) {
		super();
		this.time = time;
		this.type = type;
		this.nPersone = nPersone;
		this.durata = durata;
		this.tolleranza = tolleranza;
		this.tavolo = tavolo;
	}

	public Duration getTime() {
		return time;
	}

	public void setTime(Duration time) {
		this.time = time;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	public int getnPersone() {
		return nPersone;
	}

	public void setnPersone(int nPersone) {
		this.nPersone = nPersone;
	}

	public Duration getDurata() {
		return durata;
	}

	public void setDurata(Duration durata) {
		this.durata = durata;
	}

	public double getTolleranza() {
		return tolleranza;
	}

	public void setTolleranza(double tolleranza) {
		this.tolleranza = tolleranza;
	}

	public Tavolo getTavolo() {
		return tavolo;
	}

	public void setTavolo(Tavolo tavolo) {
		this.tavolo = tavolo;
	}

	@Override
	public int compareTo(Event o) {
		return this.time.compareTo(o.getTime());
	}
	
	
	
	
}
