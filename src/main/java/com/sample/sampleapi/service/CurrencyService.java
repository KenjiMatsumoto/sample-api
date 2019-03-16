package com.sample.sampleapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sample.sampleapi.entity.Currency;
import com.sample.sampleapi.repository.CurrencyRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CurrencyService {

	private final CurrencyRepository repository;

	/**
	 * 全件検索
	 * @return
	 */
	public List<Currency> findAll() {
		return repository.findAll();
	}

	/**
	 * 保存
	 * @param name
	 * @param symbol
	 * @return
	 */
	public Currency save(String name, String symbol) {
		return repository.save(Currency.newCurrency(name, symbol));
	}

	/**
	 * 削除
	 * @param id
	 */
	public void delete(Long id) {
		repository.findById(id).ifPresent(currency -> repository.delete(currency));
	}
}
