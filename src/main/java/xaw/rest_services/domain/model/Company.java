package xaw.rest_services.domain.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Company {

	@Id
	@GeneratedValue
	protected Long id;
	@ManyToMany(mappedBy = "company")
	protected List<AccountantFirmAssigment> accountantFirmAssigments;
	@ManyToOne
	protected License accountingFirm;
	protected String name;
	protected String identification;
	protected String description;
	@Transient
	protected FinantialPositionStatement finantialPositionStatement;
	
	

}
