import java.util.ArrayList;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String>matrix=new ArrayList<String>();
        
		matrix.add("M�xico");
        matrix.add("Venezuela");
        matrix.add("Colombia");
        matrix.add("Brasil");
        //matrix.clear();
        System.out.println();
        matrix.remove(0);
        boolean find = matrix.contains("México");
        System.out.println(find);
        for(String pais:matrix){
        
        System.out.println("País "+ pais);
        System.out.println(matrix.get(0));
        }
        System.out.println(matrix.size());
        /*
		System.out.println(matrix.get(0));
		System.out.println(matrix.contains("México"));
		*/
		/*String[] matrix_1=new String[5];
        
        int[] matrix_2={0,1,2,3,4};
        
        matrix_1[0]="cero";
        matrix_1[1]="uno";
        matrix_1[2]="dos";
        matrix_1[3]="tres";
        matrix_1[4]="cuatro";
        
        System.out.println(matrix_1[0]);
        */
	}

}
