package org.ffadilaputra.belajarspringrestapi.service;

import org.ffadilaputra.belajarspringrestapi.entity.Hardware;

import java.util.List;

public interface HardwareService {

    List<Hardware> findAll();
    Hardware findById(Long id);
    Hardware update(Long id,Hardware hardware);
    Hardware create(Hardware hardware);
    void delete(Long id);

}
