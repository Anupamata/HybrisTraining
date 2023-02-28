/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.core.suggestion.impl;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import org.training.core.model.PITUserAddressModel;


public class PitAddressInitDefaultInterceptor implements InitDefaultsInterceptor
{
	@Override
	public void onInitDefaults(Object model, InterceptorContext ctx) {
		if(model instanceof PITUserAddressModel)
		{
			final PITUserAddressModel pitUserAddressModel=(PITUserAddressModel) model;
			pitUserAddressModel.setPin(5555);
		}

	}
}