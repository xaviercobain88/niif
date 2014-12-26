package xaw.rest_services.domain.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import xaw.rest_services.domain.enums.StatusEnum;

@Entity
public class LicensePlan {

	@Id
	@GeneratedValue
	protected Long id;

	@ManyToMany
	@JoinTable(name = "license_user", joinColumns = { @JoinColumn(name = "license_id", referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "id") })
	protected List<User> users;

	protected Integer totalUsers;
	protected Integer totalCompanies;
	protected BigDecimal price;
	protected String description;
	@Enumerated(EnumType.STRING)
	protected StatusEnum status;
	@Transient
	protected Boolean selected;

}
