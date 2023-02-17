package org.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.training.core.model.PITUsersModel;
import org.training.facades.product.data.PitUserData;

public class PitUserPopulator implements Populator<PITUsersModel, PitUserData> {

    @Override
    public void populate(PITUsersModel source, PitUserData target) throws ConversionException {
        target.setPitId(source.getPitId());
        target.setName(source.getName());
        target.setUsername(source.getUsername());
        target.setDesignation(source.getDesignation());
        target.setSkillLevel(source.getSkillLevel());
        target.setSkillGrade(source.getSkillGrade());
    }
}
