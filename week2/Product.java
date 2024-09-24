package chap08.quiz.week2;

import java.math.BigDecimal;

public class Product implements Promotion {
	private final String name;
	private final BigDecimal price;
	private final Double weight;

	Product(String name, BigDecimal price, Double weight) {
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	public BigDecimal getPrice() {
		return price.subtract(getDiscountAmount());
	}

	public Double getWeight() {
		return weight;
	}

	@Override
	public BigDecimal getDiscountAmount() {
		return switch (name) {
			case "grocery" -> new BigDecimal(2_000);
			case "beauty" -> new BigDecimal(10_000);
			case "largeAppliance" -> new BigDecimal(0);
			default -> new BigDecimal(0);
		};
	}
}
