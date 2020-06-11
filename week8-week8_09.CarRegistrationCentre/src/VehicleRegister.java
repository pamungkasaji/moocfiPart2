
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners  = new HashMap<>();

    public boolean add(RegistrationPlate plate, String owner){
        if (owners.get(plate) == null){
            owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate){
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate){
        if (owners.get(plate) == null){
            return false;
        }

        owners.remove(plate);
        return true;
    }

    public void printRegistrationPlates(){
        for (RegistrationPlate regPlate : owners.keySet()){
            System.out.println(regPlate);
        }
    }

    public void printOwners(){
        ArrayList<String> added = new ArrayList<>();

        for (String owner : owners.values()){
            if (!added.contains(owner)){
                added.add(owner);
                System.out.println(owner);
            }
        }
    }
}
