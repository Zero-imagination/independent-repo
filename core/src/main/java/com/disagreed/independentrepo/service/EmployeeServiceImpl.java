package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.api.EmployeeService;
import com.disagreed.independentrepo.model.entity.EmployeeEntity;
import com.disagreed.independentrepo.repository.mybatis.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeEntity> getAll() {
        return employeeMapper.getAll();
    }

    @Override
    public EmployeeEntity getByEmployeeId(Long employeeId) {
        return employeeMapper.getByEmployeeId(employeeId)
                .orElseThrow(()-> new RuntimeException("Работника с идентификатором %s не найдено"
                        .formatted(employeeId)));
    }
}
