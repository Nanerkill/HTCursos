package meh;

public class tree {
	public static int cont = 2;
	
	public static void printTre() {
		int tree[][] = new int[6][12];
		
		tree[0][5] = 1;
		tree[1][4] = 1;
		tree[1][5] = 1;
		tree[1][6] = 1;
		tree[2][3] = 1;
		tree[2][4] = 1;
		tree[2][5] = 1;
		tree[2][6] = 1;
		tree[2][7] = 1;
		tree[3][2] = 1;
		tree[3][3] = 1;
		tree[3][4] = 1;
		tree[3][5] = 1;
		tree[3][6] = 1;
		tree[3][7] = 1;
		tree[3][8] = 1;
		tree[4][1] = 1;
		tree[4][2] = 1;
		tree[4][4] = 1;
		tree[4][3] = 1;
		tree[4][5] = 1;
		tree[4][6] = 1;
		tree[4][7] = 1;
		tree[4][8] = 1;
		tree[4][9] = 1;
		tree[5][0] = 1;
		tree[5][1] = 1;
		tree[5][2] = 1;
		tree[5][3] = 1;
		tree[5][4] = 1;
		tree[5][5] = 1;
		tree[5][6] = 1;
		tree[5][7] = 1;
		tree[5][8] = 1;
		tree[5][9] = 1;
		tree[5][10] = 1;
		
		tree[0][11] = 2;
		tree[1][11] = 2;
		tree[2][11] = 2;
		tree[3][11] = 2;
		tree[4][11] = 2;
		tree[5][11] = 2;
		
		for(int j = 0; j < 6; j++) {
			for(int i = 0; i < 12; i++) {
				
				if(cont%2 == 0) {
					//print 1
					if(tree[j][i] == 1) {
						System.out.print("1");
						cont++;
					}
					else if(tree[j][i] == 0)
						System.out.print(" ");
				}
				
				else if(cont%2 != 0) {
					//print 0
					if(tree[j][i] == 1) {
						System.out.print("0");
						cont++;
					}
					
					else if(tree[j][i] == 0)
						System.out.print(" ");
					
				}
				
				
				if(tree[j][i] == 2)
					System.out.println();
			}
			
		}
		
		
	}

}
