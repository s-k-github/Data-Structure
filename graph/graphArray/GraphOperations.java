package graph.graphArray;

public class GraphOperations {
	int[][] vertex;
	int vertices;
	GraphOperations(int v){
		vertices=v;
		vertex=new int[v][v];		
	}
	
	public void display() {
		System.out.println("\nAdjacency matrix of the graph : ");
		System.out.print("  ");
		for(int i=0;i<vertices;i++) {
			System.out.print("  "+i);
		}
		System.out.println();
		for(int i=0;i<vertices;i++) {
			System.out.print(i+"-> ");
			for(int j=0;j<vertices;j++) {
				System.out.print(vertex[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
	public void add(int a,int b) {
		addVertex(a,b);
	}

	private void addVertex(int a, int b) {
		vertex[a][b]=vertex[b][a]=1;		
	}
	
	public void delete(int a,int b) {
		deleteVertice(a,b);
	}
	
	private void deleteVertice(int a,int b) {
		vertex[a][b]=vertex[b][a]=0;		
	}

	
}
