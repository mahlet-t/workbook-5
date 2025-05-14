public class Cash extends Asset{
    @Override
    public double getValue(){
        return getOriginalCost();
    }
}
