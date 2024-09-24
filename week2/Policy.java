package chap08.quiz.week2;

import java.math.BigDecimal;

public class Policy {
	static final BigDecimal PRICE_POLICY_LEVEL_1 = BigDecimal.valueOf(100_000);
	static final BigDecimal PRICE_POLICY_LEVEL_2 = BigDecimal.valueOf(30_000);
	static final int DELIVERY_DISCOUNT_AMOUNT = 1_000;
	static final int DELIVERY_CHARGE_FREE = 0;

	public static int deliveryChargeWeightPolicy(double weight) {
		if (weight >= 10) {
			return 10_000;
		} else if (weight >= 3) {
			return 5_000;
		} else {
			return 1_000;
		}
	}
}
