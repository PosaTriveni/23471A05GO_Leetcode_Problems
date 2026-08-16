class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // first element is always 1
        for (int i = 1; i <= rowIndex; i++) {
            // update backwards to avoid overwriting
            for (int j = row.size() - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1); // last element is always 1
        }
        return row;
    }
}

        
    
