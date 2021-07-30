package fridayWorks;

import java.lang.String;
public class TrainEncapuslation {
	
	private int num;
	private String code;
	private String station;
	private String Arr;
	private String Dep;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainEncapuslation t[] = {
				new TrainEncapuslation(1,"YPR", "Yasvantpur", "", "23.40"),
				new TrainEncapuslation(2,"GTL", "Guntakal", "03.45", "03.50"),
				new TrainEncapuslation(3,"SC", "Secundrabad", "8.55", "09.10"),
				new TrainEncapuslation(4,"BPQ", "Balharshah", "13.30", "13.35"),
				new TrainEncapuslation(5,"HBJ", "Habibganj", "21.20", "13.35"),
				new TrainEncapuslation(6,"JHS", "Jhansi Jn", "01.15", "01.20"),
				new TrainEncapuslation(7,"DEE", "Delhi S Rohilla", "07.00", ""),
				};
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		//System.out.println("#   Code   Station                Arr.     Dep. ") ;
		System.out.printf("%-3s %-5s %-13s %-13s %6s\n", "#", "code", "station", "Arr.", "Dep.");
		System.out.println("-----------------------------------------------");
		
		for(TrainEncapuslation train : t) {
			
			train.trainList();
			
		}
		
		System.out.println("-----------------------------------------------");
        
	}
	
	public TrainEncapuslation(int num, String code, String station,String Arr,String Dep) {
		
		this.num = num;
	    this.code = code;
	    this.station = station;
	    this.Arr = Arr;
	    this.Dep = Dep;
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void trainList() {
		
		
		
		//System.out.println( num +"    " + code +"   " + station +"             " + Arr+"       " + Dep);
		
		System.out.printf("%-3d %-5s %-13s %-13s %6s\n", num, code, station, Arr, Dep);
	}

}
