/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.core.suggestion.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import org.training.core.model.PITUserAddressModel;

import java.util.Locale;


public class PitAddressRemoveInterceptor implements RemoveInterceptor<PITUserAddressModel>
{

	@Override
	public void onRemove(PITUserAddressModel pitUserAddressModel, InterceptorContext interceptorContext) throws InterceptorException {
		if(pitUserAddressModel.getAddressId()==203){
			throw new InterceptorException("you can not delete Address of ID 203");
		}
	}
}