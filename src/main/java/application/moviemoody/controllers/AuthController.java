package application.moviemoody.controllers;

import application.moviemoody.authorization.model.UserCredentials;
import application.moviemoody.services.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin
@AllArgsConstructor
public class AuthController {

    private final AuthService authService;


    @PostMapping("/signin")
    public String signIn(@RequestBody UserCredentials userCredentials){
        if(authService.basicAuthSignIn(userCredentials)) return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
        return "You Are Logged";
    }

    @PostMapping("/signin/google")
    public String signInGoogleOauth(){
        return "You Are Logged";
    }

    @PostMapping("/signin/github")
    public String signInGitHubOauth(){
        return "You Are Logged";
    }

    @PostMapping("/signup")
    public String signUp(@RequestBody UserCredentials userCredentials){
        return "You Are Register";
    }

}
