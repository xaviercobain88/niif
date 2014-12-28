package xaw.rest_services.application.contract;

import java.util.ArrayList;

import xaw.rest_services.application.dto.AccountDTO;
import xaw.rest_services.application.exception.InternalServerErrorException;

public interface IStatementOfFinantialPositionService {

	ArrayList<AccountDTO> getStructure() throws InternalServerErrorException;
}
