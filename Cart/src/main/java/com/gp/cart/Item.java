package com.gp.cart;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
		private int id;
		private String category;
		private String productName;
		private double productPrice;
		private int quantity;
		private int productRating;
		
		
		public Item() {
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public double getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(double productPrice) {
			this.productPrice = productPrice;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public int getProductRating() {
			return productRating;
		}

		public void setProductRating(int i) {
			this.productRating = i;
		}
		
		
		
		
}
