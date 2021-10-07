package ruslan.springframework.spring5jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ruslan.springframework.spring5jokesapp.services.JokeService;

@Controller
public class JokeControllers {

    private final JokeService jokeService;

    public JokeControllers(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }
}
