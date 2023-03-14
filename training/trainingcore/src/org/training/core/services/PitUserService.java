package org.training.core.services;

import org.training.core.model.PITUsersModel;
import org.training.facades.product.data.CountData;

import java.util.List;

public interface PitUserService {
    List<PITUsersModel> getAllPitUsers();

    PITUsersModel getPitUserByCode(int pitId);

    void createColumnUpdateBusinessProcess(PITUsersModel pitUserModel);

    void sendEmail(PITUsersModel pitUsersModel);

    CountData getCountModel();
}
