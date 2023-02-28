/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.core.suggestion.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;
import org.training.core.model.PITUserAddressModel;
import org.training.core.model.PITUsersModel;


public class PitAddressLoadInterceptor implements LoadInterceptor<PITUserAddressModel>
{
	@Override
	public void onLoad(PITUserAddressModel pitUserAddressModel, InterceptorContext interceptorContext) throws InterceptorException {
		pitUserAddressModel.setPin(888888);
	}
}