package org.training.facades.pituser;

import org.training.facades.product.data.PitUserData;

import java.util.List;

public interface PitUserFacade {
    List<PitUserData> getAllPitUsers();
}
