package xaw.rest_services.infrastructure.impl;

import javax.ejb.Stateless;

import xaw.rest_services.domain.model.User;
import xaw.rest_services.infrastructure.contract.IUserRepository;

@Stateless
public class UserRepository extends GenericRepository<User, Long>
		implements IUserRepository {


	public UserRepository() {
		super(User.class);
	}

}
