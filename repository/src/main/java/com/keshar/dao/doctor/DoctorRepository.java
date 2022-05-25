package com.keshar.dao.doctor;


import com.keshar.model.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    /**
     *
     * @project multimodule-project
     * @author kesharpaudel on 18/05/2022
     * @created_at 18(Wed) May,2022 at 3:49 PM
     *
     */
}
