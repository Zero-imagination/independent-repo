package com.disagreed.independentrepo.converter;

import com.disagreed.independentrepo.model.ActionIndicatorEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class ActionIndicatorEnumConverter implements AttributeConverter<ActionIndicatorEnum, String> {

    @Override
    public String convertToDatabaseColumn(ActionIndicatorEnum actionIndicatorEnum) {
        if (actionIndicatorEnum == null) {
            return null;
        }
        return actionIndicatorEnum.getAction();
    }

    @Override
    public ActionIndicatorEnum convertToEntityAttribute(String code) {
        if (code == null) {
            return null;
        }

        return Stream.of(ActionIndicatorEnum.values())
                .filter(c -> c.getAction().equals(code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
