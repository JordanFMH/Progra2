package com.clase;

public class Inmutable {
	private final int id;
	private String name;
	private String type;
	private final String fechaHora="06-11-2026 08:35:00";
	
	public Inmutable(int id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}
	
	/*private void cambiarDatos() {
		this.name = name;
	}*/
}