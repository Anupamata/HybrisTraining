package org.training.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.log4j.Logger;
import org.training.core.dao.PitUserDao;
import org.training.core.model.PITUsersModel;
import org.training.facades.product.data.PitUserData;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultPitUserDao extends AbstractItemDao implements PitUserDao {
    private static final Logger LOGGER = Logger.getLogger(DefaultPitUserDao.class);
    private static final String GET_ALL_PITUSER = "SELECT {" + PITUsersModel.PK + "} FROM {" + PITUsersModel._TYPECODE + "}";
    private static final String GET_SINGLE_PITUSER = "SELECT {" + PITUsersModel.PK + "} FROM {" + PITUsersModel._TYPECODE + "} WHERE {" + PITUsersModel.PITID + "} = ?pitId";


    @Override
    public List<PITUsersModel> getAllPitUsers() {
        LOGGER.info(getFlexibleSearchService().search(GET_ALL_PITUSER).getClass());
        final SearchResult<PITUsersModel> usersModelSearchResult = getFlexibleSearchService().search(GET_ALL_PITUSER);
        return usersModelSearchResult.getResult() == null ? Collections.emptyList() : usersModelSearchResult.getResult();
    }

    @Override
    public PITUsersModel getPitUserByCode(int pitId) {
        final Map<String, Integer> queryParams = new HashMap<String, Integer>();
        queryParams.put("pitId",pitId);
        final SearchResult<PITUsersModel> searchResult = getFlexibleSearchService().search(GET_SINGLE_PITUSER, queryParams);
        return searchResult.getResult().isEmpty() ? null : searchResult.getResult().get(0);
    }

}
