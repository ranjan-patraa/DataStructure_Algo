package gs;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle_29 {

    public static void main(String[] args) {

        int row = 6;
        int col = 2;

        List<List<Integer>> listOfList = EntirePascalTriangle(row);

        for(List<Integer> list : listOfList) {
            System.out.println(list);
        }

        /*printEntirePascalTriangle(row);

        System.out.println(using_NCRFormula_returnElement(row, col));


        givenRowNumberOfPascalTrianglePrintAllElementsOfThatRow(row);*/

    }

    // Given row number print entire pascal triangle

    static void printEntirePascalTriangle(int rows) {
        for(int i = 1; i <= rows; i++) {
            givenRowNumberOfPascalTrianglePrintAllElementsOfThatRow(i);
            System.out.println();
        }
    }

    // If Given Row number and Column Number return element at that place

    static int using_NCRFormula_returnElement(int row, int col) {

        int res = 1;
        int r = row - 1;
        int c = col - 1;

        for(int i = 0; i < c; i++) {

            res = res * (r - i);
            res = res / (i + 1);
        }
        return res;
    }

    // given Row number print all element of that row

    static void givenRowNumberOfPascalTrianglePrintAllElementsOfThatRow(int rowNo) {

        int elementOfRow = 1;
        System.out.print(elementOfRow+" ");

        for(int i = 1; i < rowNo; i++) {
            elementOfRow = elementOfRow * (rowNo - i);
            elementOfRow = elementOfRow / i;
            System.out.print(elementOfRow+" ");
        }
    }

    static List<Integer> printRowOfPascalTriangle(int rowNo) {

        List<Integer> list = new ArrayList<>();

        if(rowNo == 0) {
            return list;
        }
        if (rowNo == 1){
            list.add(1);
            return list;
        }
        int elementOfRow = 1;
        list.add(elementOfRow);
        for(int i = 1; i < rowNo; i++) {
            elementOfRow = elementOfRow * (rowNo - i);
            elementOfRow = elementOfRow / i;
            list.add(elementOfRow);
        }
        return list;
    }

    static List<List<Integer>> EntirePascalTriangle(int rows) {

        List<List<Integer>> listOfPascal = new ArrayList<>();

        for(int i = 1; i <= rows; i++) {
            listOfPascal.add(printRowOfPascalTriangle(i));
        }
        return listOfPascal;
    }
}
