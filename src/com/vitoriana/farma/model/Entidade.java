package com.vitoriana.farma.model;

import java.io.Serializable;

public abstract class Entidade implements Serializable {

	private int id;

	public Entidade(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
