package chap08.quiz.week2;

import static chap08.quiz.week2.Policy.*;

import java.math.BigDecimal;

public class Cart {
	Product[] products;
	BigDecimal totalPrice = BigDecimal.ZERO;
	double weight = 0;

	Cart(Product[] products) {
		this.products = products;
		for (Product product : products) {
			weight += product.getWeight();
			totalPrice = totalPrice.add(product.getPrice());
		}
	}

	int calculateDeliveryCharge() {
		// 1. 총 무게에 따라 배송비 책정
		int shippingCost = deliveryChargeWeightPolicy(weight);

		// 2. 상품 (할인 금액 적용된) 총 가격에 따라 추가 계산
		if (totalPrice.compareTo(PRICE_POLICY_LEVEL_1) > 0) {
			return DELIVERY_CHARGE_FREE;
		} else if (totalPrice.compareTo(PRICE_POLICY_LEVEL_2) > 0) {
			return shippingCost - DELIVERY_DISCOUNT_AMOUNT;
		} else
			return shippingCost;
	}

}
