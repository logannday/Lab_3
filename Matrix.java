public class Matrix {
    double[][] my_matrix;
    
    public Matrix(int num_rows, int num_cols){
    
        my_matrix = new double[num_rows][num_cols];
    }
    public Matrix(double[][] too_dee_array){
        my_matrix = too_dee_array;
        
    }
    public int get_num_rows(){
        return my_matrix.length;
    }
    public int get_num_cols(){
        return my_matrix[0].length;
    }
    public double get(int row, int col){
        return my_matrix[row][col];
    }
    public void set(int row, int col, double value){
        my_matrix[row][col] = value;
    }
    public Matrix add(Matrix other){
        Matrix sum_matrix = new Matrix(other.get_num_rows(),other.get_num_cols()); 
        for(int i = 0; i < other.get_num_rows(); i++){
            for(int j = 0; j < other.get_num_cols(); j++){
                sum_matrix.set(i,j, my_matrix[i][j]+other.get(i,j));
            }
        
        }
        return sum_matrix;
    }
    public static void main(String[] args) {
        double test_2d_array[][] = { {1, 2, 3} , 
                                    {4, 5, 6} };
        Matrix matrix1 = new Matrix(test_2d_array);
        double test_2d_array2[][] = { {1, 2, 3} , 
                                    {4, 5, 6} };
        Matrix matrix2 = new Matrix(test_2d_array2);
        Matrix ix = matrix1.add(matrix2);
        System.out.println("sum matrix at 0, 1 " + ix.get(0,1));
        Matrix really_good = new Matrix(4,4);
        really_good.set(1, 1, 22);
        System.out.println(really_good.get(1,1));
        
    }
    
}