package implementation;


public static class CustmSort{

  public static char[]  BubbleSort(char[] given) {

		for (int i = 0 ; i < given.length - 1 ; i ++) {

			for (int j = 1 ; j < given.length - i ; j++ ) {

				if (given[j-1] > given[j]) {

					char temp = given[j];
					given[j] = given[j-1];
					given[j-1] = temp;

				}
			}
		}
		return given;
	}

  public static String[]  BubbleSort(String[] unsorted) {

    for (int i = 0 ; i < unsorted.length - 1 ; i ++) {

      for (int j = 1 ; j < unsorted.length - i ; j++ ) {

        if (unsorted[j-1].compare(unsorted[j])) {
          char temp = unsorted[j];
          unsorted[j] = unsorted[j-1];
          unsorted[j-1] = temp;

        }
      }
    }
    return unsorted;
  }


    public static int[]  BubbleSort(int[] unsorted) {

      for (int i = 0 ; i < unsorted.length - 1 ; i ++) {

        for (int j = 1 ; j < unsorted.length - i ; j++ ) {

          if (unsorted[j-1] > unsorted[j]) {
            char temp = unsorted[j];
            unsorted[j] = unsorted[j-1];
            unsorted[j-1] = temp;

          }
        }
      }
      return unsorted;
    }


}
