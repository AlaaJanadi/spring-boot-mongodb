package com.alaa.springbootmongodb;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class StudentService {
    private final StudentRepository studentRepository;
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public void addStudent(Student student){
        studentRepository.insert(student);
    }

    public void deleteStudent(String id){
        studentRepository.deleteById(id);
    }

    public void updateStudent(String id,Student newStudent){
        Optional<Student> st = studentRepository.findById(id);
        if (st.isPresent()){
            st.get().setAddress(newStudent.getAddress());
            st.get().setFirstName(newStudent.getFirstName());
            st.get().setLastName(newStudent.getLastName());
            st.get().setEmail(newStudent.getEmail());
            st.get().setGender(newStudent.getGender());
            st.get().setFavouriteSubjects(newStudent.getFavouriteSubjects());
            st.get().setTotalSpentInBooks(newStudent.getTotalSpentInBooks());
            st.get().setCreated(newStudent.getCreated());
            studentRepository.save(st.get());
        }

    }
}
