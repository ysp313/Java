package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
@SpringBootApplication
public class MyProject {

    public static void main(String[] args) {
        SpringApplication.run(MyProjectApplication.class, args);
    }

    @RequestMapping("/doctor2/{numero}")
    @ResponseBody
    public String doctor(@PathVariable int numero) {
        String [] doctorName = {"William Hartnell", "Jon Pertwee", "Tom Baker", "Peter Davison", "Colin Baker", "Sylvester McCoy", "Paul McGann"
        , "John Hurt", "Christopher Eccleston", "David Tennant", "Matt Smith", "Peter Capaldi", "Jodie Whittaker"};
        String name = doctorName[numero];

        if (numero >= 9 && numero <= 13) 
        {
            return "number :"+ numero+ " name :"+ name;
        }
        else if (numero >= 1 && numero <= 8)
        {
            throw new ResponseStatusException(HttpStatus.SEE_OTHER,"Trop vieux");     }
        else
        { 
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "nous n'avons pas trouver ce docteur");
        }

    

    
    }
    
}
