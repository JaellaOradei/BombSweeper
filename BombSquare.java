import java.util.*;

public class BombSquare extends GameSquare
{
	private boolean thisSquareHasBomb = false;
	public static final int MINE_PROBABILITY = 10;
	String numbers[] = {"images/0.png", "images/1.png", "images/2.png", "images/3.png", "images/4.png"};

	public BombSquare(int x, int y, GameBoard board)
	{
		super(x, y, "images/blank.png", board);

		Random r = new Random();
		thisSquareHasBomb = (r.nextInt(MINE_PROBABILITY) == 0);
	}

	public void clicked()
	{
		//int x=0, y =1;
	
		if(thisSquareHasBomb==true){
			setImage("images/bomb.png");
		} 

		if (thisSquareHasBomb==false){
			for(int i=0; i<numbers.length;i++){
				//numbers[i]=new String;
				setImage("images/"+i+".png");
				
				i++;
			}
		}

	}
}
