
public class Torneira {
	static boolean binario;
	public static final double QUANTAGUA=2000000;
	public String torneiraOnOff(){
		if(binario){
			return "aberta";
		}
		else{
			return "fECHADA";
		}
		
		
	}


	public void status(){
		if( torneiraOnOff().equals("aberta")){
			for(double i = 0; i<QUANTAGUA;i++ ){
				System.out.println( "o" );
				System.out.println( "o" );
				System.out.println( "o" );
				System.out.println( "o" );
			}
			System.out.println( "---------------------" );
			System.out.println( "---------------------" );
			System.out.println( "---------------------" );
			System.out.println( "---------------------" );
			System.out.println( "---------------------" );
			System.out.println( "---------------------" );
			System.out.println( "---------------------" );
			System.out.println( "---------------------" );
			
			
		}
		else{ 
			System.out.print("VAZIOOOOOOOOOOO");
		}
	}
	
	
	public String toString(){
		return "TORNEIRA"+torneiraOnOff();
	}

}
