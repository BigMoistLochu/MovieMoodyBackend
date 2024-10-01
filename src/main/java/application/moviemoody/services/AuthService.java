package application.moviemoody.services;


import application.moviemoody.authorization.model.UserCredentials;
import application.moviemoody.authorization.validations.UserCredentialsValidation;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserCredentialsValidation userCredentialsValidation = new UserCredentialsValidation();

    public boolean basicAuthSignIn(UserCredentials userCredentials){
        if(userCredentialsValidation.validate(userCredentials)){
            return true;
        }

        //tutaj bedziesz mial logike itp, zwracany bedzie jwt na podstawie usera ktory tez bedzie tutaj wyciagany z bazy danych

        return false;
    }
}
