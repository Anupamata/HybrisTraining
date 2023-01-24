package org.training.facades.PitUser;

import org.training.facades.product.data.PitUserData;

import java.util.List;

public interface PitUserFacade {
    List<PitUserData> getAllPitUsers();

    void insertPitUser(PitUserData request);
}