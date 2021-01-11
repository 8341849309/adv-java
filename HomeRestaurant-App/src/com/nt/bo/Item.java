package com.nt.bo;

public class Item {

	private Integer itemNo;
	private String itemName;
	private Float basePrice;
	private Float MRP;
	private String description;

	public Integer getItemNo() {
		return itemNo;
	}

	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Float getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Float basePrice) {
		this.basePrice = basePrice;
	}

	public Float getMRP() {
		return MRP;
	}

	public void setMRP(Float mRP) {
		MRP = mRP;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Item [itemNo=" + itemNo + ", itemName=" + itemName + ", basePrice=" + basePrice + ", MRP=" + MRP
				+ ", description=" + description + "]";
	}

}
