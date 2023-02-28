package org.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.training.core.model.PITUserAddressModel;
import org.training.facades.product.data.PitAddressData;

import java.util.Locale;

public class PitAddressReversePopulator  implements Populator<PitAddressData, PITUserAddressModel> {

    @Override
    public void populate(PitAddressData source, PITUserAddressModel target) throws ConversionException {
        target.setAddressId(source.getAddressId());
        target.setHouseName(source.getHouseName(),new Locale("en"));
        target.setCity(source.getCity(),new Locale("en"));
        target.setState(source.getState(),new Locale("en"));
        target.setPin(source.getPin());
    }
}
