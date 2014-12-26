package xaw.rest_services.application.dto;

import java.math.BigDecimal;

public class LicensePlanDTO {
	protected Integer totalUsers;
	protected Integer totalCompanies;
	protected BigDecimal price;
	protected String description;

	public Integer getTotalUsers() {
		return totalUsers;
	}

	public void setTotalUsers(Integer totalUsers) {
		this.totalUsers = totalUsers;
	}

	public Integer getTotalCompanies() {
		return totalCompanies;
	}

	public void setTotalCompanies(Integer totalCompanies) {
		this.totalCompanies = totalCompanies;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
