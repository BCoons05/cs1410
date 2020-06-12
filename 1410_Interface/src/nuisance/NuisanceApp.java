package nuisance;

import java.util.ArrayList;
import java.util.List;

public class NuisanceApp {

	public static void main(String[] args) {
		
		Friend[] friends = new Friend[] {
				new Friend("Juan", 27, Hobby.MUSIC),
				new Friend("Kate", 27, Hobby.SPORTS),
				new Friend("Alex", 21, Hobby.MUSIC),
			};
		
		System.out.println("3 Friends:");
		for(int i = 0; i < friends.length; i++) {
			System.out.println("Friend" + (i+1) + ": " + friends[i].toString());
		}
		
		System.out.println();
		System.out.println("friend1 equals friend2: " + friends[0].equals(friends[1]));
		System.out.println("friend1 equals friend3: " + friends[0].equals(friends[2]));
		
		Friend newFriend = new Friend("Kate", 27, Hobby.SPORTS);
		
		System.out.println("friend2 equals new friend: " + friends[1].equals(newFriend));
		
		Telemarketer telemarketer = new Telemarketer("Fritz", 25);
		
		System.out.println();
		System.out.println("telemarketer: " + telemarketer.toString());
		System.out.println();
		
		System.out.println("4 Insects:");
		
		Insect mosquito = new Mosquito("Aedes vexans");
		Insect peskyMosquito = new PeskyMosquito("Anopheles walkeri");
		
		List<String> colors = new ArrayList<>();
		colors.add("yellow");
		colors.add("black");
		colors.add("blue");
		Butterfly butterfly = new Butterfly("Swallowtail", colors);
		Insect butterfly2 = new Butterfly(butterfly);
		
		Insect[] insects = {mosquito, peskyMosquito, butterfly, butterfly2};
		
		for(Insect insect : insects) {
			System.out.println(insect.toString());
		}
		
		System.out.println();
		
		Nuisance[] nuisances = {telemarketer, (Nuisance) mosquito, (Nuisance) peskyMosquito};
		
		System.out.println("3 Nuisances:");
		
		for(Nuisance nuisance : nuisances) {
			if(nuisance instanceof PeskyMosquito) {
				System.out.println(((PeskyMosquito) nuisance).buzz());
				System.out.println(((PeskyMosquito) nuisance).bite());
			} else if (nuisance instanceof Mosquito) {
				System.out.println(((Mosquito) nuisance).buzz());
			} 
			
			System.out.println(nuisance.annoy());
			System.out.println();
		}
	}

}
