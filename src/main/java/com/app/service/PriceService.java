package com.app.service;

import java.math.BigDecimal;

public interface PriceService {
	BigDecimal calculatePrice(final BigDecimal unitPrice, final BigDecimal numberOfItems);
}
