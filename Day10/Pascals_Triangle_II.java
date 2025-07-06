import java.util.*;

class Pascals_Triangle_II {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long val = 1;
        row.add(1);  

        for (int i = 1; i <= rowIndex; i++) {
            val = val * (rowIndex - i + 1) / i;
            row.add((int) val);
        }

        return row;
    }

    public static void main(String[] args) {
        Pascals_Triangle_II pt = new Pascals_Triangle_II();
        int rowIndex = 4;
        System.out.println(pt.getRow(rowIndex)); 
    }
}
