import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

	List<Integer> current = new ArrayList<>();
	current.add(1);
        triangle.add(current);
        for (int row = 1; row < numRows; row++) {
            current = new ArrayList<>();
            current.add(1);
	    for (int col = 1; col < row; col++) {
		    int val = triangle.get(row - 1).get(col - 1) + 
			      triangle.get(row - 1).get(col);
		    current.add(val);
            }
	    current.add(1);
            triangle.add(current);
        }

        return triangle;
    }

        
    }
