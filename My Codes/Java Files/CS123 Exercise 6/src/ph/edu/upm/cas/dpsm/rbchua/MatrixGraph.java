package ph.edu.upm.cas.dpsm.rbchua;

import java.util.List;

public class MatrixGraph extends AbstractGraph {

	int check = 0;
	double [][] matrix = new double[100][100];
	public MatrixGraph(int numV, boolean directed) {
		super(numV, directed);
		check = numV;
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void insert(Edge edge) {
		

		if(!isDirected())
		{
			matrix[edge.getSource()][edge.getDest()]=edge.getWeight();
			matrix[edge.getDest()][edge.getSource()]=edge.getWeight();
		}
		else
		{
			matrix[edge.getSource()][edge.getDest()]=edge.getWeight();
		}
		
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isEdge(int source, int dest) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Edge getEdge(int source, int dest) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		for(int i = 0; i<check; i++) {
			
			for(int j = 0; j <check;j++) {
				
				if(matrix[i][j]>9) {
					System.out.print(matrix[i][j]+"    ");
				}
				else {
					System.out.print(matrix[i][j]+"     ");
				}
			}
			System.out.println();
		}
		return "";
	}

}
