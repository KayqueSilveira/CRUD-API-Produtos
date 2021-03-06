package br.com.magalu.microserv.Cad.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class MetaDTO {
	
	private int page_number;
	private int page_size;
	
	public int getPage_number() {
		return page_number;
	}
	
	public void setPage_number(int page_number) {
		this.page_number = page_number;
	}
	
	public int getPage_size() {
		return page_size;
	}
	
	public void setPage_size(int page_size) {
		this.page_size = page_size;
	}

}
