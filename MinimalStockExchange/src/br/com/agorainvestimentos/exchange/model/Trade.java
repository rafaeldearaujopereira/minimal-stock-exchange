package br.com.agorainvestimentos.exchange.model;

import java.math.BigDecimal;

public class Trade {
	
	private Order buyOrder;
	
	private Order sellOrder;
	
	private Long quantity;
	
	private BigDecimal volume;

	public Order getBuyOrder() {
		return buyOrder;
	}

	public void setBuyOrder(Order buyOrder) {
		this.buyOrder = buyOrder;
	}

	public Order getSellOrder() {
		return sellOrder;
	}

	public void setSellOrder(Order sellOrder) {
		this.sellOrder = sellOrder;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}
	
	

}
