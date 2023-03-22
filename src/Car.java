public class Car extends Vehicle{
int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public Car(String type, String licensePlate, String brand, String model, int id, int fuelEfficiency, int fuelTankCapacity, String fuelType, int power, String transmissionType, int yearOfMaking, String dateOfRegistration, String dateOfInsurance, String dateOfMOT, String dateOfNextTiresChange, int kmTillNextOilChange) {
        super(type, licensePlate, brand, model);
        this.id = id;
        this.fuelEfficiency = fuelEfficiency;
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelType = fuelType;
        this.power = power;
        this.transmissionType = transmissionType;
        this.yearOfMaking = yearOfMaking;
        this.dateOfRegistration = dateOfRegistration;
        this.dateOfInsurance = dateOfInsurance;
        this.dateOfMOT = dateOfMOT;
        this.dateOfNextTiresChange = dateOfNextTiresChange;
        this.kmTillNextOilChange = kmTillNextOilChange;
    }

   private int fuelEfficiency;
   private int fuelTankCapacity;
   private String fuelType;
   private int power;
   private String transmissionType;
   private int yearOfMaking;
   private String dateOfRegistration;
   private String dateOfInsurance;
   private String dateOfMOT;
   private String dateOfNextTiresChange;
   private int kmTillNextOilChange;

    public int getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(int fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(int fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getYearOfMaking() {
        return yearOfMaking;
    }

    public void setYearOfMaking(int yearOfMaking) {
        this.yearOfMaking = yearOfMaking;
    }

    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getDateOfInsurance() {
        return dateOfInsurance;
    }

    public void setDateOfInsurance(String dateOfInsurance) {
        this.dateOfInsurance = dateOfInsurance;
    }

    public String getDateOfMOT() {
        return dateOfMOT;
    }

    public void setDateOfMOT(String dateOfMOT) {
        this.dateOfMOT = dateOfMOT;
    }

    public String getDateOfNextTiresChange() {
        return dateOfNextTiresChange;
    }

    public void setDateOfNextTiresChange(String dateOfNextTiresChange) {
        this.dateOfNextTiresChange = dateOfNextTiresChange;
    }

    public int getKmTillNextOilChange() {
        return kmTillNextOilChange;
    }

    public void setKmTillNextOilChange(int kmTillNextOilChange) {
        this.kmTillNextOilChange = kmTillNextOilChange;
    }


    @Override
    public String toString() {
        return id + ", "+"Mарка: " + brand + ", " +"Модел: "+ model + ", "+"Номер: "+licensePlate;

    }
}
