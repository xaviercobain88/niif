package xaw.rest_services.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class License {

	@Id
	@GeneratedValue
	protected Long id;
	@ManyToOne
	@JoinColumn(name = "license_id")
	protected LicensePlan license;

	@ManyToOne
	@JoinColumn(name = "user_id")
	protected User user;

}
