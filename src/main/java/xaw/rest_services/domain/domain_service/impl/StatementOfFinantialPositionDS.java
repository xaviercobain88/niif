package xaw.rest_services.domain.domain_service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import xaw.rest_services.domain.domain_service.IStatementOfFinantialPositionDS;
import xaw.rest_services.domain.enums.AccountTypeEnum;
import xaw.rest_services.domain.infrastructure_service.IAccountRepository;
import xaw.rest_services.domain.model.Account;
import xaw.rest_services.infrastructure.exception.UnexpectedPersistenceException;

@Stateless
public class StatementOfFinantialPositionDS implements
		IStatementOfFinantialPositionDS {

	@Inject
	protected IAccountRepository accountRepository;

	@Override
	public List<Account> getStructure() throws UnexpectedPersistenceException {
		Account assets = accountRepository
				.findParentByType(AccountTypeEnum.ASSETS);
		Account liabilities = accountRepository
				.findParentByType(AccountTypeEnum.LIABILITIES);
		Account equity = accountRepository
				.findParentByType(AccountTypeEnum.EQUITY);
		List<Account> structure = new ArrayList<>();
		if (assets != null) {
			structure.add(assets);
		}
		if (liabilities != null) {
			structure.add(liabilities);
		}
		if (equity != null) {
			structure.add(equity);
		}

		return structure;
	}

}
