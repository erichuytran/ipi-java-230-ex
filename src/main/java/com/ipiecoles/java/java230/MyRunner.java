package com.ipiecoles.java.java230;

import com.ipiecoles.java.java230.model.Employe;
import com.ipiecoles.java.java230.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private EmployeRepository employeRepository;

    @Override
    public void run(String... strings) throws Exception {
        Employe e = new Employe();
        e = employeRepository.findByMatricule("C00004");
        if (e != null) {
            System.out.println(e.toString());
        } else {
            System.out.println("Employe non trouve !");
        }

        List<Employe> employeList = employeRepository.findByNomAndPrenom("Andre", "Alexandre");
        System.out.println(employeList);
    }

    public static void print(Object t) {
        System.out.println(t);
    }
}



//        Long nbEmployes = employeRepository.count();
//        System.out.println("Il y a " + nbEmployes + " dans la base de donnée");
//        Optional<Employe> employe = employeRepository.findById(55L);
//        if (employe.isEmpty()) {
//            System.out.println("L'employé est inexistant");
//        } else {
//            System.out.println(employe.get().toString());
//        }
//
//        Employe e = employe.get();
//
//        e.setSalaire(e.getSalaire() + 200);
//        employeRepository.save(e);
//        System.out.println(e.toString());