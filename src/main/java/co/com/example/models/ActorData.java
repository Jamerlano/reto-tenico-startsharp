package co.com.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ActorData {

    private String fullname;
    private String email;
    private String password;

}