package xaw.rest_services.domain.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import xaw.rest_services.domain.enums.AccountTypeEnum;

/**
 * @author Xavier Ramírez
 * 
 */
@Entity
public class Account {

	@Id
	@GeneratedValue
	protected Long id;
	protected String name;
	protected String description;
	protected String code;
	@ManyToOne(optional = true)
	@JoinColumn(name = "parent_account_id")
	protected Account parentAccount;
	@OneToMany
	@JoinColumn(name = "parent_account_id")
	protected List<Account> childAccounts;
	@Enumerated(EnumType.STRING)
	protected AccountTypeEnum accountType;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getCode() {
		return code;
	}

	public List<Account> getChildAccounts() {
		return childAccounts;
	}

	public AccountTypeEnum getAccountType() {
		return accountType;
	}

}
