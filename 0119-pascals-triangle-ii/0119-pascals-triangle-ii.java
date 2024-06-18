class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle=new ArrayList<>();
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for(int i=1;i<rowIndex+1;i++){
            List<Integer> prevRow=triangle.get(i-1);
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));

            }
            row.add(1);
            triangle.add(row);
        }
        return triangle.get(rowIndex);       
    }
}