package com.ivson.crud.api.responses;

import java.util.List;

/**
 * T generico
 * Classe para retornar qualquer coisa
 * @author ivson.santos
 *
 * @param <T>
 */
public class Response<T> {

	private T date;
	private List<String> erros;
	
	public Response(T data) {
		this.date = data;		
	}
	
	public Response(List<String> erros) {
		this.erros = erros;
	}

	public T getDate() {
		return date;
	}

	public void setDate(T date) {
		this.date = date;
	}

	public List<String> getErros() {
		return erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}
}
