package tasks.algorithms.recursion;

public class AlgorithmE {
    public static void main(String[] args) {
        int height = 640;
        int width = 400;
        System.out.println(algEuclid(width, height));
    }
    public static int algEuclid(int width, int height){
        if(width % height == 0){
            return height;
        } else if ((height % width == 0)){
            return width;
        }

        if(width < height){
            return algEuclid(width, height-width);
        }
        return algEuclid(width-height, height);
    }
}
