package xaw.rest_services.application.dto;

import java.io.Serializable;
import java.util.ArrayList;

import xaw.rest_services.domain.enums.AccountTypeEnum;

public class AccountDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String name;
	protected String description;
	protected String code;
	protected ArrayList<AccountDTO> children;
	protected AccountTypeEnum accountType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ArrayList<AccountDTO> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<AccountDTO> children) {
		this.children = children;
	}

	public AccountTypeEnum getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountTypeEnum accountType) {
		this.accountType = accountType;
	}

}
