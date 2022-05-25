package com.keshar.service.doctor;

import com.keshar.dao.doctor.DoctorRepository;
import com.keshar.model.doctor.Doctor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class DoctorServices {
    /**
     * @project multimodule-project
     * @author kesharpaudel on 18/05/2022
     * @created_at 18(Wed) May,2022 at 3:52 PM
     */

    private final DoctorRepository doctorRepository;


    @PostConstruct
    public void initDoctors() {
        doctorRepository.saveAll(
                Stream.of(
                        new Doctor(1, "Keshar", "Ear"),
                        new Doctor(2, "Avaya", "Leg"),
                        new Doctor(3, "Ajay", "Head")
                ).collect(Collectors.toList())
        );
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor getDoctorById(int id) {
        return doctorRepository.findById(id).orElseThrow(() -> new RuntimeException("Doctor not found"));
    }
}
