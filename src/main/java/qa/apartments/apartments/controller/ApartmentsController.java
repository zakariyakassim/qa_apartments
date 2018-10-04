package qa.apartments.apartments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import qa.apartments.apartments.entities.Apartment;
import qa.apartments.apartments.repository.ApartmentsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/apartment")
public class ApartmentsController {


    @Autowired
    private ApartmentsRepository apartmentsRepository;


    @GetMapping("/all")
    @ResponseBody
    public List<Apartment> retrieveAllApartments() {

        return apartmentsRepository.findAll();
    }

    @PostMapping
    public Apartment addAppartment(@RequestBody Apartment apartment) {
        return apartmentsRepository.save(apartment);
    }



    @GetMapping("/{id}")
    @ResponseBody
    public List<Optional<Apartment>> retrieveApartmentById(@PathVariable Long id) {

        List<Optional<Apartment>> list = new ArrayList<>();
        list.add(apartmentsRepository.findById(id));

        return list;

    }

    @DeleteMapping("/delete/{id}")
    public void deleteAccount(@PathVariable Long id) {

        apartmentsRepository.deleteById(id);

    }



}

