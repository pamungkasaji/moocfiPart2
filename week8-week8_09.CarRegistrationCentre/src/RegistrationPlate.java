public class RegistrationPlate {
    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    public String toString(){
        return country+ " "+regCode;
    }

    @Override
    public int hashCode() {
        if (regCode == null){
            return 1;
        }
        if (country == null){
            return 2;
        }
        return regCode.hashCode() + country.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }

        RegistrationPlate plate = (RegistrationPlate) obj;
        if (regCode == null || !regCode.equals(plate.getRegCode())){
            return false;
        }
        if (country == null || !country.equals(plate.getCountry())){
            return false;
        }

        return true;
    }

    public String getRegCode() {
        return regCode;
    }

    public String getCountry() {
        return country;
    }
}