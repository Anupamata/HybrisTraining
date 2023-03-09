package org.training.core.translators;

import de.hybris.platform.impex.jalo.translators.AbstractValueTranslator;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import org.apache.commons.lang.StringUtils;

import java.util.logging.Logger;

public class CustomTranslator extends AbstractValueTranslator {
    private static final Logger LOG=Logger.getLogger(CustomTranslator.class.getName());
    @Override
    public Object importValue(String value, Item item) throws JaloInvalidParameterException {
        LOG.info("Import value method");
        LOG.info("value Expression :"+value);
        Double result = null;
        if (!StringUtils.isBlank(value))
        {
            try
            {
                result = Double.valueOf(value);
                LOG.info("Result:"+result);
            }
            catch (final NumberFormatException exc)
            {
                setError();
            }
            if (result != null && result.doubleValue() < 0.0)
            {
                setError();
            }
        }
        return result;
    }

    @Override
    public String exportValue(Object object) throws JaloInvalidParameterException {
        return null;
    }
}
