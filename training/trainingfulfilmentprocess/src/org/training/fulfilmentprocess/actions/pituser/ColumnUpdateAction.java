/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.fulfilmentprocess.actions.pituser;

import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import org.apache.log4j.Logger;
import org.training.core.model.ColumnUpdateProcessModel;
import org.training.core.model.PITUsersModel;


/**
 * This example action checks the order for required data in the business process. Skipping this action may result in
 * failure in one of the subsequent steps of the process. The relation between the order and the business process is
 * defined in basecommerce extension through item OrderProcess. Therefore if your business process has to access the
 * order (a typical case), it is recommended to use the OrderProcess as a parentClass instead of the plain
 * BusinessProcess.
 */
public class ColumnUpdateAction extends AbstractSimpleDecisionAction<ColumnUpdateProcessModel>
{
	private static final Logger LOG = Logger.getLogger(ColumnUpdateAction.class);

	@Override
	public Transition executeAction(final ColumnUpdateProcessModel process)
	{
		final PITUsersModel pitUsersModel = process.getPitUser();

		if (pitUsersModel == null)
		{
			LOG.error("Missing the user details");
			return Transition.NOK;
		}
		else
		{
			pitUsersModel.setUsername("user@gmail.com");
			getModelService().save(pitUsersModel);
			LOG.info("username successfully updated");
			return Transition.OK;
		}
	}

}
