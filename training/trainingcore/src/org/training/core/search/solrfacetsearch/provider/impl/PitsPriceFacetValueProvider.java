package org.training.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.PriceService;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

public class PitsPriceFacetValueProvider extends AbstractPropertyFieldValueProvider implements FieldValueProvider{
    private FieldNameProvider fieldNameProvider;
    private PriceService priceService;

    public PitsPriceFacetValueProvider() {
    }

    public Collection<FieldValue> getFieldValues(IndexConfig indexConfig, IndexedProperty indexedProperty, Object model) throws FieldValueProviderException {
        if (!(model instanceof ProductModel)) {
            throw new FieldValueProviderException("Cannot evaluate price of non-product item");
        } else {
            Collection<FieldValue> fieldValues = new ArrayList();
            ProductModel product = (ProductModel)model;
            if (indexedProperty.isCurrency() && CollectionUtils.isNotEmpty(indexConfig.getCurrencies())) {
                CurrencyModel sessionCurrency = this.i18nService.getCurrentCurrency();

                try {
                    Iterator var7 = indexConfig.getCurrencies().iterator();

                    while(var7.hasNext()) {
                        CurrencyModel currency = (CurrencyModel)var7.next();
                        this.i18nService.setCurrentCurrency(currency);
                        this.addFieldValues(fieldValues, product, indexedProperty, currency.getIsocode());
                    }
                } finally {
                    this.i18nService.setCurrentCurrency(sessionCurrency);
                }
            } else {
                this.addFieldValues(fieldValues, product, indexedProperty, (String)null);
            }

            return fieldValues;
        }
    }

    protected void addFieldValues(Collection<FieldValue> fieldValues, ProductModel product, IndexedProperty indexedProperty, String currency) throws FieldValueProviderException {
        Double value = product.getPitsPrice();
        List<String> rangeNameList = this.getRangeNameList(indexedProperty, value, currency);
        Collection<String> fieldNames = this.fieldNameProvider.getFieldNames(indexedProperty, currency == null ? null : currency.toLowerCase(Locale.ROOT));
        Iterator var9 = fieldNames.iterator();

        while(true) {
            while(var9.hasNext()) {
                String fieldName = (String)var9.next();
                if (rangeNameList.isEmpty()) {
                    fieldValues.add(new FieldValue(fieldName, value));
                } else {
                    Iterator var11 = rangeNameList.iterator();

                    while(var11.hasNext()) {
                        String rangeName = (String)var11.next();
                        fieldValues.add(new FieldValue(fieldName, rangeName == null ? value : rangeName));
                    }
                }
            }

            return;
        }
    }

    public void setFieldNameProvider(FieldNameProvider fieldNameProvider) {
        this.fieldNameProvider = fieldNameProvider;
    }

    public void setPriceService(PriceService priceService) {
        this.priceService = priceService;
    }
}


/*
package org.training.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.PriceService;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

public class PitsPriceFacetValueProvider extends AbstractPropertyFieldValueProvider implements FieldValueProvider{
    private FieldNameProvider fieldNameProvider;
    private PriceService priceService;

    public PitsPriceFacetValueProvider() {
    }

    public Collection<FieldValue> getFieldValues(IndexConfig indexConfig, IndexedProperty indexedProperty, Object model) throws FieldValueProviderException {
        if (!(model instanceof ProductModel)) {
            throw new FieldValueProviderException("Cannot evaluate price of non-product item");
        } else {
            Collection<FieldValue> fieldValues = new ArrayList();
            ProductModel product = (ProductModel)model;
            this.addFieldValues(fieldValues, product, indexedProperty);
            return fieldValues;
        }
    }

    protected void addFieldValues(Collection<FieldValue> fieldValues, ProductModel product, IndexedProperty indexedProperty) throws FieldValueProviderException {
        Double value = product.getPitsPrice();
        List<String> rangeNameList = this.getRangeNameList(indexedProperty, value,"USD");
        Collection<String> fieldNames = this.fieldNameProvider.getFieldNames(indexedProperty, "USD");
        Iterator var9 = fieldNames.iterator();
        while(true) {
            while(var9.hasNext()) {
                String fieldName = (String)var9.next();
                if (rangeNameList.isEmpty()) {
                    fieldValues.add(new FieldValue(fieldName, value));
                } else {
                    Iterator var11 = rangeNameList.iterator();

                    while(var11.hasNext()) {
                        String rangeName = (String)var11.next();
                        fieldValues.add(new FieldValue(fieldName, rangeName == null ? value : rangeName));
                    }
                }
            }

            return;
        }
    }

    public void setFieldNameProvider(FieldNameProvider fieldNameProvider) {
        this.fieldNameProvider = fieldNameProvider;
    }

    public void setPriceService(PriceService priceService) {
        this.priceService = priceService;
    }
}

*/
