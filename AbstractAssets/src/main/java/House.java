public class House extends Asset{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;
    public House(String description, String dateAcquired, double originalCost,String address,int condition,int squareFoot,int lotSize ){
        super(description,dateAcquired,originalCost);
        this.address=address;
        this.condition=condition;
        this.squareFoot=squareFoot;
        this.lotSize=lotSize;


    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;

    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }


    @Override
    public double getValue() {
        double value=0;
        if (condition==1){
            value=squareFoot*180;
            System.out.println("Condition: Excellent");
        }
        else if (condition==2){
            value=squareFoot*130;
            System.out.println("Condition: good");



        }
        else if (condition==3){
            value=squareFoot*90;
            System.out.println("Condition: fair");
        }
        else if (condition==4){
            value=squareFoot*80;
            System.out.println("Condition: poor");
        }
        value+=lotSize*0.25;

        return value;
    }

}
