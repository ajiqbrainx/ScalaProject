package Practise

object UniqueArray extends App{

      var my_array = Array(0, 0, 3, -2, -2, 4, 3, 2, 4, 6, 7)
      //Call the following java class for array operation
      import java.util.Arrays;
      println("Original Array1 : "+Arrays.toString(my_array));
      var no_unique_elements = my_array.length;
      //Comparing each element with all other elements
      var i=0;
      var j=0;
      // var j=0;
      for (l <- 0 to no_unique_elements-1)
      {
        j=i+1
        //  println(i + "  "+j)
        for (x <- i+1 to no_unique_elements-1)
        {
          //If any two elements are found equal
          if (my_array(i) == my_array(j))
          {
            //Replace duplicate element with last unique element
            my_array(j) = my_array(no_unique_elements-1);
            no_unique_elements = no_unique_elements-1;
            j=j-1
          }
          j=j+1
        }
        i=i+1
      }
      //Copying only unique elements of unique_array into array1
      //Use the Java class for array operation
      var unique_array = Arrays.copyOf(my_array, no_unique_elements);
      println("New array without duplicates: "+Arrays.toString(unique_array));


}
