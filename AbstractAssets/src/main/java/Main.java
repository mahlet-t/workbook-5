import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets=new ArrayList<>();
        House vacationHome=new House("My Vacation house","october 27 2030",124000,"567 main st",1,2000,5000);
        House mainHome=new House("My Main house","october 27 2028",200000,"456 main st",2,3000,10000);
        assets.add(vacationHome);
        assets.add(mainHome);

        Vehicle car=new Vehicle("Tom's car","october 12 2022",15000,"Toyota",6,120000);
        Vehicle truck=new Vehicle("Tom's truck","January 1 2023",80000,"Ford",3,45000);
        assets.add(car);
        assets.add(truck);
        for (Asset asset:assets){
            System.out.println(asset.getDescription());
            System.out.println(" Date: "+asset.getDateAcquired());
            System.out.println(" original cost: "+asset.getOriginalCost());
            System.out.println(" Value: "+asset.getValue());

            if (asset instanceof House){
                House house=(House) asset;
                System.out.println("Address: "+house.getAddress());
                System.out.println(".......................................");
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle=(Vehicle) asset;
                System.out.println("Make/Model: "+vehicle.getMakeModel());
                System.out.println("...........................................");

            }
        }
    }


}
