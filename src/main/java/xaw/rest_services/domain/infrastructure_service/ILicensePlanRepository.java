package xaw.rest_services.domain.infrastructure_service;

import java.util.List;

import xaw.rest_services.domain.model.LicensePlan;
import xaw.rest_services.domain.query_params.LicensePlanQueryParam;
import xaw.rest_services.infrastructure.exception.UnexpectedPersistenceException;

public interface ILicensePlanRepository extends
		IGenericRepository<LicensePlan, Long> {

	List<LicensePlan> findAll(LicensePlanQueryParam licensePlanQueryParam)
			throws UnexpectedPersistenceException;

}
