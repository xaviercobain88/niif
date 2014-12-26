package xaw.rest_services.infrastructure.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import xaw.rest_services.domain.enums.StatusEnum;
import xaw.rest_services.domain.infrastructure_service.ILicensePlanRepository;
import xaw.rest_services.domain.model.LicensePlan;
import xaw.rest_services.domain.query_params.LicensePlanQueryParam;
import xaw.rest_services.infrastructure.exception.UnexpectedPersistenceException;

public class LicensePlanRepository extends GenericRepository<LicensePlan, Long>
		implements ILicensePlanRepository {

	public LicensePlanRepository() {
		super(LicensePlan.class);
	}

	@Override
	public List<LicensePlan> findAll(LicensePlanQueryParam licensePlanQueryParam)
			throws UnexpectedPersistenceException {

		String sql = "select lp from LicensePlan lp where lp.status=:status";
		HashMap<String, Object> parameters = new HashMap<>();
		parameters.put("status", StatusEnum.ACTIVE);

		if (licensePlanQueryParam != null) {
			return findByQuery(sql, parameters,
					licensePlanQueryParam.getPage(),
					licensePlanQueryParam.getPageSize());
		}
		return new ArrayList<LicensePlan>();

	}
}
