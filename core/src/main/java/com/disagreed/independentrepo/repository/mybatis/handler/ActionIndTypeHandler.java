package com.disagreed.independentrepo.repository.mybatis.handler;

import com.disagreed.independentrepo.model.ActionIndicatorEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Objects;

/**
 * The special handler for ActionIndicatorEnum enum.
 */
@MappedTypes(ActionIndicatorEnum.class)
@MappedJdbcTypes(JdbcType.VARCHAR)
public class ActionIndTypeHandler extends BaseTypeHandler<ActionIndicatorEnum> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, ActionIndicatorEnum actionIndicatorEnum,
                                    JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, actionIndicatorEnum.getAction());
    }

    @Override
    public ActionIndicatorEnum getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return getActionType(resultSet.getString(s));
    }

    @Override
    public ActionIndicatorEnum getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return getActionType(resultSet.getString(i));
    }

    @Override
    public ActionIndicatorEnum getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return getActionType(callableStatement.getString(i));
    }

    /**
     * Helper method.
     *
     * @param value the value
     * @return actionIndicatorEnum
     */
    private ActionIndicatorEnum getActionType(String value) {
        if (Objects.isNull(value)) {
            return null;
        }
        return Arrays.stream(ActionIndicatorEnum.values())
                .filter(v -> v.getAction().equals(value))
                .findFirst().orElseThrow(() -> new RuntimeException("не получилось извлечь Enum"));
    }
}