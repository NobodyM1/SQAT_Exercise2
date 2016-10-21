
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:

public class PlanetExplorer {
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
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
		int pos_x;
		int pos_y;
		char facing;
		
		// ffrff
		facing = 'N';
		pos_x = 0;
		pos_y = 0;
		
		for(int i = 0; i < command.length(); i++){
			char order = command.charAt(i);
			switch (order) {
						case 'f' : pos_y = pos_y + 1;
						case 'b' : pos_y = pos_y - 1;
						case 'l' : facing = 'W';
						case 'r' : facing = 'E';
						};
						/*
			case 'E' : 	switch (order) {
						case 'f' : pos_x = pos_x + 1;
						case 'b' : pos_x = pos_x - 1;
						case 'l' : facing = 'N';
						case 'r' : facing = 'S';
						};
			case 'S' : 	switch (order) {
						case 'f' : pos_y = pos_y - 1;
						case 'b' : pos_y = pos_y + 1;
						case 'l' : facing = 'E';
						case 'r' : facing = 'W';
						};
			case 'W' : 	switch (order) {
						case 'f' : pos_x = pos_x - 1;
						case 'b' : pos_x = pos_x + 1;
						case 'l' : facing = 'S';
						case 'r' : facing = 'N';
						};
						*/
			
			//System.out.println(pos_x + "," + pos_y + "," + facing);
		}
		String journey = "(" + pos_x + "," + pos_y + "," + facing + ")";
		return journey;
	}
}
