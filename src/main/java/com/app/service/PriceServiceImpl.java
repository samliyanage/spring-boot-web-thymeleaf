package com.app.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class PriceServiceImpl implements PriceService {

	@Override
	public BigDecimal calculatePrice(final BigDecimal unitPrice, final BigDecimal numberOfItems) {
		BigDecimal calutaltedAmount =unitPrice.multiply(numberOfItems);
		BigDecimal additions=BigDecimal.ZERO;
		if(numberOfItems.compareTo(new BigDecimal(3))<3) {
			additions=(calutaltedAmount.divide(new BigDecimal(100))).multiply(new BigDecimal(10));
		}
		return calutaltedAmount.add(additions);
	}

}
