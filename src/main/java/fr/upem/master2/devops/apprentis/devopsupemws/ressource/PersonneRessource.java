package fr.upem.master2.devops.apprentis.devopsupemws.ressource;

import fr.upem.master2.devops.apprentis.devopsupemws.model.Personne;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PersonneRessource{

    @GetMapping("/personnes")
    public List<Personne> getAll(){
        return Arrays.asList(new Personne("toto", "tata"));
    }

}
