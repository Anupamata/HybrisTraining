package org.training.core.attributehandlers;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import org.training.core.enums.SkillGrade;
import org.training.core.model.PITUsersModel;

public class PitUserSkillGradeHandler implements DynamicAttributeHandler <SkillGrade, PITUsersModel> {

    public SkillGrade get(PITUsersModel model) {
        switch (model.getDesignation()) {
            case "Senior Software Engineer" -> {
                return SkillGrade.GRADE_ONE;
            }
            case "Software Engineer" -> {
                return SkillGrade.GRADE_TWO;
            }
            case "Associate" -> {
                return SkillGrade.GRADE_THREE;
            }
            default -> {
                return SkillGrade.UNDEFINED;
            }
        }
    }

    @Override
    public void set(PITUsersModel model, SkillGrade skillGrade) {
        throw new UnsupportedOperationException();
    }

}
