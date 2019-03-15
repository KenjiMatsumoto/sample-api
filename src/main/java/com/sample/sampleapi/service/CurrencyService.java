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

	public List<Currency> findAll() {
		return repository.findAll();
	}
}
