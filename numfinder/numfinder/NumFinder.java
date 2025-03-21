package tudelft.numfinder;

public class NumFinder {
    private int smallest;
    private int largest;

    public void find(int[] nums) {
        // Inicializamos smallest y largest con el primer número de la lista
        if (nums.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío");
        }

        smallest = nums[0];
        largest = nums[0];

        for (int n : nums) {
            if (n < smallest) {
                smallest = n;
            }
            if (n > largest) {
                largest = n;
            }
        }
    }

    public int getSmallest() {
        return smallest;
    }

    public int getLargest() {
        return largest;
    }
}

