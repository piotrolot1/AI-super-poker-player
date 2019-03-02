
public enum Figure {

//	NINE	DZIEWIATKA
//	TEN		DZIESIATKA
//	JACK	WALET
//	QUEEN	DAMA
//	ACE 	AS
	
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(13),
	ACE(14); 

	int value;
	
	private Figure(int value) {
		this.value = value;
	}
	
	
}
