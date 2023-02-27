/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.core.event;

import de.hybris.platform.acceleratorservices.site.AbstractAcceleratorSiteEventListener;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.commerceservices.event.ForgottenPwdEvent;
import de.hybris.platform.commerceservices.model.process.ForgottenPasswordProcessModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import org.springframework.beans.factory.annotation.Required;
import org.training.core.model.PitUserEmailProcessModel;

public class PitUserEmailEventListener extends AbstractEventListener<PitUserEmailEvent> {

    private ModelService modelService;
    private BusinessProcessService businessProcessService;

    @Override
    protected void onEvent(PitUserEmailEvent event) {
        final PitUserEmailProcessModel pitUserEmailProcessModel = getBusinessProcessService()
                .createProcess("pitUserEmail-" + event.getProcess().getPitUser().getPitId() + "-" + System.currentTimeMillis(),
                        "pitUserEmailProcess");
        pitUserEmailProcessModel.setPitUser(event.getProcess().getPitUser());
        pitUserEmailProcessModel.setSite(event.getProcess().getSite());
        pitUserEmailProcessModel.setLanguage(event.getProcess().getLanguage());
        pitUserEmailProcessModel.setCustomer(event.getProcess().getCustomer());
        getModelService().save(pitUserEmailProcessModel);
        getBusinessProcessService().startProcess(pitUserEmailProcessModel);
    }
	protected BusinessProcessService getBusinessProcessService() {
		return businessProcessService;
	}
    @Required
    public void setBusinessProcessService(final BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }

    protected ModelService getModelService() {
        return modelService;
    }

    @Required
    public void setModelService(final ModelService modelService) {
        this.modelService = modelService;
    }

}
