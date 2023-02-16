package org.training.core.attributehandlers;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import org.training.core.model.PITUsersModel;

public class PitUserSkillLevelHandler implements DynamicAttributeHandler<String,PITUsersModel> {
    @Override
    public String get(PITUsersModel model) {
        switch (model.getDesignation()) {
            case "Senior Software Engineer" -> {
                return "EXPERT";
            }
            case "Software Engineer" -> {
                return "INTERMEDIATE";
            }
            case "Associate" -> {
                return "BEGINNER";
            }
            default -> {
                return "NOT DEFINED";
            }
        }
    }

    @Override
    public void set(PITUsersModel model, String skillLevels) {
        throw new UnsupportedOperationException();
    }

}
