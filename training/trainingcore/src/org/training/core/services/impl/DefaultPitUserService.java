package org.training.core.services.impl;

import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.site.BaseSiteService;
import org.apache.log4j.Logger;
import org.training.core.dao.PitUserDao;
import org.training.core.event.PitUserEmailEvent;
import org.training.core.model.ColumnUpdateProcessModel;
import org.training.core.model.PITUsersModel;
import org.training.core.model.PitUserEmailProcessModel;
import org.training.core.services.PitUserService;

import javax.annotation.Resource;
import java.util.List;

public class DefaultPitUserService implements PitUserService {
    private static final Logger LOG = Logger.getLogger(DefaultPitUserService.class);
    private BaseSiteService baseSiteService;
    private PitUserDao pitUserDao;
    private BusinessProcessService businessProcessService;
    private ModelService modelService;
    private EventService eventService;
    private CommonI18NService commonI18NService;
    private UserService userService;

    @Override
    public List<PITUsersModel> getAllPitUsers() {
        return getPitUserDao().getAllPitUsers();
    }

    @Override
    public PITUsersModel getPitUserByCode(int pitId) {
        return getPitUserDao().getPitUserByCode(pitId);
    }


    @Override
    public void createColumnUpdateBusinessProcess(PITUsersModel pitUserModel) {
        final String fulfilmentProcessDefinitionName = "columnUpdate-process";
        final String processCode = fulfilmentProcessDefinitionName + "-" + pitUserModel.getPitId() + "-" + System.currentTimeMillis();
        final ColumnUpdateProcessModel businessProcessModel = getBusinessProcessService().createProcess(processCode,
                fulfilmentProcessDefinitionName);
        businessProcessModel.setPitUser(pitUserModel);
        getBusinessProcessService().startProcess(businessProcessModel);
        if (LOG.isInfoEnabled()) {
            LOG.info(String.format("Started the process %s", processCode));
        }
    }

    @Override
    public void sendEmail(PITUsersModel pitUsersModel) {
        PitUserEmailProcessModel pitUserEmailProcessModel=new PitUserEmailProcessModel();
        pitUserEmailProcessModel.setLanguage(getCommonI18NService().getLanguage("en"));
        pitUserEmailProcessModel.setCustomer((CustomerModel) userService.getCurrentUser());
        pitUserEmailProcessModel.setSite(getBaseSiteService().getCurrentBaseSite());
        pitUserEmailProcessModel.setPitUser(pitUsersModel);
        final PitUserEmailEvent pitUserEmailEvent=new PitUserEmailEvent(pitUserEmailProcessModel);
        getEventService().publishEvent(pitUserEmailEvent);
    }


    public PitUserDao getPitUserDao() {
        return pitUserDao;
    }

    public void setPitUserDao(PitUserDao pitUserDao) {
        this.pitUserDao = pitUserDao;
    }
    public BusinessProcessService getBusinessProcessService() {
        return businessProcessService;
    }

    public void setBusinessProcessService(BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public EventService getEventService() {
        return eventService;
    }

    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

    public BaseSiteService getBaseSiteService() {
        return baseSiteService;
    }

    public void setBaseSiteService(BaseSiteService baseSiteService) {
        this.baseSiteService = baseSiteService;
    }

    public CommonI18NService getCommonI18NService() {
        return commonI18NService;
    }

    public void setCommonI18NService(CommonI18NService commonI18NService) {
        this.commonI18NService = commonI18NService;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
