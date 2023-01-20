package org.training.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.log4j.Logger;
import org.training.core.dao.PitUserDao;
import org.training.core.model.PITUsersModel;

import java.util.Collections;
import java.util.List;

public class DefaultPitUserDao extends AbstractItemDao implements PitUserDao {
    private static final Logger LOGGER = Logger.getLogger(DefaultPitUserDao.class);
    private static final String GET_ALL_PITUSER = "SELECT {" + PITUsersModel.PK + "} FROM {" + PITUsersModel._TYPECODE + "}";

    @Override
    public List<PITUsersModel> getAllPitUsers() {
        LOGGER.info(getFlexibleSearchService().search(GET_ALL_PITUSER).getClass());
        final SearchResult<PITUsersModel> usersModelSearchResult = getFlexibleSearchService().search(GET_ALL_PITUSER);
        return usersModelSearchResult.getResult() == null ? Collections.emptyList() : usersModelSearchResult.getResult();
    }
}
