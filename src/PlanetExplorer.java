
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:

public class PlanetExplorer {
	int x;
	int y;

	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
		this.x = x;
		this.y = y;
		
	}
	
	public char outOfMap(int x, int y, int pos_x, int pos_y, char facing){
		if(pos_x == x && facing == 'E' || pos_x == x && facing == 'W' || pos_x == 0 && facing == 'E' || pos_x == 0 && facing == 'W'){
			return 'y';
		}
		if(pos_y == y && facing == 'N' || pos_y == y && facing == 'S' ){
			return 'y';
		}
		
		return 'n';
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		int pos_x ;
		int pos_y;
		char facing;
		
		// ffrff
		facing = 'N';
		pos_x = 0;
		pos_y = 0;
		
		
		for(int i = 0; i < command.length(); i++){
			char order = command.charAt(i);
			if(order == 'f' || order == 'b'){
				char onEdge = outOfMap(x, y, pos_x, pos_y, facing);
				if(onEdge == 'y'){
					continue;
				}
			}
			
			switch(facing){
			case 'N' : 	switch (order) {
						case 'f' : pos_y = pos_y + 1;
						break;
						case 'b' : pos_y = pos_y - 1;
						break;
						case 'l' : facing = 'W';
						break;
						case 'r' : facing = 'E';
						break;
						};
						break;
			case 'E' : 	switch (order) {
						case 'f' : pos_x = pos_x + 1;
						break;
						case 'b' : pos_x = pos_x - 1;
						break;
						case 'l' : facing = 'N';
						break;
						case 'r' : facing = 'S';
						break;
						};
						break;
			case 'S' : 	switch (order) {
						case 'f' : pos_y = pos_y - 1;
						break;
						case 'b' : pos_y = pos_y + 1;
						break;
						case 'l' : facing = 'E';
						break;
						case 'r' : facing = 'W';
						break;
						};
						break;
			case 'W' : 	switch (order) {
						case 'f' : pos_x = pos_x - 1;
						break;
						case 'b' : pos_x = pos_x + 1;
						break;
						case 'l' : facing = 'S';
						break;
						case 'r' : facing = 'N';
						break;
						};
						break;
			}
			//System.out.println(pos_x + "," + pos_y + "," + facing);
		}
		String journey = "(" + pos_x + "," + pos_y + "," + facing + ")";
		return journey;
	}
}
