package org.training.core.services.impl;

import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.log4j.Logger;
import org.training.core.dao.PitUserDao;
import org.training.core.model.ColumnUpdateProcessModel;
import org.training.core.model.PITUsersModel;
import org.training.core.services.PitUserService;
import org.training.facades.product.data.PitUserData;

import java.util.List;

public class DefaultPitUserService implements PitUserService {
    private static final Logger LOG = Logger.getLogger(DefaultPitUserService.class);

    private PitUserDao pitUserDao;
    private BusinessProcessService businessProcessService;
    private ModelService modelService;

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
//        getModelService().save(businessProcessModel);
        getBusinessProcessService().startProcess(businessProcessModel);
        if (LOG.isInfoEnabled()) {
            LOG.info(String.format("Started the process %s", processCode));
        }
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
}
