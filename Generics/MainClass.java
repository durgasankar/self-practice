package Generics;

public class MainClass {
	public static void main(String[] args) {
		
		HockeyPlayer ambu = new HockeyPlayer("Ambu");
		FootballPlayer satya = new FootballPlayer("Satya");
		CricketPlayer raja = new CricketPlayer("Raja");
		
		Team<HockeyPlayer> cenation = new Team("Cenation");
		cenation.addPlayer(ambu);
		
		Team<FootballPlayer> rko = new Team("RKO");
		rko.addPlayer(satya);
		
		Team<CricketPlayer> karachi = new Team("Karachi");
		karachi.addPlayer(raja);
		
		karachi.matchResults(rko, 120, 322);
		rko.matchResults(cenation, 230, 99);
		cenation.matchResults(karachi, 120, 120);
		
		System.out.println("Ranking");
		System.out.println(cenation.ranking());
		System.out.println(rko.ranking());
		System.out.println(karachi.ranking());
		
		
		
		
		
		
	}

}
