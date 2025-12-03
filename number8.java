public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};
        int[] B = new int[A.length];   // create array B with same size

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];               // copy each element
        }

        // Display Array B
        for (int num : B) {
            System.out.print(num + " ");
        }
    }
}
