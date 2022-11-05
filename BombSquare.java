import java.util.*;

public class BombSquare extends GameSquare 
{
	private boolean thisSquareHasBomb = false;
	public static final int MINE_PROBABILITY = 10;
	private boolean thisSquareHasNoNeighbours = false;
	public static final int NO_NEIGHBOURS= 15;
	//int numbers[] = new int[10];
	int x,y;
	GameBoard gm;

	public BombSquare(int x, int y, GameBoard board)
	{
		super(x, y, "images/blank.png", board);
		this.x=x;
		this.y=y;

		Random r = new Random();
		thisSquareHasBomb = (r.nextInt(MINE_PROBABILITY) == 0);
		thisSquareHasNoNeighbours = (r.nextInt(NO_NEIGHBOURS) == 0);
	}
	// public void noNeighbors(){
		
	// }

	public void clicked()
	{
		//int x=0, y =1;
		int i;
		if(thisSquareHasBomb==true){
			setImage("images/bomb.png");
			
			//new BombExplode();

		
		} else if (thisSquareHasBomb==false){

			for(i=0;i<10;i++){
				//numbers[i]= i;
				setImage("images/"+i+".png");
				System.out.println(i);
				
				if (i==10){
					i=0;
				}
				
				
			}
		}
	}
}
