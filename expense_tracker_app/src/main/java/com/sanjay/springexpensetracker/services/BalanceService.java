package com.sanjay.springexpensetracker.services;

import com.sathish.springexpensetracker.models.Balance;

public interface BalanceService {
	public Balance saveBalance(Balance balance);
	public Balance createBalance();
}
