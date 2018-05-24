package models;

import java.util.ArrayList;

public class Linguagem {
    private ArrayList<String> all = new ArrayList();  

    public ArrayList<String> getAll() {
        return all;
    }

    public void setAll(ArrayList<String> all) {
        this.all = all;
    }

    @Override
    public String toString() {
        return "Linguagem{" + "all=" + all + '}';
    }
    

    
    
}
