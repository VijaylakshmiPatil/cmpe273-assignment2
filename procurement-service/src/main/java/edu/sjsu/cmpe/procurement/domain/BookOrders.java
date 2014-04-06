/**
 * 
 */
package edu.sjsu.cmpe.procurement.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Vijaylakshmi
 *
 */
public class BookOrders {


	@JsonProperty("id")
	private String id;
	
	@JsonProperty("order_book_isbns")
	private int[] orderBookIsbns = new int[10];
	
	public int[] getOrderBookIsbns() {
		return orderBookIsbns;
	}
	
	public void setOrderBookIsbns(List<Integer> isbnFromQueue) {
		for (int i = 0; i<isbnFromQueue.size(); i++)
				this.orderBookIsbns[i] = isbnFromQueue.get(i);
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
		

}
