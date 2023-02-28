/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.core.suggestion.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import org.training.core.model.PITUserAddressModel;
import org.training.core.model.PITUsersModel;

import java.util.Locale;


public class PitAddressValidateInterceptor implements ValidateInterceptor<PITUserAddressModel>
{

	@Override
	public void onValidate(PITUserAddressModel pitUserAddressModel, InterceptorContext interceptorContext) throws InterceptorException {
		if(pitUserAddressModel.getHouseName(new Locale("en")).contains(" ")){
			throw new InterceptorException("Your housename should not contain whitespace");
		}
	}
}