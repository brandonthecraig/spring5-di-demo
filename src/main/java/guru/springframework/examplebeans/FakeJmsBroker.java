package guru.springframework.examplebeans;

import lombok.Data;

@Data
public class FakeJmsBroker {

    private String user;
    private String password;
    private String url;
}
