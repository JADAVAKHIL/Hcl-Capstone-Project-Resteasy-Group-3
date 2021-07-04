package com.hcl.resteasy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderDTO {
	
	private int orderID;
	private int quantity;
	private int menuID;
	private String itemName;
	private String itemtype;
	private double price;

}
