package com.keshar.controller.doctor;

import com.keshar.model.doctor.Doctor;
import com.keshar.service.doctor.DoctorServices;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("multimodule")
@AllArgsConstructor
public class DoctorController {
    /**
     * @project multimodule-project
     * @author kesharpaudel on 18/05/2022
     * @created_at 18(Wed) May,2022 at 4:02 PM
     */


    private final DoctorServices doctorServices;

    @GetMapping("doctors")
    public ResponseEntity<List<Doctor>> allDoctors() {
        return ResponseEntity.ok(doctorServices.getAllDoctors());
    }

    @GetMapping("doctors/{id}")
    public ResponseEntity<Doctor> allDoctors(@PathVariable("id") int id) {
        return ResponseEntity.ok(doctorServices.getDoctorById(id));
    }
}
