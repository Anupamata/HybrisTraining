package org.training.core.services;

import org.training.core.model.PITUsersModel;

import java.util.List;

public interface PitUserService {
    List<PITUsersModel> getAllPitUsers();

    PITUsersModel getPitUserByCode(int pitId);

    void createColumnUpdateBusinessProcess(PITUsersModel pitUserModel);
}
