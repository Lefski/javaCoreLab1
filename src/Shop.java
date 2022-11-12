import java.util.ArrayList;

public class Shop {
    ArrayList<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer){
        computers.add(computer);
    }
    public void removeComputer(Computer computer){
        computers.remove(computer);
    }
    public Computer findComputer(Computer computer){
        for (Computer comp: computers){
            if(comp == computer){
                return computer;
            } else return null;
        }
        return null;
    }
}

