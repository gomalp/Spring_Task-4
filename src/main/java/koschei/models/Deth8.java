package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Deth8 {
    private String mess="Koschei is dead";

    public Deth8() {
    }

    @Override
    public String toString() {
        return mess;
    }
}
