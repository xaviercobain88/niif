package xaw.rest_services.domain.model;

import java.util.ArrayList;
/**
 * @author Xavier Ramírez
 *
 */
public class Account {

	protected String name;
	protected String code;
	protected Account parentAccount;
	protected ArrayList<Account> childAccounts;
	
	
	
}
