import java.util.Scanner;
import java.util.ArrayList;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int no = in.nextInt();
    ArrayList<Integer> dataList = new ArrayList<Integer>();
    ArrayList<Integer> counter = new ArrayList<Integer>();
    int count = 1;
    for (int x = 0; x < no; x++)
    {
      System.out.print("Add a number: ");
      int y = in.nextInt();
      if (!dataList.contains(y))
      {
        dataList.add(y);
        counter.add(count);
      }
      else
      {
        int position = dataList.indexOf(y);
        counter.set(position,counter.get(position)+1);
      }
    }
    int mode = 0;
    for (int o : counter)
    {
      if (o > mode)
      {
        mode = o;
      }
    }
    System.out.print("Mode:" + dataList.get(counter.indexOf(mode)));
  }
}
