/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.core.suggestion.impl;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import org.training.core.model.PITUsersModel;


public class PitUserInitDefaultInterceptor implements InitDefaultsInterceptor
{
	@Override
	public void onInitDefaults(Object model, InterceptorContext ctx) {
		if(model instanceof PITUsersModel)
		{
			final PITUsersModel pitUsersModel=(PITUsersModel) model;
			pitUsersModel.setDesignation("Associate Software Engineer");
		}

	}
}