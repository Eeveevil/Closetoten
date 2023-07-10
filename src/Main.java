class closetoen {
    public static int findClosest(int[] array) {
        int closest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i] - 10) < Math.abs(closest - 10) || (Math.abs(array[i] - 10) == Math.abs(closest - 10) && array[i] > closest)) {
                closest = array[i];
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        int[] array = {8, 12, 5, 15, 9, -100, 11, 23, -123, 0};
        int closestToTen = findClosest(array);

        System.out.println("Ближе всего к 10 число: " + closestToTen);
    }
}