package br.com.agorainvestimentos.exchange.model;

import java.util.TreeSet;

public class Book {

	private String side;

	private TreeSet<BookPrice> prices;

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public TreeSet<BookPrice> getPrices() {
		return prices;
	}

	public void setPrices(TreeSet<BookPrice> prices) {
		this.prices = prices;
	}

}
