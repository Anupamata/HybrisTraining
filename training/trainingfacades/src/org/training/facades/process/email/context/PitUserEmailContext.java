/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.facades.process.email.context;

import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.training.core.model.PITUsersModel;
import org.training.core.model.PitUserEmailProcessModel;
import org.training.facades.product.data.PitUserData;


/**
 * Velocity context for a pit user customer email.
 */
public class PitUserEmailContext extends AbstractEmailContext<PitUserEmailProcessModel>
{
	private PitUserData pitUserData;
	private Converter<PITUsersModel,PitUserData> pitUserDataConverter;
	public void init(final PitUserEmailProcessModel pitUserEmailProcessModel, final EmailPageModel emailPageModel)
	{
		pitUserData = getPitUserDataConverter().convert(pitUserEmailProcessModel.getPitUser());
		super.init(pitUserEmailProcessModel, emailPageModel);
		put(EMAIL,"anupamataju@gmail.com");
		put(DISPLAY_NAME, pitUserEmailProcessModel.getPitUser().getName());
	}

	@Override
	protected BaseSiteModel getSite(PitUserEmailProcessModel businessProcessModel) {
		return businessProcessModel.getSite();
	}

	@Override
	protected CustomerModel getCustomer(PitUserEmailProcessModel businessProcessModel) {
		return businessProcessModel.getCustomer();
	}

	@Override
	protected LanguageModel getEmailLanguage(PitUserEmailProcessModel businessProcessModel) {
		return businessProcessModel.getLanguage();
	}

	public PitUserData getPitUserData() {
		return pitUserData;
	}

	public void setPitUserData(PitUserData pitUserData) {
		this.pitUserData = pitUserData;
	}

	public Converter<PITUsersModel, PitUserData> getPitUserDataConverter() {
		return pitUserDataConverter;
	}

	public void setPitUserDataConverter(Converter<PITUsersModel, PitUserData> pitUserDataConverter) {
		this.pitUserDataConverter = pitUserDataConverter;
	}
}
