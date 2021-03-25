package br.com.agorainvestimentos.exchange.model;

import java.math.BigDecimal;

public class Instrument {

	private String code;

	private String name;

	private String description;

	private BigDecimal priceIncrement;

	private Long lotSize;

	private Book askBook;

	private Book bidBook;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPriceIncrement() {
		return priceIncrement;
	}

	public void setPriceIncrement(BigDecimal priceIncrement) {
		this.priceIncrement = priceIncrement;
	}

	public Long getLotSize() {
		return lotSize;
	}

	public void setLotSize(Long lotSize) {
		this.lotSize = lotSize;
	}

	public Book getAskBook() {
		return askBook;
	}

	public void setAskBook(Book askBook) {
		this.askBook = askBook;
	}

	public Book getBidBook() {
		return bidBook;
	}

	public void setBidBook(Book bidBook) {
		this.bidBook = bidBook;
	}

}
