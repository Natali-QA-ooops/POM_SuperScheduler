package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

@Getter
@Setter
@Builder
@ToString
public class Auth {
    String email;
    String password;

}
