package chap08.quiz.week2;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		Product beauty = new Beauty("beauty", BigDecimal.valueOf(30_000), 2);
		Product grocery = new Grocery("grocery", BigDecimal.valueOf(20_000), 3);
		Product largeAppliance = new LargeAppliance("largeAppliance", BigDecimal.valueOf(50_000), 5);

		Cart cart = new Cart(new Product[] {beauty, grocery, largeAppliance});
		int totalDeliveryCharge = cart.calculateDeliveryCharge();
		System.out.println(totalDeliveryCharge);    // 결과: 9000
	}
}
