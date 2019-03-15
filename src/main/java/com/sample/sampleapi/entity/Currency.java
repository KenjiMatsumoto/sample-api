package com.sample.sampleapi.entity;

import java.math.BigDecimal;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Currency {
	/** 自動採番ID */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** 仮想通貨名 */
	private String name;

	/** シンボル */
	private String symbol;

	/** 数量 */
	private BigDecimal amount;
}
