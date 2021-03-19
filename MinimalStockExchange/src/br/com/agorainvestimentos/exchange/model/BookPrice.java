package br.com.agorainvestimentos.exchange.model;

import java.math.BigDecimal;
import java.util.TreeSet;

public class BookPrice {

	private BigDecimal price;

	/**
	 * Orders must be ordered by the last time that its price was modified.
	 */
	private TreeSet<Order> orders;
	
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public TreeSet<Order> getOrders() {
		return orders;
	}

	public void setOrders(TreeSet<Order> orders) {
		this.orders = orders;
	}
	
	

}
