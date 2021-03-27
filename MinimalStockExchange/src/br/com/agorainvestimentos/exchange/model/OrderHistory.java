package br.com.agorainvestimentos.exchange.model;

import java.util.Date;

public class OrderHistory {

	private Order order;

	private Date dateTime;
	
	private OrderStatus status;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	

}
