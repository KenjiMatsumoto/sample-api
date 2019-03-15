package com.sample.sampleapi.controller;

import java.util.List;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.sample.sampleapi.entity.Currency;
import com.sample.sampleapi.service.CurrencyService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CurrencyController {

	private final CurrencyService service;

	@GetMapping("/")
	public ResponseEntity<CurrencyResponse> findAll() {
		List<Currency> currencies = service.findAll();
		CurrencyResponse response = CurrencyResponse.builder().currencies(currencies).build();
		return new ResponseEntity<CurrencyResponse>(response, HttpStatus.OK);
	}
}
