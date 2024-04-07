import java.util.ArrayList;
import java.util.List;

public class MujObrazek {
    public List<MujTvar> getTvars() {
        return tvars;
    }

    public void addTvar(MujTvar tvar) {
        tvars.add(tvar);
    }

    private List<MujTvar> tvars = new ArrayList<>();

}
