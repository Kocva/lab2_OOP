public class Finder {
   public String Str;

   public Finder () {
      Str = "1 2 2 3 4 5 6 5 5 7 8";
   }
   public Finder (String str) {
      Str = str;
   }

   void FindNumber () {
      String[] splitStr = Str.split(" ");
      int [] arr = new int[splitStr.length];

      for (int i = 0; i < arr.length; i++){
         arr[i] = Integer.parseInt(splitStr[i]);
      }

      int k;
      int  maxk = 0;
      int answer = arr[0];
      for (int i = 0; i< arr.length; i++ ) {
         k = 0;
         for (int j = 0; j < arr.length; j++) {
            if (i != j) {
               if (arr[i] == arr[j]){
                  k++;
               }
            }
         }
         if (k > maxk) {
            maxk = k;
            answer = arr[i];
         }
      }
      System.out.println(answer);
   }


}
