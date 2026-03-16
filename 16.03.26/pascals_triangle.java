class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows <= 0)  
            return result;
        
        ArrayList<Integer> prev = new ArrayList<Integer>();

        for(int i = 0; i < numRows; i++){

            ArrayList<Integer> row = new ArrayList<Integer>();

            // first element always 1
            row.add(1);

            // middle elements
            for(int j = 1; j <= i-1; j++){
                row.add(prev.get(j-1) + prev.get(j));
            }

            // last element always 1 (except first row)
            if(i > 0){
                row.add(1);
            }

            result.add(row);

            // update previous row
            prev = row;
        }

        return result;
    }
}
