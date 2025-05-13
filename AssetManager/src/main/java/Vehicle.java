public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;
    public Vehicle(String description, String dateAcquired, double originalCost,String makeModel,int year, int odometer){
        super(description,dateAcquired,originalCost);
        this.makeModel=makeModel;
        this.year=year;
        this.odometer=odometer;

    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }


    @Override
    public double getValue() {
        double value=0;
        if (year>=0&&year<=3){
            value=getOriginalCost()-(0.03*getOriginalCost()*year);
        }
        else if (year>=4&&year<=6){
            value=getOriginalCost()-(0.06*getOriginalCost()*year);
        }
        else if (year>=7&&year<=10){
            value=getOriginalCost()-(0.08*getOriginalCost()*year);
        }
        else if (year>10){
            value=getOriginalCost()-1000.00;
        }
        if (odometer>100000&&!makeModel.contains("Honda")&&!makeModel.contains("Toyota")){
            value=value-(0.25*value);
        }
        return value;
    }
}
