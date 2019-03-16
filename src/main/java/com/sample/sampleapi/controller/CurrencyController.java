package com.sample.sampleapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

	@PostMapping("/")
	public ResponseEntity<HttpStatus> save(@RequestBody CurrencyAddRequest request) {
		service.save(request.getName(),request.getSymbol());
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable Long id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
