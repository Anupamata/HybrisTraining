package org.training.core.dao;

import de.hybris.platform.servicelayer.internal.dao.Dao;
import org.training.core.model.PITUsersModel;

import java.util.List;

public interface PitUserDao extends Dao {
    List<PITUsersModel> getAllPitUsers();
}
