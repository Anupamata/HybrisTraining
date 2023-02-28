/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.core.suggestion.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import org.training.core.model.PITUserAddressModel;

import java.util.Locale;


public class PitAddressPrepareInterceptor implements PrepareInterceptor<PITUserAddressModel>
{

	@Override
	public void onPrepare(PITUserAddressModel pitUserAddressModel, InterceptorContext interceptorContext) throws InterceptorException {
		pitUserAddressModel.setHouseName(pitUserAddressModel.getHouseName(new Locale("en")).toUpperCase(),new Locale("en"));
	}
}