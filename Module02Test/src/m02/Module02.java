package m02;

import java.util.ArrayList;
import java.util.List;

public class Module02 {

	public static void main(String[] args) {
		List<PowerPlant> powerPlants = new ArrayList<PowerPlant>();
		WindFarm offshoreWindFarm = new WindFarm(400);
		offshoreWindFarm.offshore();
		
		powerPlants.add(new PowerPlant(100));
		powerPlants.add(new WindFarm(6800));
		powerPlants.add(offshoreWindFarm);
		powerPlants.add(new HydroPowerPlant(22500, true));
		powerPlants.add(new HydroPowerPlant(15, false));
		
		for(PowerPlant powerPlant : powerPlants) {
			System.out.println(powerPlant.toString());
			System.out.println(powerPlant.generateElectricity());
			System.out.println();
		}

	}

}
