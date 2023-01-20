package org.training.core.services.impl;

import org.training.core.dao.PitUserDao;
import org.training.core.model.PITUsersModel;
import org.training.core.services.PitUserService;

import java.util.List;

public class DefaultPitUserService implements PitUserService {
    private PitUserDao pitUserDao;

    @Override
    public List<PITUsersModel> getAllPitUsers() {
        return getPitUserDao().getAllPitUsers();
    }

    public PitUserDao getPitUserDao() {
        return pitUserDao;
    }

    public void setPitUserDao(PitUserDao pitUserDao) {
        this.pitUserDao = pitUserDao;
    }
}
