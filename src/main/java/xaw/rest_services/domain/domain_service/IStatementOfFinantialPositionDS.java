package xaw.rest_services.domain.domain_service;

import java.util.List;

import xaw.rest_services.domain.model.Account;
import xaw.rest_services.infrastructure.exception.UnexpectedPersistenceException;

public interface IStatementOfFinantialPositionDS {

	List<Account> getStructure() throws UnexpectedPersistenceException;

}
