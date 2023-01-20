package org.training.facades.pituser.impl;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.training.core.model.PITUsersModel;
import org.training.core.services.PitUserService;
import org.training.facades.pituser.PitUserFacade;
import org.training.facades.product.data.PitUserData;

import java.util.List;

public class DefaultPitUserFacade implements PitUserFacade {

    private PitUserService pitUserService;
    private Converter<PITUsersModel, PitUserData> pitUserDataConverter;

    @Override
    public List<PitUserData> getAllPitUsers() {
        final List<PITUsersModel> pitUsersModelList = getPitUserService().getAllPitUsers();
        return getPitUserDataConverter().convertAll(pitUsersModelList);
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
}
