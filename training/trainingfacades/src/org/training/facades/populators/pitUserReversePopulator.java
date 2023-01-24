package org.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.training.core.model.PITUsersModel;
import org.training.facades.product.data.PitUserData;

import java.util.Locale;

public class pitUserReversePopulator implements Populator<PitUserData, PITUsersModel> {

    @Override
    public void populate(PitUserData source, PITUsersModel target) throws ConversionException {
        target.setPitId(source.getPitId());
        target.setName(source.getName());
        target.setUsername(source.getUsername());
        target.setPassword(source.getPassword());
        target.setDesignation(source.getDesignation(),new Locale("en"));
    }
}
