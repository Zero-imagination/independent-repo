package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.api.EmployeeService;
import com.disagreed.independentrepo.dto.EmployeeDto;
import com.disagreed.independentrepo.repository.mybatis.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeMapper employeeRepository;

    private final com.disagreed.independentrepo.mapper.EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeDto> getAll() {
        return employeeMapper.toDto(employeeRepository.getAll());
    }

    @Override
    public EmployeeDto getByEmployeeId(Long employeeId) {
        return employeeRepository.getByEmployeeId(employeeId)
                .map(employeeMapper::toDto)
                .orElseThrow(()-> new RuntimeException("Работника с идентификатором %s не найдено"
                        .formatted(employeeId)));
    }
}
