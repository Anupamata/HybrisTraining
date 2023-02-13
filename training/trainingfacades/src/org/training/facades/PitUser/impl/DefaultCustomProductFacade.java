package org.training.facades.PitUser.impl;

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.commercefacades.product.impl.DefaultProductFacade;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.model.ModelService;
import org.training.facades.PitUser.CustomProductFacade;

public class DefaultCustomProductFacade extends DefaultProductFacade implements CustomProductFacade {
    private ProductService productService;
    private ModelService modelService;
    private CatalogVersionService catalogVersionService;
    @Override
    public void saveCompanyName(String productCode,String companyName) {
        CatalogVersionModel catalogVersionModel=catalogVersionService.getCatalogVersion("electronicsProductCatalog","Staged");
        var productModel = productService.getProductForCode(catalogVersionModel,productCode);
        productModel.setCompanyName(companyName);
        modelService.save(productModel);
    }
    @Override
    public ModelService getModelService() {
        return modelService;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    @Override
    public ProductService getProductService() {
        return productService;
    }

    @Override
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public CatalogVersionService getCatalogVersionService() {
        return catalogVersionService;
    }

    public void setCatalogVersionService(CatalogVersionService catalogVersionService) {
        this.catalogVersionService = catalogVersionService;
    }
}
