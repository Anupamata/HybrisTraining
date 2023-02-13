package org.training.facades.PitUser;

import de.hybris.platform.commercefacades.product.ProductFacade;

public interface CustomProductFacade extends ProductFacade {
    void saveCompanyName(String productCode,String companyName);
}
