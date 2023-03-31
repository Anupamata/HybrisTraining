package org.training.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultVariantProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;

public class CustomSearchResultVariantProductPopulator extends SearchResultVariantProductPopulator {
    public void populate(final SearchResultValueData source,final ProductData target)
    {
        super.populate(source,target);
        final var obj=this.<String> getValue(source,"companyName");
        if(obj!=null) {
            target.setCompanyName(obj);
        }
        else {
            target.setCompanyName("UNKNOWN");
        }
        final var price=this.<String>getValue(source,"pitsPrice_usd_string");
        if(price!=null) {
            target.setPitsPrice(price);
        }
        else {
            target.setPitsPrice("0");
        }
    }
}
