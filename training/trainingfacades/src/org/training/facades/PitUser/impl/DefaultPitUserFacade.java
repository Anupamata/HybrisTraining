package org.training.facades.PitUser.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.training.core.model.PITUserAddressModel;
import org.training.core.model.PITUsersModel;
import org.training.core.services.PitUserService;
import org.training.facades.PitUser.PitUserFacade;
import org.training.facades.product.data.CountData;
import org.training.facades.product.data.PitAddressData;
import org.training.facades.product.data.PitUserData;

import java.util.List;

public class DefaultPitUserFacade implements PitUserFacade {


    private PitUserService pitUserService;
    private Converter<PITUsersModel, PitUserData> pitUserDataConverter;
    private Converter<PitUserData, PITUsersModel> pitUserDataReverseConverter;
    private Converter<PitAddressData, PITUserAddressModel> pitAddressReverseConverter;
    private ModelService modelService;

    @Override
    public List<PitUserData> getAllPitUsers() {
        final List<PITUsersModel> pitUsersModelList = getPitUserService().getAllPitUsers();
        return getPitUserDataConverter().convertAll(pitUsersModelList);
    }

    @Override
    public void insertPitUser(PitUserData pitUserData) {
        var pitUsersModel = pitUserDataReverseConverter.convert(pitUserData);
        modelService.save(pitUsersModel);
    }

    @Override
    public void updateUsername(int pitId) {
        final PITUsersModel pitUserModel = pitUserService.getPitUserByCode(pitId);
        pitUserService.createColumnUpdateBusinessProcess(pitUserModel);
    }

    @Override
    public void sendEmail(int pitId) {
        final PITUsersModel pitUserModel = pitUserService.getPitUserByCode(pitId);
        pitUserService.sendEmail(pitUserModel);
    }

    @Override
    public void insertPitAddress(int pitId, PitAddressData pitAddressData) {
        PITUserAddressModel pitAddressModel=getPitAddressReverseConverter().convert(pitAddressData);
        PITUsersModel pitUsersModel=pitUserService.getPitUserByCode(pitId);
        pitAddressModel.setUser(pitUsersModel);
        modelService.save(pitAddressModel);

    }

    @Override
    public CountData getCountModel() {
        return pitUserService.getCountModel();
    }


    public PitUserService getPitUserService() {
        return pitUserService;
    }

    public void setPitUserService(PitUserService pitUserService) {
        this.pitUserService = pitUserService;
    }

    public Converter<PITUsersModel, PitUserData> getPitUserDataConverter() {
        return pitUserDataConverter;
    }

    public void setPitUserDataConverter(Converter<PITUsersModel, PitUserData> pitUserDataConverter) {
        this.pitUserDataConverter = pitUserDataConverter;
    }
    public Converter<PitUserData, PITUsersModel> getPitUserDataReverseConverter() {
        return pitUserDataReverseConverter;
    }

    public void setPitUserDataReverseConverter(Converter<PitUserData, PITUsersModel> pitUserDataReverseConverter) {
        this.pitUserDataReverseConverter = pitUserDataReverseConverter;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public Converter<PitAddressData, PITUserAddressModel> getPitAddressReverseConverter() {
        return pitAddressReverseConverter;
    }

    public void setPitAddressReverseConverter(Converter<PitAddressData, PITUserAddressModel> pitAddressReverseConverter) {
        this.pitAddressReverseConverter = pitAddressReverseConverter;
    }
}
