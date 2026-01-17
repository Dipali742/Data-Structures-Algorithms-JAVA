class PacalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0) {
            return triangle;
        }
        List<Integer> firstRow = List.of(1);
        triangle.add(firstRow);

        for(int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>(Collections.nCopies(i+1, 1));
            for(int j = 1; j < i; j++) {
                row.set(j, triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
            }
            triangle.add(row);
        }

        return triangle;
    }
}
